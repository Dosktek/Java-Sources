public class MyMath {
	public static void main(String[] args) {
		double n = 0.0;
		if(args[0].equals("-e")) {
			System.out.println("e = " + e());
			System.exit(0);				
		}
		
		if(args[0].equals("-pi")) {
			System.out.println("pi = " + pi());
			System.exit(0);				
		}
		
		if(args[0].equals("-ln")) {
			n = Double.parseDouble(args[1]);
			System.out.println("ln(" + n + ") = " + ln(n));
			System.exit(0);				
		}
		
		if(args[0].equals("-gmt")) {
			n = Double.parseDouble(args[1]);
			System.out.println("gmt(" + n + ") = " + gmt(n));
			System.exit(0);				
		}
	}
	
	/* pow()
	 * Eleva la base al exponente dado	 
	 */
	public static double pow(double base, int exponente){
		double res = 1.0;
		
		if(base == 1.0) {
			return 1.0;
		}
		
		if(exponente == 0) {
			return 1.0;
		}
		else if(exponente < 0){
			exponente *= -1;
		}
		
		for(int i = 1; i <= exponente; ++i) {
			res *= base;
		}
		
		return (exponente >= 0) ? res : 1/res;		
	}
	
	/* fac()
	 * Devuelve el factorial de param
	 */
	public static long fac(int param) {
		long res = 1;
		for(int i = 1; i <= param; ++i)
			res *= i;
			
		return res;
	}
	
	/* e()
	 * Devuele el numero e (2.718281 ..)
	 */
	public static double e(){
		double res = 0;
		for(int i = 0; i < 20; ++i){
			res += pow(1, i)/fac(i);
		}
		
		return res;
	}
	
	/* pi()
	 * Devuele el numero pi (3.14 ..)
	 */
	public static double pi(){
		double res = 0;
		for(int i = 0; i < 100000; ++i){
			res += pow(-1, i)/(2*i + 1);
		}
		
		return res*4;
	}
	
	/*	ln(param)
	 *	Devuelve el logaritmo natural de param, cuando
	 *	param esta entre 0 y 2
	 */
	
	public static double ln(double param) {
		double res = 0;
		for(int i = 1; i <= 100; ++i){
			res += pow(-1, i + 1) * pow(param - 1, i) / i;
		}
		
		return res;
	}
	
	/*	gmt(param)
	 *	Devuelve la serie geomtrica de param, cuando
	 *	|param| < 1
	 */
	
	public static double gmt(double param) {
		double res = 0;
		for(int i = 0; i < 100; ++i){
			res += pow(param, i);
		}
		
		return res;
	}
}