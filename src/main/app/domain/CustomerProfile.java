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
		@NamedQuery(name = "findAllCustomerProfiles", query = "select myCustomerProfile from CustomerProfile myCustomerProfile"),
		@NamedQuery(name = "findCustomerProfileByAddressLine1", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.addressLine1 = ?1"),
		@NamedQuery(name = "findCustomerProfileByAddressLine1Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.addressLine1 like ?1"),
		@NamedQuery(name = "findCustomerProfileByAddressLine2", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.addressLine2 = ?1"),
		@NamedQuery(name = "findCustomerProfileByAddressLine2Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.addressLine2 like ?1"),
		@NamedQuery(name = "findCustomerProfileByAddressLine3", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.addressLine3 = ?1"),
		@NamedQuery(name = "findCustomerProfileByAddressLine3Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.addressLine3 like ?1"),
		@NamedQuery(name = "findCustomerProfileByCreatedBy", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.createdBy = ?1"),
		@NamedQuery(name = "findCustomerProfileByCreatedByContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.createdBy like ?1"),
		@NamedQuery(name = "findCustomerProfileByCreatedIp", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.createdIp = ?1"),
		@NamedQuery(name = "findCustomerProfileByCreatedIpContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.createdIp like ?1"),
		@NamedQuery(name = "findCustomerProfileByCreatedOn", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.createdOn = ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerEmail", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerEmail = ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerEmailContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerEmail like ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerId", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerId = ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerName", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerName = ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerNameContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerName like ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerPassword", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerPassword = ?1"),
		@NamedQuery(name = "findCustomerProfileByCustomerPasswordContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerPassword like ?1"),
		@NamedQuery(name = "findCustomerProfileByFirstName", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.firstName = ?1"),
		@NamedQuery(name = "findCustomerProfileByFirstNameContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.firstName like ?1"),
		@NamedQuery(name = "findCustomerProfileByLastLoginIp", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.lastLoginIp = ?1"),
		@NamedQuery(name = "findCustomerProfileByLastLoginIpContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.lastLoginIp like ?1"),
		@NamedQuery(name = "findCustomerProfileByLastName", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.lastName = ?1"),
		@NamedQuery(name = "findCustomerProfileByLastNameContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.lastName like ?1"),
		@NamedQuery(name = "findCustomerProfileByLastSuccessLogin", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.lastSuccessLogin = ?1"),
		@NamedQuery(name = "findCustomerProfileByMiddleName", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.middleName = ?1"),
		@NamedQuery(name = "findCustomerProfileByMiddleNameContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.middleName like ?1"),
		@NamedQuery(name = "findCustomerProfileByModifiedBy", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.modifiedBy = ?1"),
		@NamedQuery(name = "findCustomerProfileByModifiedByContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.modifiedBy like ?1"),
		@NamedQuery(name = "findCustomerProfileByModifiedOn", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.modifiedOn = ?1"),
		@NamedQuery(name = "findCustomerProfileByNameSuffix", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.nameSuffix = ?1"),
		@NamedQuery(name = "findCustomerProfileByNameSuffixContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.nameSuffix like ?1"),
		@NamedQuery(name = "findCustomerProfileByNameTitle", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.nameTitle = ?1"),
		@NamedQuery(name = "findCustomerProfileByNameTitleContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.nameTitle like ?1"),
		@NamedQuery(name = "findCustomerProfileByPhone1", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.phone1 = ?1"),
		@NamedQuery(name = "findCustomerProfileByPhone1Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.phone1 like ?1"),
		@NamedQuery(name = "findCustomerProfileByPhone2", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.phone2 = ?1"),
		@NamedQuery(name = "findCustomerProfileByPhone2Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.phone2 like ?1"),
		@NamedQuery(name = "findCustomerProfileByPrimaryKey", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.customerId = ?1"),
		@NamedQuery(name = "findCustomerProfileByProfileStatus", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.profileStatus = ?1"),
		@NamedQuery(name = "findCustomerProfileByProfileStatusContaining", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.profileStatus like ?1"),
		@NamedQuery(name = "findCustomerProfileByVisits", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.visits = ?1"),
		@NamedQuery(name = "findCustomerProfileByZipCode4", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.zipCode4 = ?1"),
		@NamedQuery(name = "findCustomerProfileByZipCode4Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.zipCode4 like ?1"),
		@NamedQuery(name = "findCustomerProfileByZipCode5", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.zipCode5 = ?1"),
		@NamedQuery(name = "findCustomerProfileByZipCode5Containing", query = "select myCustomerProfile from CustomerProfile myCustomerProfile where myCustomerProfile.zipCode5 like ?1") })
@Table(schema = "SINGHS2", name = "CUSTOMER_PROFILE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "CustomerProfile")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class CustomerProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "CUSTOMER_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_id_seq_gen")
	@SequenceGenerator(name="customer_id_seq_gen", sequenceName="CUSTOMER_PROFILE_ID_SEQ", allocationSize=1)
	Integer customerId;
	/**
	 */

	@Column(name = "CUSTOMER_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String customerName;
	/**
	 */

	@Column(name = "CUSTOMER_PASSWORD", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String customerPassword;
	/**
	 */

	@Column(name = "CUSTOMER_EMAIL", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String customerEmail;
	/**
	 */

	@Column(name = "PROFILE_STATUS", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String profileStatus;
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

	@Column(name = "FIRST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "LAST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "MIDDLE_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String middleName;
	/**
	 */

	@Column(name = "NAME_SUFFIX", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String nameSuffix;
	/**
	 */

	@Column(name = "NAME_TITLE", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String nameTitle;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_SUCCESS_LOGIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar lastSuccessLogin;
	/**
	 */

	@Column(name = "VISITS", precision = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal visits;
	/**
	 */

	@Column(name = "CREATED_IP", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String createdIp;
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

	@Column(name = "ZIP_CODE5", length = 6)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode5;
	/**
	 */

	@Column(name = "ZIP_CODE4", length = 4)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode4;
	/**
	 */

	@Column(name = "LAST_LOGIN_IP", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastLoginIp;
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
	@JoinColumns({ @JoinColumn(name = "USER_ROLE_ID", referencedColumnName = "USER_ROLE_ID") })
	@XmlTransient
	UserRole userRole;
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
	@OneToMany(mappedBy = "customerProfile", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.ProductsRating> productsRatings;
	/**
	 */
	@OneToMany(mappedBy = "customerProfile", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CartItems> cartItemses;

	/**
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 */
	public Integer getCustomerId() {
		return this.customerId;
	}

	/**
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	/**
	 */
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	/**
	 */
	public String getCustomerPassword() {
		return this.customerPassword;
	}

	/**
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	/**
	 */
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	/**
	 */
	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
	}

	/**
	 */
	public String getProfileStatus() {
		return this.profileStatus;
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 */
	public String getMiddleName() {
		return this.middleName;
	}

	/**
	 */
	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	/**
	 */
	public String getNameSuffix() {
		return this.nameSuffix;
	}

	/**
	 */
	public void setNameTitle(String nameTitle) {
		this.nameTitle = nameTitle;
	}

	/**
	 */
	public String getNameTitle() {
		return this.nameTitle;
	}

	/**
	 */
	public void setLastSuccessLogin(Calendar lastSuccessLogin) {
		this.lastSuccessLogin = lastSuccessLogin;
	}

	/**
	 */
	public Calendar getLastSuccessLogin() {
		return this.lastSuccessLogin;
	}

	/**
	 */
	public void setVisits(BigDecimal visits) {
		this.visits = visits;
	}

	/**
	 */
	public BigDecimal getVisits() {
		return this.visits;
	}

	/**
	 */
	public void setCreatedIp(String createdIp) {
		this.createdIp = createdIp;
	}

	/**
	 */
	public String getCreatedIp() {
		return this.createdIp;
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
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 */
	public String getLastLoginIp() {
		return this.lastLoginIp;
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
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	/**
	 */
	public UserRole getUserRole() {
		return userRole;
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
	public void setProductsRatings(Set<ProductsRating> productsRatings) {
		this.productsRatings = productsRatings;
	}

	/**
	 */
	public Set<ProductsRating> getProductsRatings() {
		if (productsRatings == null) {
			productsRatings = new java.util.LinkedHashSet<main.app.domain.ProductsRating>();
		}
		return productsRatings;
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
	public CustomerProfile() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CustomerProfile that) {
		setCustomerId(that.getCustomerId());
		setCustomerName(that.getCustomerName());
		setCustomerPassword(that.getCustomerPassword());
		setCustomerEmail(that.getCustomerEmail());
		setProfileStatus(that.getProfileStatus());
		setPhone1(that.getPhone1());
		setPhone2(that.getPhone2());
		setFirstName(that.getFirstName());
		setLastName(that.getLastName());
		setMiddleName(that.getMiddleName());
		setNameSuffix(that.getNameSuffix());
		setNameTitle(that.getNameTitle());
		setLastSuccessLogin(that.getLastSuccessLogin());
		setVisits(that.getVisits());
		setCreatedIp(that.getCreatedIp());
		setAddressLine1(that.getAddressLine1());
		setAddressLine2(that.getAddressLine2());
		setAddressLine3(that.getAddressLine3());
		setZipCode5(that.getZipCode5());
		setZipCode4(that.getZipCode4());
		setLastLoginIp(that.getLastLoginIp());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setUsCounties(that.getUsCounties());
		setUsStates(that.getUsStates());
		setUserRole(that.getUserRole());
		setUsCities(that.getUsCities());
		setIndCities(that.getIndCities());
		setIndStates(that.getIndStates());
		setIndDistrict(that.getIndDistrict());
		setCountries(that.getCountries());
		setProductsRatings(new java.util.LinkedHashSet<main.app.domain.ProductsRating>(that.getProductsRatings()));
		setCartItemses(new java.util.LinkedHashSet<main.app.domain.CartItems>(that.getCartItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("customerId=[").append(customerId).append("] ");
		buffer.append("customerName=[").append(customerName).append("] ");
		buffer.append("customerPassword=[").append(customerPassword).append("] ");
		buffer.append("customerEmail=[").append(customerEmail).append("] ");
		buffer.append("profileStatus=[").append(profileStatus).append("] ");
		buffer.append("phone1=[").append(phone1).append("] ");
		buffer.append("phone2=[").append(phone2).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("middleName=[").append(middleName).append("] ");
		buffer.append("nameSuffix=[").append(nameSuffix).append("] ");
		buffer.append("nameTitle=[").append(nameTitle).append("] ");
		buffer.append("lastSuccessLogin=[").append(lastSuccessLogin).append("] ");
		buffer.append("visits=[").append(visits).append("] ");
		buffer.append("createdIp=[").append(createdIp).append("] ");
		buffer.append("addressLine1=[").append(addressLine1).append("] ");
		buffer.append("addressLine2=[").append(addressLine2).append("] ");
		buffer.append("addressLine3=[").append(addressLine3).append("] ");
		buffer.append("zipCode5=[").append(zipCode5).append("] ");
		buffer.append("zipCode4=[").append(zipCode4).append("] ");
		buffer.append("lastLoginIp=[").append(lastLoginIp).append("] ");
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
		result = (int) (prime * result + ((customerId == null) ? 0 : customerId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CustomerProfile))
			return false;
		CustomerProfile equalCheck = (CustomerProfile) obj;
		if ((customerId == null && equalCheck.customerId != null) || (customerId != null && equalCheck.customerId == null))
			return false;
		if (customerId != null && !customerId.equals(equalCheck.customerId))
			return false;
		return true;
	}
}
