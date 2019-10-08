import java.util.Scanner;
public class Exercicio8 {
		public static void main(String[] args) {
			int a[]=new int[10];
			int b[]=new int[10];
			Scanner ler=new Scanner(System.in);
			int i=0, j=0, d , c;
			for (i=0;i<10;i++) {
				System.out.println("Digite o "+(i+1)+"° valor desejado:");
				a[i]=ler.nextInt();
			}
			for(i=0; i<10; i++) {
				for(j=9; j>=i; j--) {
					c=0;
					d=c;
					while(c<=a[j]) {
						d+=c;
						c++;
					}
					b[i]=d;
				}
			}
			for(i=0;i<10;i++) System.out.print(a[i]+"	");
			System.out.println("");
			for(i=0;i<10;i++) System.out.print(b[i]+"	");
		}
		
	}