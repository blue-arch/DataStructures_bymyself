package queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        char key = ' ';
        boolean loop = true;
        while(loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'e':
                    loop = false;
                    break;
                case 'a':
                    System.out.println("请输入一个数：");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.println("取出的数据为："+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 'h':
                    try {
                        int res = queue.getQueue();
                        System.out.println("头部的数据为："+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                default:
                    break;
            }

        }

    }
}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[maxSize];
    }

   public boolean isFull(){

        return maxSize-1==rear;
   }
   public boolean isEmpty(){
        return front==rear;
   }
   public void addQueue(int n){
        if(isFull()){
            return;
        }
        arr[++rear] = n;
   }

   public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取数据！");
        }
        front++;
        return arr[front];
   }
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空，不能显示数据！");
            return;
        }
        for (int value : arr) {
            System.out.println(value);
        }

    }
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取数据！");
        }
        return arr[front+1];
    }

}





