package mousefeast.relatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.amazon.mousefeast.models.Produto;

public class Relatorio {

	// gera um relatorio sobre os produtos da loja, o mais caro ou mais barato;

	private Double maiorValor = Double.NEGATIVE_INFINITY;
	private Double menorValor = Double.POSITIVE_INFINITY;

	private List<Produto> produtosMaisCaros;
	
	public List<Produto> getProdutosMaisCaros() {
		return produtosMaisCaros;
	}

	public void gerarRelatorioPrecos(List<Produto> produtos) {
		for (Produto produto : produtos) {
			if ( produto.getValor() > maiorValor ) {
				maiorValor = produto.getValor();
			}

			if ( produto.getValor() < menorValor ) {
				menorValor = produto.getValor();
			}
		}
		calcularProdutosMaisCaros(produtos);
	}
	
	private void calcularProdutosMaisCaros(List<Produto> produtos) {
		
		produtosMaisCaros = new ArrayList<>(produtos);
		Collections.sort(produtosMaisCaros, new Comparator<Produto>() {
			public int compare(Produto p1, Produto p2) {
				if(p1.getValor() < p2.getValor()) return 1;
				if(p1.getValor() > p2.getValor()) return -1;
				return 0;			}
		});
		
		produtosMaisCaros = produtosMaisCaros.subList(0, 
				produtosMaisCaros.size() > 3 ? 3 : produtosMaisCaros.size());
		
	}

	public Double getMaiorValor() {
		return maiorValor;
	}

	public Double getMenorValor() {
		return menorValor;
	}
	
	

}
