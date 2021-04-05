package hashtab;

import java.util.Scanner;

public class HashTabDemo {
    public static void main(String[] args) {
        //创建哈希表
        HashTab hashTab = new HashTab(7);

        //写一个简单的菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("add:  添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("find: 查找雇员");
            System.out.println("exit: 退出系统");

            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    //创建 雇员
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("请输入要查找的id");
                    id = scanner.nextInt();
                    hashTab.findEmpById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}

class HashTab{
   private EmLinledList[] emLinledListArray;
   private int size;

    public HashTab(int size) {
        this.size = size;
        //这里要特别注意，我这个打字也太慢了吧，没办法就这样了。
        emLinledListArray = new EmLinledList[size];
        for(int i = 0;i<size;i++){
            emLinledListArray[i] = new EmLinledList();
        }
    }
    public void add(Emp emp){
        int empLinklistNo = hashFun(emp.id);
        emLinledListArray[empLinklistNo].add(emp);
    }
    public void list(){
        for(int i = 0;i<size;i++){
            emLinledListArray[i].list(i);
        }
    }
    public int hashFun(int id){
        return id % size;
    }

    public void findEmpById(int id) {
        int empLinklistNo = hashFun(id);
        Emp emp = emLinledListArray[empLinklistNo].findEmpById(id);
        if(emp != null) {//找到
            System.out.printf("在第%d条链表中找到 雇员 id = %d\n", (empLinklistNo + 1), id);
        }else{
            System.out.println("在哈希表中，没有找到该雇员~");
        }
    }
}
class Emp{
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

}
class EmLinledList{
    private Emp head;
    public void add(Emp emp){
        if (head==null){
            head = emp;
            return;
        }
        Emp curEmp = head;
        while (true){
            if (curEmp.next==null){
                break;
            }
            curEmp = curEmp.next;
        }
        curEmp.next = emp;
    }
    public void list(int no){
        if(head == null) { //说明链表为空
            System.out.println("第 "+(no+1)+" 链表为空");
            return;
        }
        System.out.print("第 "+(no+1)+" 链表的信息为");
        Emp curEmp = head; //辅助指针
        while(true) {
            System.out.printf(" => id=%d name=%s\t", curEmp.id, curEmp.name);
            if(curEmp.next == null) {//说明curEmp已经是最后结点
                break;
            }
            curEmp = curEmp.next; //后移，遍历
        }
        System.out.println();
    }
    public Emp findEmpById(int id) {
        //判断链表是否为空
        if(head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emp curEmp = head;
        while(true) {
            if(curEmp.id == id) {//找到
                break;//这时curEmp就指向要查找的雇员
            }
            //退出
            if(curEmp.next == null) {//说明遍历当前链表没有找到该雇员
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;//以后
        }

        return curEmp;
    }
}