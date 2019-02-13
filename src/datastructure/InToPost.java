package datastructure;

public class InToPost {
    private Stack stack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        stack = new Stack(input.length());
    }

    /**
     * 中缀表达式转后缀表达式
     */
    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    getOper(ch,1);
                    break;
                case '*':
                case '/':
                    getOper(ch,2);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    getParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }
        return output;
    }

    public void getOper(char ch, int type) {//遇到操作符
        while (!stack.isEmpty()) {//判断栈
            char top = (char)stack.pop();//不为空弹出最顶的元素
            if (top == '(') {
                stack.push(top);//弹出的元素为'(',重新压入栈
                break;
            } else {
                int type2;
                if (top == '+' || top == '-') {
                    type2 = 1;
                } else {
                    type2 = 2;
                }
                if (type2 < type) {
                    stack.push(top);
                    break;
                } else {
                    output = output + top;
                }
            }
        }
     stack.push(ch);
    }

    public void getParen(char ch) {
        while (!stack.isEmpty()) {
            char chx = (char) stack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }

    }
}
