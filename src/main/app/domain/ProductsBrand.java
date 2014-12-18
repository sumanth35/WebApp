package main.app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
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
		@NamedQuery(name = "findAllProductsBrands", query = "select myProductsBrand from ProductsBrand myProductsBrand"),
		@NamedQuery(name = "findProductsBrandByBrandCode", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandCode = ?1"),
		@NamedQuery(name = "findProductsBrandByBrandCodeContaining", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandCode like ?1"),
		@NamedQuery(name = "findProductsBrandByBrandDescription", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandDescription = ?1"),
		@NamedQuery(name = "findProductsBrandByBrandDescriptionContaining", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandDescription like ?1"),
		@NamedQuery(name = "findProductsBrandByBrandId", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandId = ?1"),
		@NamedQuery(name = "findProductsBrandByBrandName", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandName = ?1"),
		@NamedQuery(name = "findProductsBrandByBrandNameContaining", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandName like ?1"),
		@NamedQuery(name = "findProductsBrandByCreatedBy", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.createdBy = ?1"),
		@NamedQuery(name = "findProductsBrandByCreatedByContaining", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.createdBy like ?1"),
		@NamedQuery(name = "findProductsBrandByCreatedOn", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.createdOn = ?1"),
		@NamedQuery(name = "findProductsBrandByModifiedBy", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.modifiedBy = ?1"),
		@NamedQuery(name = "findProductsBrandByModifiedByContaining", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.modifiedBy like ?1"),
		@NamedQuery(name = "findProductsBrandByModifiedOn", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.modifiedOn = ?1"),
		@NamedQuery(name = "findProductsBrandByPrimaryKey", query = "select myProductsBrand from ProductsBrand myProductsBrand where myProductsBrand.brandId = ?1") })
@Table(schema = "SINGHS2", name = "PRODUCTS_BRAND")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ProductsBrand")
public class ProductsBrand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "BRAND_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_brand_seq_gen")
	@SequenceGenerator(name="product_brand_seq_gen", sequenceName="PRODUCT_BRAND_ID_SEQ", allocationSize=1)
	Integer brandId;
	/**
	 */

	@Column(name = "BRAND_NAME", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String brandName;
	/**
	 */

	@Column(name = "BRAND_DESCRIPTION", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String brandDescription;
	/**
	 */

	@Column(name = "BRAND_CODE", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String brandCode;
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
	@JoinColumns({ @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID", nullable = false) })
	@XmlTransient
	ProductsCategory productsCategory;

	/**
	 */
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	/**
	 */
	public Integer getBrandId() {
		return this.brandId;
	}

	/**
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 */
	public String getBrandName() {
		return this.brandName;
	}

	/**
	 */
	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	/**
	 */
	public String getBrandDescription() {
		return this.brandDescription;
	}

	/**
	 */
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	/**
	 */
	public String getBrandCode() {
		return this.brandCode;
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
	public ProductsBrand() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductsBrand that) {
		setBrandId(that.getBrandId());
		setBrandName(that.getBrandName());
		setBrandDescription(that.getBrandDescription());
		setBrandCode(that.getBrandCode());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedBy(that.getModifiedBy());
		setModifiedOn(that.getModifiedOn());
		setProductsCategory(that.getProductsCategory());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("brandId=[").append(brandId).append("] ");
		buffer.append("brandName=[").append(brandName).append("] ");
		buffer.append("brandDescription=[").append(brandDescription).append("] ");
		buffer.append("brandCode=[").append(brandCode).append("] ");
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
		result = (int) (prime * result + ((brandId == null) ? 0 : brandId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductsBrand))
			return false;
		ProductsBrand equalCheck = (ProductsBrand) obj;
		if ((brandId == null && equalCheck.brandId != null) || (brandId != null && equalCheck.brandId == null))
			return false;
		if (brandId != null && !brandId.equals(equalCheck.brandId))
			return false;
		return true;
	}
}
