package tree;

import javax.swing.*;

public class ArrBinaryTreeDemo {




    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrayBinaryTree demo = new ArrayBinaryTree(arr);
        demo.preOrder();
        System.out.println("****************");
        demo.infixOrder(0);
        System.out.println("*************");
        demo.postOrder(0);

    }
}

class ArrayBinaryTree{
    private int[] arr;

    public ArrayBinaryTree(int[] arr) {
        this.arr = arr;
    }
    //重载preOrder
    public void preOrder() {
        this.preOrder(0);
    }
    public void preOrder(int index){
        if(arr==null||arr.length==0){
            System.out.println("数组为空，不能遍历！");
        }
        System.out.println(arr[index]);
        if((2*index+1)<arr.length){
            preOrder(2*index+1);
        }
        if((2*index+2)<arr.length){
            preOrder(2*index+2);
        }

    }
    public void infixOrder(int index){
        if(arr==null||arr.length==0){
            System.out.println("数组为空，不能遍历！");
        }

        if((2*index+1)<arr.length){
            infixOrder(2*index+1);
        }
        System.out.println(arr[index]);
        if((2*index+2)<arr.length){
            infixOrder(2*index+2);
        }

    }
    public void postOrder(int index){
        if(arr==null||arr.length==0){
            System.out.println("数组为空，不能遍历！");
        }

        if((2*index+1)<arr.length){
            postOrder(2*index+1);
        }
        if((2*index+2)<arr.length){
            postOrder(2*index+2);
        }
        System.out.println(arr[index]);
    }
}