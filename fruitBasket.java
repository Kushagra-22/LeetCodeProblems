import java.util.HashMap;
import java.util.HashSet;

public class fruitBasket {
    public static int totalFruits(int []fruits){
        int n=fruits.length;
        int j=0,len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
//            j=0;
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2 &&j<n) {
                if(map.get(fruits[j])==1){
                    map.remove(fruits[j]);
                }
                else{
                    map.put(fruits[j],map.get(fruits[j])-1);
                }
                j++;
            }
                len=Math.max(len,i-j+1);


        }
        return len;
    }

    public static void main(String[] args) {
        int []arr={2,2,1,1,1};
        System.out.println(totalFruits(arr));
    }
}
