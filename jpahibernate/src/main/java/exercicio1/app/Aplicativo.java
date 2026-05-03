package exercicio1.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aplicativo {
	public static void main(String[] args) {
		
		/*//teste 1
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com"); */

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("name");
		EntityManager em = emf.createEntityManager();

		/*//teste 1
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		
		/*//teste 2
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		*/
		
		/*//teste 3
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		*/
		
		System.out.println("Pronto!");
		em.close();
		emf.close();

	}
}
