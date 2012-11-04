package cliente;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ramonlabs.ramonbank.dbaccess.Cliente;
import com.ramonlabs.ramonbank.dbaccess.Parametro;

import utils.Contexto;
import utils.Enums;
import utils.OperationException;
import utils.Validator;

public class ClienteManager {
	public static void Registro(Cliente cliente) throws OperationException
	{
		//Validaciones
        if(cliente == null){
                throw new OperationException("El objeto cliente es null");
        }
        if(!Validator.valDNI(cliente.getDni())){
                throw new OperationException("DNI incorrecto");
        }
        if(!Validator.validMail(cliente.getEmail())){
                throw new OperationException("Mail incorrecto");
        }
        if(cliente.getApellido() == ""){
                throw new OperationException("Apellido incorrecto");
        }
        if(cliente.getNombre() == ""){
                throw new OperationException("Nombre incorrecto");
        }
        if(cliente.getDireccion() == ""){
                throw new OperationException("Direccion incorrecta");
        }
        
        
        
        //TODO: VER QUE VERGA HACER CON ESTO ALE MEDIA PILA        
    	
    	Cliente cliente2 = (Cliente) Contexto.getBean("clienteBean");
    	
        Parametro param = new Parametro("dni", cliente.getDni());
        
        if (cliente2.select(param).size()>0)
        	throw new OperationException("El DNI ya existe en la base!");
        
        cliente.save();
		
	}
}
