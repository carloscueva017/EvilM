package tads.fecha;

public class Fechas {

	public static String toString(Fecha fecha) {
		return conZero(fecha.dia) + "-" + conZero(fecha.mes) + "-" + fecha.año;
	}
	
	private static String conZero(int num) {
		if (num > 10) {
			return String.valueOf(num);
		}
		return "0" + num;
	}
}
