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
		@NamedQuery(name = "findAllOrderRequestStatusess", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses"),
		@NamedQuery(name = "findOrderRequestStatusesByAbbreviation", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.abbreviation = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByAbbreviationContaining", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.abbreviation like ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByCreatedBy", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.createdBy = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByCreatedByContaining", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.createdBy like ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByCreatedOn", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.createdOn = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByDescription", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.description = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByDescriptionContaining", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.description like ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByModifiedBy", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.modifiedBy = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByModifiedByContaining", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.modifiedBy like ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByModifiedOn", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.modifiedOn = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByOrderRequestStatusId", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.orderRequestStatusId = ?1"),
		@NamedQuery(name = "findOrderRequestStatusesByPrimaryKey", query = "select myOrderRequestStatuses from OrderRequestStatuses myOrderRequestStatuses where myOrderRequestStatuses.orderRequestStatusId = ?1") })
@Table(schema = "SINGHS2", name = "ORDER_REQUEST_STATUSES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "OrderRequestStatuses")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class OrderRequestStatuses implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ORDER_REQUEST_STATUS_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="order_request_status_seq_gen")
	@SequenceGenerator(name="order_request_status_seq_gen", sequenceName="ORDER_REQUEST_STATUS_ID_SEQ", allocationSize=1)
	Integer orderRequestStatusId;
	/**
	 */

	@Column(name = "ABBREVIATION", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String abbreviation;
	/**
	 */

	@Column(name = "DESCRIPTION", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
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
	@OneToMany(mappedBy = "orderRequestStatuses", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.OrderRequest> orderRequests;

	/**
	 */
	public void setOrderRequestStatusId(Integer orderRequestStatusId) {
		this.orderRequestStatusId = orderRequestStatusId;
	}

	/**
	 */
	public Integer getOrderRequestStatusId() {
		return this.orderRequestStatusId;
	}

	/**
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 */
	public String getAbbreviation() {
		return this.abbreviation;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
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
	public void setOrderRequests(Set<OrderRequest> orderRequests) {
		this.orderRequests = orderRequests;
	}

	/**
	 */
	public Set<OrderRequest> getOrderRequests() {
		if (orderRequests == null) {
			orderRequests = new java.util.LinkedHashSet<main.app.domain.OrderRequest>();
		}
		return orderRequests;
	}

	/**
	 */
	public OrderRequestStatuses() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(OrderRequestStatuses that) {
		setOrderRequestStatusId(that.getOrderRequestStatusId());
		setAbbreviation(that.getAbbreviation());
		setDescription(that.getDescription());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setOrderRequests(new java.util.LinkedHashSet<main.app.domain.OrderRequest>(that.getOrderRequests()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderRequestStatusId=[").append(orderRequestStatusId).append("] ");
		buffer.append("abbreviation=[").append(abbreviation).append("] ");
		buffer.append("description=[").append(description).append("] ");
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
		result = (int) (prime * result + ((orderRequestStatusId == null) ? 0 : orderRequestStatusId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof OrderRequestStatuses))
			return false;
		OrderRequestStatuses equalCheck = (OrderRequestStatuses) obj;
		if ((orderRequestStatusId == null && equalCheck.orderRequestStatusId != null) || (orderRequestStatusId != null && equalCheck.orderRequestStatusId == null))
			return false;
		if (orderRequestStatusId != null && !orderRequestStatusId.equals(equalCheck.orderRequestStatusId))
			return false;
		return true;
	}
}
