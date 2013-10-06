package herencia;

	
	public class gato implements IGritable{
		public String raza;
		public String color;
		
		
		@Override
		public void gritar() {
			System.out.println("MiauuuuuuuuArggggggg");
			
		}
		@Override
		public void callar() {
			// TODO Auto-generated method stub
			System.out.println("Miau");
		}
	}