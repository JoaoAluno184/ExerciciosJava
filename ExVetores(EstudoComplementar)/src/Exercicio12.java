public class Exercicio12 {
	public static void main(String[]args) {
		int a[]=new int[] {1, 4, 5, 7, 10, 10, 7, 5, 4, 1};
		int i, max=9, min=0, aux=0;
		for(i=0; i<10; i++, max--, min++) {
			if(a[max]==a[min]) {
				aux++;
			}
		}
		if(aux==10) {
			System.out.println("O vetor é um Políndromo!");
		}
		else{
			System.out.println("O vetor não é um Políndromo!");
		}
	}
}
