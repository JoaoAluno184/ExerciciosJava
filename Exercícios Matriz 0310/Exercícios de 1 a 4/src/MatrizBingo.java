import java.util.Scanner;
public class MatrizBingo {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int m[][]=new int[4][4];
		int i = 0, j, at, c = 0, ka = 0, x, ganho = 0, ajd = 0;
		int numero[]=new int[16];
		for(at=0;at<numero.length;at++){
			int rand=(int)((Math.random()*74)+1);
			boolean e = false;
			for(int g = 0;g<at;g++){
				if(numero[g]==rand){
					e = true;
					break;
				}
				else{
					e = false;
				}
			} 
			if(!e){
				numero[at]=rand; 
			}
			else{
				at--;
			}
        }
		for(i=0, ajd=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				m[i][j]=numero[ajd];
				ajd++;
			}
		}
		for(i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
		System.out.println(" ");
		while(ka==0) {
			System.out.println("Escolha 1 número na tabela : ");
			x=ler.nextInt();
			for(i=0; i<=3; i++) {
				for(j=0; j<=3; j++) {
					if(x==m[i][j]) {
						ganho++;
					}
				}
			}
			if(ganho==16) {
				ka+=1;
			}
			else {
				ka+=0;
			}
			c++;
		}
		System.out.println(" EBA BINGO!");
		System.out.println("Você conseguiu no "+c+"º número");
	}
}

