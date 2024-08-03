package myProductAppDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import myProductAppEntity.Product;

public class ProductDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void SaveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
	}

	public void DeleteProduct(int id) {
		Product product=entityManager.find(Product.class, id);
		entityTransaction.begin();
		entityManager.remove(product);
		entityTransaction.commit();
	}

	public List<Product> getAllProduct() {
		Query query = entityManager.createQuery("select s from Product s");
		List<Product> products = query.getResultList();
		return products;
	}
	public Product getProductbyID(int id){
		Product product=entityManager.find(Product.class, id);
		return product;
	}
	public void updateProduct(Product product) {
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		
	}
}
