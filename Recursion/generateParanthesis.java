import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public static List<String> generate_Paranthesis(int n) {
        List<String> ans = new ArrayList<>();
        printParanthesis(n, n, "", ans);
        return ans;

    }

    public static void printParanthesis(int open, int close, String op, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(op);
            return;
        }

        if (open != 0) {
            String op1 = op;
            op1 += "(";
            printParanthesis(open - 1, close, op1, ans);
        }
        if (open < close) {
            String op2 = op;
            op2 += ")";
            printParanthesis(open, close - 1, op2, ans);

        }
        return;

    }

    public static void main(String[] args) {
        System.out.println(generate_Paranthesis(4));
    }
}
