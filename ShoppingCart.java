/**
 * Dr. Johnson
 * @author tylerlericos
 * CS215
 * Assingnment 1.1 Shopping Cart
 */
import java.util.*;
public class ShoppingCart implements BagInterface{
	
	Item[] itemCart;
	int cartQuantity;
	boolean empty = true;
	
	
	public ShoppingCart(Item[]itemCart){
		this.itemCart = itemCart;
	}
	/** Gets the current number of entries in this bag.
	 	@return  The integer number of entries currently in the bag. */
	public int getCurrentSize() {
		cartQuantity = itemCart.length;
		return cartQuantity;
	}
	public void displayCart() {
		
		for(int i = 0; i< this.getCurrentSize() ; i++) {
			System.out.println(itemCart[i].itemName);
			
		}
		
	}

	/** Sees whether this bag is empty.
	 	@return  True if the bag is empty, or false if not. */
	public boolean isEmpty() {
		if(itemCart.length == 0) {
			empty = true;
		}
		else {
			empty = false;
		}
		return empty;
	}

	/** Adds a new entry to this bag.
   		@param newEntry  The object to be added as a new entry.
   		@return  True if the addition is successful, or false if not. */
	public boolean add(Item item) {
		int i;
		int n = itemCart.length;
		Item[] newarr = new Item[n +1]; 
		
		for(i = 0; i < itemCart.length; i++) {
			newarr[i] = itemCart[i];
		}
		
		newarr[n] = item;
		
		itemCart = newarr;
		
		return true ;
		
	}

	/** Removes one unspecified entry from this bag, if possible.
  		@return  Either the removed entry, if the removal.
           was successful, or null. */
	public Object remove() {
		
		int n = itemCart.length;
		Item[] newarr = new Item[n-1];
		int j=0;
		for(int i = 0, k = 0; i < itemCart.length; i++) {
			if (i != j) {
				newarr[k] = itemCart[i];
				k++;
				
			}
			
		}
		itemCart = newarr;
		return itemCart[j].itemName;
	}

	/** Removes one occurrence of a given entry from this bag, if possible.
  		@param anEntry  The entry to be removed.
  		@return  True if the removal was successful, or false if not. */
	public boolean remove(Item item) {
		int n = itemCart.length;
		Item[] newarr = new Item[n-1];
		for(int i = 0, k = 0; i < itemCart.length; i++) {
			if (itemCart[i] != item) {
				newarr[k] = itemCart[i];
				k++;
			}
		}
		itemCart = newarr;
		
		return true;
	}

	/** Removes all entries from this bag. */
	public void clear() {
		for(int i = 0; i>itemCart.length; i++) {
			itemCart[i] = null;
		}
	}

	/** Counts the number of times a given entry appears in this bag.
	 @param anEntry  The entry to be counted.
	 @return  The number of times anEntry appears in the bag. */
	public int getFrequencyOf(Object item) {
		int amountItem = 0;
		for(int i = 0, k=0; i<itemCart.length; i++) {
			if (itemCart[i] == item) {
				amountItem += 1;
				k++;
			}
		}
	return amountItem;
	}

	/** Tests whether this bag contains a given entry.
	 @param anEntry  The entry to find.
	 @return  True if the bag contains anEntry, or false if not. */
	public boolean contains(Object item) {
		boolean hasItem = false;
		for(int i = 0; i<itemCart.length; i++) {
			if(itemCart[i] == item) {
				hasItem = true;
				
			}else
			{hasItem = false;}
		}
		return hasItem;
	}

	/** Retrieves all entries that are in this bag.
	 	@return  A newly allocated array of all the entries in the bag.
           Note: If the bag is empty, the returned array is empty. */
		public Object[] toArray() {
			return null;
		}
		
		
		/**
		 * Gets the price of a specific item NOT in the array
		 * @param item
		 * @return the entry's price as a double
		 */
		public double getPrice(Item item) {
			
			
			return item.itemPrice;
			
		}
		/**
		 * Gets the total price of the Cart
		 * @return the total of all the prices in itemCart
		 */
		public double getTotal() {
			double total = 0;
			for(int i = 0; i<itemCart.length; i++) {
				total += itemCart[i].itemPrice;
			}
			
			
			return total;
			
		}
		
	@Override
	public boolean add(Object newEntry) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

}
