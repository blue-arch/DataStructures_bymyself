package linkedlist;

public class DoubleLinkedlist {
    public static void main(String[] args) {
        System.out.println("双向链表的测试：");
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");

        DoubleLinkedlist1 doublelinkedlist1 = new DoubleLinkedlist1();
        //加入
//        doublelinkedlist1.add(hero1);
//        doublelinkedlist1.add(hero4);
//        doublelinkedlist1.add(hero2);
//        doublelinkedlist1.add(hero3);
//        doublelinkedlist1.list();

//        HeroNode2 newhero = new HeroNode2(3,"公孙胜","入云龙");
//        doublelinkedlist1.update(newhero);
//        doublelinkedlist1.list();
        doublelinkedlist1.addByOrder(hero1);
        doublelinkedlist1.addByOrder(hero4);
        doublelinkedlist1.addByOrder(hero2);
        doublelinkedlist1.addByOrder(hero3);
        doublelinkedlist1.list();

    }
}

class HeroNode2{
    private int no;
    private String name;
    private String nickname;
    private HeroNode2 next;
    private HeroNode2 pre;

    public HeroNode2(int no, String name, String nickname) {
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

    public HeroNode2 getNext() {
        return next;
    }

    public void setNext(HeroNode2 next) {
        this.next = next;
    }

    public HeroNode2 getPre() {
        return pre;
    }

    public void setPre(HeroNode2 pre) {
        this.pre = pre;
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
class DoubleLinkedlist1{
    private HeroNode2 head = new HeroNode2(0,"","");
    public void addByOrder(HeroNode2 heroode){
        HeroNode2 temp = head;
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
            heroode.setPre(temp);
            temp.getNext().setPre(heroode);
        }
    }
    public void del(int no){
        if(head.getNext()==null){
            System.out.println("链表为空..");
            return;
        }
        HeroNode2 temp = head.getNext();
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if(temp.getNo()==no){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if(flag){
            temp.getPre().setNext(temp.getNext());
            if(temp.getNext()!=null){
                temp.getNext().setPre(temp.getPre());
            }
        }else {
            System.out.println("要删除的"+no+"不存在");
        }


    }
    public void update(HeroNode2 heroNode){
        if(head.getNext()==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.getNext();
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
    public void add(HeroNode2 heronode){
        HeroNode2 temp = head;
        while (true){
            if(temp.getNext()==null){
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(heronode);
        heronode.setPre(temp);
    }
    public void list(){
        if(head.getNext()==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.getNext();
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}