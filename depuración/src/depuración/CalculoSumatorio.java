package depuración;

public class CalculoSumatorio {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int suma=0;
		int mayor, menor;
		if(a>b) {
			mayor=b;
			menor=a;
		}else {
			mayor=a;
			menor=b;
		}
		for(int i=menor;i<=mayor;i++) {
			suma+=i;
		}
		System.out.println("La suma es "+suma);

	}

}
