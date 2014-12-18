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
		@NamedQuery(name = "findAllProductsDescriptions", query = "select myProductsDescription from ProductsDescription myProductsDescription"),
		@NamedQuery(name = "findProductsDescriptionByCreatedBy", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.createdBy = ?1"),
		@NamedQuery(name = "findProductsDescriptionByCreatedByContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.createdBy like ?1"),
		@NamedQuery(name = "findProductsDescriptionByCreatedOn", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.createdOn = ?1"),
		@NamedQuery(name = "findProductsDescriptionByModifiedBy", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.modifiedBy = ?1"),
		@NamedQuery(name = "findProductsDescriptionByModifiedByContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.modifiedBy like ?1"),
		@NamedQuery(name = "findProductsDescriptionByModifiedOn", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.modifiedOn = ?1"),
		@NamedQuery(name = "findProductsDescriptionByPrimaryKey", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDescriptionId = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductColor", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productColor = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductColorContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productColor like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDescriptionId", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDescriptionId = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDimensionBreadth", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDimensionBreadth = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDimensionBreadthContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDimensionBreadth like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDimensionHeight", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDimensionHeight = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDimensionHeightContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDimensionHeight like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDimensionLength", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDimensionLength = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductDimensionLengthContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productDimensionLength like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductModelNumber", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productModelNumber = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductModelNumberContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productModelNumber like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductNumber", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productNumber = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductOrigin", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productOrigin = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductOriginContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productOrigin like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductPrimaryDescription", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productPrimaryDescription = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductPrimaryDescriptionContaining", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productPrimaryDescription like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription1", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription1 = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription1Containing", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription1 like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription2", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription2 = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription2Containing", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription2 like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription3", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription3 = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription3Containing", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription3 like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription4", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription4 = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription4Containing", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription4 like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription5", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription5 = ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductSecondaryDescription5Containing", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productSecondaryDescription5 like ?1"),
		@NamedQuery(name = "findProductsDescriptionByProductWeight", query = "select myProductsDescription from ProductsDescription myProductsDescription where myProductsDescription.productWeight = ?1") })
@Table(schema = "SINGHS2", name = "PRODUCTS_DESCRIPTION")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ProductsDescription")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class ProductsDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "PRODUCT_DESCRIPTION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_description_seq_gen")
	@SequenceGenerator(name="product_description_seq_gen", sequenceName="PRODUCT_DESCRIPTION_ID_SEQ", allocationSize=1)
	Integer productDescriptionId;
	/**
	 */

	@Column(name = "PRODUCT_PRIMARY_DESCRIPTION", length = 150, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productPrimaryDescription;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_DESCRIPTION1", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productSecondaryDescription1;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_DESCRIPTION2", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productSecondaryDescription2;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_DESCRIPTION3", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productSecondaryDescription3;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_DESCRIPTION4", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productSecondaryDescription4;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_DESCRIPTION5", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productSecondaryDescription5;
	/**
	 */

	@Column(name = "PRODUCT_COLOR", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productColor;
	/**
	 */

	@Column(name = "PRODUCT_DIMENSION_LENGTH", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productDimensionLength;
	/**
	 */

	@Column(name = "PRODUCT_DIMENSION_BREADTH", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productDimensionBreadth;
	/**
	 */

	@Column(name = "PRODUCT_DIMENSION_HEIGHT", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productDimensionHeight;
	/**
	 */

	@Column(name = "PRODUCT_WEIGHT", precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal productWeight;
	/**
	 */

	@Column(name = "PRODUCT_NUMBER", precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal productNumber;
	/**
	 */

	@Column(name = "PRODUCT_MODEL_NUMBER", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productModelNumber;
	/**
	 */

	@Column(name = "PRODUCT_ORIGIN", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String productOrigin;
	/**
	 */

	@Column(name = "CREATED_BY", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String createdBy;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar createdOn;
	/**
	 */

	@Column(name = "MODIFIED_BY", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String modifiedBy;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar modifiedOn;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", nullable = false) })
	@XmlTransient
	Products products;
	/**
	 */
	@OneToMany(mappedBy = "productsDescription", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CartItems> cartItemses;

	/**
	 */
	public void setProductDescriptionId(Integer productDescriptionId) {
		this.productDescriptionId = productDescriptionId;
	}

	/**
	 */
	public Integer getProductDescriptionId() {
		return this.productDescriptionId;
	}

	/**
	 */
	public void setProductPrimaryDescription(String productPrimaryDescription) {
		this.productPrimaryDescription = productPrimaryDescription;
	}

	/**
	 */
	public String getProductPrimaryDescription() {
		return this.productPrimaryDescription;
	}

	/**
	 */
	public void setProductSecondaryDescription1(String productSecondaryDescription1) {
		this.productSecondaryDescription1 = productSecondaryDescription1;
	}

	/**
	 */
	public String getProductSecondaryDescription1() {
		return this.productSecondaryDescription1;
	}

	/**
	 */
	public void setProductSecondaryDescription2(String productSecondaryDescription2) {
		this.productSecondaryDescription2 = productSecondaryDescription2;
	}

	/**
	 */
	public String getProductSecondaryDescription2() {
		return this.productSecondaryDescription2;
	}

	/**
	 */
	public void setProductSecondaryDescription3(String productSecondaryDescription3) {
		this.productSecondaryDescription3 = productSecondaryDescription3;
	}

	/**
	 */
	public String getProductSecondaryDescription3() {
		return this.productSecondaryDescription3;
	}

	/**
	 */
	public void setProductSecondaryDescription4(String productSecondaryDescription4) {
		this.productSecondaryDescription4 = productSecondaryDescription4;
	}

	/**
	 */
	public String getProductSecondaryDescription4() {
		return this.productSecondaryDescription4;
	}

	/**
	 */
	public void setProductSecondaryDescription5(String productSecondaryDescription5) {
		this.productSecondaryDescription5 = productSecondaryDescription5;
	}

	/**
	 */
	public String getProductSecondaryDescription5() {
		return this.productSecondaryDescription5;
	}

	/**
	 */
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	/**
	 */
	public String getProductColor() {
		return this.productColor;
	}

	/**
	 */
	public void setProductDimensionLength(String productDimensionLength) {
		this.productDimensionLength = productDimensionLength;
	}

	/**
	 */
	public String getProductDimensionLength() {
		return this.productDimensionLength;
	}

	/**
	 */
	public void setProductDimensionBreadth(String productDimensionBreadth) {
		this.productDimensionBreadth = productDimensionBreadth;
	}

	/**
	 */
	public String getProductDimensionBreadth() {
		return this.productDimensionBreadth;
	}

	/**
	 */
	public void setProductDimensionHeight(String productDimensionHeight) {
		this.productDimensionHeight = productDimensionHeight;
	}

	/**
	 */
	public String getProductDimensionHeight() {
		return this.productDimensionHeight;
	}

	/**
	 */
	public void setProductWeight(BigDecimal productWeight) {
		this.productWeight = productWeight;
	}

	/**
	 */
	public BigDecimal getProductWeight() {
		return this.productWeight;
	}

	/**
	 */
	public void setProductNumber(BigDecimal productNumber) {
		this.productNumber = productNumber;
	}

	/**
	 */
	public BigDecimal getProductNumber() {
		return this.productNumber;
	}

	/**
	 */
	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}

	/**
	 */
	public String getProductModelNumber() {
		return this.productModelNumber;
	}

	/**
	 */
	public void setProductOrigin(String productOrigin) {
		this.productOrigin = productOrigin;
	}

	/**
	 */
	public String getProductOrigin() {
		return this.productOrigin;
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
	public ProductsDescription() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductsDescription that) {
		setProductDescriptionId(that.getProductDescriptionId());
		setProductPrimaryDescription(that.getProductPrimaryDescription());
		setProductSecondaryDescription1(that.getProductSecondaryDescription1());
		setProductSecondaryDescription2(that.getProductSecondaryDescription2());
		setProductSecondaryDescription3(that.getProductSecondaryDescription3());
		setProductSecondaryDescription4(that.getProductSecondaryDescription4());
		setProductSecondaryDescription5(that.getProductSecondaryDescription5());
		setProductColor(that.getProductColor());
		setProductDimensionLength(that.getProductDimensionLength());
		setProductDimensionBreadth(that.getProductDimensionBreadth());
		setProductDimensionHeight(that.getProductDimensionHeight());
		setProductWeight(that.getProductWeight());
		setProductNumber(that.getProductNumber());
		setProductModelNumber(that.getProductModelNumber());
		setProductOrigin(that.getProductOrigin());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedBy(that.getModifiedBy());
		setModifiedOn(that.getModifiedOn());
		setProducts(that.getProducts());
		setCartItemses(new java.util.LinkedHashSet<main.app.domain.CartItems>(that.getCartItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("productDescriptionId=[").append(productDescriptionId).append("] ");
		buffer.append("productPrimaryDescription=[").append(productPrimaryDescription).append("] ");
		buffer.append("productSecondaryDescription1=[").append(productSecondaryDescription1).append("] ");
		buffer.append("productSecondaryDescription2=[").append(productSecondaryDescription2).append("] ");
		buffer.append("productSecondaryDescription3=[").append(productSecondaryDescription3).append("] ");
		buffer.append("productSecondaryDescription4=[").append(productSecondaryDescription4).append("] ");
		buffer.append("productSecondaryDescription5=[").append(productSecondaryDescription5).append("] ");
		buffer.append("productColor=[").append(productColor).append("] ");
		buffer.append("productDimensionLength=[").append(productDimensionLength).append("] ");
		buffer.append("productDimensionBreadth=[").append(productDimensionBreadth).append("] ");
		buffer.append("productDimensionHeight=[").append(productDimensionHeight).append("] ");
		buffer.append("productWeight=[").append(productWeight).append("] ");
		buffer.append("productNumber=[").append(productNumber).append("] ");
		buffer.append("productModelNumber=[").append(productModelNumber).append("] ");
		buffer.append("productOrigin=[").append(productOrigin).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((productDescriptionId == null) ? 0 : productDescriptionId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductsDescription))
			return false;
		ProductsDescription equalCheck = (ProductsDescription) obj;
		if ((productDescriptionId == null && equalCheck.productDescriptionId != null) || (productDescriptionId != null && equalCheck.productDescriptionId == null))
			return false;
		if (productDescriptionId != null && !productDescriptionId.equals(equalCheck.productDescriptionId))
			return false;
		return true;
	}
}
