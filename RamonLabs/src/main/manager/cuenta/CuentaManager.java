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
			throw new OperationException("Seleccione una cuenta correcta");
		
		Cuenta cuenta = (Cuenta) Contexto.getBean("cuentaBean");
		Parametro param = new Parametro("id", id);
		cuenta = cuenta.Load(param);
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
			throw new OperationException("Seleccione una cuenta");

		cuenta.update();
	}
	
	public static void Depositar(Cuenta cuenta, int monto) throws OperationException
	{
		if(cuenta == null)
			throw new OperationException("El objeto cuenta es null");
		if(cuenta.getId() <= 0)
			throw new OperationException("Seleccione una cuenta");
		if(monto <= 0)
			throw new OperationException("Monto incorrecto");
		
        Parametro P_Id = new Parametro("id", cuenta.getId());
        cuenta = cuenta.Load(P_Id);
    

        double _costoMovimiento = Enums.TIPO_CUENTA.get_enum(cuenta.getTipo())
                        .costoMovimiento();

        cuenta.setSaldo(cuenta.getSaldo() + monto
                        - (monto * _costoMovimiento));
        cuenta.update();

//        double montoTotal = _monto - (_monto * _costoMovimiento);
//        Movimientos _movimiento = new Movimientos();
//        _movimiento.set_idcuenta(_cuenta.get_id());
//        _movimiento.set_monto(montoTotal);
//        _movimiento.set_origen(MOVIMIENTO.ORIGEN.CAJA.id());
//        _movimiento.set_tipo(MOVIMIENTO.TIPO.DEPOSITO.id());
//        _movimiento.set_saldo(_cuenta.get_saldo());
//        _movimiento.Insert();

        return;
	}
	
	public static void Extraer(Cuenta cuenta, int monto) throws OperationException
	{
		if(cuenta == null)
			throw new OperationException("El objeto cuenta es null");
		if(cuenta.getId() <= 0)
			throw new OperationException("Seleccione una cuenta");
		if(monto <= 0)
			throw new OperationException("Monto incorrecto");
		
		Parametro P_Id = new Parametro("id", cuenta.getId());
        cuenta = cuenta.Load(P_Id);
	    

        double _costoMovimiento = Enums.TIPO_CUENTA.get_enum(cuenta.getTipo())
                        .costoMovimiento();

        if (cuenta.getSaldo() < monto + monto * _costoMovimiento) {
                throw new OperationException(
                                "No hay suficiente saldo para realizar la transferencia");
        }

        cuenta.setSaldo(cuenta.getSaldo() - monto - monto
                        * _costoMovimiento);
        cuenta.update();

//        double montoTotal = _monto + (_monto * _costoMovimiento);
//        Movimientos _movimiento = new Movimientos();
//        _movimiento.set_idcuenta(_cuenta.get_id());
//        _movimiento.set_monto(montoTotal);
//        _movimiento.set_origen(MOVIMIENTO.ORIGEN.CAJA.id());
//        _movimiento.set_tipo(MOVIMIENTO.TIPO.EXTRACCION.id());
//        _movimiento.set_saldo(_cuenta.get_saldo());
//        _movimiento.Insert();
	}
	

}
