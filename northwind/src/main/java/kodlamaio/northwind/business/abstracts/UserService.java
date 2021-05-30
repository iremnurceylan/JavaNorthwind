package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	//findBy getBy aynı bir projede birini tek kullan her yerde
	DataResult<User> findByEmail(String email);

}
