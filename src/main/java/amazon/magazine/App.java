package amazon.magazine;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import amazon.magazine.model.Cliente;
import amazon.magazine.model.Endereco;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		
		
		Endereco gabriel = new Endereco();
		gabriel.setBairro("Da paz");
		gabriel.setCep("12264841");
		gabriel.setCidade("Maceio");
		gabriel.setComplemento("Perto do fim do mundo");
		gabriel.setEstado("Alagoas");
		gabriel.setNumero("24");
		gabriel.setRua("Rua dos bobos");

		Cliente afonso = new Cliente();
		afonso.setNome("Afonso Gabriel");
		afonso.setCpf("0266479545484");
		afonso.setEmail("gabrielafonso@gmail.com");
	    afonso.setSenha("afonso123");
		afonso.setEndereco(gabriel);
		
		
		manager.persist(afonso);

		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
