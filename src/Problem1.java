import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>(125);
        Set<Student> studentSet2 = new TreeSet<>();
        Student s1 = new Student(11,"Somchai",3.22);
        Student s2 = new Student(11,"Somchais",3.11);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(new Student(333,"Akkarawit",3.44));
        for(Student i : studentSet){
            System.out.println(i.getName());
        }
        studentSet2.add(s1);
        List<Student> list_student = studentSet.stream().sorted(Student.COMPARE_BY_GPAX).toList();
        for(Student s : list_student){
            System.out.println(s);
        }


        for(Student i : studentSet){
            System.out.println(i.getName());
        }
    }
}
