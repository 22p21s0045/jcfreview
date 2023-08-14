import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        int data[] = {1,2,3,5,8,7,9,6,4};
        Map<Integer,Integer> map = new HashMap<>();
        int x = 10;
       for(int i = 0; i< data.length;i++){
          int  v = data[i];
          int require = x - v;
          if(map.get(require) == null){
              map.put(v,i);
          }
          else {
              System.out.println("("+i+","+map.get(require)+")");
          }
       }
    }
}
