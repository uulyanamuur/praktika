import java.util.Scanner;
import java.util.Stack;

public class Skobki {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Stack<Character> st = new Stack<Character>();

        System.out.println("Введите скобки:");

        boolean kr = true, kv = true, fg = true;
        String str = in.next();

        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == '[' || ch[i] == '{' || ch[i] == '(' || ch[i] == ']' || ch[i] == '}' || ch[i] == ')')
                st.push(ch[i]);
        }


        System.out.print("Стек: ");
        while (!st.isEmpty()) {
            char value = st.pop();
            System.out.print(value);
            System.out.print(" ");
        }

        for (int i = 0; i < str.length() + 1; i++) {
            if (kr && kv && fg) {
                if (st.peek() == ')')
                    kr = (!st.empty() && (char) st.pop() == '(');
                if (st.peek() == ']')
                    kv = (!st.empty() && (char) st.pop() == '[');
                if (st.peek() == '}')
                    fg = (!st.empty() && (char) st.pop() == '{');
            }
        }

        if (kr && kv && fg && st.empty()) System.out.print("YES");
        else System.out.print("NO");
    }
}