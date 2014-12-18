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
		@NamedQuery(name = "findAllProductsFeedbacks", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback"),
		@NamedQuery(name = "findProductsFeedbackByCreatedBy", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.createdBy = ?1"),
		@NamedQuery(name = "findProductsFeedbackByCreatedByContaining", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.createdBy like ?1"),
		@NamedQuery(name = "findProductsFeedbackByCreatedOn", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.createdOn = ?1"),
		@NamedQuery(name = "findProductsFeedbackByFeedbackComments", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.feedbackComments = ?1"),
		@NamedQuery(name = "findProductsFeedbackByFeedbackCommentsContaining", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.feedbackComments like ?1"),
		@NamedQuery(name = "findProductsFeedbackByFeedbackId", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.feedbackId = ?1"),
		@NamedQuery(name = "findProductsFeedbackByModifiedBy", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.modifiedBy = ?1"),
		@NamedQuery(name = "findProductsFeedbackByModifiedByContaining", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.modifiedBy like ?1"),
		@NamedQuery(name = "findProductsFeedbackByModifiedOn", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.modifiedOn = ?1"),
		@NamedQuery(name = "findProductsFeedbackByPrimaryKey", query = "select myProductsFeedback from ProductsFeedback myProductsFeedback where myProductsFeedback.feedbackId = ?1") })
@Table(schema = "SINGHS2", name = "PRODUCTS_FEEDBACK")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ProductsFeedback")
public class ProductsFeedback implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "FEEDBACK_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_feedback_seq_gen")
	@SequenceGenerator(name="product_feedback_seq_gen", sequenceName="PRODUCT_FEEDBACK_ID_SEQ", allocationSize=1)
	Integer feedbackId;
	/**
	 */

	@Column(name = "FEEDBACK_COMMENTS", length = 300)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String feedbackComments;
	/**
	 */

	@Column(name = "FEEDBACK_IMAGE")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] feedbackImage;
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
	@JoinColumns({ @JoinColumn(name = "FEEDBACK_RATING_ID", referencedColumnName = "PRODUCT_RATING_ID") })
	@XmlTransient
	ProductsRating productsRating;

	/**
	 */
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	/**
	 */
	public Integer getFeedbackId() {
		return this.feedbackId;
	}

	/**
	 */
	public void setFeedbackComments(String feedbackComments) {
		this.feedbackComments = feedbackComments;
	}

	/**
	 */
	public String getFeedbackComments() {
		return this.feedbackComments;
	}

	/**
	 */
	public void setFeedbackImage(byte[] feedbackImage) {
		this.feedbackImage = feedbackImage;
	}

	/**
	 */
	public byte[] getFeedbackImage() {
		return this.feedbackImage;
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
	public void setProductsRating(ProductsRating productsRating) {
		this.productsRating = productsRating;
	}

	/**
	 */
	public ProductsRating getProductsRating() {
		return productsRating;
	}

	/**
	 */
	public ProductsFeedback() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductsFeedback that) {
		setFeedbackId(that.getFeedbackId());
		setFeedbackComments(that.getFeedbackComments());
		setFeedbackImage(that.getFeedbackImage());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setProducts(that.getProducts());
		setProductsRating(that.getProductsRating());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("feedbackId=[").append(feedbackId).append("] ");
		buffer.append("feedbackComments=[").append(feedbackComments).append("] ");
		buffer.append("feedbackImage=[").append(feedbackImage).append("] ");
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
		result = (int) (prime * result + ((feedbackId == null) ? 0 : feedbackId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductsFeedback))
			return false;
		ProductsFeedback equalCheck = (ProductsFeedback) obj;
		if ((feedbackId == null && equalCheck.feedbackId != null) || (feedbackId != null && equalCheck.feedbackId == null))
			return false;
		if (feedbackId != null && !feedbackId.equals(equalCheck.feedbackId))
			return false;
		return true;
	}
}
