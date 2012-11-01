package com.ramonlabs.ramonbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ramonlabs.ramonbank.dbaccess.Cliente;
import com.ramonlabs.ramonbank.dbaccess.Cuenta;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {  
        	
    	String[] contexto = new String[] {"hibernate-spring.xml"};
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(contexto);

    	Cliente cliente = (Cliente) ctx.getBean("clienteBean");
    	
    	
    	//hola como erstas
    	for (Cliente cl :cliente.loadAll() )
    	{
    		System.out.println( cl.getApellido());
    		for (Cuenta cu : cl.getCuentas())
    		{
    			System.out.println("lascuentas");
    			System.out.println(cu.getSaldo());
    			System.out.println(cu.getTipo());
    			System.out.println(cu.getIdCliente());
    		}
    		
    	}
    	
    	/*cuenta.setSaldo(1000);
    	cuenta.setDescubierto(200);
    	cuenta.setIdCliente(3);
    	cuenta.setTipo(1);
    	cuenta.setEstado(true);
    	cuenta.save();*/
    	
        
    }
}
