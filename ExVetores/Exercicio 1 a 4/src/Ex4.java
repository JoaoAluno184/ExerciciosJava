import java.util.Scanner;
public class Ex4 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int v[]=new int[7];
		for(int i=0; i<7; i++) {
			System.out.println("Digite o "+(i+1)+"� valor:");
			v[i]=ler.nextInt();
		}
		System.out.print("(");
		for(int i=0; i<7; i++) {
			if(i==6) {
				System.out.print((v[i]*2)+")");
			}
			else {
				System.out.print((v[i]*2)+", ");
			}
		}
	}
}