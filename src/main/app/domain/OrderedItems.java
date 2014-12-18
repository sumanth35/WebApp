package main.app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
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
		@NamedQuery(name = "findAllOrderedItemss", query = "select myOrderedItems from OrderedItems myOrderedItems"),
		@NamedQuery(name = "findOrderedItemsByCreatedBy", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.createdBy = ?1"),
		@NamedQuery(name = "findOrderedItemsByCreatedByContaining", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.createdBy like ?1"),
		@NamedQuery(name = "findOrderedItemsByCreatedOn", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.createdOn = ?1"),
		@NamedQuery(name = "findOrderedItemsByItemPrice", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.itemPrice = ?1"),
		@NamedQuery(name = "findOrderedItemsByModifiedBy", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.modifiedBy = ?1"),
		@NamedQuery(name = "findOrderedItemsByModifiedByContaining", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.modifiedBy like ?1"),
		@NamedQuery(name = "findOrderedItemsByModifiedOn", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.modifiedOn = ?1"),
		@NamedQuery(name = "findOrderedItemsByOrderItemId", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.orderItemId = ?1"),
		@NamedQuery(name = "findOrderedItemsByPrimaryKey", query = "select myOrderedItems from OrderedItems myOrderedItems where myOrderedItems.orderItemId = ?1") })
@Table(schema = "SINGHS2", name = "ORDERED_ITEMS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "OrderedItems")
public class OrderedItems implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ORDER_ITEM_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ordered_items_seq_gen")
	@SequenceGenerator(name="ordered_items_seq_gen", sequenceName="ORDERED_ITEM_ID_SEQ", allocationSize=1)
	Integer orderItemId;
	/**
	 */

	@Column(name = "ITEM_PRICE", scale = 2, precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal itemPrice;
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
	@JoinColumns({ @JoinColumn(name = "CART_ITEM_ID", referencedColumnName = "CART_ITEM_ID") })
	@XmlTransient
	CartItems cartItems;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "ORDER_REQUEST_ID", referencedColumnName = "ORDER_REQUEST_ID") })
	@XmlTransient
	OrderRequest orderRequest;

	/**
	 */
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 */
	public Integer getOrderItemId() {
		return this.orderItemId;
	}

	/**
	 */
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 */
	public BigDecimal getItemPrice() {
		return this.itemPrice;
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
	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}

	/**
	 */
	public CartItems getCartItems() {
		return cartItems;
	}

	/**
	 */
	public void setOrderRequest(OrderRequest orderRequest) {
		this.orderRequest = orderRequest;
	}

	/**
	 */
	public OrderRequest getOrderRequest() {
		return orderRequest;
	}

	/**
	 */
	public OrderedItems() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(OrderedItems that) {
		setOrderItemId(that.getOrderItemId());
		setItemPrice(that.getItemPrice());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setCartItems(that.getCartItems());
		setOrderRequest(that.getOrderRequest());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderItemId=[").append(orderItemId).append("] ");
		buffer.append("itemPrice=[").append(itemPrice).append("] ");
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
		result = (int) (prime * result + ((orderItemId == null) ? 0 : orderItemId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof OrderedItems))
			return false;
		OrderedItems equalCheck = (OrderedItems) obj;
		if ((orderItemId == null && equalCheck.orderItemId != null) || (orderItemId != null && equalCheck.orderItemId == null))
			return false;
		if (orderItemId != null && !orderItemId.equals(equalCheck.orderItemId))
			return false;
		return true;
	}
}
