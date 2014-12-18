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
		@NamedQuery(name = "findAllOrderRequests", query = "select myOrderRequest from OrderRequest myOrderRequest"),
		@NamedQuery(name = "findOrderRequestByCreatedBy", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.createdBy = ?1"),
		@NamedQuery(name = "findOrderRequestByCreatedByContaining", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.createdBy like ?1"),
		@NamedQuery(name = "findOrderRequestByCreatedOn", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.createdOn = ?1"),
		@NamedQuery(name = "findOrderRequestByModifiedBy", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.modifiedBy = ?1"),
		@NamedQuery(name = "findOrderRequestByModifiedByContaining", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.modifiedBy like ?1"),
		@NamedQuery(name = "findOrderRequestByModifiedOn", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.modifiedOn = ?1"),
		@NamedQuery(name = "findOrderRequestByOrderConfirmationNumber", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.orderConfirmationNumber = ?1"),
		@NamedQuery(name = "findOrderRequestByOrderConfirmationNumberContaining", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.orderConfirmationNumber like ?1"),
		@NamedQuery(name = "findOrderRequestByOrderRequestId", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.orderRequestId = ?1"),
		@NamedQuery(name = "findOrderRequestByPrimaryKey", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.orderRequestId = ?1"),
		@NamedQuery(name = "findOrderRequestByTax", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.tax = ?1"),
		@NamedQuery(name = "findOrderRequestByTotalCost", query = "select myOrderRequest from OrderRequest myOrderRequest where myOrderRequest.totalCost = ?1") })
@Table(schema = "SINGHS2", name = "ORDER_REQUEST")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "OrderRequest")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class OrderRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ORDER_REQUEST_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="order_request_seq_gen")
	@SequenceGenerator(name="order_request_seq_gen", sequenceName="ORDER_REQUEST_ID_SEQ", allocationSize=1)
	Integer orderRequestId;
	/**
	 */

	@Column(name = "ORDER_CONFIRMATION_NUMBER", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String orderConfirmationNumber;
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

	@Column(name = "TOTAL_COST", scale = 2, precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal totalCost;
	/**
	 */

	@Column(name = "TAX", scale = 2, precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal tax;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "ORDER_REQUEST_STATUS_ID", referencedColumnName = "ORDER_REQUEST_STATUS_ID") })
	@XmlTransient
	OrderRequestStatuses orderRequestStatuses;
	/**
	 */
	@OneToMany(mappedBy = "orderRequest", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ShipmentDetails> shipmentDetailses;
	/**
	 */
	@OneToMany(mappedBy = "orderRequest", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.OrderedItems> orderedItemses;

	/**
	 */
	public void setOrderRequestId(Integer orderRequestId) {
		this.orderRequestId = orderRequestId;
	}

	/**
	 */
	public Integer getOrderRequestId() {
		return this.orderRequestId;
	}

	/**
	 */
	public void setOrderConfirmationNumber(String orderConfirmationNumber) {
		this.orderConfirmationNumber = orderConfirmationNumber;
	}

	/**
	 */
	public String getOrderConfirmationNumber() {
		return this.orderConfirmationNumber;
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
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 */
	public BigDecimal getTotalCost() {
		return this.totalCost;
	}

	/**
	 */
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	/**
	 */
	public BigDecimal getTax() {
		return this.tax;
	}

	/**
	 */
	public void setOrderRequestStatuses(OrderRequestStatuses orderRequestStatuses) {
		this.orderRequestStatuses = orderRequestStatuses;
	}

	/**
	 */
	public OrderRequestStatuses getOrderRequestStatuses() {
		return orderRequestStatuses;
	}

	/**
	 */
	public void setShipmentDetailses(Set<ShipmentDetails> shipmentDetailses) {
		this.shipmentDetailses = shipmentDetailses;
	}

	/**
	 */
	public Set<ShipmentDetails> getShipmentDetailses() {
		if (shipmentDetailses == null) {
			shipmentDetailses = new java.util.LinkedHashSet<main.app.domain.ShipmentDetails>();
		}
		return shipmentDetailses;
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
	public OrderRequest() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(OrderRequest that) {
		setOrderRequestId(that.getOrderRequestId());
		setOrderConfirmationNumber(that.getOrderConfirmationNumber());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setTotalCost(that.getTotalCost());
		setTax(that.getTax());
		setOrderRequestStatuses(that.getOrderRequestStatuses());
		setShipmentDetailses(new java.util.LinkedHashSet<main.app.domain.ShipmentDetails>(that.getShipmentDetailses()));
		setOrderedItemses(new java.util.LinkedHashSet<main.app.domain.OrderedItems>(that.getOrderedItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderRequestId=[").append(orderRequestId).append("] ");
		buffer.append("orderConfirmationNumber=[").append(orderConfirmationNumber).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("totalCost=[").append(totalCost).append("] ");
		buffer.append("tax=[").append(tax).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((orderRequestId == null) ? 0 : orderRequestId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof OrderRequest))
			return false;
		OrderRequest equalCheck = (OrderRequest) obj;
		if ((orderRequestId == null && equalCheck.orderRequestId != null) || (orderRequestId != null && equalCheck.orderRequestId == null))
			return false;
		if (orderRequestId != null && !orderRequestId.equals(equalCheck.orderRequestId))
			return false;
		return true;
	}
}
