import java.util.Scanner;
public class Ex2 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int i=0, j=0, n, m, x;
		System.out.println("Digite a quantidade de linhas :");
		m=ler.nextInt();
		System.out.println("Digite a quantidade de colunas:");
		n=ler.nextInt();
		System.out.print("\n");
		int v[][]=new int[m][n];
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				v[i][j]=(int)(Math.random()*50);
			}
		}
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				System.out.print("[ "+v[i][j]+" ]");
				if(j==n-1) {
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		System.out.println("Digite um n�mero:");
		x=ler.nextInt();
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				if(v[i][j]==x) {
					System.out.print("\n");
					System.out.println(" Posi��o  "+i+","+j+":");
					if(j-1>=0) {
						System.out.println("A Esquerda: "+v[i][j-1]);
					}
					if(j+1<=n) {
						System.out.println("A Direita: "+v[i][j+1]);
					}
					if(i+1<m) {
						System.out.println("Em baixo: "+v[i+1][j]);
					}
					if(i>0) {
						System.out.println("Em cima: "+v[i-1][j]);
					}
				}
			}
		}
	}
}

