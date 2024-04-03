import java.util.ArrayList;
import java.util.List;

public class subSetString {

    // public static

    public static void subStr(String str, int index, String ans, List<String> list) {

        if (str.length() == index) {
            list.add(ans);
            return;
        }

        subStr(str, index + 1, ans, list);
        ans += str.charAt(index);
        System.out.println(ans);
        subStr(str, index + 1, ans, list);

    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        subStr(str, 0, " ", list);
        System.out.println(list);

    }
}
