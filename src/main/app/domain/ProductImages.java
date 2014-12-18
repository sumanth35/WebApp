package main.app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
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
		@NamedQuery(name = "findAllProductImagess", query = "select myProductImages from ProductImages myProductImages"),
		@NamedQuery(name = "findProductImagesByCreatedBy", query = "select myProductImages from ProductImages myProductImages where myProductImages.createdBy = ?1"),
		@NamedQuery(name = "findProductImagesByCreatedByContaining", query = "select myProductImages from ProductImages myProductImages where myProductImages.createdBy like ?1"),
		@NamedQuery(name = "findProductImagesByCreatedOn", query = "select myProductImages from ProductImages myProductImages where myProductImages.createdOn = ?1"),
		@NamedQuery(name = "findProductImagesByModifiedBy", query = "select myProductImages from ProductImages myProductImages where myProductImages.modifiedBy = ?1"),
		@NamedQuery(name = "findProductImagesByModifiedByContaining", query = "select myProductImages from ProductImages myProductImages where myProductImages.modifiedBy like ?1"),
		@NamedQuery(name = "findProductImagesByModifiedOn", query = "select myProductImages from ProductImages myProductImages where myProductImages.modifiedOn = ?1"),
		@NamedQuery(name = "findProductImagesByPrimaryKey", query = "select myProductImages from ProductImages myProductImages where myProductImages.productImageId = ?1"),
		@NamedQuery(name = "findProductImagesByProductImageId", query = "select myProductImages from ProductImages myProductImages where myProductImages.productImageId = ?1") })
@Table(schema = "SINGHS2", name = "PRODUCT_IMAGES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ProductImages")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class ProductImages implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "PRODUCT_IMAGE_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_image_seq_gen")
	@SequenceGenerator(name="product_image_seq_gen", sequenceName="PRODUCT_IMAGE_ID_SEQ", allocationSize=1)
	Integer productImageId;
	/**
	 */

	@Column(name = "PRODUCT_PRIMARY_IMAGE", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productPrimaryImage;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_IMAGE1")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productSecondaryImage1;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_IMAGE2")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productSecondaryImage2;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_IMAGE3")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productSecondaryImage3;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_IMAGE4")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productSecondaryImage4;
	/**
	 */

	@Column(name = "PRODUCT_SECONDARY_IMAGE5")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productSecondaryImage5;
	/**
	 */

	@Column(name = "PRODUCT_VIDEO")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] productVideo;
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
	@JoinColumns({ @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", nullable = false) })
	@XmlTransient
	Products products;
	/**
	 */
	@OneToMany(mappedBy = "productImages", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CartItems> cartItemses;

	/**
	 */
	public void setProductImageId(Integer productImageId) {
		this.productImageId = productImageId;
	}

	/**
	 */
	public Integer getProductImageId() {
		return this.productImageId;
	}

	/**
	 */
	public void setProductPrimaryImage(byte[] productPrimaryImage) {
		this.productPrimaryImage = productPrimaryImage;
	}

	/**
	 */
	public byte[] getProductPrimaryImage() {
		return this.productPrimaryImage;
	}

	/**
	 */
	public void setProductSecondaryImage1(byte[] productSecondaryImage1) {
		this.productSecondaryImage1 = productSecondaryImage1;
	}

	/**
	 */
	public byte[] getProductSecondaryImage1() {
		return this.productSecondaryImage1;
	}

	/**
	 */
	public void setProductSecondaryImage2(byte[] productSecondaryImage2) {
		this.productSecondaryImage2 = productSecondaryImage2;
	}

	/**
	 */
	public byte[] getProductSecondaryImage2() {
		return this.productSecondaryImage2;
	}

	/**
	 */
	public void setProductSecondaryImage3(byte[] productSecondaryImage3) {
		this.productSecondaryImage3 = productSecondaryImage3;
	}

	/**
	 */
	public byte[] getProductSecondaryImage3() {
		return this.productSecondaryImage3;
	}

	/**
	 */
	public void setProductSecondaryImage4(byte[] productSecondaryImage4) {
		this.productSecondaryImage4 = productSecondaryImage4;
	}

	/**
	 */
	public byte[] getProductSecondaryImage4() {
		return this.productSecondaryImage4;
	}

	/**
	 */
	public void setProductSecondaryImage5(byte[] productSecondaryImage5) {
		this.productSecondaryImage5 = productSecondaryImage5;
	}

	/**
	 */
	public byte[] getProductSecondaryImage5() {
		return this.productSecondaryImage5;
	}

	/**
	 */
	public void setProductVideo(byte[] productVideo) {
		this.productVideo = productVideo;
	}

	/**
	 */
	public byte[] getProductVideo() {
		return this.productVideo;
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
	public ProductImages() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductImages that) {
		setProductImageId(that.getProductImageId());
		setProductPrimaryImage(that.getProductPrimaryImage());
		setProductSecondaryImage1(that.getProductSecondaryImage1());
		setProductSecondaryImage2(that.getProductSecondaryImage2());
		setProductSecondaryImage3(that.getProductSecondaryImage3());
		setProductSecondaryImage4(that.getProductSecondaryImage4());
		setProductSecondaryImage5(that.getProductSecondaryImage5());
		setProductVideo(that.getProductVideo());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setProducts(that.getProducts());
		setCartItemses(new java.util.LinkedHashSet<main.app.domain.CartItems>(that.getCartItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("productImageId=[").append(productImageId).append("] ");
		buffer.append("productPrimaryImage=[").append(productPrimaryImage).append("] ");
		buffer.append("productSecondaryImage1=[").append(productSecondaryImage1).append("] ");
		buffer.append("productSecondaryImage2=[").append(productSecondaryImage2).append("] ");
		buffer.append("productSecondaryImage3=[").append(productSecondaryImage3).append("] ");
		buffer.append("productSecondaryImage4=[").append(productSecondaryImage4).append("] ");
		buffer.append("productSecondaryImage5=[").append(productSecondaryImage5).append("] ");
		buffer.append("productVideo=[").append(productVideo).append("] ");
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
		result = (int) (prime * result + ((productImageId == null) ? 0 : productImageId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductImages))
			return false;
		ProductImages equalCheck = (ProductImages) obj;
		if ((productImageId == null && equalCheck.productImageId != null) || (productImageId != null && equalCheck.productImageId == null))
			return false;
		if (productImageId != null && !productImageId.equals(equalCheck.productImageId))
			return false;
		return true;
	}
}
