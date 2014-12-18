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
		@NamedQuery(name = "findAllUsCountiess", query = "select myUsCounties from UsCounties myUsCounties"),
		@NamedQuery(name = "findUsCountiesByCountyAbbr", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.countyAbbr = ?1"),
		@NamedQuery(name = "findUsCountiesByCountyAbbrContaining", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.countyAbbr like ?1"),
		@NamedQuery(name = "findUsCountiesByCountyId", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.countyId = ?1"),
		@NamedQuery(name = "findUsCountiesByCountyName", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.countyName = ?1"),
		@NamedQuery(name = "findUsCountiesByCountyNameContaining", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.countyName like ?1"),
		@NamedQuery(name = "findUsCountiesByCreatedBy", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.createdBy = ?1"),
		@NamedQuery(name = "findUsCountiesByCreatedByContaining", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.createdBy like ?1"),
		@NamedQuery(name = "findUsCountiesByCreatedOn", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.createdOn = ?1"),
		@NamedQuery(name = "findUsCountiesByModifiedBy", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.modifiedBy = ?1"),
		@NamedQuery(name = "findUsCountiesByModifiedByContaining", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.modifiedBy like ?1"),
		@NamedQuery(name = "findUsCountiesByModifiedOn", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.modifiedOn = ?1"),
		@NamedQuery(name = "findUsCountiesByPrimaryKey", query = "select myUsCounties from UsCounties myUsCounties where myUsCounties.countyId = ?1") })
@Table(schema = "SINGHS2", name = "US_COUNTIES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "UsCounties")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class UsCounties implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "COUNTY_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="us_county_seq_gen")
	@SequenceGenerator(name="us_county_seq_gen", sequenceName="US_COUNTY_ID_SEQ", allocationSize=1)
	Integer countyId;
	/**
	 */

	@Column(name = "COUNTY_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String countyName;
	/**
	 */

	@Column(name = "COUNTY_ABBR", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String countyAbbr;
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
	@JoinColumns({ @JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID") })
	@XmlTransient
	UsStates usStates;
	/**
	 */
	@OneToMany(mappedBy = "usCounties", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;
	/**
	 */
	@OneToMany(mappedBy = "usCounties", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.UsCities> usCitieses;
	/**
	 */
	@OneToMany(mappedBy = "usCounties", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;
	/**
	 */
	@OneToMany(mappedBy = "usCounties", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "usCounties", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocations> vendorLocationses;

	/**
	 */
	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}

	/**
	 */
	public Integer getCountyId() {
		return this.countyId;
	}

	/**
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	/**
	 */
	public String getCountyName() {
		return this.countyName;
	}

	/**
	 */
	public void setCountyAbbr(String countyAbbr) {
		this.countyAbbr = countyAbbr;
	}

	/**
	 */
	public String getCountyAbbr() {
		return this.countyAbbr;
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
	public void setUsStates(UsStates usStates) {
		this.usStates = usStates;
	}

	/**
	 */
	public UsStates getUsStates() {
		return usStates;
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
	public void setUsCitieses(Set<UsCities> usCitieses) {
		this.usCitieses = usCitieses;
	}

	/**
	 */
	public Set<UsCities> getUsCitieses() {
		if (usCitieses == null) {
			usCitieses = new java.util.LinkedHashSet<main.app.domain.UsCities>();
		}
		return usCitieses;
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
	public UsCounties() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(UsCounties that) {
		setCountyId(that.getCountyId());
		setCountyName(that.getCountyName());
		setCountyAbbr(that.getCountyAbbr());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setUsStates(that.getUsStates());
		setVendorOrganizationses(new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>(that.getVendorOrganizationses()));
		setUsCitieses(new java.util.LinkedHashSet<main.app.domain.UsCities>(that.getUsCitieses()));
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setVendorLocationses(new java.util.LinkedHashSet<main.app.domain.VendorLocations>(that.getVendorLocationses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("countyId=[").append(countyId).append("] ");
		buffer.append("countyName=[").append(countyName).append("] ");
		buffer.append("countyAbbr=[").append(countyAbbr).append("] ");
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
		result = (int) (prime * result + ((countyId == null) ? 0 : countyId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof UsCounties))
			return false;
		UsCounties equalCheck = (UsCounties) obj;
		if ((countyId == null && equalCheck.countyId != null) || (countyId != null && equalCheck.countyId == null))
			return false;
		if (countyId != null && !countyId.equals(equalCheck.countyId))
			return false;
		return true;
	}
}
