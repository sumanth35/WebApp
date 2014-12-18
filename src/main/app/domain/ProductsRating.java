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
		@NamedQuery(name = "findAllProductsRatings", query = "select myProductsRating from ProductsRating myProductsRating"),
		@NamedQuery(name = "findProductsRatingByCreatedBy", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.createdBy = ?1"),
		@NamedQuery(name = "findProductsRatingByCreatedByContaining", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.createdBy like ?1"),
		@NamedQuery(name = "findProductsRatingByCreatedOn", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.createdOn = ?1"),
		@NamedQuery(name = "findProductsRatingByModifiedBy", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.modifiedBy = ?1"),
		@NamedQuery(name = "findProductsRatingByModifiedByContaining", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.modifiedBy like ?1"),
		@NamedQuery(name = "findProductsRatingByModifiedOn", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.modifiedOn = ?1"),
		@NamedQuery(name = "findProductsRatingByPrimaryKey", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.productRatingId = ?1"),
		@NamedQuery(name = "findProductsRatingByProductRating", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.productRating = ?1"),
		@NamedQuery(name = "findProductsRatingByProductRatingId", query = "select myProductsRating from ProductsRating myProductsRating where myProductsRating.productRatingId = ?1") })
@Table(schema = "SINGHS2", name = "PRODUCTS_RATING")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ProductsRating")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class ProductsRating implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "PRODUCT_RATING_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_rating_seq_gen")
	@SequenceGenerator(name="product_rating_seq_gen", sequenceName="PRODUCT_RATING_ID_SEQ", allocationSize=1)
	Integer productRatingId;
	/**
	 */

	@Column(name = "PRODUCT_RATING", precision = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal productRating;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar createdOn;
	/**
	 */

	@Column(name = "CREATED_BY", length = 50)
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

	@Column(name = "MODIFIED_BY", length = 50)
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
	@JoinColumns({ @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID") })
	@XmlTransient
	CustomerProfile customerProfile;
	/**
	 */
	@OneToMany(mappedBy = "productsRating", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductsFeedback> productsFeedbacks;

	/**
	 */
	public void setProductRatingId(Integer productRatingId) {
		this.productRatingId = productRatingId;
	}

	/**
	 */
	public Integer getProductRatingId() {
		return this.productRatingId;
	}

	/**
	 */
	public void setProductRating(BigDecimal productRating) {
		this.productRating = productRating;
	}

	/**
	 */
	public BigDecimal getProductRating() {
		return this.productRating;
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
	public ProductsRating() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductsRating that) {
		setProductRatingId(that.getProductRatingId());
		setProductRating(that.getProductRating());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setProducts(that.getProducts());
		setCustomerProfile(that.getCustomerProfile());
		setProductsFeedbacks(new java.util.LinkedHashSet<main.app.domain.ProductsFeedback>(that.getProductsFeedbacks()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("productRatingId=[").append(productRatingId).append("] ");
		buffer.append("productRating=[").append(productRating).append("] ");
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
		result = (int) (prime * result + ((productRatingId == null) ? 0 : productRatingId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductsRating))
			return false;
		ProductsRating equalCheck = (ProductsRating) obj;
		if ((productRatingId == null && equalCheck.productRatingId != null) || (productRatingId != null && equalCheck.productRatingId == null))
			return false;
		if (productRatingId != null && !productRatingId.equals(equalCheck.productRatingId))
			return false;
		return true;
	}
}
