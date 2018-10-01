package mousefeast.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.amazon.mousefeast.models.Produto;

public class RelatorioTest {

	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemCrescente() {
		Produto celular = new Produto( "Eletrônicos", "Moto G500", 250.00 );
		Produto tv = new Produto( "Eletrônicos", "Samsung HD", 300.00 );
		Produto dvd = new Produto( "Eletrônicos", "CCE DVD", 400.0 );
		
		List<Produto> produtos = new ArrayList<> ();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemDecrescente() {

		Produto dvd = new Produto( "Eletrônicos", "CCE DVD", 400.0 );
		Produto tv = new Produto( "Eletrônicos", "Samsung HD", 300.00 );
		Produto celular = new Produto( "Eletrônicos", "Moto G500", 250.00 );
		
		List<Produto> produtos = new ArrayList<> ();
		produtos.add(dvd);
		produtos.add(tv);
		produtos.add(celular);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemAleatoria() {

		
		Produto tv = new Produto( "Eletrônicos", "Samsung HD", 300.00 );
		Produto dvd = new Produto( "Eletrônicos", "CCE DVD", 400.0 );
		Produto celular = new Produto( "Eletrônicos", "Moto G500", 250.00 );
				
		List<Produto> produtos = new ArrayList<> ();
		produtos.add(tv);
		produtos.add(dvd);
		produtos.add(celular);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDeUmUnicoProduto() {

		
		Produto tv = new Produto( "Eletrônicos", "Samsung HD", 300.00 );
				
		List<Produto> produtos = new ArrayList<> ();
		produtos.add(tv);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=300.00;
		Double menorValorEsperado=300.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	
	
}
