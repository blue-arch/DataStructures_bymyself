package linkedlist;

import java.util.Stack;

public class TestsTack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("jack");
        stack.add("kdaskd");
        stack.add("aefe");

        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
