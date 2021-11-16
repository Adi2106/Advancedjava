package com.first.FitstSpringProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Stud.Stud;

public class App 
{	
    public static void main( String[] args )
    {
        Resource r = new ClassPathResource("Beans.xml");
        BeanFactory bf = new XmlBeanFactory(r);
        Stud s = (Stud)bf.getBean("first");
        System.out.println("ID"+ s.getSid() );
        System.out.println("Name"+ s.getName() );
    }
}
