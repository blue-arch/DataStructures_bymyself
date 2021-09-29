package test.ComparatorAndComparable;

import java.util.Comparator;

public class StaffComparator implements Comparator<Staff> {

    //不一定要自然排序即升序，可以反过来写成降序
    @Override
    public int compare(Staff o1, Staff o2) {
        //降序
     /*if(o1.getSalary()>o2.getSalary()){
       return -1;
     }
     if(o1.getSalary()<o2.getSalary()){
       return 1;
     }
     return 0;*/

        //升序
     /*if(o1.getSalary()>o2.getSalary()){
       return 1;
     }
     if(o1.getSalary()<o2.getSalary()){
       return -1;
     }
     return 0;*/

        //先按照年龄倒序排，如果年龄相等比较工资
        if(o1.getAge()>o2.getAge()){
            return -1;
        }
        if(o1.getAge()<o2.getAge()){
            return 1;
        }
        //能到这里说明年龄相等，继续比较工资
        if(o1.getSalary()>o2.getSalary()){
            return 1;
        }
        if(o1.getSalary()<o2.getSalary()){
            return -1;
        }
        return 0;
    }
}