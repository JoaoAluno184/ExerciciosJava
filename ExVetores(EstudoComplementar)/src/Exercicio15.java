import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		int i, j, aux;
		for(i=0; i<10; i++) {
			System.out.println("Escolha o "+(i+1)+"� n�mero:");
			a[i]=ler.nextInt();
		}
		for(i=0; i<10; i++) {
			aux=0;
			for(j=0; j<10; j++) {
				if(a[i]>a[j]) {
					aux++;
				}
			}
			b[aux]=a[i];
		}
		for(i=0; i<10; i++) {
			aux=0;
			for(j=0; j<10; j++) {
				if(a[i]<a[j]) {
					aux++;
				}
			}
			c[aux]=a[i];
		}
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		for(i=0; i<10; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
