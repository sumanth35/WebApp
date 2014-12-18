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
		@NamedQuery(name = "findAllProductss", query = "select myProducts from Products myProducts"),
		@NamedQuery(name = "findProductsByCostPrice", query = "select myProducts from Products myProducts where myProducts.costPrice = ?1"),
		@NamedQuery(name = "findProductsByCreatedBy", query = "select myProducts from Products myProducts where myProducts.createdBy = ?1"),
		@NamedQuery(name = "findProductsByCreatedByContaining", query = "select myProducts from Products myProducts where myProducts.createdBy like ?1"),
		@NamedQuery(name = "findProductsByCreatedOn", query = "select myProducts from Products myProducts where myProducts.createdOn = ?1"),
		@NamedQuery(name = "findProductsByDiscountPrice", query = "select myProducts from Products myProducts where myProducts.discountPrice = ?1"),
		@NamedQuery(name = "findProductsByModifiedBy", query = "select myProducts from Products myProducts where myProducts.modifiedBy = ?1"),
		@NamedQuery(name = "findProductsByModifiedByContaining", query = "select myProducts from Products myProducts where myProducts.modifiedBy like ?1"),
		@NamedQuery(name = "findProductsByModifiedOn", query = "select myProducts from Products myProducts where myProducts.modifiedOn = ?1"),
		@NamedQuery(name = "findProductsByPercentageDiscount", query = "select myProducts from Products myProducts where myProducts.percentageDiscount = ?1"),
		@NamedQuery(name = "findProductsByPrimaryKey", query = "select myProducts from Products myProducts where myProducts.productId = ?1"),
		@NamedQuery(name = "findProductsByProductId", query = "select myProducts from Products myProducts where myProducts.productId = ?1"),
		@NamedQuery(name = "findProductsByProductTitle", query = "select myProducts from Products myProducts where myProducts.productTitle = ?1"),
		@NamedQuery(name = "findProductsByProductTitleContaining", query = "select myProducts from Products myProducts where myProducts.productTitle like ?1"),
		@NamedQuery(name = "findProductsByQuantity", query = "select myProducts from Products myProducts where myProducts.quantity = ?1"),
		@NamedQuery(name = "findProductsBySalesPrice", query = "select myProducts from Products myProducts where myProducts.salesPrice = ?1"),
		@NamedQuery(name = "findProductsByStatus", query = "select myProducts from Products myProducts where myProducts.status = ?1"),
		@NamedQuery(name = "findProductsByStatusContaining", query = "select myProducts from Products myProducts where myProducts.status like ?1") })
@Table(schema = "SINGHS2", name = "PRODUCTS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "Products")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class Products implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "PRODUCT_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="products_seq_gen")
	@SequenceGenerator(name="products_seq_gen", sequenceName="PRODUCT_ID_SEQ", allocationSize=1)
	Integer productId;
	/**
	 */

	@Column(name = "PRODUCT_TITLE", length = 150, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productTitle;
	/**
	 */

	@Column(name = "SALES_PRICE", scale = 2, precision = 16, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal salesPrice;
	/**
	 */

	@Column(name = "COST_PRICE", scale = 2, precision = 16, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal costPrice;
	/**
	 */

	@Column(name = "DISCOUNT_PRICE", scale = 2, precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal discountPrice;
	/**
	 */

	@Column(name = "PERCENTAGE_DISCOUNT", precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal percentageDiscount;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar createdOn;
	/**
	 */

	@Column(name = "CREATED_BY", length = 150)
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

	@Column(name = "MODIFIED_BY", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String modifiedBy;
	/**
	 */

	@Column(name = "STATUS", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String status;
	/**
	 */

	@Column(name = "QUANTITY", precision = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal quantity;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "VENDOR_ID", referencedColumnName = "REGISTRATION_ID") })
	@XmlTransient
	VendorProfile vendorProfile;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "VENDOR_COMPANY_ID", referencedColumnName = "LOCATION_ID") })
	@XmlTransient
	VendorLocations vendorLocations;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "CATEGORY_ID", nullable = false) })
	@XmlTransient
	ProductsCategory productsCategory;
	/**
	 */
	@OneToMany(mappedBy = "products", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductsFeedback> productsFeedbacks;
	/**
	 */
	@OneToMany(mappedBy = "products", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductsRating> productsRatings;
	/**
	 */
	@OneToMany(mappedBy = "products", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductsDescription> productsDescriptions;
	/**
	 */
	@OneToMany(mappedBy = "products", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductImages> productImageses;
	/**
	 */
	@OneToMany(mappedBy = "products", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CartItems> cartItemses;

	/**
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 */
	public Integer getProductId() {
		return this.productId;
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
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	/**
	 */
	public BigDecimal getSalesPrice() {
		return this.salesPrice;
	}

	/**
	 */
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	/**
	 */
	public BigDecimal getCostPrice() {
		return this.costPrice;
	}

	/**
	 */
	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	/**
	 */
	public BigDecimal getDiscountPrice() {
		return this.discountPrice;
	}

	/**
	 */
	public void setPercentageDiscount(BigDecimal percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

	/**
	 */
	public BigDecimal getPercentageDiscount() {
		return this.percentageDiscount;
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
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 */
	public BigDecimal getQuantity() {
		return this.quantity;
	}

	/**
	 */
	public void setVendorProfile(VendorProfile vendorProfile) {
		this.vendorProfile = vendorProfile;
	}

	/**
	 */
	public VendorProfile getVendorProfile() {
		return vendorProfile;
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
	public void setProductsCategory(ProductsCategory productsCategory) {
		this.productsCategory = productsCategory;
	}

	/**
	 */
	public ProductsCategory getProductsCategory() {
		return productsCategory;
	}

	/**
	 */
	public void setProductsFeedbacks(Set<ProductsFeedback> productsFeedbacks) {
		this.productsFeedbacks = productsFeedbacks;
	}

	/**
	 */
	public Set<ProductsFeedback> getProductsFeedbacks() {
		if (productsFeedbacks == null) {
			productsFeedbacks = new java.util.LinkedHashSet<main.app.domain.ProductsFeedback>();
		}
		return productsFeedbacks;
	}

	/**
	 */
	public void setProductsRatings(Set<ProductsRating> productsRatings) {
		this.productsRatings = productsRatings;
	}

	/**
	 */
	public Set<ProductsRating> getProductsRatings() {
		if (productsRatings == null) {
			productsRatings = new java.util.LinkedHashSet<main.app.domain.ProductsRating>();
		}
		return productsRatings;
	}

	/**
	 */
	public void setProductsDescriptions(Set<ProductsDescription> productsDescriptions) {
		this.productsDescriptions = productsDescriptions;
	}

	/**
	 */
	public Set<ProductsDescription> getProductsDescriptions() {
		if (productsDescriptions == null) {
			productsDescriptions = new java.util.LinkedHashSet<main.app.domain.ProductsDescription>();
		}
		return productsDescriptions;
	}

	/**
	 */
	public void setProductImageses(Set<ProductImages> productImageses) {
		this.productImageses = productImageses;
	}

	/**
	 */
	public Set<ProductImages> getProductImageses() {
		if (productImageses == null) {
			productImageses = new java.util.LinkedHashSet<main.app.domain.ProductImages>();
		}
		return productImageses;
	}

	/**
	 */
	public void setCartItemses(Set<CartItems> cartItemses) {
		this.cartItemses = cartItemses;
	}

	/**
	 */
	public Set<CartItems> getCartItemses() {
		if (cartItemses == null) {
			cartItemses = new java.util.LinkedHashSet<main.app.domain.CartItems>();
		}
		return cartItemses;
	}

	/**
	 */
	public Products() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Products that) {
		setProductId(that.getProductId());
		setProductTitle(that.getProductTitle());
		setSalesPrice(that.getSalesPrice());
		setCostPrice(that.getCostPrice());
		setDiscountPrice(that.getDiscountPrice());
		setPercentageDiscount(that.getPercentageDiscount());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setStatus(that.getStatus());
		setQuantity(that.getQuantity());
		setVendorProfile(that.getVendorProfile());
		setVendorLocations(that.getVendorLocations());
		setProductsCategory(that.getProductsCategory());
		setProductsFeedbacks(new java.util.LinkedHashSet<main.app.domain.ProductsFeedback>(that.getProductsFeedbacks()));
		setProductsRatings(new java.util.LinkedHashSet<main.app.domain.ProductsRating>(that.getProductsRatings()));
		setProductsDescriptions(new java.util.LinkedHashSet<main.app.domain.ProductsDescription>(that.getProductsDescriptions()));
		setProductImageses(new java.util.LinkedHashSet<main.app.domain.ProductImages>(that.getProductImageses()));
		setCartItemses(new java.util.LinkedHashSet<main.app.domain.CartItems>(that.getCartItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("productId=[").append(productId).append("] ");
		buffer.append("productTitle=[").append(productTitle).append("] ");
		buffer.append("salesPrice=[").append(salesPrice).append("] ");
		buffer.append("costPrice=[").append(costPrice).append("] ");
		buffer.append("discountPrice=[").append(discountPrice).append("] ");
		buffer.append("percentageDiscount=[").append(percentageDiscount).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("quantity=[").append(quantity).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((productId == null) ? 0 : productId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Products))
			return false;
		Products equalCheck = (Products) obj;
		if ((productId == null && equalCheck.productId != null) || (productId != null && equalCheck.productId == null))
			return false;
		if (productId != null && !productId.equals(equalCheck.productId))
			return false;
		return true;
	}
}
