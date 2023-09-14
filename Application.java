/**
 * Dr. Johnson
 * @author tylerlericos
 * CS215
 * Assingnment 1.1 Shopping Cart
 */
public class Application {
	
	//===================================================
	
	//===================================================
	
	public static void main(String args[]) {
		
		Item apple = new Item("Apple", 2.99);
		Item milk = new Item("Milk", 5.99);
		
		Item[] emptyList = {};
		Item[] items = {apple, milk};
		
		ShoppingCart cart = new ShoppingCart(emptyList);
		//===================================================
		//isEmpty Testing Method
		//===================================================
		System.out.println("=======isEmptyTestingMethod======");
		System.out.println(cart.isEmpty());
		cart.itemCart = items;
		System.out.println(cart.isEmpty());
		
		//===================================================
		//GetQuantity Method
		//===================================================
		System.out.println("=====CurrentSizeTestingMethod====");
		cart.itemCart = emptyList;
		System.out.println(cart.getCurrentSize());
		cart.itemCart = items;
		System.out.println(cart.getCurrentSize());
		cart.displayCart();
		
		//===================================================
		//Adding an Item
		//===================================================
		System.out.println("====Add an Item====");
		System.out.println("+List1 Adding 1x Milk+");
		cart.add(milk);
		cart.displayCart();
		System.out.println("+List2 Adding 1x Apple+");
		cart.add(apple);
		cart.displayCart();
				
		
		//===================================================
		//Remove Item
		//===================================================
		System.out.println("=====Remove an item====");
		cart.displayCart();
		System.out.println(cart.getCurrentSize());
		cart.remove();
		System.out.println(cart.getCurrentSize());
		cart.displayCart();
		
		
		//===================================================
		//Remove a specific item!
		//===================================================
		System.out.println("=====Remove a specific item====");
		cart.itemCart = items;
		cart.displayCart();
		System.out.println(cart.remove(milk));
		cart.displayCart();
		
		//===================================================
		//Find a frequency of an item:
		//===================================================
		System.out.println("=====Get Frequecy of Item====");
		System.out.println("Cart: ");
		cart.displayCart();
		System.out.println("Apples: "+ cart.getFrequencyOf(apple));
		System.out.println("Milk: " + cart.getFrequencyOf(milk));
		
		//===================================================
		//Creating the Cart Methods
		//===================================================
		System.out.println("=====Testing Contains Method=====");
		System.out.println("Contains Milk: " + cart.contains(milk));
		System.out.println("Contains Apple: "  + cart.contains(apple));
		//===================================================
		//Price Methods
		//===================================================
		System.out.println("=====Pricing Methods=====");
		System.out.println("Milk: "+cart.getPrice(milk));
		System.out.println("Apple: " + cart.getPrice(apple));
		
		System.out.println("Total: " + cart.getTotal());
		System.out.println("Adding Milk!");
		cart.add(milk);
		System.out.println("Total: " + cart.getTotal());
		
	}
	
}
