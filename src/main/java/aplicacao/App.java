package aplicacao;

import dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); 
//		Pessoa pessoa = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa pessoa2 = new Pessoa(null, "Joaquim torres", "carlos@gmail.com");
//		Pessoa pessoa3 = new Pessoa(null, "Ana maria", "carlos@gmail.com");
//		
//
//		em.getTransaction().begin();
//		em.persist(pessoa);
//		em.persist(pessoa2);
//		em.persist(pessoa3);
//		em.getTransaction().commit();

		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		System.out.println("Pronto");
		em.close();
		emf.close();
		
	}
}
