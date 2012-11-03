package cliente;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

import utils.Enums;
import utils.OperationException;

public class ClienteManager {
	public static void Registro(Cliente cliente) throws OperationException{
		if(cliente == null){
			throw new OperationException("Cliente es nulo");
		}
		if (cliente.getDni().equals("")){
			throw new OperationException("Cliente DNI no posee datos");
		}
		if (cliente.getApellido().equals("")){
			throw new OperationException("Cliente DNI no posee datos");
		}
		
			
		
	}
}
