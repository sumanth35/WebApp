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
		@NamedQuery(name = "findAllIndDistricts", query = "select myIndDistrict from IndDistrict myIndDistrict"),
		@NamedQuery(name = "findIndDistrictByCreatedBy", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.createdBy = ?1"),
		@NamedQuery(name = "findIndDistrictByCreatedByContaining", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.createdBy like ?1"),
		@NamedQuery(name = "findIndDistrictByCreatedOn", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.createdOn = ?1"),
		@NamedQuery(name = "findIndDistrictByDistrictAbbr", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.districtAbbr = ?1"),
		@NamedQuery(name = "findIndDistrictByDistrictAbbrContaining", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.districtAbbr like ?1"),
		@NamedQuery(name = "findIndDistrictByDistrictId", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.districtId = ?1"),
		@NamedQuery(name = "findIndDistrictByDistrictName", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.districtName = ?1"),
		@NamedQuery(name = "findIndDistrictByDistrictNameContaining", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.districtName like ?1"),
		@NamedQuery(name = "findIndDistrictByModifiedBy", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.modifiedBy = ?1"),
		@NamedQuery(name = "findIndDistrictByModifiedByContaining", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.modifiedBy like ?1"),
		@NamedQuery(name = "findIndDistrictByModifiedOn", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.modifiedOn = ?1"),
		@NamedQuery(name = "findIndDistrictByPrimaryKey", query = "select myIndDistrict from IndDistrict myIndDistrict where myIndDistrict.districtId = ?1") })
@Table(schema = "SINGHS2", name = "IND_DISTRICT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "IndDistrict")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class IndDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "DISTRICT_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ind_district_seq_gen")
	@SequenceGenerator(name="ind_district_seq_gen", sequenceName="IND_DISTRICT_ID_SEQ", allocationSize=1)
	Integer districtId;
	/**
	 */

	@Column(name = "DISTRICT_NAME", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String districtName;
	/**
	 */

	@Column(name = "DISTRICT_ABBR", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String districtAbbr;
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
	@JoinColumns({ @JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID") })
	@XmlTransient
	IndStates indStates;
	/**
	 */
	@OneToMany(mappedBy = "indDistrict", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.IndCities> indCitieses;
	/**
	 */
	@OneToMany(mappedBy = "indDistrict", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "indDistrict", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;
	/**
	 */
	@OneToMany(mappedBy = "indDistrict", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocations> vendorLocationses;
	/**
	 */
	@OneToMany(mappedBy = "indDistrict", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;

	/**
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 */
	public Integer getDistrictId() {
		return this.districtId;
	}

	/**
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 */
	public String getDistrictName() {
		return this.districtName;
	}

	/**
	 */
	public void setDistrictAbbr(String districtAbbr) {
		this.districtAbbr = districtAbbr;
	}

	/**
	 */
	public String getDistrictAbbr() {
		return this.districtAbbr;
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
	public void setIndStates(IndStates indStates) {
		this.indStates = indStates;
	}

	/**
	 */
	public IndStates getIndStates() {
		return indStates;
	}

	/**
	 */
	public void setIndCitieses(Set<IndCities> indCitieses) {
		this.indCitieses = indCitieses;
	}

	/**
	 */
	public Set<IndCities> getIndCitieses() {
		if (indCitieses == null) {
			indCitieses = new java.util.LinkedHashSet<main.app.domain.IndCities>();
		}
		return indCitieses;
	}

	/**
	 */
	public void setRecipientLocations(Set<RecipientLocation> recipientLocations) {
		this.recipientLocations = recipientLocations;
	}

	/**
	 */
	public Set<RecipientLocation> getRecipientLocations() {
		if (recipientLocations == null) {
			recipientLocations = new java.util.LinkedHashSet<main.app.domain.RecipientLocation>();
		}
		return recipientLocations;
	}

	/**
	 */
	public void setVendorOrganizationses(Set<VendorOrganizations> vendorOrganizationses) {
		this.vendorOrganizationses = vendorOrganizationses;
	}

	/**
	 */
	public Set<VendorOrganizations> getVendorOrganizationses() {
		if (vendorOrganizationses == null) {
			vendorOrganizationses = new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>();
		}
		return vendorOrganizationses;
	}

	/**
	 */
	public void setVendorLocationses(Set<VendorLocations> vendorLocationses) {
		this.vendorLocationses = vendorLocationses;
	}

	/**
	 */
	public Set<VendorLocations> getVendorLocationses() {
		if (vendorLocationses == null) {
			vendorLocationses = new java.util.LinkedHashSet<main.app.domain.VendorLocations>();
		}
		return vendorLocationses;
	}

	/**
	 */
	public void setCustomerProfiles(Set<CustomerProfile> customerProfiles) {
		this.customerProfiles = customerProfiles;
	}

	/**
	 */
	public Set<CustomerProfile> getCustomerProfiles() {
		if (customerProfiles == null) {
			customerProfiles = new java.util.LinkedHashSet<main.app.domain.CustomerProfile>();
		}
		return customerProfiles;
	}

	/**
	 */
	public IndDistrict() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(IndDistrict that) {
		setDistrictId(that.getDistrictId());
		setDistrictName(that.getDistrictName());
		setDistrictAbbr(that.getDistrictAbbr());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setIndStates(that.getIndStates());
		setIndCitieses(new java.util.LinkedHashSet<main.app.domain.IndCities>(that.getIndCitieses()));
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setVendorOrganizationses(new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>(that.getVendorOrganizationses()));
		setVendorLocationses(new java.util.LinkedHashSet<main.app.domain.VendorLocations>(that.getVendorLocationses()));
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("districtId=[").append(districtId).append("] ");
		buffer.append("districtName=[").append(districtName).append("] ");
		buffer.append("districtAbbr=[").append(districtAbbr).append("] ");
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
		result = (int) (prime * result + ((districtId == null) ? 0 : districtId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof IndDistrict))
			return false;
		IndDistrict equalCheck = (IndDistrict) obj;
		if ((districtId == null && equalCheck.districtId != null) || (districtId != null && equalCheck.districtId == null))
			return false;
		if (districtId != null && !districtId.equals(equalCheck.districtId))
			return false;
		return true;
	}
}
