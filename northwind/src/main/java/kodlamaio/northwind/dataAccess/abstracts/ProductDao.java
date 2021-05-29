package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	//hepsi hazır jpaRepository tarafından yapılır
	//geti gordugu an tabloladaki ilgili kolona bakıp ver komutunu yapıstırır
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	//birden fazla categoryi getirir
    List<Product> getByCategoryIn(List<Integer>categories);
    
    List<Product> getByProductNameContains(String productName);
    
    //Ürün isimleri bununla baslayan bununla bitem gibi
    List<Product> getByProductNameStartsWith(String productName);
    
    //jpq yazımı
    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByProductAndCategory(String productName,int categoryId);

}
