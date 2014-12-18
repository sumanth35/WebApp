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
		@NamedQuery(name = "findAllIndStatess", query = "select myIndStates from IndStates myIndStates"),
		@NamedQuery(name = "findIndStatesByCreatedBy", query = "select myIndStates from IndStates myIndStates where myIndStates.createdBy = ?1"),
		@NamedQuery(name = "findIndStatesByCreatedByContaining", query = "select myIndStates from IndStates myIndStates where myIndStates.createdBy like ?1"),
		@NamedQuery(name = "findIndStatesByCreatedOn", query = "select myIndStates from IndStates myIndStates where myIndStates.createdOn = ?1"),
		@NamedQuery(name = "findIndStatesByModifiedBy", query = "select myIndStates from IndStates myIndStates where myIndStates.modifiedBy = ?1"),
		@NamedQuery(name = "findIndStatesByModifiedByContaining", query = "select myIndStates from IndStates myIndStates where myIndStates.modifiedBy like ?1"),
		@NamedQuery(name = "findIndStatesByModifiedOn", query = "select myIndStates from IndStates myIndStates where myIndStates.modifiedOn = ?1"),
		@NamedQuery(name = "findIndStatesByPrimaryKey", query = "select myIndStates from IndStates myIndStates where myIndStates.stateId = ?1"),
		@NamedQuery(name = "findIndStatesByStateAbbr", query = "select myIndStates from IndStates myIndStates where myIndStates.stateAbbr = ?1"),
		@NamedQuery(name = "findIndStatesByStateAbbrContaining", query = "select myIndStates from IndStates myIndStates where myIndStates.stateAbbr like ?1"),
		@NamedQuery(name = "findIndStatesByStateId", query = "select myIndStates from IndStates myIndStates where myIndStates.stateId = ?1"),
		@NamedQuery(name = "findIndStatesByStateName", query = "select myIndStates from IndStates myIndStates where myIndStates.stateName = ?1"),
		@NamedQuery(name = "findIndStatesByStateNameContaining", query = "select myIndStates from IndStates myIndStates where myIndStates.stateName like ?1") })
@Table(schema = "SINGHS2", name = "IND_STATES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "IndStates")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class IndStates implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "STATE_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ind_state_seq_gen")
	@SequenceGenerator(name="ind_state_seq_gen", sequenceName="IND_STATE_ID_SEQ", allocationSize=1)
	Integer stateId;
	/**
	 */

	@Column(name = "STATE_NAME", length = 100)
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
	@OneToMany(mappedBy = "indStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "indStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.IndCities> indCitieses;
	/**
	 */
	@OneToMany(mappedBy = "indStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.IndDistrict> indDistricts;
	/**
	 */
	@OneToMany(mappedBy = "indStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;
	/**
	 */
	@OneToMany(mappedBy = "indStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocations> vendorLocationses;
	/**
	 */
	@OneToMany(mappedBy = "indStates", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;

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
	public void setIndDistricts(Set<IndDistrict> indDistricts) {
		this.indDistricts = indDistricts;
	}

	/**
	 */
	public Set<IndDistrict> getIndDistricts() {
		if (indDistricts == null) {
			indDistricts = new java.util.LinkedHashSet<main.app.domain.IndDistrict>();
		}
		return indDistricts;
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
	public IndStates() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(IndStates that) {
		setStateId(that.getStateId());
		setStateName(that.getStateName());
		setStateAbbr(that.getStateAbbr());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setCountries(that.getCountries());
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setIndCitieses(new java.util.LinkedHashSet<main.app.domain.IndCities>(that.getIndCitieses()));
		setIndDistricts(new java.util.LinkedHashSet<main.app.domain.IndDistrict>(that.getIndDistricts()));
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
		if (!(obj instanceof IndStates))
			return false;
		IndStates equalCheck = (IndStates) obj;
		if ((stateId == null && equalCheck.stateId != null) || (stateId != null && equalCheck.stateId == null))
			return false;
		if (stateId != null && !stateId.equals(equalCheck.stateId))
			return false;
		return true;
	}
}
