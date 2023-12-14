package aplicacao;

import dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa pessoa2 = new Pessoa(null, "Joaquim torres", "carlos@gmail.com");
		Pessoa pessoa3 = new Pessoa(null, "Ana maria", "carlos@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); 

		em.getTransaction().begin();
		em.persist(pessoa);
		em.persist(pessoa2);
		em.persist(pessoa3);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		
	}
}
