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
		@NamedQuery(name = "findAllRecipientLocations", query = "select myRecipientLocation from RecipientLocation myRecipientLocation"),
		@NamedQuery(name = "findRecipientLocationByAddressLine1", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.addressLine1 = ?1"),
		@NamedQuery(name = "findRecipientLocationByAddressLine1Containing", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.addressLine1 like ?1"),
		@NamedQuery(name = "findRecipientLocationByAddressLine2", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.addressLine2 = ?1"),
		@NamedQuery(name = "findRecipientLocationByAddressLine2Containing", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.addressLine2 like ?1"),
		@NamedQuery(name = "findRecipientLocationByAddressLine3", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.addressLine3 = ?1"),
		@NamedQuery(name = "findRecipientLocationByAddressLine3Containing", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.addressLine3 like ?1"),
		@NamedQuery(name = "findRecipientLocationByContactNumber", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.contactNumber = ?1"),
		@NamedQuery(name = "findRecipientLocationByContactNumberContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.contactNumber like ?1"),
		@NamedQuery(name = "findRecipientLocationByCreatedBy", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.createdBy = ?1"),
		@NamedQuery(name = "findRecipientLocationByCreatedByContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.createdBy like ?1"),
		@NamedQuery(name = "findRecipientLocationByCreatedOn", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.createdOn = ?1"),
		@NamedQuery(name = "findRecipientLocationByEmail", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.email = ?1"),
		@NamedQuery(name = "findRecipientLocationByEmailContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.email like ?1"),
		@NamedQuery(name = "findRecipientLocationByFax", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.fax = ?1"),
		@NamedQuery(name = "findRecipientLocationByFaxContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.fax like ?1"),
		@NamedQuery(name = "findRecipientLocationByModifiedBy", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.modifiedBy = ?1"),
		@NamedQuery(name = "findRecipientLocationByModifiedByContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.modifiedBy like ?1"),
		@NamedQuery(name = "findRecipientLocationByModifiedOn", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.modifiedOn = ?1"),
		@NamedQuery(name = "findRecipientLocationByPrimaryKey", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientLocationId = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientFirstName", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientFirstName = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientFirstNameContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientFirstName like ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientLastName", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientLastName = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientLastNameContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientLastName like ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientLocationId", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientLocationId = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientMiddleName", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientMiddleName = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientMiddleNameContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientMiddleName like ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientSuffix", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientSuffix = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientSuffixContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientSuffix like ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientTitle", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientTitle = ?1"),
		@NamedQuery(name = "findRecipientLocationByRecipientTitleContaining", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.recipientTitle like ?1"),
		@NamedQuery(name = "findRecipientLocationByZipCode4", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.zipCode4 = ?1"),
		@NamedQuery(name = "findRecipientLocationByZipCode4Containing", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.zipCode4 like ?1"),
		@NamedQuery(name = "findRecipientLocationByZipCode5", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.zipCode5 = ?1"),
		@NamedQuery(name = "findRecipientLocationByZipCode5Containing", query = "select myRecipientLocation from RecipientLocation myRecipientLocation where myRecipientLocation.zipCode5 like ?1") })
@Table(schema = "SINGHS2", name = "RECIPIENT_LOCATION")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "RecipientLocation")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class RecipientLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "RECIPIENT_LOCATION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="recipient_location_seq_gen")
	@SequenceGenerator(name="recipient_location_seq_gen", sequenceName="RECIPIENT_LOCATION_ID_SEQ", allocationSize=1)
	Integer recipientLocationId;
	/**
	 */

	@Column(name = "RECIPIENT_FIRST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String recipientFirstName;
	/**
	 */

	@Column(name = "RECIPIENT_MIDDLE_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String recipientMiddleName;
	/**
	 */

	@Column(name = "RECIPIENT_LAST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String recipientLastName;
	/**
	 */

	@Column(name = "RECIPIENT_SUFFIX", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String recipientSuffix;
	/**
	 */

	@Column(name = "RECIPIENT_TITLE", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String recipientTitle;
	/**
	 */

	@Column(name = "ADDRESS_LINE_1", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String addressLine1;
	/**
	 */

	@Column(name = "ADDRESS_LINE_2", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String addressLine2;
	/**
	 */

	@Column(name = "ADDRESS_LINE_3", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String addressLine3;
	/**
	 */

	@Column(name = "EMAIL", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "CONTACT_NUMBER", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactNumber;
	/**
	 */

	@Column(name = "FAX", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fax;
	/**
	 */

	@Column(name = "ZIP_CODE_5", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode5;
	/**
	 */

	@Column(name = "ZIP_CODE_4", length = 4)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode4;
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
	@JoinColumns({ @JoinColumn(name = "US_COUNTY_ID", referencedColumnName = "COUNTY_ID") })
	@XmlTransient
	UsCounties usCounties;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "US_STATE_ID", referencedColumnName = "STATE_ID") })
	@XmlTransient
	UsStates usStates;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "US_CITY_ID", referencedColumnName = "CITY_ID") })
	@XmlTransient
	UsCities usCities;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "IND_CITY_ID", referencedColumnName = "CITY_ID") })
	@XmlTransient
	IndCities indCities;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "IND_STATE_ID", referencedColumnName = "STATE_ID") })
	@XmlTransient
	IndStates indStates;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "IND_DISTRICT_ID", referencedColumnName = "DISTRICT_ID") })
	@XmlTransient
	IndDistrict indDistrict;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID") })
	@XmlTransient
	Countries countries;
	/**
	 */
	@OneToMany(mappedBy = "recipientLocation", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ShipmentDetails> shipmentDetailses;

	/**
	 */
	public void setRecipientLocationId(Integer recipientLocationId) {
		this.recipientLocationId = recipientLocationId;
	}

	/**
	 */
	public Integer getRecipientLocationId() {
		return this.recipientLocationId;
	}

	/**
	 */
	public void setRecipientFirstName(String recipientFirstName) {
		this.recipientFirstName = recipientFirstName;
	}

	/**
	 */
	public String getRecipientFirstName() {
		return this.recipientFirstName;
	}

	/**
	 */
	public void setRecipientMiddleName(String recipientMiddleName) {
		this.recipientMiddleName = recipientMiddleName;
	}

	/**
	 */
	public String getRecipientMiddleName() {
		return this.recipientMiddleName;
	}

	/**
	 */
	public void setRecipientLastName(String recipientLastName) {
		this.recipientLastName = recipientLastName;
	}

	/**
	 */
	public String getRecipientLastName() {
		return this.recipientLastName;
	}

	/**
	 */
	public void setRecipientSuffix(String recipientSuffix) {
		this.recipientSuffix = recipientSuffix;
	}

	/**
	 */
	public String getRecipientSuffix() {
		return this.recipientSuffix;
	}

	/**
	 */
	public void setRecipientTitle(String recipientTitle) {
		this.recipientTitle = recipientTitle;
	}

	/**
	 */
	public String getRecipientTitle() {
		return this.recipientTitle;
	}

	/**
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 */
	public String getAddressLine1() {
		return this.addressLine1;
	}

	/**
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 */
	public String getAddressLine2() {
		return this.addressLine2;
	}

	/**
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 */
	public String getAddressLine3() {
		return this.addressLine3;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 */
	public String getContactNumber() {
		return this.contactNumber;
	}

	/**
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 */
	public String getFax() {
		return this.fax;
	}

	/**
	 */
	public void setZipCode5(String zipCode5) {
		this.zipCode5 = zipCode5;
	}

	/**
	 */
	public String getZipCode5() {
		return this.zipCode5;
	}

	/**
	 */
	public void setZipCode4(String zipCode4) {
		this.zipCode4 = zipCode4;
	}

	/**
	 */
	public String getZipCode4() {
		return this.zipCode4;
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
	public void setUsCities(UsCities usCities) {
		this.usCities = usCities;
	}

	/**
	 */
	public UsCities getUsCities() {
		return usCities;
	}

	/**
	 */
	public void setIndCities(IndCities indCities) {
		this.indCities = indCities;
	}

	/**
	 */
	public IndCities getIndCities() {
		return indCities;
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
	public void setShipmentDetailses(Set<ShipmentDetails> shipmentDetailses) {
		this.shipmentDetailses = shipmentDetailses;
	}

	/**
	 */
	public Set<ShipmentDetails> getShipmentDetailses() {
		if (shipmentDetailses == null) {
			shipmentDetailses = new java.util.LinkedHashSet<main.app.domain.ShipmentDetails>();
		}
		return shipmentDetailses;
	}

	/**
	 */
	public RecipientLocation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RecipientLocation that) {
		setRecipientLocationId(that.getRecipientLocationId());
		setRecipientFirstName(that.getRecipientFirstName());
		setRecipientMiddleName(that.getRecipientMiddleName());
		setRecipientLastName(that.getRecipientLastName());
		setRecipientSuffix(that.getRecipientSuffix());
		setRecipientTitle(that.getRecipientTitle());
		setAddressLine1(that.getAddressLine1());
		setAddressLine2(that.getAddressLine2());
		setAddressLine3(that.getAddressLine3());
		setEmail(that.getEmail());
		setContactNumber(that.getContactNumber());
		setFax(that.getFax());
		setZipCode5(that.getZipCode5());
		setZipCode4(that.getZipCode4());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setUsCounties(that.getUsCounties());
		setUsStates(that.getUsStates());
		setUsCities(that.getUsCities());
		setIndCities(that.getIndCities());
		setIndStates(that.getIndStates());
		setIndDistrict(that.getIndDistrict());
		setCountries(that.getCountries());
		setShipmentDetailses(new java.util.LinkedHashSet<main.app.domain.ShipmentDetails>(that.getShipmentDetailses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("recipientLocationId=[").append(recipientLocationId).append("] ");
		buffer.append("recipientFirstName=[").append(recipientFirstName).append("] ");
		buffer.append("recipientMiddleName=[").append(recipientMiddleName).append("] ");
		buffer.append("recipientLastName=[").append(recipientLastName).append("] ");
		buffer.append("recipientSuffix=[").append(recipientSuffix).append("] ");
		buffer.append("recipientTitle=[").append(recipientTitle).append("] ");
		buffer.append("addressLine1=[").append(addressLine1).append("] ");
		buffer.append("addressLine2=[").append(addressLine2).append("] ");
		buffer.append("addressLine3=[").append(addressLine3).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("contactNumber=[").append(contactNumber).append("] ");
		buffer.append("fax=[").append(fax).append("] ");
		buffer.append("zipCode5=[").append(zipCode5).append("] ");
		buffer.append("zipCode4=[").append(zipCode4).append("] ");
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
		result = (int) (prime * result + ((recipientLocationId == null) ? 0 : recipientLocationId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof RecipientLocation))
			return false;
		RecipientLocation equalCheck = (RecipientLocation) obj;
		if ((recipientLocationId == null && equalCheck.recipientLocationId != null) || (recipientLocationId != null && equalCheck.recipientLocationId == null))
			return false;
		if (recipientLocationId != null && !recipientLocationId.equals(equalCheck.recipientLocationId))
			return false;
		return true;
	}
}
