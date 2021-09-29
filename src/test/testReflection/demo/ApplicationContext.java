package test.testReflection.demo;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class ApplicationContext {
    private HashMap<String, Object> map= new HashMap<String, Object>();
    public ApplicationContext(String xml) {
        SAXReader reader = new SAXReader();
        try{
            //读取xml
            InputStream in = this.getClass().getClassLoader().getResourceAsStream(xml);
            Document doc = reader.read(in);
            //解析XML内容 获取全部的<bean>
            List<Element> beans = doc.getRootElement().elements();
            for (Element e : beans) {
                //e 是每个 <bean> 元素
                String id = e.attributeValue("id");
                String className = e.attributeValue("class");
                //利用反射创建对象
                Class cls = Class.forName(className);
                Object obj = cls.newInstance();
                //对象缓存到 map中
                map.put(id, obj);
            }

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public Object getBean(String id){
        return map.get(id);
    }
    public static void main(String[] args) {
        String conf = "test.testReflection.demo.application.xml";//test\testReflection\demo\application.xml
        ApplicationContext ac = new ApplicationContext(conf);
        Object o = ac.getBean("date");
        System.out.println(o); //Fri Sep 16 21:30:07 CST 2016
    }
}