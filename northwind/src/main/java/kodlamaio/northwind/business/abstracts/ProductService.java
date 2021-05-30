package kodlamaio.northwind.business.abstracts;

import java.util.List;



import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
	
    DataResult<Product> getByProductName(String productName);
	
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	//birden fazla categoryi getirir
	DataResult<List<Product>> getByCategoryIdIn(List<Integer>categories);
    
	DataResult<List<Product>> getByProductNameContains(String productName);
    
    //Ürün isimleri bununla baslayan bununla bitem gibi
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
    
	DataResult<List<Product>> getByProductAndCategory(String productName,int categoryId);
	
	//sayfalama bu sayfada bu kadar veri gelsin gibi
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	//Datayı istediğim sekle gore sıralasın
	DataResult<List<Product>> getAllSorted();
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

}
