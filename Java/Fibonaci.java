public class Fibonaci{
	public static void main(String args[]){
		int a = 0, b = 1, c = 0, i = 0;
		System.out.print("Con el ciclo for: ");
		for(i = 0; i < 10; i++){
			if(i < 9){
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}
			else{
				System.out.print(a);
			}
		}
		System.out.println("");

		a = 0;
		b = 1;
		c = 0;
		i = 0;
		System.out.print("Con el ciclo while: ");
		while(i < 10){
			if(i < 9){
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}
			else{
				System.out.print(a);
			}
			i++;
		}
		System.out.println("");

		a = 0;
		b = 1;
		c = 0;
		i = 0;
		System.out.print("Con el ciclo do-while: ");
		do{
			if(i < 9){
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}
			else{
				System.out.print(a);
			}
			i++;
		}while(i < 10);
	}
}