package com.cognizant.truyum.dao;
import java.util.*;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
public class CartDaoCollectionImpl implements CartDao{

	private static HashMap<Long, Cart> userCarts;
	
	public CartDaoCollectionImpl() {
		
	}
	public void addCartItem(long userId, long menuItemId) {
		
	}
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		
	}
	public void removeCartItem( long userId, long menuItemId) {
		
	}
	
}
