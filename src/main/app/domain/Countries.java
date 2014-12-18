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
		@NamedQuery(name = "findAllCountriess", query = "select myCountries from Countries myCountries"),
		@NamedQuery(name = "findCountriesByCountryAbbr", query = "select myCountries from Countries myCountries where myCountries.countryAbbr = ?1"),
		@NamedQuery(name = "findCountriesByCountryAbbrContaining", query = "select myCountries from Countries myCountries where myCountries.countryAbbr like ?1"),
		@NamedQuery(name = "findCountriesByCountryCode", query = "select myCountries from Countries myCountries where myCountries.countryCode = ?1"),
		@NamedQuery(name = "findCountriesByCountryId", query = "select myCountries from Countries myCountries where myCountries.countryId = ?1"),
		@NamedQuery(name = "findCountriesByCountryName", query = "select myCountries from Countries myCountries where myCountries.countryName = ?1"),
		@NamedQuery(name = "findCountriesByCountryNameContaining", query = "select myCountries from Countries myCountries where myCountries.countryName like ?1"),
		@NamedQuery(name = "findCountriesByCreatedBy", query = "select myCountries from Countries myCountries where myCountries.createdBy = ?1"),
		@NamedQuery(name = "findCountriesByCreatedByContaining", query = "select myCountries from Countries myCountries where myCountries.createdBy like ?1"),
		@NamedQuery(name = "findCountriesByCreatedOn", query = "select myCountries from Countries myCountries where myCountries.createdOn = ?1"),
		@NamedQuery(name = "findCountriesByModifiedBy", query = "select myCountries from Countries myCountries where myCountries.modifiedBy = ?1"),
		@NamedQuery(name = "findCountriesByModifiedByContaining", query = "select myCountries from Countries myCountries where myCountries.modifiedBy like ?1"),
		@NamedQuery(name = "findCountriesByModifiedOn", query = "select myCountries from Countries myCountries where myCountries.modifiedOn = ?1"),
		@NamedQuery(name = "findCountriesByPrimaryKey", query = "select myCountries from Countries myCountries where myCountries.countryId = ?1") })
@Table(schema = "SINGHS2", name = "COUNTRIES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "Countries")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class Countries implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "COUNTRY_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="country_id_seq_gen")
	@SequenceGenerator(name="country_id_seq_gen", sequenceName="COUNTRY_ID_SEQ", allocationSize=1)
	Integer countryId;
	/**
	 */

	@Column(name = "COUNTRY_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String countryName;
	/**
	 */

	@Column(name = "COUNTRY_CODE", precision = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal countryCode;
	/**
	 */

	@Column(name = "COUNTRY_ABBR", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String countryAbbr;
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
	@OneToMany(mappedBy = "countries", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.RecipientLocation> recipientLocations;
	/**
	 */
	@OneToMany(mappedBy = "countries", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.UsStates> usStateses;
	/**
	 */
	@OneToMany(mappedBy = "countries", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorOrganizations> vendorOrganizationses;
	/**
	 */
	@OneToMany(mappedBy = "countries", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.IndStates> indStateses;
	/**
	 */
	@OneToMany(mappedBy = "countries", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;

	/**
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	/**
	 */
	public Integer getCountryId() {
		return this.countryId;
	}

	/**
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 */
	public String getCountryName() {
		return this.countryName;
	}

	/**
	 */
	public void setCountryCode(BigDecimal countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 */
	public BigDecimal getCountryCode() {
		return this.countryCode;
	}

	/**
	 */
	public void setCountryAbbr(String countryAbbr) {
		this.countryAbbr = countryAbbr;
	}

	/**
	 */
	public String getCountryAbbr() {
		return this.countryAbbr;
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
	public void setUsStateses(Set<UsStates> usStateses) {
		this.usStateses = usStateses;
	}

	/**
	 */
	public Set<UsStates> getUsStateses() {
		if (usStateses == null) {
			usStateses = new java.util.LinkedHashSet<main.app.domain.UsStates>();
		}
		return usStateses;
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
	public void setIndStateses(Set<IndStates> indStateses) {
		this.indStateses = indStateses;
	}

	/**
	 */
	public Set<IndStates> getIndStateses() {
		if (indStateses == null) {
			indStateses = new java.util.LinkedHashSet<main.app.domain.IndStates>();
		}
		return indStateses;
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
	public Countries() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Countries that) {
		setCountryId(that.getCountryId());
		setCountryName(that.getCountryName());
		setCountryCode(that.getCountryCode());
		setCountryAbbr(that.getCountryAbbr());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setRecipientLocations(new java.util.LinkedHashSet<main.app.domain.RecipientLocation>(that.getRecipientLocations()));
		setUsStateses(new java.util.LinkedHashSet<main.app.domain.UsStates>(that.getUsStateses()));
		setVendorOrganizationses(new java.util.LinkedHashSet<main.app.domain.VendorOrganizations>(that.getVendorOrganizationses()));
		setIndStateses(new java.util.LinkedHashSet<main.app.domain.IndStates>(that.getIndStateses()));
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("countryId=[").append(countryId).append("] ");
		buffer.append("countryName=[").append(countryName).append("] ");
		buffer.append("countryCode=[").append(countryCode).append("] ");
		buffer.append("countryAbbr=[").append(countryAbbr).append("] ");
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
		result = (int) (prime * result + ((countryId == null) ? 0 : countryId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Countries))
			return false;
		Countries equalCheck = (Countries) obj;
		if ((countryId == null && equalCheck.countryId != null) || (countryId != null && equalCheck.countryId == null))
			return false;
		if (countryId != null && !countryId.equals(equalCheck.countryId))
			return false;
		return true;
	}
}
