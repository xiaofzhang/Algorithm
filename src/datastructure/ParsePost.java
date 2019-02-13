package datastructure;

public class ParsePost {
    private Stack stack;
    private String input;

    public ParsePost(String s) {
        input = s;
        stack = new Stack(s.length());
    }

    /**
     * 计算后缀表达式的值
     * @return
     */
    public int doParse() {
        int num1,num2,interAns;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stack.push((int)(ch - '0'));
            } else {
                num2 = (int)stack.pop();
                num1 = (int)stack.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                stack.push(interAns);
            }
        }
        interAns = (int)stack.pop();
        return interAns;
    }
}
