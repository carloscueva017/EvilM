
public class Estados {

	public static class Espera implements Estado {

		@Override
		public Estado agregarMoneda() {
			System.out.println("maquina lista");
			return new Lista();
		}

		@Override
		public Estado empezarJugar() {
			return this;
		}

	}

	public static class Lista implements Estado {

		@Override public Estado agregarMoneda() {
			return this;
		}
		
		@Override
		public Estado empezarJugar() {
			System.out.println("comienza juego");
			return new Jugando();
		}
	}

	public static class Jugando implements Estado {
		
		@Override public Estado agregarMoneda() {
			return this;
		}
		
		@Override
		public Estado empezarJugar() {
			return this;
		}
	}
}
