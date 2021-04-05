package linkedlist;

import java.util.Stack;

public class SingleLinkedlist {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        SingleLinkedlist1 singleLinkedList = new SingleLinkedlist1();

        //加入
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero4);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
//        singleLinkedList.list();
        //加入按照编号的顺序
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);

        HeroNode heroUpdate = new HeroNode(4, "林额为台风", "豹子头");
        singleLinkedList.update(heroUpdate);
        singleLinkedList.del(2);
        //显示一把
        singleLinkedList.list();
        System.out.println(getLength(singleLinkedList.getHead()));

        System.out.println(findLastIndexNode(singleLinkedList.getHead(),2));

        System.out.println();
        reverse(singleLinkedList.getHead());
        singleLinkedList.list();

        System.out.println();
        reversePrint(singleLinkedList.getHead());

    }
    public static void reversePrint(HeroNode head){
        if(head.getNext()==null){
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.getNext();
        while (cur!=null){
            stack.push(cur);
            cur = cur.getNext();
        }
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
    public static void reverse(HeroNode head){
        if(head.getNext()==null||head.getNext().getNext()==null){
            return;
        }
        HeroNode cur = head.getNext();
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");

        while(cur!=null){
            next = cur.getNext();
            cur.setNext(reverseHead.getNext());
            reverseHead.setNext(cur);
            cur = next;
        }
        head.setNext(reverseHead.getNext());
    }
    public static int getLength(HeroNode head){
        if(head.getNext()==null){
            return 0;
        }
        int length = 0;
        HeroNode cur = head.getNext();
        while(cur!=null){
            length++;
            cur = cur.getNext();
        }
        return length;
    }
    public static HeroNode findLastIndexNode(HeroNode head,int index){
        if(head.getNext()==null){
            return null;
        }
        int size = getLength(head);
        if(index<=0||index>size){
            return null;
        }
        HeroNode cur = head.getNext();
        for(int i=0;i<size-index;i++){
            cur=cur.getNext();
        }
        return cur;

    }
}

class HeroNode{
    private int no;
    private String name;
    private String nickname;
    private HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public HeroNode getNext() {
        return next;
    }

    public void setNext(HeroNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname +
                '}';
    }


}

class SingleLinkedlist1{
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    public void add(HeroNode heronode){
        HeroNode temp = head;
        while (true){
            if(temp.getNext()==null){
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(heronode);
    }

    public void list(){
        if(head.getNext()==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head;
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }


    }

    public void addByOrder(HeroNode heroode){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.getNext()==null){
                break;
            }
            if(heroode.getNo()<temp.getNext().getNo()){
                break;
            }else if(heroode.getNo()==temp.getNext().getNo()){
                flag = true;
                break;
            }

            temp=temp.getNext();

        }
        if(flag){
            System.out.println("英雄已经存"+heroode.getNo()+"在，不能添加！");
        }else{
            heroode.setNext(temp.getNext());
            temp.setNext(heroode);
        }
    }

    public void update(HeroNode heroNode){
        if(head.getNext()==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.getNext();
        boolean flag = false;
        while (true){
            if(temp==null){
                System.out.println("遍历结束！");
                return;
            }
            if(temp.getNo()==heroNode.getNo()){
                flag=true;
                break;
            }
            temp = temp.getNext();

        }
        if(flag){
            temp.setName(heroNode.getName());
            temp.setNickname(heroNode.getNickname());
        }else{
            System.out.println("没找到，更新失败"+heroNode.getNo());
        }

    }

    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            if(temp.getNo()==no){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if(flag){
            temp.setNext(temp.getNext().getNext());
        }else {
            System.out.println("要删除的"+no+"不存在");
        }


    }
}