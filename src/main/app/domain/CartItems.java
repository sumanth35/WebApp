package main.app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllCartItemss", query = "select myCartItems from CartItems myCartItems"),
		@NamedQuery(name = "findCartItemsByCartItemId", query = "select myCartItems from CartItems myCartItems where myCartItems.cartItemId = ?1"),
		@NamedQuery(name = "findCartItemsByCreatedBy", query = "select myCartItems from CartItems myCartItems where myCartItems.createdBy = ?1"),
		@NamedQuery(name = "findCartItemsByCreatedByContaining", query = "select myCartItems from CartItems myCartItems where myCartItems.createdBy like ?1"),
		@NamedQuery(name = "findCartItemsByCreatedOn", query = "select myCartItems from CartItems myCartItems where myCartItems.createdOn = ?1"),
		@NamedQuery(name = "findCartItemsByModifiedBy", query = "select myCartItems from CartItems myCartItems where myCartItems.modifiedBy = ?1"),
		@NamedQuery(name = "findCartItemsByModifiedByContaining", query = "select myCartItems from CartItems myCartItems where myCartItems.modifiedBy like ?1"),
		@NamedQuery(name = "findCartItemsByModifiedOn", query = "select myCartItems from CartItems myCartItems where myCartItems.modifiedOn = ?1"),
		@NamedQuery(name = "findCartItemsByPrimaryKey", query = "select myCartItems from CartItems myCartItems where myCartItems.cartItemId = ?1"),
		@NamedQuery(name = "findCartItemsByProductCost", query = "select myCartItems from CartItems myCartItems where myCartItems.productCost = ?1"),
		@NamedQuery(name = "findCartItemsByProductQuantity", query = "select myCartItems from CartItems myCartItems where myCartItems.productQuantity = ?1"),
		@NamedQuery(name = "findCartItemsByProductTitle", query = "select myCartItems from CartItems myCartItems where myCartItems.productTitle = ?1"),
		@NamedQuery(name = "findCartItemsByProductTitleContaining", query = "select myCartItems from CartItems myCartItems where myCartItems.productTitle like ?1"),
		@NamedQuery(name = "findCartItemsByStatus", query = "select myCartItems from CartItems myCartItems where myCartItems.status = ?1"),
		@NamedQuery(name = "findCartItemsByStatusContaining", query = "select myCartItems from CartItems myCartItems where myCartItems.status like ?1") })
@Table(schema = "SINGHS2", name = "CART_ITEMS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "CartItems")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class CartItems implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "CART_ITEM_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cart_item_seq_gen")
	@SequenceGenerator(name="cart_item_seq_gen", sequenceName="CART_ITEM_ID_SEQ", allocationSize=1)
	Integer cartItemId;
	/**
	 */

	@Column(name = "PRODUCT_TITLE", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productTitle;
	/**
	 */

	@Column(name = "PRODUCT_COST", scale = 2, precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal productCost;
	/**
	 */

	@Column(name = "PRODUCT_QUANTITY", precision = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal productQuantity;
	/**
	 */

	@Column(name = "STATUS", length = 5)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String status;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar createdOn;
	/**
	 */

	@Column(name = "CREATED_BY", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String createdBy;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar modifiedOn;
	/**
	 */

	@Column(name = "MODIFIED_BY", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String modifiedBy;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID") })
	@XmlTransient
	Products products;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PRODUCT_IMAGE_ID", referencedColumnName = "PRODUCT_IMAGE_ID") })
	@XmlTransient
	ProductImages productImages;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID") })
	@XmlTransient
	CustomerProfile customerProfile;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "VENDOR_LOCATION_ID", referencedColumnName = "LOCATION_ID") })
	@XmlTransient
	VendorLocations vendorLocations;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PRODUCT_DESCRIPTION_ID", referencedColumnName = "PRODUCT_DESCRIPTION_ID") })
	@XmlTransient
	ProductsDescription productsDescription;
	/**
	 */
	@OneToMany(mappedBy = "cartItems", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.OrderedItems> orderedItemses;

	/**
	 */
	public void setCartItemId(Integer cartItemId) {
		this.cartItemId = cartItemId;
	}

	/**
	 */
	public Integer getCartItemId() {
		return this.cartItemId;
	}

	/**
	 */
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	/**
	 */
	public String getProductTitle() {
		return this.productTitle;
	}

	/**
	 */
	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

	/**
	 */
	public BigDecimal getProductCost() {
		return this.productCost;
	}

	/**
	 */
	public void setProductQuantity(BigDecimal productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 */
	public BigDecimal getProductQuantity() {
		return this.productQuantity;
	}

	/**
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 */
	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 */
	public Calendar getCreatedOn() {
		return this.createdOn;
	}

	/**
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 */
	public void setModifiedOn(Calendar modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	/**
	 */
	public Calendar getModifiedOn() {
		return this.modifiedOn;
	}

	/**
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 */
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	/**
	 */
	public void setProducts(Products products) {
		this.products = products;
	}

	/**
	 */
	public Products getProducts() {
		return products;
	}

	/**
	 */
	public void setProductImages(ProductImages productImages) {
		this.productImages = productImages;
	}

	/**
	 */
	public ProductImages getProductImages() {
		return productImages;
	}

	/**
	 */
	public void setCustomerProfile(CustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
	}

	/**
	 */
	public CustomerProfile getCustomerProfile() {
		return customerProfile;
	}

	/**
	 */
	public void setVendorLocations(VendorLocations vendorLocations) {
		this.vendorLocations = vendorLocations;
	}

	/**
	 */
	public VendorLocations getVendorLocations() {
		return vendorLocations;
	}

	/**
	 */
	public void setProductsDescription(ProductsDescription productsDescription) {
		this.productsDescription = productsDescription;
	}

	/**
	 */
	public ProductsDescription getProductsDescription() {
		return productsDescription;
	}

	/**
	 */
	public void setOrderedItemses(Set<OrderedItems> orderedItemses) {
		this.orderedItemses = orderedItemses;
	}

	/**
	 */
	public Set<OrderedItems> getOrderedItemses() {
		if (orderedItemses == null) {
			orderedItemses = new java.util.LinkedHashSet<main.app.domain.OrderedItems>();
		}
		return orderedItemses;
	}

	/**
	 */
	public CartItems() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CartItems that) {
		setCartItemId(that.getCartItemId());
		setProductTitle(that.getProductTitle());
		setProductCost(that.getProductCost());
		setProductQuantity(that.getProductQuantity());
		setStatus(that.getStatus());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setProducts(that.getProducts());
		setProductImages(that.getProductImages());
		setCustomerProfile(that.getCustomerProfile());
		setVendorLocations(that.getVendorLocations());
		setProductsDescription(that.getProductsDescription());
		setOrderedItemses(new java.util.LinkedHashSet<main.app.domain.OrderedItems>(that.getOrderedItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("cartItemId=[").append(cartItemId).append("] ");
		buffer.append("productTitle=[").append(productTitle).append("] ");
		buffer.append("productCost=[").append(productCost).append("] ");
		buffer.append("productQuantity=[").append(productQuantity).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((cartItemId == null) ? 0 : cartItemId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CartItems))
			return false;
		CartItems equalCheck = (CartItems) obj;
		if ((cartItemId == null && equalCheck.cartItemId != null) || (cartItemId != null && equalCheck.cartItemId == null))
			return false;
		if (cartItemId != null && !cartItemId.equals(equalCheck.cartItemId))
			return false;
		return true;
	}
}
