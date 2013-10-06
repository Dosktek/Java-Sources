import java.util.*;
public class guia_1 {
	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2, x= 4;
		int radio ;
		
		int y = a * x * x * x + 7,
		t = a * x * x * ( x + 7),
		u = (a * x ) * x * ( x + 7), //erronea
		v = (a * x ) * x * x + 7, //erronea
		w = a* (x*x*x)+7,
		z = a * x * ( x * x + 7);
		
		System.out.printf("%d %d %d %d %d\n",y,t,u,v,w,z);
		System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14");
		System.out.print("1 2 3 4 5 6 7 8 9 10 11 12 13 14");
		System.out.print("\n1 2 3");
		System.out.print(" 4 5 6 7");
		System.out.print(" 8 9 10 11");
		System.out.print(" 12 13 14\n");
		
		System.out.print("*********        **         *         *");
		System.out.print("\n*       *       *  *       ***       * *");
		System.out.print("\n*       *      *    *     *****     *   *");
		System.out.print("\n*       *     *      *      *      *     *");
		System.out.print("\n*       *     *      *      *     *       *");
		System.out.print("\n*       *     *      *      *    *         *");
		System.out.print("\n*       *     *      *      *     *       *");
		System.out.print("\n*       *      *    *       *      *     *");
		System.out.print("\n*       *       *  *        *       *   *");
		System.out.print("\n*********        **         *         *\n");
		
		
		entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el radio");
		radio = entrada.nextInt();
		System.out.println("Diametro:" + 2 * radio +  "\nArea: " + ((float) Math.PI * radio * radio) + "\nCircunferencia: " + ((float) (2 * Math.PI * radio)) );
		
		
		System.out.printf("El carácter %c tien e el valor %d\n", 'A', ( (int) 'A' ) ) ;

	}

}
