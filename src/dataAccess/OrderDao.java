package dataAccess;

import java.util.List;

import model.Order;

public class OrderDao {
	
	private DataContext dataContext;

	public OrderDao(DataContext dataContext) {

		this.dataContext = dataContext;
	}

	public List<Order> getAll(){
		
		// TODO: Implement call to database that gets all orders from the Orders table
		
		return null;
	}
	
	public Order getSingle() {
		
		// TODO: Implement call to database that gets a single order from the Orders table
		// QUESTION: Which property in the order can be used to identify a single order and how can you send that to this method?

		return null;
	}
	
	public Order createOrder(Order order) {
		
		// TODO: Implement call to database that creates an order in the Orders table
		// NOTE: As you might have noticed, there isn't any OrderlineDao class in this solution, so you must handle orderlines here as well.
		
		return null;
	}
	
	public Order updateOrder(Order order) {
		
		// TODO: Implement call to database that updates an order in the Orders table
		// NOTE: remember the orderlines :-)
		
		return null;
	}
}
