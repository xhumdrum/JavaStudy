package com.basic.a08_xml;

import com.basic.a07_classloader.Student;
import com.basic.a07_classloader.StudentCalssDemo1;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Hashtable;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        // 1. 创建 dom4j 解析对象
        SAXReader sr = new SAXReader();
        // 2. 加载 xml 文件
        Document doc = sr.read("JavaBasic/xml/student.xml");

        // 3. 获取根标签
        Element rootElement = doc.getRootElement();

        // 4. 获取根标签包含的元素
        //List elements = rootElement.elements();  // 获取全部的标签元素
        List<Element> students = rootElement.elements("student");
        for (Element student : students) {
            // 获取标签的属性 id 对象
            Attribute id = student.attribute("id");
            // 获取标签体
            String name = student.element("name").getText();
            String age = student.element("age").getText();
            // 创建 student 对象
            Student st = new Student(name, Integer.parseInt(age));

            System.out.println(id.getText() + "." +st);
        }
    }
}
