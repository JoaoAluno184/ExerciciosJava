public class ExB {
	public static void main(String[]args) {
		int m[][]=new int[3][3];
		int i, j, ma=0, me=0, l=0, c=0, ml=0, mc=0;
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				m[i][j]=(int)(Math.random()*30);
			}
		}
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				if(i==0 && j==0) {
					 me=m[i][j];
				}
				if(m[i][j]<me) {
					me=m[i][j];
					ml=i;
					mc=j;
				}
				if(m[i][j]>ma) {
					ma=m[i][j];
					l=i;
					c=j;
				}
				System.out.print("[ "+m[i][j]+" ]");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println(" ");
		System.out.println("O maior n�mero �: "+ma);
		System.out.println("Linha: "+l);
		System.out.println("Coluna: "+c);
		System.out.println("");
		System.out.println("O menor n�mero �: "+me);
		System.out.println("Linha: "+ml);
		System.out.println("Coluna: "+mc);

	}
}