package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.OrderedItemsDAO;
import main.app.dao.ProductImagesDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsDescriptionDAO;
import main.app.dao.VendorLocationsDAO;

import main.app.domain.CartItems;
import main.app.domain.CustomerProfile;
import main.app.domain.OrderedItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;
import main.app.domain.VendorLocations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CartItems entities
 * 
 */

@Service("CartItemsService")
@Transactional
public class CartItemsServiceImpl implements CartItemsService {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

	/**
	 * DAO injected by Spring that manages OrderedItems entities
	 * 
	 */
	@Autowired
	private OrderedItemsDAO orderedItemsDAO;

	/**
	 * DAO injected by Spring that manages ProductImages entities
	 * 
	 */
	@Autowired
	private ProductImagesDAO productImagesDAO;

	/**
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

	/**
	 * DAO injected by Spring that manages ProductsDescription entities
	 * 
	 */
	@Autowired
	private ProductsDescriptionDAO productsDescriptionDAO;

	/**
	 * DAO injected by Spring that manages VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsDAO vendorLocationsDAO;

	/**
	 * Instantiates a new CartItemsServiceImpl.
	 *
	 */
	public CartItemsServiceImpl() {
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public CartItems saveCartItemsCustomerProfile(Integer cartItemId, CustomerProfile related_customerprofile) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemId, -1, -1);
		CustomerProfile existingcustomerProfile = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofile.getCustomerId());

		// copy into the existing record to preserve existing relationships
		if (existingcustomerProfile != null) {
			existingcustomerProfile.setCustomerId(related_customerprofile.getCustomerId());
			existingcustomerProfile.setCustomerName(related_customerprofile.getCustomerName());
			existingcustomerProfile.setCustomerPassword(related_customerprofile.getCustomerPassword());
			existingcustomerProfile.setCustomerEmail(related_customerprofile.getCustomerEmail());
			existingcustomerProfile.setProfileStatus(related_customerprofile.getProfileStatus());
			existingcustomerProfile.setPhone1(related_customerprofile.getPhone1());
			existingcustomerProfile.setPhone2(related_customerprofile.getPhone2());
			existingcustomerProfile.setFirstName(related_customerprofile.getFirstName());
			existingcustomerProfile.setLastName(related_customerprofile.getLastName());
			existingcustomerProfile.setMiddleName(related_customerprofile.getMiddleName());
			existingcustomerProfile.setNameSuffix(related_customerprofile.getNameSuffix());
			existingcustomerProfile.setNameTitle(related_customerprofile.getNameTitle());
			existingcustomerProfile.setLastSuccessLogin(related_customerprofile.getLastSuccessLogin());
			existingcustomerProfile.setVisits(related_customerprofile.getVisits());
			existingcustomerProfile.setCreatedIp(related_customerprofile.getCreatedIp());
			existingcustomerProfile.setAddressLine1(related_customerprofile.getAddressLine1());
			existingcustomerProfile.setAddressLine2(related_customerprofile.getAddressLine2());
			existingcustomerProfile.setAddressLine3(related_customerprofile.getAddressLine3());
			existingcustomerProfile.setZipCode5(related_customerprofile.getZipCode5());
			existingcustomerProfile.setZipCode4(related_customerprofile.getZipCode4());
			existingcustomerProfile.setLastLoginIp(related_customerprofile.getLastLoginIp());
			existingcustomerProfile.setCreatedOn(related_customerprofile.getCreatedOn());
			existingcustomerProfile.setCreatedBy(related_customerprofile.getCreatedBy());
			existingcustomerProfile.setModifiedOn(related_customerprofile.getModifiedOn());
			existingcustomerProfile.setModifiedBy(related_customerprofile.getModifiedBy());
			related_customerprofile = existingcustomerProfile;
		} else {
			related_customerprofile = customerProfileDAO.store(related_customerprofile);
			customerProfileDAO.flush();
		}

		cartitems.setCustomerProfile(related_customerprofile);
		related_customerprofile.getCartItemses().add(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_customerprofile = customerProfileDAO.store(related_customerprofile);
		customerProfileDAO.flush();

		return cartitems;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public void deleteCartItems(CartItems cartitems) {
		cartItemsDAO.remove(cartitems);
		cartItemsDAO.flush();
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public CartItems deleteCartItemsVendorLocations(Integer cartitems_cartItemId, Integer related_vendorlocations_locationId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);
		VendorLocations related_vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocations_locationId, -1, -1);

		cartitems.setVendorLocations(null);
		related_vendorlocations.getCartItemses().remove(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_vendorlocations = vendorLocationsDAO.store(related_vendorlocations);
		vendorLocationsDAO.flush();

		vendorLocationsDAO.remove(related_vendorlocations);
		vendorLocationsDAO.flush();

		return cartitems;
	}

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public CartItems deleteCartItemsOrderedItemses(Integer cartitems_cartItemId, Integer related_ordereditemses_orderItemId) {
		OrderedItems related_ordereditemses = orderedItemsDAO.findOrderedItemsByPrimaryKey(related_ordereditemses_orderItemId, -1, -1);

		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);

		related_ordereditemses.setCartItems(null);
		cartitems.getOrderedItemses().remove(related_ordereditemses);

		orderedItemsDAO.remove(related_ordereditemses);
		orderedItemsDAO.flush();

		return cartitems;
	}

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public CartItems saveCartItemsOrderedItemses(Integer cartItemId, OrderedItems related_ordereditemses) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemId, -1, -1);
		OrderedItems existingorderedItemses = orderedItemsDAO.findOrderedItemsByPrimaryKey(related_ordereditemses.getOrderItemId());

		// copy into the existing record to preserve existing relationships
		if (existingorderedItemses != null) {
			existingorderedItemses.setOrderItemId(related_ordereditemses.getOrderItemId());
			existingorderedItemses.setItemPrice(related_ordereditemses.getItemPrice());
			existingorderedItemses.setCreatedOn(related_ordereditemses.getCreatedOn());
			existingorderedItemses.setCreatedBy(related_ordereditemses.getCreatedBy());
			existingorderedItemses.setModifiedOn(related_ordereditemses.getModifiedOn());
			existingorderedItemses.setModifiedBy(related_ordereditemses.getModifiedBy());
			related_ordereditemses = existingorderedItemses;
		} else {
			related_ordereditemses = orderedItemsDAO.store(related_ordereditemses);
			orderedItemsDAO.flush();
		}

		related_ordereditemses.setCartItems(cartitems);
		cartitems.getOrderedItemses().add(related_ordereditemses);
		related_ordereditemses = orderedItemsDAO.store(related_ordereditemses);
		orderedItemsDAO.flush();

		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		return cartitems;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public CartItems saveCartItemsVendorLocations(Integer cartItemId, VendorLocations related_vendorlocations) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemId, -1, -1);
		VendorLocations existingvendorLocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocations.getLocationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorLocations != null) {
			existingvendorLocations.setLocationId(related_vendorlocations.getLocationId());
			existingvendorLocations.setLocationName(related_vendorlocations.getLocationName());
			existingvendorLocations.setLocationAdminFirstName(related_vendorlocations.getLocationAdminFirstName());
			existingvendorLocations.setLocationAdminMiddleName(related_vendorlocations.getLocationAdminMiddleName());
			existingvendorLocations.setLocationAdminLastName(related_vendorlocations.getLocationAdminLastName());
			existingvendorLocations.setLocationAdminSuffix(related_vendorlocations.getLocationAdminSuffix());
			existingvendorLocations.setStatus(related_vendorlocations.getStatus());
			existingvendorLocations.setPhone1(related_vendorlocations.getPhone1());
			existingvendorLocations.setPhone2(related_vendorlocations.getPhone2());
			existingvendorLocations.setFax(related_vendorlocations.getFax());
			existingvendorLocations.setEmail(related_vendorlocations.getEmail());
			existingvendorLocations.setAddressLine1(related_vendorlocations.getAddressLine1());
			existingvendorLocations.setAddressLine2(related_vendorlocations.getAddressLine2());
			existingvendorLocations.setAddressLine3(related_vendorlocations.getAddressLine3());
			existingvendorLocations.setZipCode5(related_vendorlocations.getZipCode5());
			existingvendorLocations.setCreatedBy(related_vendorlocations.getCreatedBy());
			existingvendorLocations.setCreatedOn(related_vendorlocations.getCreatedOn());
			existingvendorLocations.setModifiedBy(related_vendorlocations.getModifiedBy());
			existingvendorLocations.setModifiedOn(related_vendorlocations.getModifiedOn());
			existingvendorLocations.setZipCode4(related_vendorlocations.getZipCode4());
			related_vendorlocations = existingvendorLocations;
		} else {
			related_vendorlocations = vendorLocationsDAO.store(related_vendorlocations);
			vendorLocationsDAO.flush();
		}

		cartitems.setVendorLocations(related_vendorlocations);
		related_vendorlocations.getCartItemses().add(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_vendorlocations = vendorLocationsDAO.store(related_vendorlocations);
		vendorLocationsDAO.flush();

		return cartitems;
	}

	/**
	 * Return all CartItems entity
	 * 
	 */
	@Transactional
	public List<CartItems> findAllCartItemss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CartItems>(cartItemsDAO.findAllCartItemss(startResult, maxRows));
	}

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public CartItems saveCartItemsProductsDescription(Integer cartItemId, ProductsDescription related_productsdescription) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemId, -1, -1);
		ProductsDescription existingproductsDescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(related_productsdescription.getProductDescriptionId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsDescription != null) {
			existingproductsDescription.setProductDescriptionId(related_productsdescription.getProductDescriptionId());
			existingproductsDescription.setProductPrimaryDescription(related_productsdescription.getProductPrimaryDescription());
			existingproductsDescription.setProductSecondaryDescription1(related_productsdescription.getProductSecondaryDescription1());
			existingproductsDescription.setProductSecondaryDescription2(related_productsdescription.getProductSecondaryDescription2());
			existingproductsDescription.setProductSecondaryDescription3(related_productsdescription.getProductSecondaryDescription3());
			existingproductsDescription.setProductSecondaryDescription4(related_productsdescription.getProductSecondaryDescription4());
			existingproductsDescription.setProductSecondaryDescription5(related_productsdescription.getProductSecondaryDescription5());
			existingproductsDescription.setProductColor(related_productsdescription.getProductColor());
			existingproductsDescription.setProductDimensionLength(related_productsdescription.getProductDimensionLength());
			existingproductsDescription.setProductDimensionBreadth(related_productsdescription.getProductDimensionBreadth());
			existingproductsDescription.setProductDimensionHeight(related_productsdescription.getProductDimensionHeight());
			existingproductsDescription.setProductWeight(related_productsdescription.getProductWeight());
			existingproductsDescription.setProductNumber(related_productsdescription.getProductNumber());
			existingproductsDescription.setProductModelNumber(related_productsdescription.getProductModelNumber());
			existingproductsDescription.setProductOrigin(related_productsdescription.getProductOrigin());
			existingproductsDescription.setCreatedBy(related_productsdescription.getCreatedBy());
			existingproductsDescription.setCreatedOn(related_productsdescription.getCreatedOn());
			existingproductsDescription.setModifiedBy(related_productsdescription.getModifiedBy());
			existingproductsDescription.setModifiedOn(related_productsdescription.getModifiedOn());
			related_productsdescription = existingproductsDescription;
		} else {
			related_productsdescription = productsDescriptionDAO.store(related_productsdescription);
			productsDescriptionDAO.flush();
		}

		cartitems.setProductsDescription(related_productsdescription);
		related_productsdescription.getCartItemses().add(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_productsdescription = productsDescriptionDAO.store(related_productsdescription);
		productsDescriptionDAO.flush();

		return cartitems;
	}

	/**
	 * Return a count of all CartItems entity
	 * 
	 */
	@Transactional
	public Integer countCartItemss() {
		return ((Long) cartItemsDAO.createQuerySingleResult("select count(o) from CartItems o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	@Transactional
	public CartItems saveCartItemsProductImages(Integer cartItemId, ProductImages related_productimages) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemId, -1, -1);
		ProductImages existingproductImages = productImagesDAO.findProductImagesByPrimaryKey(related_productimages.getProductImageId());

		// copy into the existing record to preserve existing relationships
		if (existingproductImages != null) {
			existingproductImages.setProductImageId(related_productimages.getProductImageId());
			existingproductImages.setProductPrimaryImage(related_productimages.getProductPrimaryImage());
			existingproductImages.setProductSecondaryImage1(related_productimages.getProductSecondaryImage1());
			existingproductImages.setProductSecondaryImage2(related_productimages.getProductSecondaryImage2());
			existingproductImages.setProductSecondaryImage3(related_productimages.getProductSecondaryImage3());
			existingproductImages.setProductSecondaryImage4(related_productimages.getProductSecondaryImage4());
			existingproductImages.setProductSecondaryImage5(related_productimages.getProductSecondaryImage5());
			existingproductImages.setProductVideo(related_productimages.getProductVideo());
			existingproductImages.setCreatedOn(related_productimages.getCreatedOn());
			existingproductImages.setCreatedBy(related_productimages.getCreatedBy());
			existingproductImages.setModifiedOn(related_productimages.getModifiedOn());
			existingproductImages.setModifiedBy(related_productimages.getModifiedBy());
			related_productimages = existingproductImages;
		} else {
			related_productimages = productImagesDAO.store(related_productimages);
			productImagesDAO.flush();
		}

		cartitems.setProductImages(related_productimages);
		related_productimages.getCartItemses().add(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_productimages = productImagesDAO.store(related_productimages);
		productImagesDAO.flush();

		return cartitems;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public CartItems saveCartItemsProducts(Integer cartItemId, Products related_products) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemId, -1, -1);
		Products existingproducts = productsDAO.findProductsByPrimaryKey(related_products.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingproducts != null) {
			existingproducts.setProductId(related_products.getProductId());
			existingproducts.setProductTitle(related_products.getProductTitle());
			existingproducts.setSalesPrice(related_products.getSalesPrice());
			existingproducts.setCostPrice(related_products.getCostPrice());
			existingproducts.setDiscountPrice(related_products.getDiscountPrice());
			existingproducts.setPercentageDiscount(related_products.getPercentageDiscount());
			existingproducts.setCreatedOn(related_products.getCreatedOn());
			existingproducts.setCreatedBy(related_products.getCreatedBy());
			existingproducts.setModifiedOn(related_products.getModifiedOn());
			existingproducts.setModifiedBy(related_products.getModifiedBy());
			existingproducts.setStatus(related_products.getStatus());
			existingproducts.setQuantity(related_products.getQuantity());
			related_products = existingproducts;
		} else {
			related_products = productsDAO.store(related_products);
			productsDAO.flush();
		}

		cartitems.setProducts(related_products);
		related_products.getCartItemses().add(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		return cartitems;
	}

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public CartItems deleteCartItemsProductsDescription(Integer cartitems_cartItemId, Integer related_productsdescription_productDescriptionId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);
		ProductsDescription related_productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(related_productsdescription_productDescriptionId, -1, -1);

		cartitems.setProductsDescription(null);
		related_productsdescription.getCartItemses().remove(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_productsdescription = productsDescriptionDAO.store(related_productsdescription);
		productsDescriptionDAO.flush();

		productsDescriptionDAO.remove(related_productsdescription);
		productsDescriptionDAO.flush();

		return cartitems;
	}

	/**
	 */
	@Transactional
	public CartItems findCartItemsByPrimaryKey(Integer cartItemId) {
		return cartItemsDAO.findCartItemsByPrimaryKey(cartItemId);
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public CartItems deleteCartItemsProducts(Integer cartitems_cartItemId, Integer related_products_productId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);
		Products related_products = productsDAO.findProductsByPrimaryKey(related_products_productId, -1, -1);

		cartitems.setProducts(null);
		related_products.getCartItemses().remove(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		productsDAO.remove(related_products);
		productsDAO.flush();

		return cartitems;
	}

	/**
	 * Load an existing CartItems entity
	 * 
	 */
	@Transactional
	public Set<CartItems> loadCartItemss() {
		return cartItemsDAO.findAllCartItemss();
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public void saveCartItems(CartItems cartitems) {
		CartItems existingCartItems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems.getCartItemId());

		if (existingCartItems != null) {
			if (existingCartItems != cartitems) {
				existingCartItems.setCartItemId(cartitems.getCartItemId());
				existingCartItems.setProductTitle(cartitems.getProductTitle());
				existingCartItems.setProductCost(cartitems.getProductCost());
				existingCartItems.setProductQuantity(cartitems.getProductQuantity());
				existingCartItems.setStatus(cartitems.getStatus());
				existingCartItems.setCreatedOn(cartitems.getCreatedOn());
				existingCartItems.setCreatedBy(cartitems.getCreatedBy());
				existingCartItems.setModifiedOn(cartitems.getModifiedOn());
				existingCartItems.setModifiedBy(cartitems.getModifiedBy());
			}
			cartitems = cartItemsDAO.store(existingCartItems);
		} else {
			cartitems = cartItemsDAO.store(cartitems);
		}
		cartItemsDAO.flush();
	}

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	@Transactional
	public CartItems deleteCartItemsProductImages(Integer cartitems_cartItemId, Integer related_productimages_productImageId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);
		ProductImages related_productimages = productImagesDAO.findProductImagesByPrimaryKey(related_productimages_productImageId, -1, -1);

		cartitems.setProductImages(null);
		related_productimages.getCartItemses().remove(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_productimages = productImagesDAO.store(related_productimages);
		productImagesDAO.flush();

		productImagesDAO.remove(related_productimages);
		productImagesDAO.flush();

		return cartitems;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public CartItems deleteCartItemsCustomerProfile(Integer cartitems_cartItemId, Integer related_customerprofile_customerId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);
		CustomerProfile related_customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofile_customerId, -1, -1);

		cartitems.setCustomerProfile(null);
		related_customerprofile.getCartItemses().remove(cartitems);
		cartitems = cartItemsDAO.store(cartitems);
		cartItemsDAO.flush();

		related_customerprofile = customerProfileDAO.store(related_customerprofile);
		customerProfileDAO.flush();

		customerProfileDAO.remove(related_customerprofile);
		customerProfileDAO.flush();

		return cartitems;
	}
}
