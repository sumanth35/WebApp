package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.CustomerProfile;
import main.app.domain.OrderedItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;
import main.app.domain.VendorLocations;

/**
 * Spring service that handles CRUD requests for CartItems entities
 * 
 */
public interface CartItemsService {

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public CartItems saveCartItemsCustomerProfile(Integer cartItemId, CustomerProfile related_customerprofile);

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public void deleteCartItems(CartItems cartitems);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public CartItems deleteCartItemsVendorLocations(Integer cartitems_cartItemId, Integer related_vendorlocations_locationId);

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	public CartItems deleteCartItemsOrderedItemses(Integer cartitems_cartItemId_1, Integer related_ordereditemses_orderItemId);

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	public CartItems saveCartItemsOrderedItemses(Integer cartItemId_1, OrderedItems related_ordereditemses);

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public CartItems saveCartItemsVendorLocations(Integer cartItemId_2, VendorLocations related_vendorlocations);

	/**
	 * Return all CartItems entity
	 * 
	 */
	public List<CartItems> findAllCartItemss(Integer startResult, Integer maxRows);

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	public CartItems saveCartItemsProductsDescription(Integer cartItemId_3, ProductsDescription related_productsdescription);

	/**
	 * Return a count of all CartItems entity
	 * 
	 */
	public Integer countCartItemss();

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	public CartItems saveCartItemsProductImages(Integer cartItemId_4, ProductImages related_productimages);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public CartItems saveCartItemsProducts(Integer cartItemId_5, Products related_products);

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	public CartItems deleteCartItemsProductsDescription(Integer cartitems_cartItemId_2, Integer related_productsdescription_productDescriptionId);

	/**
	 */
	public CartItems findCartItemsByPrimaryKey(Integer cartItemId_6);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public CartItems deleteCartItemsProducts(Integer cartitems_cartItemId_3, Integer related_products_productId);

	/**
	 * Load an existing CartItems entity
	 * 
	 */
	public Set<CartItems> loadCartItemss();

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public void saveCartItems(CartItems cartitems_1);

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	public CartItems deleteCartItemsProductImages(Integer cartitems_cartItemId_4, Integer related_productimages_productImageId);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public CartItems deleteCartItemsCustomerProfile(Integer cartitems_cartItemId_5, Integer related_customerprofile_customerId);
}