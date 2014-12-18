package main.app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
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
		@NamedQuery(name = "findAllVendorOrganizationss", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations"),
		@NamedQuery(name = "findVendorOrganizationsByAddressLine1", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.addressLine1 = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByAddressLine1Containing", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.addressLine1 like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByAddressLine2", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.addressLine2 = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByAddressLine2Containing", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.addressLine2 like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByAddressLine3", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.addressLine3 = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByAddressLine3Containing", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.addressLine3 like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonFirstName", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonFirstName = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonFirstNameContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonFirstName like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonLastName", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonLastName = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonLastNameContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonLastName like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonMiddleName", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonMiddleName = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonMiddleNameContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonMiddleName like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonSuffix", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonSuffix = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByContactPersonSuffixContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.contactPersonSuffix like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByCreatedBy", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.createdBy = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByCreatedByContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.createdBy like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByCreatedOn", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.createdOn = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByEmail", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.email = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByEmailContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.email like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByFax", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.fax = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByFaxContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.fax like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByModifiedBy", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.modifiedBy = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByModifiedByContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.modifiedBy like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByModifiedOn", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.modifiedOn = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByOrganizationBusinessName", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.organizationBusinessName = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByOrganizationBusinessNameContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.organizationBusinessName like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByOrganizationId", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.organizationId = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByOrganizationTypeId", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.organizationTypeId = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByPhone1", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.phone1 = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByPhone1Containing", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.phone1 like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByPhone2", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.phone2 = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByPhone2Containing", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.phone2 like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByPrimaryKey", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.organizationId = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByStatus", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.status = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByStatusContaining", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.status like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByZipCode4", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.zipCode4 = ?1"),
		@NamedQuery(name = "findVendorOrganizationsByZipCode4Containing", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.zipCode4 like ?1"),
		@NamedQuery(name = "findVendorOrganizationsByZipCode5", query = "select myVendorOrganizations from VendorOrganizations myVendorOrganizations where myVendorOrganizations.zipCode5 = ?1") })
@Table(schema = "SINGHS2", name = "VENDOR_ORGANIZATIONS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "VendorOrganizations")
public class VendorOrganizations implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "ORGANIZATION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_organization_seq_gen")
	@SequenceGenerator(name="vendor_organization_seq_gen", sequenceName="VENDOR_ORGANIZATION_ID_SEQ", allocationSize=1)
	Integer organizationId;
	/**
	 */

	@Column(name = "ORGANIZATION_BUSINESS_NAME", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String organizationBusinessName;
	/**
	 */

	@Column(name = "ORGANIZATION_TYPE_ID")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer organizationTypeId;
	/**
	 */

	@Column(name = "CONTACT_PERSON_FIRST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactPersonFirstName;
	/**
	 */

	@Column(name = "CONTACT_PERSON_MIDDLE_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactPersonMiddleName;
	/**
	 */

	@Column(name = "CONTACT_PERSON_LAST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactPersonLastName;
	/**
	 */

	@Column(name = "CONTACT_PERSON_SUFFIX", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactPersonSuffix;
	/**
	 */

	@Column(name = "PHONE_1", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String phone1;
	/**
	 */

	@Column(name = "PHONE_2", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String phone2;
	/**
	 */

	@Column(name = "FAX", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fax;
	/**
	 */

	@Column(name = "EMAIL", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
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

	@Column(name = "STATUS", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String status;
	/**
	 */

	@Column(name = "ZIP_CODE5", precision = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal zipCode5;
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

	@Column(name = "ZIP_CODE4", length = 4)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode4;

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
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	/**
	 */
	public Integer getOrganizationId() {
		return this.organizationId;
	}

	/**
	 */
	public void setOrganizationBusinessName(String organizationBusinessName) {
		this.organizationBusinessName = organizationBusinessName;
	}

	/**
	 */
	public String getOrganizationBusinessName() {
		return this.organizationBusinessName;
	}

	/**
	 */
	public void setOrganizationTypeId(Integer organizationTypeId) {
		this.organizationTypeId = organizationTypeId;
	}

	/**
	 */
	public Integer getOrganizationTypeId() {
		return this.organizationTypeId;
	}

	/**
	 */
	public void setContactPersonFirstName(String contactPersonFirstName) {
		this.contactPersonFirstName = contactPersonFirstName;
	}

	/**
	 */
	public String getContactPersonFirstName() {
		return this.contactPersonFirstName;
	}

	/**
	 */
	public void setContactPersonMiddleName(String contactPersonMiddleName) {
		this.contactPersonMiddleName = contactPersonMiddleName;
	}

	/**
	 */
	public String getContactPersonMiddleName() {
		return this.contactPersonMiddleName;
	}

	/**
	 */
	public void setContactPersonLastName(String contactPersonLastName) {
		this.contactPersonLastName = contactPersonLastName;
	}

	/**
	 */
	public String getContactPersonLastName() {
		return this.contactPersonLastName;
	}

	/**
	 */
	public void setContactPersonSuffix(String contactPersonSuffix) {
		this.contactPersonSuffix = contactPersonSuffix;
	}

	/**
	 */
	public String getContactPersonSuffix() {
		return this.contactPersonSuffix;
	}

	/**
	 */
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	/**
	 */
	public String getPhone1() {
		return this.phone1;
	}

	/**
	 */
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	/**
	 */
	public String getPhone2() {
		return this.phone2;
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
	public void setZipCode5(BigDecimal zipCode5) {
		this.zipCode5 = zipCode5;
	}

	/**
	 */
	public BigDecimal getZipCode5() {
		return this.zipCode5;
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
	public VendorOrganizations() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(VendorOrganizations that) {
		setOrganizationId(that.getOrganizationId());
		setOrganizationBusinessName(that.getOrganizationBusinessName());
		setOrganizationTypeId(that.getOrganizationTypeId());
		setContactPersonFirstName(that.getContactPersonFirstName());
		setContactPersonMiddleName(that.getContactPersonMiddleName());
		setContactPersonLastName(that.getContactPersonLastName());
		setContactPersonSuffix(that.getContactPersonSuffix());
		setPhone1(that.getPhone1());
		setPhone2(that.getPhone2());
		setFax(that.getFax());
		setEmail(that.getEmail());
		setAddressLine1(that.getAddressLine1());
		setAddressLine2(that.getAddressLine2());
		setAddressLine3(that.getAddressLine3());
		setStatus(that.getStatus());
		setZipCode5(that.getZipCode5());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setZipCode4(that.getZipCode4());
		setUsCounties(that.getUsCounties());
		setUsStates(that.getUsStates());
		setUsCities(that.getUsCities());
		setIndCities(that.getIndCities());
		setIndStates(that.getIndStates());
		setIndDistrict(that.getIndDistrict());
		setCountries(that.getCountries());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("organizationId=[").append(organizationId).append("] ");
		buffer.append("organizationBusinessName=[").append(organizationBusinessName).append("] ");
		buffer.append("organizationTypeId=[").append(organizationTypeId).append("] ");
		buffer.append("contactPersonFirstName=[").append(contactPersonFirstName).append("] ");
		buffer.append("contactPersonMiddleName=[").append(contactPersonMiddleName).append("] ");
		buffer.append("contactPersonLastName=[").append(contactPersonLastName).append("] ");
		buffer.append("contactPersonSuffix=[").append(contactPersonSuffix).append("] ");
		buffer.append("phone1=[").append(phone1).append("] ");
		buffer.append("phone2=[").append(phone2).append("] ");
		buffer.append("fax=[").append(fax).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("addressLine1=[").append(addressLine1).append("] ");
		buffer.append("addressLine2=[").append(addressLine2).append("] ");
		buffer.append("addressLine3=[").append(addressLine3).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("zipCode5=[").append(zipCode5).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("zipCode4=[").append(zipCode4).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((organizationId == null) ? 0 : organizationId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof VendorOrganizations))
			return false;
		VendorOrganizations equalCheck = (VendorOrganizations) obj;
		if ((organizationId == null && equalCheck.organizationId != null) || (organizationId != null && equalCheck.organizationId == null))
			return false;
		if (organizationId != null && !organizationId.equals(equalCheck.organizationId))
			return false;
		return true;
	}
}
