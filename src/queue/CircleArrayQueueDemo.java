package queue;

import java.util.Scanner;

public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue2 queue = new ArrayQueue2(4);
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
                    break;
                case 'h':
                    try {
                        int res = queue.getQueue();
                        System.out.println("头部的数据为："+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
            }

        }

    }
}


class ArrayQueue2{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue2(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.arr = new int[maxSize];
    }

    public boolean isFull(){

        return (rear+1)%maxSize==front;
    }
    public boolean isEmpty(){
        return front==rear;
    }
    public void addQueue(int n){
        if(isFull()){
            return;
        }

        arr[rear] = n;
        rear = (rear+1)%maxSize;

    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取数据！");
        }
        int value = arr[front];

        front = (front+1)%maxSize;
        return value;
    }
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空，不能显示数据！");
            return;
        }

//        for (int value : arr) {
//            System.out.println(value);
//        }
            for (int i = front;i<front+size();i++){
                System.out.println(arr[i%maxSize]);
            }

    }
    public int size(){
        return  (rear + maxSize - front) % maxSize;

    }
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取数据！");
        }
        return arr[front];
    }

}