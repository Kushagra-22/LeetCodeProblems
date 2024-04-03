
public class print1toN {
    public static int fun(int n) {

        if (n < 1) {
            return 0;
        }
        fun(n - 1);
        System.out.print(n + " ");
        return 0;

    }

    public static double fun1(double n, int k) {
        if (k < 1) {
            return 1;
        }
        
        double ans=n * fun1(n, k - 1);

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(fun1(0.00001, 541818516));
    }
}
