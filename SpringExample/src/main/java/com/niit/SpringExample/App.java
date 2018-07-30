package com.niit.SpringExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Resource resource=new ClassPathResource("beans.xml");
       BeanFactory factory=new XmlBeanFactory(resource);
       Car car1=(Car)factory.getBean("car");
      
       
       car1.display();
       
    }
}
