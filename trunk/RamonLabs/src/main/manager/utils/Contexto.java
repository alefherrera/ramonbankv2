package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class Contexto {
	
	private static String[] contexto ;
	private static ApplicationContext ctx ;
	
	static {
		contexto = new String[] {"hibernate-spring.xml"};
		ctx = new ClassPathXmlApplicationContext(contexto);
	}
	
	public static Object getBean(String bean)
	{
		return ctx.getBean(bean);
	}
	
}
