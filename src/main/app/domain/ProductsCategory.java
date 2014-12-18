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
		@NamedQuery(name = "findAllProductsCategorys", query = "select myProductsCategory from ProductsCategory myProductsCategory"),
		@NamedQuery(name = "findProductsCategoryByCategoryCode", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryCode = ?1"),
		@NamedQuery(name = "findProductsCategoryByCategoryCodeContaining", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryCode like ?1"),
		@NamedQuery(name = "findProductsCategoryByCategoryDescription", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryDescription = ?1"),
		@NamedQuery(name = "findProductsCategoryByCategoryDescriptionContaining", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryDescription like ?1"),
		@NamedQuery(name = "findProductsCategoryByCategoryId", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryId = ?1"),
		@NamedQuery(name = "findProductsCategoryByCategoryName", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryName = ?1"),
		@NamedQuery(name = "findProductsCategoryByCategoryNameContaining", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryName like ?1"),
		@NamedQuery(name = "findProductsCategoryByCreatedBy", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.createdBy = ?1"),
		@NamedQuery(name = "findProductsCategoryByCreatedByContaining", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.createdBy like ?1"),
		@NamedQuery(name = "findProductsCategoryByCreatedOn", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.createdOn = ?1"),
		@NamedQuery(name = "findProductsCategoryByModifiedBy", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.modifiedBy = ?1"),
		@NamedQuery(name = "findProductsCategoryByModifiedByContaining", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.modifiedBy like ?1"),
		@NamedQuery(name = "findProductsCategoryByModifiedOn", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.modifiedOn = ?1"),
		@NamedQuery(name = "findProductsCategoryByPrimaryKey", query = "select myProductsCategory from ProductsCategory myProductsCategory where myProductsCategory.categoryId = ?1") })
@Table(schema = "SINGHS2", name = "PRODUCTS_CATEGORY")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ProductsCategory")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class ProductsCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "CATEGORY_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_category_seq_gen")
	@SequenceGenerator(name="product_category_seq_gen", sequenceName="PRODUCT_CATEGORY_ID_SEQ", allocationSize=1)
	Integer categoryId;
	/**
	 */

	@Column(name = "CATEGORY_NAME", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String categoryName;
	/**
	 */

	@Column(name = "CATEGORY_DESCRIPTION", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String categoryDescription;
	/**
	 */

	@Column(name = "CATEGORY_CODE", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String categoryCode;
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
	@OneToMany(mappedBy = "productsCategory", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductsBrand> productsBrands;
	/**
	 */
	@OneToMany(mappedBy = "productsCategory", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.Products> productses;

	/**
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 */
	public Integer getCategoryId() {
		return this.categoryId;
	}

	/**
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 */
	public String getCategoryName() {
		return this.categoryName;
	}

	/**
	 */
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	/**
	 */
	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	/**
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 */
	public String getCategoryCode() {
		return this.categoryCode;
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
	public void setProductsBrands(Set<ProductsBrand> productsBrands) {
		this.productsBrands = productsBrands;
	}

	/**
	 */
	public Set<ProductsBrand> getProductsBrands() {
		if (productsBrands == null) {
			productsBrands = new java.util.LinkedHashSet<main.app.domain.ProductsBrand>();
		}
		return productsBrands;
	}

	/**
	 */
	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

	/**
	 */
	public Set<Products> getProductses() {
		if (productses == null) {
			productses = new java.util.LinkedHashSet<main.app.domain.Products>();
		}
		return productses;
	}

	/**
	 */
	public ProductsCategory() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductsCategory that) {
		setCategoryId(that.getCategoryId());
		setCategoryName(that.getCategoryName());
		setCategoryDescription(that.getCategoryDescription());
		setCategoryCode(that.getCategoryCode());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedBy(that.getModifiedBy());
		setModifiedOn(that.getModifiedOn());
		setProductsBrands(new java.util.LinkedHashSet<main.app.domain.ProductsBrand>(that.getProductsBrands()));
		setProductses(new java.util.LinkedHashSet<main.app.domain.Products>(that.getProductses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("categoryId=[").append(categoryId).append("] ");
		buffer.append("categoryName=[").append(categoryName).append("] ");
		buffer.append("categoryDescription=[").append(categoryDescription).append("] ");
		buffer.append("categoryCode=[").append(categoryCode).append("] ");
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
		result = (int) (prime * result + ((categoryId == null) ? 0 : categoryId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductsCategory))
			return false;
		ProductsCategory equalCheck = (ProductsCategory) obj;
		if ((categoryId == null && equalCheck.categoryId != null) || (categoryId != null && equalCheck.categoryId == null))
			return false;
		if (categoryId != null && !categoryId.equals(equalCheck.categoryId))
			return false;
		return true;
	}
}
