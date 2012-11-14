package cliente;


import java.util.List;

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
        if(cliente.getApellido() == "" || cliente.getApellido() == null){
                throw new OperationException("Apellido incorrecto");
        }
        if(cliente.getNombre() == "" || cliente.getNombre() == null){
                throw new OperationException("Nombre incorrecto");
        }
        if(cliente.getDireccion() == "" || cliente.getDireccion() == null){
                throw new OperationException("Direccion incorrecta");
        }
        
        
        
        if (ExisteCliente(cliente.getDni()))
        	throw new OperationException("El DNI ya existe");
        
        cliente.save();
	}
	
	
	public static void Baja(String idCliente) throws OperationException
	{
		if(!Validator.isNumeric(idCliente))
			throw new OperationException("Id del cliente incorrecto");
		int id = Integer.parseInt(idCliente);
		
		if(id <= 0)
			throw new OperationException("Id del cliente incorrecto");
		
		Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
		Parametro param = new Parametro("id", id);
		cliente.Copy(cliente.Load(param));
		if(cliente.getId() <= 0)
			throw new OperationException("La Id no concuerda con ningun cliente");
		
		cliente.setActivo(false);
		
		cliente.update();
	}
	
	
	public static void Modificar(Cliente cliente) throws OperationException
	{
		if(cliente == null)
			throw new OperationException("El objeto cliente es null");
		
		cliente.setId(CargarClienteDNI(cliente.getDni()).getId());
		if(cliente.getId() <= 0)
			throw new OperationException("Cliente no existente");
		cliente.update();
	}
	
	//Devuelve true si el cliente existe
	public static boolean ExisteCliente(String DNI)
	{
		Cliente clienteDNI = (Cliente) Contexto.getBean("clienteBean");
        Parametro param = new Parametro("dni", DNI);
		Parametro param_activo = new Parametro("activo", true);
        
        if (clienteDNI.select(param, param_activo).size()>0)
        	return true;
        else
        	return false;
	}
	
	public static boolean ExisteCliente(int Id)
	{
		Cliente clienteID = (Cliente) Contexto.getBean("clienteBean");
        Parametro param = new Parametro("id", Id);
		Parametro param_activo = new Parametro("activo", true);
        
        if (clienteID.select(param, param_activo).size()>0)
        	return true;
        else
        	return false;
	}
	
	public static Cliente CargarClienteID(int idCliente)
	{
		Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
        Parametro parametro = new Parametro("id", idCliente);
        return cliente.Load(parametro);
	}
	
	public static Cliente CargarClienteID(String idCliente) throws OperationException
	{
		Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
		if(!Validator.isNumeric(idCliente))
			throw new OperationException("ID de cliente incorrecta");
		
        Parametro parametro = new Parametro("id", Integer.parseInt(idCliente));
        return cliente.Load(parametro);
	}
	
	public static Cliente CargarClienteDNI(String DNI)
	{
		Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
        Parametro parametro = new Parametro("dni", DNI);
        return cliente.Load(parametro);
	}
	
	public static List<Cliente>ListarClientes(){
		Cliente cliente =  (Cliente) Contexto.getBean("clienteBean");
		return cliente.select();
	}
	
	public static List<Cliente>ListarClientesActivos(){
		Cliente cliente =  (Cliente) Contexto.getBean("clienteBean");
		Parametro param = new Parametro("activo", true);
		return cliente.select(param);
	}
}
