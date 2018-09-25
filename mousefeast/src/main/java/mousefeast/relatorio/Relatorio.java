package mousefeast.relatorio;

import java.util.List;

import com.amazon.mousefeast.models.Produto;

public class Relatorio {

	// gera um relatorio sobre os produtos da loja, o mais caro ou mais barato;

	private Double maiorValor = Double.NEGATIVE_INFINITY;
	private Double menorValor = Double.POSITIVE_INFINITY;

	public void gerarRelatorioPrecos(List<Produto> produtos) {
		for (Produto produto : produtos) {
			if (produto.getValor() > maiorValor) {
				maiorValor = produto.getValor();
			}

			if (produto.getValor() < menorValor) {
				menorValor = produto.getValor();
			}
		}

	}
	
	

	public Double getMaiorValor() {
		return maiorValor;
	}

	public Double getMenorValor() {
		return menorValor;
	}
	
	

}
