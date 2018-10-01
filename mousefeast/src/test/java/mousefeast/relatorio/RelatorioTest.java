package mousefeast.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.amazon.mousefeast.models.Produto;

public class RelatorioTest {

	private Relatorio relatorio;
	private List<Produto> produtos;
	
	@Before
	public void criarEntidadesParaTestes() {
		relatorio = new Relatorio();
		Produto tv = new Produto( "Eletrônicos", "Samsung HD", 300.00 );
		Produto dvd = new Produto( "Eletrônicos", "CCE DVD", 400.0 );
		Produto celular = new Produto( "Eletrônicos", "Moto G500", 250.00 );
		
		produtos = new ArrayList<> ();
		produtos.add(tv);
		produtos.add(dvd);
		produtos.add(celular);
		
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemCrescente() {
		
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemDecrescente() {
		
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemAleatoria() {
		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=250.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDeUmUnicoProduto() {

		relatorio.gerarRelatorioPrecos(produtos);
		
		Double maiorValorEsperado=400.00;
		Double menorValorEsperado=400.00;
		
		assertEquals(maiorValorEsperado, relatorio.getMaiorValor());
		assertEquals(menorValorEsperado, relatorio.getMenorValor());
	}
	
	@Test
	public void deveEncontrarOsTresProdutosMaisCaros() {
		
		Produto afonso = new Produto( "RH", "Afonso", 70.00 );
		produtos.add(afonso);
		
		relatorio.gerarRelatorioPrecos(produtos);
		
		List<Produto> top3ProdutosMaisCaros = relatorio.getProdutosMaisCaros();
		
		assertEquals(3, top3ProdutosMaisCaros.size());
		assertEquals(400.00, top3ProdutosMaisCaros.get(0).getValor(), 0.00001);
		assertEquals(300.00, top3ProdutosMaisCaros.get(1).getValor(), 0.00001);
		assertEquals(250.00, top3ProdutosMaisCaros.get(2).getValor(), 0.00001);
	}	
}
