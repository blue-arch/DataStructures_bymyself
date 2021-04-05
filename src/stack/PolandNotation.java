package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args) {
//        String suffixExpression = "3 4 + 5 * 6 -";
//
//        List<String> list  = getListString(suffixExpression);
//        int res = calculate(list);
//        System.out.println(res);

        String expression = "1+((2+3)*4)-5";//注意表达式
        List<String> infixExpressionList = toInfixExpression(expression);
        System.out.println("中缀表达式对应的List=" + infixExpressionList); // ArrayList [1,+,(,(,2,+,3,),*,4,),-,5]
        List<String> suffixExpreesionList = parseSuffixExpreesionList(infixExpressionList);
        System.out.println("后缀表达式对应的List" + suffixExpreesionList); //ArrayList [1,2,3,+,4,*,+,5,–]

        System.out.printf("expression=%d", calculate(suffixExpreesionList)); // ?
    }
    public static List<String> parseSuffixExpreesionList(List<String> ls) {
        //定义两个栈
        Stack<String> s1 = new Stack<String>(); // 符号栈
        //说明：因为s2 这个栈，在整个转换过程中，没有pop操作，而且后面我们还需要逆序输出
        //因此比较麻烦，这里我们就不用 Stack<String> 直接使用 List<String> s2
        //Stack<String> s2 = new Stack<String>(); // 储存中间结果的栈s2
        List<String> s2 = new ArrayList<String>(); // 储存中间结果的Lists2

        //遍历ls
        for(String item: ls) {
            //如果是一个数，加入s2
            if(item.matches("\\d+")) {
                s2.add(item);
            } else if (item.equals("(")) {
                s1.push(item);
            } else if (item.equals(")")) {
                //如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号丢弃
                while(!s1.peek().equals("(")) {
                    s2.add(s1.pop());
                }
                s1.pop();//!!! 将 ( 弹出 s1栈， 消除小括号
            } else {
                //当item的优先级小于等于s1栈顶运算符, 将s1栈顶的运算符弹出并加入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较
                //问题：我们缺少一个比较优先级高低的方法
                while(s1.size() != 0 && Operation.getValue(s1.peek()) >= Operation.getValue(item) ) {
                    s2.add(s1.pop());
                }
                //还需要将item压入栈
                s1.push(item);
            }
        }

        //将s1中剩余的运算符依次弹出并加入s2
        while(s1.size() != 0) {
            s2.add(s1.pop());
        }

        return s2; //注意因为是存放到List, 因此按顺序输出就是对应的后缀表达式对应的List

    }
    public static List<String> toInfixExpression(String s){
        List<String> LS = new ArrayList<>();
        int i=0;
        String str;
        char c;
        do {
            if((c = s.charAt(i))<48||(c = s.charAt(i))>57){
                LS.add(String.valueOf(c));
                i++;
            }else {
                str="";
                while ((i<s.length())&&((c = s.charAt(i))>=48&&(c = s.charAt(i))<=57)){
                    str+=c;
                    i++;
                }
                LS.add(str);
            }
        }while (i<s.length());
        return LS;
    }
    public static List<String> getListString(String suffixExpression){
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<>();
        for(String e:split){
            list.add(e);
        }
        return list;
    }
    public static int calculate(List<String> ls){
        Stack<String> stack = new Stack<>();
        for(String item : ls){
            if(item.matches("\\d+")){
                stack.push(item);
            }else{
                // pop出两个数，并运算， 再入栈
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                //把res 入栈
                stack.push(String.valueOf(res));
            }
        }
        //最后留在stack中的数据是运算结果
        return Integer.parseInt(stack.pop());
    }
}

class Operation {
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;

    //写一个方法，返回对应的优先级数字
    public static int getValue(String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            default:
                System.out.println("不存在该运算符" + operation);
                break;
        }
        return result;
    }

}
