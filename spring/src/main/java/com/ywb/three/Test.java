package com.ywb.three;

import com.ywb.two.OneBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		OneBean bean1=(OneBean) context.getBean("getOneBean");

		
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
		context1.scan("com.ywb.three");
		context1.refresh();
		String zz = context1.getBean(Second.class).toString();
		System.out.println(zz);

		System.out.println(bean1);

	}
}
