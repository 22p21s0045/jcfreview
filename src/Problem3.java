import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);
        Map<String, List<Integer>> map = new HashMap<>(200);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
            StringTokenizer tokens = new StringTokenizer(line," ,.?");
            int word_position = 0;
            while(tokens.hasMoreElements()){
                String word = tokens.nextToken();
                if(map.get(word) == null){
                    map.put(word,new LinkedList<Integer>());
                }
                map.get(word).add(++word_position);

            }
            System.out.println(map);
        }
        sc.close();
        for(Map.Entry<String,List<Integer>> entry: map.entrySet()){
            System.out.println(entry.getKey()+"("+entry.getValue().size()+"):");
            for(Integer position: entry.getValue()){
                System.out.println("@"+ position+" ");
            }
        }

    }
}
