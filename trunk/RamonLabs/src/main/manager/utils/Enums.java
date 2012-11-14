package utils;

public class Enums{
	public enum TIPO_CUENTA {
	        CAJA_AHORROS(1, 1, "Caja de Ahorros", 0.0, 500), CUENTA_CORRIENTE(2, 5,
	                        "Cuenta Corriente", 0.06, 1000);
	
	        private int id;
	        private int _cantidadMax;
	        private String nombre;
	        private double _costoMovimiento;
	        private double _limiteDescubierto;
	
	        TIPO_CUENTA(int _key, int _cantidadMax, String _nombre,
	                        double _costoMovimiento, double _limiteDescubierto) {
	                this.id = _key;
	                this._cantidadMax = _cantidadMax;
	                this.nombre = _nombre;
	                this._costoMovimiento = _costoMovimiento;
	                this._limiteDescubierto = _limiteDescubierto;
	        }
	
	        public int cantMax() {
	                return this._cantidadMax;
	        }
	
	        public int getId() {
	                return this.id;
	        }
	
	        public String getNombre() {
	                return this.nombre;
	        }
	
	        public double costoMovimiento() {
	                return this._costoMovimiento;
	        }
	        public double limiteDescubierto(){
	                return this._limiteDescubierto;
	        }
	
	        public static TIPO_CUENTA get_enum(int _key) {
	                switch (_key) {
	                case 1:
	                        return CAJA_AHORROS;
	                case 2:
	                        return CUENTA_CORRIENTE;
	                default:
	                        break;
	                }
	                return CAJA_AHORROS;
	        }
	}
	
}
