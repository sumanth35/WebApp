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
		@NamedQuery(name = "findAllIndCitiess", query = "select myIndCities from IndCities myIndCities"),
		@NamedQuery(name = "findIndCitiesByCityAbbr", query = "select myIndCities from IndCities myIndCities where myIndCities.cityAbbr = ?1"),
		@NamedQuery(name = "findIndCitiesByCityAbbrContaining", query = "select myIndCities from IndCities myIndCities where myIndCities.cityAbbr like ?1"),
		@NamedQuery(name = "findIndCitiesByCityId", query = "select myIndCities from IndCities myIndCities where myIndCities.cityId = ?1"),
		@NamedQuery(name = "findIndCitiesByCityName", query = "select myIndCities from IndCities myIndCities where myIndCities.cityName = ?1"),
		@NamedQuery(name = "findIndCitiesByCityNameContaining", query = "select myIndCities from IndCities myIndCities where myIndCities.cityName like ?1"),
		@NamedQuery(name = "findIndCitiesByCreatedBy", query = "select myIndCities from IndCities myIndCities where myIndCities.createdBy = ?1"),
		@NamedQuery(name = "findIndCitiesByCreatedByContaining", query = "select myIndCities from IndCities myIndCities where myIndCities.createdBy like ?1"),
		@NamedQuery(name = "findIndCitiesByCreatedOn", query = "select myIndCities from IndCities myIndCities where myIndCities.createdOn = ?1"),
		@NamedQuery(name = "findIndCitiesByModifiedBy", query = "select myIndCities from IndCities myIndCities where myIndCities.modifiedBy = ?1"),
		@NamedQuery(name = "findIndCitiesByModifiedByContaining", query = "select myIndCities from IndCities myIndCities where myIndCities.modifiedBy like ?1"),
		@NamedQuery(name = "findIndCitiesByModifiedOn", query = "select myIndCities from IndCities myIndCities where myIndCities.modifiedOn = ?1"),
		@NamedQuery(name = "findIndCitiesByPrimaryKey", query = "select myIndCities from IndCities myIndCities where myIndCities.cityId = ?1") })
@Table(schema = "SINGHS2", name = "IND_CITIES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "IndCities")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class IndCities implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "CITY_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ind_city_seq_gen")
	@SequenceGenerator(name="ind_city_seq_gen", sequenceName="IND_CITY_ID_SEQ", allocationSize=1)
	Integer cityId;
	/**
	 */

	@Column(name = "CITY_NAME", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cityName;
	/**
	 */

	@Column(name = "CITY_ABBR", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cityAbbr;
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
	@JoinColumns({ @JoinColumn(name = "DISTRICT_ID", referencedColumnName = "DISTRICT_ID") })
	@XmlTransient
	IndDistrict indDistrict;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID") })
	@XmlTransient
	IndStates indStates;
	/**
	 */
	@OneToMany(mappedBy = "indCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocations> vendorLocationses;
	/**
	 */
	@OneToMany(mappedBy = "indCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "indCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;
	/**
	 */
	@OneToMany(mappedBy = "indCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;

	/**
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	/**
	 */
	public Integer getCityId() {
		return this.cityId;
	}

	/**
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 */
	public String getCityName() {
		return this.cityName;
	}

	/**
	 */
	public void setCityAbbr(String cityAbbr) {
		this.cityAbbr = cityAbbr;
	}

	/**
	 */
	public String getCityAbbr() {
		return this.cityAbbr;
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
	public void setIndDistrict(IndDistrict indDistrict) {
		this.indDistrict = indDistrict;
	}

	/**
	 */
	public IndDistrict getIndDistrict() {
		return indDistrict;
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
	public IndCities() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(IndCities that) {
		setCityId(that.getCityId());
		setCityName(that.getCityName());
		setCityAbbr(that.getCityAbbr());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setIndDistrict(that.getIndDistrict());
		setIndStates(that.getIndStates());
		setVendorLocationses(new java.util.LinkedHashSet<main.app.domain.VendorLocations>(that.getVendorLocationses()));
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setVendorOrganizationses(new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>(that.getVendorOrganizationses()));
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("cityId=[").append(cityId).append("] ");
		buffer.append("cityName=[").append(cityName).append("] ");
		buffer.append("cityAbbr=[").append(cityAbbr).append("] ");
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
		result = (int) (prime * result + ((cityId == null) ? 0 : cityId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof IndCities))
			return false;
		IndCities equalCheck = (IndCities) obj;
		if ((cityId == null && equalCheck.cityId != null) || (cityId != null && equalCheck.cityId == null))
			return false;
		if (cityId != null && !cityId.equals(equalCheck.cityId))
			return false;
		return true;
	}
}
