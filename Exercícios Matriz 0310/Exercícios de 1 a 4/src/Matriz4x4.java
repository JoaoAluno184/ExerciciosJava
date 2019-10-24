public class Matriz4x4 {
	public static void main(String[]args) {
		int n[][]=new int[4][4];
		int i = 0, j = 0, a = 2;
			for(i=0; i<=3; i++) {
				for(j=0; j<=3; j++) {
					n[i][j]=a;
					a=a*2;
				}
			}
			for(i = 0; i<= 3; i++) {
				for(j = 0; j<= 3; j++) {
					System.out.print("[ "+n[i][j]+" ]");
					if(j==3) {
						System.out.print("\n");
				}
			}
		}
	}
}
