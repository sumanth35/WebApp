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
		@NamedQuery(name = "findAllVendorLocationAssociationss", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations"),
		@NamedQuery(name = "findVendorLocationAssociationsByCreatedBy", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.createdBy = ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByCreatedByContaining", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.createdBy like ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByCreatedOn", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.createdOn = ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByLocationId", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.locationId = ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByModifiedBy", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.modifiedBy = ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByModifiedByContaining", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.modifiedBy like ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByModifiedOn", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.modifiedOn = ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByPrimaryKey", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.vendorLocationAssociationId = ?1"),
		@NamedQuery(name = "findVendorLocationAssociationsByVendorLocationAssociationId", query = "select myVendorLocationAssociations from VendorLocationAssociations myVendorLocationAssociations where myVendorLocationAssociations.vendorLocationAssociationId = ?1") })
@Table(schema = "SINGHS2", name = "VENDOR_LOCATION_ASSOCIATIONS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "VendorLocationAssociations")
public class VendorLocationAssociations implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "VENDOR_LOCATION_ASSOCIATION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_location_ass_seq_gen")
	@SequenceGenerator(name="vendor_location_ass_seq_gen", sequenceName="VENDOR_LOCATION_ASS_ID_SEQ", allocationSize=1)
	Integer vendorLocationAssociationId;
	/**
	 */

	@Column(name = "LOCATION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer locationId;
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
	@JoinColumns({ @JoinColumn(name = "VENDOR_PROFILE_ID", referencedColumnName = "REGISTRATION_ID", nullable = false) })
	@XmlTransient
	VendorProfile vendorProfile;

	/**
	 */
	public void setVendorLocationAssociationId(Integer vendorLocationAssociationId) {
		this.vendorLocationAssociationId = vendorLocationAssociationId;
	}

	/**
	 */
	public Integer getVendorLocationAssociationId() {
		return this.vendorLocationAssociationId;
	}

	/**
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 */
	public Integer getLocationId() {
		return this.locationId;
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
	public void setVendorProfile(VendorProfile vendorProfile) {
		this.vendorProfile = vendorProfile;
	}

	/**
	 */
	public VendorProfile getVendorProfile() {
		return vendorProfile;
	}

	/**
	 */
	public VendorLocationAssociations() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(VendorLocationAssociations that) {
		setVendorLocationAssociationId(that.getVendorLocationAssociationId());
		setLocationId(that.getLocationId());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setVendorProfile(that.getVendorProfile());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("vendorLocationAssociationId=[").append(vendorLocationAssociationId).append("] ");
		buffer.append("locationId=[").append(locationId).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
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
		result = (int) (prime * result + ((vendorLocationAssociationId == null) ? 0 : vendorLocationAssociationId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof VendorLocationAssociations))
			return false;
		VendorLocationAssociations equalCheck = (VendorLocationAssociations) obj;
		if ((vendorLocationAssociationId == null && equalCheck.vendorLocationAssociationId != null) || (vendorLocationAssociationId != null && equalCheck.vendorLocationAssociationId == null))
			return false;
		if (vendorLocationAssociationId != null && !vendorLocationAssociationId.equals(equalCheck.vendorLocationAssociationId))
			return false;
		return true;
	}
}
