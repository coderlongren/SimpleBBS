package test;

import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coderlong.config.AppConfig;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		test obj = (test)context.getBean("helloworld"); 
		obj.print();
	}

}
