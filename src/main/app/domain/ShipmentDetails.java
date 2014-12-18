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
		@NamedQuery(name = "findAllShipmentDetailss", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails"),
		@NamedQuery(name = "findShipmentDetailsByCreatedBy", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.createdBy = ?1"),
		@NamedQuery(name = "findShipmentDetailsByCreatedByContaining", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.createdBy like ?1"),
		@NamedQuery(name = "findShipmentDetailsByCreatedOn", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.createdOn = ?1"),
		@NamedQuery(name = "findShipmentDetailsByExpectedDelivery", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.expectedDelivery = ?1"),
		@NamedQuery(name = "findShipmentDetailsByModifiedBy", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.modifiedBy = ?1"),
		@NamedQuery(name = "findShipmentDetailsByModifiedByContaining", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.modifiedBy like ?1"),
		@NamedQuery(name = "findShipmentDetailsByModifiedOn", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.modifiedOn = ?1"),
		@NamedQuery(name = "findShipmentDetailsByPrimaryKey", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.shipmentId = ?1"),
		@NamedQuery(name = "findShipmentDetailsByShipmentCarrier", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.shipmentCarrier = ?1"),
		@NamedQuery(name = "findShipmentDetailsByShipmentCarrierContaining", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.shipmentCarrier like ?1"),
		@NamedQuery(name = "findShipmentDetailsByShipmentId", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.shipmentId = ?1"),
		@NamedQuery(name = "findShipmentDetailsByStatus", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.status = ?1"),
		@NamedQuery(name = "findShipmentDetailsByStatusContaining", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.status like ?1"),
		@NamedQuery(name = "findShipmentDetailsByTrackingNumber", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.trackingNumber = ?1"),
		@NamedQuery(name = "findShipmentDetailsByTrackingNumberContaining", query = "select myShipmentDetails from ShipmentDetails myShipmentDetails where myShipmentDetails.trackingNumber like ?1") })
@Table(schema = "SINGHS2", name = "SHIPMENT_DETAILS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "ShipmentDetails")
public class ShipmentDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "SHIPMENT_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="shipment_details_seq_gen")
	@SequenceGenerator(name="shipment_details_seq_gen", sequenceName="SHIPMENT_DETAIL_ID_SEQ", allocationSize=1)
	Integer shipmentId;
	/**
	 */

	@Column(name = "SHIPMENT_CARRIER", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String shipmentCarrier;
	/**
	 */

	@Column(name = "TRACKING_NUMBER", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String trackingNumber;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXPECTED_DELIVERY")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar expectedDelivery;
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

	@Column(name = "STATUS", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String status;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_REQUEST_ID") })
	@XmlTransient
	OrderRequest orderRequest;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "RECIPIENT_LOCATION_ID", referencedColumnName = "RECIPIENT_LOCATION_ID") })
	@XmlTransient
	RecipientLocation recipientLocation;

	/**
	 */
	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}

	/**
	 */
	public Integer getShipmentId() {
		return this.shipmentId;
	}

	/**
	 */
	public void setShipmentCarrier(String shipmentCarrier) {
		this.shipmentCarrier = shipmentCarrier;
	}

	/**
	 */
	public String getShipmentCarrier() {
		return this.shipmentCarrier;
	}

	/**
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	 */
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	/**
	 */
	public void setExpectedDelivery(Calendar expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}

	/**
	 */
	public Calendar getExpectedDelivery() {
		return this.expectedDelivery;
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
	public void setRecipientLocation(RecipientLocation recipientLocation) {
		this.recipientLocation = recipientLocation;
	}

	/**
	 */
	public RecipientLocation getRecipientLocation() {
		return recipientLocation;
	}

	/**
	 */
	public ShipmentDetails() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ShipmentDetails that) {
		setShipmentId(that.getShipmentId());
		setShipmentCarrier(that.getShipmentCarrier());
		setTrackingNumber(that.getTrackingNumber());
		setExpectedDelivery(that.getExpectedDelivery());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setStatus(that.getStatus());
		setOrderRequest(that.getOrderRequest());
		setRecipientLocation(that.getRecipientLocation());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("shipmentId=[").append(shipmentId).append("] ");
		buffer.append("shipmentCarrier=[").append(shipmentCarrier).append("] ");
		buffer.append("trackingNumber=[").append(trackingNumber).append("] ");
		buffer.append("expectedDelivery=[").append(expectedDelivery).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("status=[").append(status).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((shipmentId == null) ? 0 : shipmentId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ShipmentDetails))
			return false;
		ShipmentDetails equalCheck = (ShipmentDetails) obj;
		if ((shipmentId == null && equalCheck.shipmentId != null) || (shipmentId != null && equalCheck.shipmentId == null))
			return false;
		if (shipmentId != null && !shipmentId.equals(equalCheck.shipmentId))
			return false;
		return true;
	}
}
