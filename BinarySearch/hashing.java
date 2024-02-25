// package BinarySearch;
public class hashing{
    public static int hash(char []arr){
        // Array can be declared only upto 10^6 of integer type
        int []hash=new int[26];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]-'a']+=1;
        }
        for (int i : hash) {
            System.out.print(i+",");
        }


        return 0;
    }
    public static void main(String[] args) {
        int []arr={1,3,2,1,2,4};
        char []arr1={'a','b','c','a','d','c','z'};

        char ss='a';
        System.out.println((int)ss);
        hash(arr1);

    }
}