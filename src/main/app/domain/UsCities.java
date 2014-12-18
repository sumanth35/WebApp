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
		@NamedQuery(name = "findAllUsCitiess", query = "select myUsCities from UsCities myUsCities"),
		@NamedQuery(name = "findUsCitiesByCityAbbr", query = "select myUsCities from UsCities myUsCities where myUsCities.cityAbbr = ?1"),
		@NamedQuery(name = "findUsCitiesByCityAbbrContaining", query = "select myUsCities from UsCities myUsCities where myUsCities.cityAbbr like ?1"),
		@NamedQuery(name = "findUsCitiesByCityId", query = "select myUsCities from UsCities myUsCities where myUsCities.cityId = ?1"),
		@NamedQuery(name = "findUsCitiesByCityName", query = "select myUsCities from UsCities myUsCities where myUsCities.cityName = ?1"),
		@NamedQuery(name = "findUsCitiesByCityNameContaining", query = "select myUsCities from UsCities myUsCities where myUsCities.cityName like ?1"),
		@NamedQuery(name = "findUsCitiesByCreatedBy", query = "select myUsCities from UsCities myUsCities where myUsCities.createdBy = ?1"),
		@NamedQuery(name = "findUsCitiesByCreatedByContaining", query = "select myUsCities from UsCities myUsCities where myUsCities.createdBy like ?1"),
		@NamedQuery(name = "findUsCitiesByCreatedOn", query = "select myUsCities from UsCities myUsCities where myUsCities.createdOn = ?1"),
		@NamedQuery(name = "findUsCitiesByModifiedBy", query = "select myUsCities from UsCities myUsCities where myUsCities.modifiedBy = ?1"),
		@NamedQuery(name = "findUsCitiesByModifiedByContaining", query = "select myUsCities from UsCities myUsCities where myUsCities.modifiedBy like ?1"),
		@NamedQuery(name = "findUsCitiesByModifiedOn", query = "select myUsCities from UsCities myUsCities where myUsCities.modifiedOn = ?1"),
		@NamedQuery(name = "findUsCitiesByPrimaryKey", query = "select myUsCities from UsCities myUsCities where myUsCities.cityId = ?1") })
@Table(schema = "SINGHS2", name = "US_CITIES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "UsCities")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class UsCities implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "CITY_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="us_city_seq_gen")
	@SequenceGenerator(name="us_city_seq_gen", sequenceName="US_CITY_ID_SEQ", allocationSize=1)
	Integer cityId;
	/**
	 */

	@Column(name = "CITY_NAME", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cityName;
	/**
	 */

	@Column(name = "CITY_ABBR", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cityAbbr;
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

	@Column(name = "MODIFIED_BY", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String modifiedBy;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_ON")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar modifiedOn;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID") })
	@XmlTransient
	UsStates usStates;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "COUNTY_ID", referencedColumnName = "COUNTY_ID") })
	@XmlTransient
	UsCounties usCounties;
	/**
	 */
	@OneToMany(mappedBy = "usCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "usCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocations> vendorLocationses;
	/**
	 */
	@OneToMany(mappedBy = "usCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;
	/**
	 */
	@OneToMany(mappedBy = "usCities", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;

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
	public void setUsCounties(UsCounties usCounties) {
		this.usCounties = usCounties;
	}

	/**
	 */
	public UsCounties getUsCounties() {
		return usCounties;
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
	public UsCities() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(UsCities that) {
		setCityId(that.getCityId());
		setCityName(that.getCityName());
		setCityAbbr(that.getCityAbbr());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedBy(that.getModifiedBy());
		setModifiedOn(that.getModifiedOn());
		setUsStates(that.getUsStates());
		setUsCounties(that.getUsCounties());
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setVendorLocationses(new java.util.LinkedHashSet<main.app.domain.VendorLocations>(that.getVendorLocationses()));
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
		setVendorOrganizationses(new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>(that.getVendorOrganizationses()));
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
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");

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
		if (!(obj instanceof UsCities))
			return false;
		UsCities equalCheck = (UsCities) obj;
		if ((cityId == null && equalCheck.cityId != null) || (cityId != null && equalCheck.cityId == null))
			return false;
		if (cityId != null && !cityId.equals(equalCheck.cityId))
			return false;
		return true;
	}
}
