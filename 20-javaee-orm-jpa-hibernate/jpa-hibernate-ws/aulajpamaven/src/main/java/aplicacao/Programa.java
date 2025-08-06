package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		// Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); // null porque BD que atribui Ids
		// Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		// Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // nome definido no persistence.xml
		EntityManager em = emf.createEntityManager(); // com isso, já tem a conexão com DB e toda aquela parte de contexto de persistência
		
		// Insere na base de dados
		// em.getTransaction().begin();
		// em.persist(p1);
		// em.persist(p2);
		// em.persist(p3);
		// em.getTransaction().commit();
		
		// Buscando uma pessoa do BD
		// Pessoa p = em.find(Pessoa.class, 2); // uma única linha para pesquisar no BD e converter para objeto
		
		// Apagando uma pessoa do BD
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
