
public class Maquina {

	private int monedas = 0;
	private Estado estado = new Estados.Espera();

	public void agregarMonedas() {
		monedas = monedas + 1;
		estado = estado.agregarMoneda();
	}
	
	public int monedas () {
		return monedas;
	}
	
	public void empezarJugar() {
		estado = estado.empezarJugar();
	}
}
