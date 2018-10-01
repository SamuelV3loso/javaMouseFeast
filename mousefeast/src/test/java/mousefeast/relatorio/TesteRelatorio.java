package mousefeast.relatorio;

import java.util.ArrayList;
import java.util.List;

import com.amazon.mousefeast.models.Produto;

public class TesteRelatorio {

	public static void main(String[] args) {
		
		Produto celular = new Produto("Eletrônicos", "Moto G500", 250.00);
		Produto tv = new Produto("Eletrônicos", "Samsung HD", 300.00);
		Produto dvd = new Produto("Eletrônicos", "CCE DVD", 400.0);
		
		List<Produto> produtos = new ArrayList<> ();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		System.out.println(maiorValorEsperado.equals(relatorio.getMaiorValor()) );
		System.out.println(menorValorEsperado.equals(relatorio.getMenorValor()) );
	}

}
