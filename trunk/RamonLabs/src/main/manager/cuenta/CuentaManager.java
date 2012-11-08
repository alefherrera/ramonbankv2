package cuenta;

import com.ramonlabs.ramonbank.dbaccess.Cuenta;
import com.ramonlabs.ramonbank.dbaccess.Parametro;

import utils.Contexto;
import utils.Enums;
import utils.OperationException;
import utils.Validator;


public class CuentaManager {
	
	public static void Registro(Cuenta cuenta) throws OperationException
	{
		//Validaciones
        if(cuenta == null){
                throw new OperationException("El objeto cuenta es null");
        }
        if (cuenta.getId()<0){
        	throw new OperationException("Cuenta incorrecta");
        }
        if (cuenta.getIdCliente()<0){
        	throw new OperationException("idCliente incorrecta");
        }
        if (!cliente.ClienteManager.ExisteCliente(cuenta.getIdCliente()))
        	throw new OperationException("idCliente asignado a la cuenta no existe en la db");
        
        cuenta.setSaldo(0);
        cuenta.setDescubierto(0);
        
        Parametro p_IDCliente = new Parametro("IdCliente", cuenta.getIdCliente());
        Parametro p_Tipo = new Parametro("tipo", cuenta.getTipo());
        Parametro p_Activo = new Parametro("activo", 1);
        
        //TODO: Ale, ver como hacer para que funcione el select al mandar dos parametros!
        int CuentaCantidad = cuenta.select(p_Tipo, p_IDCliente, p_Activo).size();
        
        	
        if (Enums.TIPO_CUENTA.get_enum(cuenta.getTipo()).cantMax() > CuentaCantidad) {
                // Puedo crear la cuenta
                cuenta.save();
        } else {
                throw new OperationException("El cliente tiene "
                                + CuentaCantidad + "/"
                                + Enums.TIPO_CUENTA.get_enum(cuenta.getTipo()).cantMax()
                                + "/s cuentas creadas");
        }
	}
	
	
	public static void Baja(int id) throws OperationException
	{
		if(id <= 0)
			throw new OperationException("Id del cuenta incorrecto");
		
		Cuenta cuenta = (Cuenta) Contexto.getBean("cuentaBean");
		Parametro param = new Parametro("id", id);
		cuenta = cuenta.load(param);
		if(cuenta == null)
			throw new OperationException("La Id no concuerda con ningun cuenta");
		cuenta.setActivo(false);
		
		cuenta.update();
	}
	
	public static void Modificar(Cuenta cuenta) throws OperationException
	{
		if(cuenta == null)
			throw new OperationException("El objeto cuenta es null");
		if(cuenta.getId() <= 0)
			throw new OperationException("Id de la cuenta incorrecto");

		cuenta.update();
	}

}
