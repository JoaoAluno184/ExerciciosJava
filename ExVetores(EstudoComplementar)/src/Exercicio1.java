import java.util.Scanner;
public class Exercicio1 {
		public static void main (String[]args) {
			int a[]=new int[20];
			int b[][]=new int[2][20];
			Scanner ler=new Scanner (System.in);
			int i=0, v=0;
			for(i=0;i<20;i++) {
				System.out.println("Insira um " +(i+1)+"º Valor");
				a[i]= ler.nextInt();
			}
			for(i=0;i<20;i++) {
				if (a[i]%2==0) {
					b[0][i]=a[i];
					
				}
				else { 
					b[1][i]= a[i];
				}
			}
			for(i=0;i<2;i++) {
				for(v=0;v<20;v++) {
					System.out.println(b[i][v]);
				}
				System.out.println("");
			}
		}
	}

