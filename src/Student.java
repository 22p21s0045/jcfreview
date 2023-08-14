import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    int id;
    String name;
    double gpax;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name,double gpax){
        this.id = id;
        this.name = name;
        this.gpax = gpax;

    }

    public int getId() {
        return id;
    }

    public double getGpax() {
        return gpax;
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();

    }
    public static final Comparator<Student> COMPARE_BY_GPAX = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getGpax() < o2.getGpax()){
                return 1;
            }else if (o1.getGpax() > o2.getGpax()){
                return -1;

            }
            else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    };
}
