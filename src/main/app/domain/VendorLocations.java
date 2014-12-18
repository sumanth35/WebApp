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
		@NamedQuery(name = "findAllVendorLocationss", query = "select myVendorLocations from VendorLocations myVendorLocations"),
		@NamedQuery(name = "findVendorLocationsByAddressLine1", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.addressLine1 = ?1"),
		@NamedQuery(name = "findVendorLocationsByAddressLine1Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.addressLine1 like ?1"),
		@NamedQuery(name = "findVendorLocationsByAddressLine2", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.addressLine2 = ?1"),
		@NamedQuery(name = "findVendorLocationsByAddressLine2Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.addressLine2 like ?1"),
		@NamedQuery(name = "findVendorLocationsByAddressLine3", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.addressLine3 = ?1"),
		@NamedQuery(name = "findVendorLocationsByAddressLine3Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.addressLine3 like ?1"),
		@NamedQuery(name = "findVendorLocationsByCreatedBy", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.createdBy = ?1"),
		@NamedQuery(name = "findVendorLocationsByCreatedByContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.createdBy like ?1"),
		@NamedQuery(name = "findVendorLocationsByCreatedOn", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.createdOn = ?1"),
		@NamedQuery(name = "findVendorLocationsByEmail", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.email = ?1"),
		@NamedQuery(name = "findVendorLocationsByEmailContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.email like ?1"),
		@NamedQuery(name = "findVendorLocationsByFax", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.fax = ?1"),
		@NamedQuery(name = "findVendorLocationsByFaxContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.fax like ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminFirstName", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminFirstName = ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminFirstNameContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminFirstName like ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminLastName", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminLastName = ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminLastNameContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminLastName like ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminMiddleName", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminMiddleName = ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminMiddleNameContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminMiddleName like ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminSuffix", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminSuffix = ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationAdminSuffixContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationAdminSuffix like ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationId", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationId = ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationName", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationName = ?1"),
		@NamedQuery(name = "findVendorLocationsByLocationNameContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationName like ?1"),
		@NamedQuery(name = "findVendorLocationsByModifiedBy", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.modifiedBy = ?1"),
		@NamedQuery(name = "findVendorLocationsByModifiedByContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.modifiedBy like ?1"),
		@NamedQuery(name = "findVendorLocationsByModifiedOn", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.modifiedOn = ?1"),
		@NamedQuery(name = "findVendorLocationsByPhone1", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.phone1 = ?1"),
		@NamedQuery(name = "findVendorLocationsByPhone1Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.phone1 like ?1"),
		@NamedQuery(name = "findVendorLocationsByPhone2", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.phone2 = ?1"),
		@NamedQuery(name = "findVendorLocationsByPhone2Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.phone2 like ?1"),
		@NamedQuery(name = "findVendorLocationsByPrimaryKey", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.locationId = ?1"),
		@NamedQuery(name = "findVendorLocationsByStatus", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.status = ?1"),
		@NamedQuery(name = "findVendorLocationsByStatusContaining", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.status like ?1"),
		@NamedQuery(name = "findVendorLocationsByZipCode4", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.zipCode4 = ?1"),
		@NamedQuery(name = "findVendorLocationsByZipCode4Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.zipCode4 like ?1"),
		@NamedQuery(name = "findVendorLocationsByZipCode5", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.zipCode5 = ?1"),
		@NamedQuery(name = "findVendorLocationsByZipCode5Containing", query = "select myVendorLocations from VendorLocations myVendorLocations where myVendorLocations.zipCode5 like ?1") })
@Table(schema = "SINGHS2", name = "VENDOR_LOCATIONS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "VendorLocations")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class VendorLocations implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "LOCATION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_location_seq_gen")
	@SequenceGenerator(name="vendor_location_seq_gen", sequenceName="VENDOR_LOCATION_ID_SEQ", allocationSize=1)
	Integer locationId;
	/**
	 */

	@Column(name = "LOCATION_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String locationName;
	/**
	 */

	@Column(name = "LOCATION_ADMIN_FIRST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String locationAdminFirstName;
	/**
	 */

	@Column(name = "LOCATION_ADMIN_MIDDLE_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String locationAdminMiddleName;
	/**
	 */

	@Column(name = "LOCATION_ADMIN_LAST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String locationAdminLastName;
	/**
	 */

	@Column(name = "LOCATION_ADMIN_SUFFIX", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String locationAdminSuffix;
	/**
	 */

	@Column(name = "STATUS", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String status;
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

	@Column(name = "ZIP_CODE5", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode5;
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
	@OneToMany(mappedBy = "vendorLocations", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.Products> productses;
	/**
	 */
	@OneToMany(mappedBy = "vendorLocations", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CartItems> cartItemses;

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
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 */
	public String getLocationName() {
		return this.locationName;
	}

	/**
	 */
	public void setLocationAdminFirstName(String locationAdminFirstName) {
		this.locationAdminFirstName = locationAdminFirstName;
	}

	/**
	 */
	public String getLocationAdminFirstName() {
		return this.locationAdminFirstName;
	}

	/**
	 */
	public void setLocationAdminMiddleName(String locationAdminMiddleName) {
		this.locationAdminMiddleName = locationAdminMiddleName;
	}

	/**
	 */
	public String getLocationAdminMiddleName() {
		return this.locationAdminMiddleName;
	}

	/**
	 */
	public void setLocationAdminLastName(String locationAdminLastName) {
		this.locationAdminLastName = locationAdminLastName;
	}

	/**
	 */
	public String getLocationAdminLastName() {
		return this.locationAdminLastName;
	}

	/**
	 */
	public void setLocationAdminSuffix(String locationAdminSuffix) {
		this.locationAdminSuffix = locationAdminSuffix;
	}

	/**
	 */
	public String getLocationAdminSuffix() {
		return this.locationAdminSuffix;
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
	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

	/**
	 */
	public Set<Products> getProductses() {
		if (productses == null) {
			productses = new java.util.LinkedHashSet<main.app.domain.Products>();
		}
		return productses;
	}

	/**
	 */
	public void setCartItemses(Set<CartItems> cartItemses) {
		this.cartItemses = cartItemses;
	}

	/**
	 */
	public Set<CartItems> getCartItemses() {
		if (cartItemses == null) {
			cartItemses = new java.util.LinkedHashSet<main.app.domain.CartItems>();
		}
		return cartItemses;
	}

	/**
	 */
	public VendorLocations() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(VendorLocations that) {
		setLocationId(that.getLocationId());
		setLocationName(that.getLocationName());
		setLocationAdminFirstName(that.getLocationAdminFirstName());
		setLocationAdminMiddleName(that.getLocationAdminMiddleName());
		setLocationAdminLastName(that.getLocationAdminLastName());
		setLocationAdminSuffix(that.getLocationAdminSuffix());
		setStatus(that.getStatus());
		setPhone1(that.getPhone1());
		setPhone2(that.getPhone2());
		setFax(that.getFax());
		setEmail(that.getEmail());
		setAddressLine1(that.getAddressLine1());
		setAddressLine2(that.getAddressLine2());
		setAddressLine3(that.getAddressLine3());
		setZipCode5(that.getZipCode5());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedBy(that.getModifiedBy());
		setModifiedOn(that.getModifiedOn());
		setZipCode4(that.getZipCode4());
		setUsCounties(that.getUsCounties());
		setUsStates(that.getUsStates());
		setUsCities(that.getUsCities());
		setIndCities(that.getIndCities());
		setIndStates(that.getIndStates());
		setIndDistrict(that.getIndDistrict());
		setProductses(new java.util.LinkedHashSet<main.app.domain.Products>(that.getProductses()));
		setCartItemses(new java.util.LinkedHashSet<main.app.domain.CartItems>(that.getCartItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("locationId=[").append(locationId).append("] ");
		buffer.append("locationName=[").append(locationName).append("] ");
		buffer.append("locationAdminFirstName=[").append(locationAdminFirstName).append("] ");
		buffer.append("locationAdminMiddleName=[").append(locationAdminMiddleName).append("] ");
		buffer.append("locationAdminLastName=[").append(locationAdminLastName).append("] ");
		buffer.append("locationAdminSuffix=[").append(locationAdminSuffix).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("phone1=[").append(phone1).append("] ");
		buffer.append("phone2=[").append(phone2).append("] ");
		buffer.append("fax=[").append(fax).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("addressLine1=[").append(addressLine1).append("] ");
		buffer.append("addressLine2=[").append(addressLine2).append("] ");
		buffer.append("addressLine3=[").append(addressLine3).append("] ");
		buffer.append("zipCode5=[").append(zipCode5).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("zipCode4=[").append(zipCode4).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((locationId == null) ? 0 : locationId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof VendorLocations))
			return false;
		VendorLocations equalCheck = (VendorLocations) obj;
		if ((locationId == null && equalCheck.locationId != null) || (locationId != null && equalCheck.locationId == null))
			return false;
		if (locationId != null && !locationId.equals(equalCheck.locationId))
			return false;
		return true;
	}
}
