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
		@NamedQuery(name = "findAllUsStatess", query = "select myUsStates from UsStates myUsStates"),
		@NamedQuery(name = "findUsStatesByCreatedBy", query = "select myUsStates from UsStates myUsStates where myUsStates.createdBy = ?1"),
		@NamedQuery(name = "findUsStatesByCreatedByContaining", query = "select myUsStates from UsStates myUsStates where myUsStates.createdBy like ?1"),
		@NamedQuery(name = "findUsStatesByCreatedOn", query = "select myUsStates from UsStates myUsStates where myUsStates.createdOn = ?1"),
		@NamedQuery(name = "findUsStatesByModifiedBy", query = "select myUsStates from UsStates myUsStates where myUsStates.modifiedBy = ?1"),
		@NamedQuery(name = "findUsStatesByModifiedByContaining", query = "select myUsStates from UsStates myUsStates where myUsStates.modifiedBy like ?1"),
		@NamedQuery(name = "findUsStatesByModifiedOn", query = "select myUsStates from UsStates myUsStates where myUsStates.modifiedOn = ?1"),
		@NamedQuery(name = "findUsStatesByPrimaryKey", query = "select myUsStates from UsStates myUsStates where myUsStates.stateId = ?1"),
		@NamedQuery(name = "findUsStatesByStateAbbr", query = "select myUsStates from UsStates myUsStates where myUsStates.stateAbbr = ?1"),
		@NamedQuery(name = "findUsStatesByStateAbbrContaining", query = "select myUsStates from UsStates myUsStates where myUsStates.stateAbbr like ?1"),
		@NamedQuery(name = "findUsStatesByStateId", query = "select myUsStates from UsStates myUsStates where myUsStates.stateId = ?1"),
		@NamedQuery(name = "findUsStatesByStateName", query = "select myUsStates from UsStates myUsStates where myUsStates.stateName = ?1"),
		@NamedQuery(name = "findUsStatesByStateNameContaining", query = "select myUsStates from UsStates myUsStates where myUsStates.stateName like ?1") })
@Table(schema = "SINGHS2", name = "US_STATES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "UsStates")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class UsStates implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "STATE_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="us_state_seq_gen")
	@SequenceGenerator(name="us_state_seq_gen", sequenceName="US_STATE_ID_SEQ", allocationSize=1)
	Integer stateId;
	/**
	 */

	@Column(name = "STATE_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String stateName;
	/**
	 */

	@Column(name = "STATE_ABBR", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String stateAbbr;
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
	@JoinColumns({ @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID") })
	@XmlTransient
	Countries countries;
	/**
	 */
	@OneToMany(mappedBy = "usStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.UsCounties> usCountieses;
	/**
	 */
	@OneToMany(mappedBy = "usStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;
	/**
	 */
	@OneToMany(mappedBy = "usStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.UsCities> usCitieses;
	/**
	 */
	@OneToMany(mappedBy = "usStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "usStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;
	/**
	 */
	@OneToMany(mappedBy = "usStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocations> vendorLocationses;

	/**
	 */
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	/**
	 */
	public Integer getStateId() {
		return this.stateId;
	}

	/**
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 */
	public String getStateName() {
		return this.stateName;
	}

	/**
	 */
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}

	/**
	 */
	public String getStateAbbr() {
		return this.stateAbbr;
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
	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	/**
	 */
	public Countries getCountries() {
		return countries;
	}

	/**
	 */
	public void setUsCountieses(Set<UsCounties> usCountieses) {
		this.usCountieses = usCountieses;
	}

	/**
	 */
	public Set<UsCounties> getUsCountieses() {
		if (usCountieses == null) {
			usCountieses = new java.util.LinkedHashSet<main.app.domain.UsCounties>();
		}
		return usCountieses;
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
	public UsStates() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(UsStates that) {
		setStateId(that.getStateId());
		setStateName(that.getStateName());
		setStateAbbr(that.getStateAbbr());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setCountries(that.getCountries());
		setUsCountieses(new java.util.LinkedHashSet<main.app.domain.UsCounties>(that.getUsCountieses()));
		setVendorOrganizationses(new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>(that.getVendorOrganizationses()));
		setUsCitieses(new java.util.LinkedHashSet<main.app.domain.UsCities>(that.getUsCitieses()));
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
		setVendorLocationses(new java.util.LinkedHashSet<main.app.domain.VendorLocations>(that.getVendorLocationses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("stateId=[").append(stateId).append("] ");
		buffer.append("stateName=[").append(stateName).append("] ");
		buffer.append("stateAbbr=[").append(stateAbbr).append("] ");
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
		result = (int) (prime * result + ((stateId == null) ? 0 : stateId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof UsStates))
			return false;
		UsStates equalCheck = (UsStates) obj;
		if ((stateId == null && equalCheck.stateId != null) || (stateId != null && equalCheck.stateId == null))
			return false;
		if (stateId != null && !stateId.equals(equalCheck.stateId))
			return false;
		return true;
	}
}
