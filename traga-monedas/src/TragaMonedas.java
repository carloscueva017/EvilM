
public class TragaMonedas {
	
	
	public static void main(String[] args) {
		Maquina maq = new Maquina();
		
		maq.empezarJugar();
		maq.agregarMonedas();
		maq.agregarMonedas();
		maq.empezarJugar();
		maq.agregarMonedas();
		
		System.out.print(maq.monedas());
	}
	
	
}
