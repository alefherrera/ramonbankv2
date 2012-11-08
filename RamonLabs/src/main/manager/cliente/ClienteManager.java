package cliente;


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
        
        
             
    	Cliente clienteDNI = (Cliente) Contexto.getBean("clienteBean");
        Parametro param = new Parametro("dni", cliente.getDni());
        
        if (clienteDNI.select(param).size()>0)
        	throw new OperationException("El DNI ya existe en la base!");
        
        cliente.save();
	}
	
	
	public static void Baja(int id) throws OperationException
	{
		if(id <= 0)
			throw new OperationException("Id del cliente incorrecto");
		
		Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
		Parametro param = new Parametro("id", id);
		cliente = cliente.load(param);
		if(cliente == null)
			throw new OperationException("La Id no concuerda con ningun cliente");
		cliente.setActivo(false);
		
		cliente.update();
	}
	
	public static void Modificar(Cliente cliente) throws OperationException
	{
		if(cliente == null)
			throw new OperationException("El objeto cliente es null");
		if(cliente.getId() <= 0)
			throw new OperationException("Id del cliente incorrecto");

		cliente.update();
	}
	
	//Devuelve true si el cliente existe
	public static boolean ExisteCliente(int idCliente)
	{
		Cliente clienteDNI = (Cliente) Contexto.getBean("clienteBean");
        Parametro param = new Parametro("dni", idCliente);
        
        if (clienteDNI.select(param).size()>0)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}
}
