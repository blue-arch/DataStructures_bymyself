package linkedlist;

public class josephu {
    public static void main(String[] args) {
        CircleLinkedlist circle= new CircleLinkedlist();
        circle.addBoy(5);
        circle.showBoy();

        circle.countBoy(1,2,5);
    }
}
class CircleLinkedlist{
    private Boy first = null;
    public void countBoy(int startNum,int countNo,int num){
        Boy helper = first;
        while (true){
            if(helper.getNext()==first){
                break;
            }
            helper = helper.getNext();
        }
        for(int i=0;i<startNum-1;i++){
            first=first.getNext();
            helper=helper.getNext();
        }
        while(true){
            if(helper==first){
                break;
            }
            for(int j =0;j<countNo-1;j++){
                first=first.getNext();
                helper=helper.getNext();
            }
            System.out.println("小孩出圈："+first.getNo());
            first=first.getNext();
            helper.setNext(first);
        }
        System.out.println("最后在圈中的小孩："+first.getNo());
    }
    public void addBoy(int num){
        if(num<1){
            System.out.println("num的值不正确");
        }
        Boy curBoy = null;
        for(int i =1;i<=num;i++){
            Boy boy = new Boy(i);
            if(i==1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }
            curBoy.setNext(boy);
            boy.setNext(first);
            curBoy=boy;
        }
    }
    public void showBoy(){
        if(first==null){
            System.out.println("链表为空");
            return;
        }
        Boy curBoy = first;
        while(true){
            System.out.println("小孩的编号："+curBoy.getNo());
            if(curBoy.getNext()==first){
                break;
            }
            curBoy=curBoy.getNext();
        }
    }


}
class Boy{
    private int no;
    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}