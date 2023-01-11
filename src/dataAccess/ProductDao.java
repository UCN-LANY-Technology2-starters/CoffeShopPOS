package dataAccess;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDao {
	
	private DataContext dataContext;
	
	public ProductDao(DataContext dataContext) {

		this.dataContext = dataContext;
	}

	public List<Product> getAll(){
		
		// TODO: Implement call to database that gets all products from the Products table
		// QUESTION: Is it necessary to use a transaction for that?
		
		return new ArrayList<Product>();
	}
}
