package pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m, p;
		Scanner input;
		Lista listacircular = null;
		input = new Scanner(System.in);

		System.out.println("Digite quantas pessoas tem no círculo e a ordem para remove las");

		n = input.nextInt();
		m = input.nextInt();
		listacircular = new Lista();
		listacircular.CriarLista(n);
		listacircular.ImprimirListaComp(n);

		listacircular.Remocao(m);

		p = listacircular.Final();
		System.out.println(p + " é a posição em que Josephus deve estar");
		input.close();
	}

}
