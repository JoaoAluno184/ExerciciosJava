public class Matriz3x4 {
	public static void main(String[]args) {
		int m[][]=new int[3][4];
		int i , j , s=0;
		for(i=0; i<=2; i++) {
			for(j=0; j<=3; j++) {
				if(j!=3) {
					m[i][j]=(int)(Math.random()*10);
				}
			}
		}
		for(i=0; i<=2; i++) {
			s=0;
			for(j=0; j<=3; j++) {
				s=s+m[i][j];
				if(j!=3) {
					System.out.print("[ "+m[i][j]+" ]");
				}
				else {
					System.out.println(" = [ "+s+" ]");
				}
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
	}
}
