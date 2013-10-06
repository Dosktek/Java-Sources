
public class internto5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float min = 0;
		for (int i =0; i<args.length;i++){
			float numero = Float.parseFloat(args[i]);
			if (i==0){
				min = numero;
			}else if(numero<min){
				min = numero;
			}
			
		}
		System.out.println("el numero menor es: " + min);
	}

}
