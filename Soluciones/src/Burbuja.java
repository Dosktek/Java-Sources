public class Burbuja {
	public static void main(String[] args) {
		
		// Para convertir de String a double
		double[] v = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			v[i] = Double.parseDouble(args[i]);
		}
		
		// Metodo de ordenamiento
		double temp;
        int t = v.length;
        for (int i = 1; i < t; i++) {
            for (int k = t - 1; k >= i; k--) {
                if(v[k] < v[k-1]){
                    temp = v[k];
                    v[k] = v[k-1];
                    v[k-1]=  temp;
                }
            }
        }
        
        for (double x : v) {
			System.out.print(x + " ");
		}
	}
}