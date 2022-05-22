package com.nv.Spring_pr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring_info.xml");
    	
    	Car obj=(Car)context.getBean("car");
    	obj.drive();
        
    }
}
// xml comment shortcut -   ctrl+shift+c