package pack;

public class Lista {
	Nodo nodo = null;
	Nodo aux = null;
	Nodo primeiro = null;

	public void CriarLista(int n) {
		for (int i = 1; i <= n; i++) {

			if (nodo != null) {
				aux = nodo;

			}
			nodo = new Nodo();

			nodo.setValor(i);

			if (i >= n) {
				nodo.setProx(primeiro);
				primeiro.setAnt(nodo);
			}
			if (i > 1) {
				aux.setProx(nodo);
				nodo.setAnt(aux);

			}

			if (i == 1) {
				primeiro = nodo;
			}

		}
	}

	public void ImprimirListaComp(int n) {
		for (int i = 1; i <= n; i++) {
			if (nodo.getAnt() != null) {
				System.out.println(" valor  " + nodo.getValor() + " Ant " + nodo.getAnt().getValor() + " Prox "
						+ nodo.getProx().getValor());
			}

			nodo = nodo.getAnt();

		}

	}

	public void Remocao(int m) {
		while (nodo.getAnt() != nodo) {
			for (int i = 1; i <= m; i++) {
				nodo = nodo.getProx();

			}
			aux = nodo;
			while (nodo.getProx() != aux || aux.getAnt() != nodo) {
				nodo = nodo.getProx();
				System.out.print(nodo.getValor() + "|");

			}
			nodo = aux;

			System.out.println();

			nodo.getProx().setAnt(nodo.getAnt());
			nodo.getAnt().setProx(nodo.getProx());

		}
		nodo.setAnt(null);
		nodo.setProx(null);

	}

	public int Final() {

		return nodo.getValor();
	}
}
