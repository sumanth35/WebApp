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
		@NamedQuery(name = "findAllVendorProfiles", query = "select myVendorProfile from VendorProfile myVendorProfile"),
		@NamedQuery(name = "findVendorProfileByCreatedBy", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.createdBy = ?1"),
		@NamedQuery(name = "findVendorProfileByCreatedByContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.createdBy like ?1"),
		@NamedQuery(name = "findVendorProfileByCreatedOn", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.createdOn = ?1"),
		@NamedQuery(name = "findVendorProfileByEducationDegree", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.educationDegree = ?1"),
		@NamedQuery(name = "findVendorProfileByEducationDegreeContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.educationDegree like ?1"),
		@NamedQuery(name = "findVendorProfileByFax1", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.fax1 = ?1"),
		@NamedQuery(name = "findVendorProfileByFax1Containing", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.fax1 like ?1"),
		@NamedQuery(name = "findVendorProfileByFax2", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.fax2 = ?1"),
		@NamedQuery(name = "findVendorProfileByFax2Containing", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.fax2 like ?1"),
		@NamedQuery(name = "findVendorProfileByFirstName", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.firstName = ?1"),
		@NamedQuery(name = "findVendorProfileByFirstNameContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.firstName like ?1"),
		@NamedQuery(name = "findVendorProfileByInactivityDuration", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.inactivityDuration = ?1"),
		@NamedQuery(name = "findVendorProfileByLastName", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.lastName = ?1"),
		@NamedQuery(name = "findVendorProfileByLastNameContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.lastName like ?1"),
		@NamedQuery(name = "findVendorProfileByLastSucessLogin", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.lastSucessLogin = ?1"),
		@NamedQuery(name = "findVendorProfileByMiddleName", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.middleName = ?1"),
		@NamedQuery(name = "findVendorProfileByMiddleNameContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.middleName like ?1"),
		@NamedQuery(name = "findVendorProfileByModifiedBy", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.modifiedBy = ?1"),
		@NamedQuery(name = "findVendorProfileByModifiedByContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.modifiedBy like ?1"),
		@NamedQuery(name = "findVendorProfileByModifiedOn", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.modifiedOn = ?1"),
		@NamedQuery(name = "findVendorProfileByNameSuffix", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.nameSuffix = ?1"),
		@NamedQuery(name = "findVendorProfileByNameSuffixContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.nameSuffix like ?1"),
		@NamedQuery(name = "findVendorProfileByNameTitle", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.nameTitle = ?1"),
		@NamedQuery(name = "findVendorProfileByNameTitleContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.nameTitle like ?1"),
		@NamedQuery(name = "findVendorProfileByPhone1", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.phone1 = ?1"),
		@NamedQuery(name = "findVendorProfileByPhone1Containing", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.phone1 like ?1"),
		@NamedQuery(name = "findVendorProfileByPhone2", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.phone2 = ?1"),
		@NamedQuery(name = "findVendorProfileByPhone2Containing", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.phone2 like ?1"),
		@NamedQuery(name = "findVendorProfileByPrimaryKey", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.registrationId = ?1"),
		@NamedQuery(name = "findVendorProfileByProfileStatus", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.profileStatus = ?1"),
		@NamedQuery(name = "findVendorProfileByProfileStatusContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.profileStatus like ?1"),
		@NamedQuery(name = "findVendorProfileByRegistrationEmail", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.registrationEmail = ?1"),
		@NamedQuery(name = "findVendorProfileByRegistrationEmailContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.registrationEmail like ?1"),
		@NamedQuery(name = "findVendorProfileByRegistrationId", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.registrationId = ?1"),
		@NamedQuery(name = "findVendorProfileByRegistrationName", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.registrationName = ?1"),
		@NamedQuery(name = "findVendorProfileByRegistrationNameContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.registrationName like ?1"),
		@NamedQuery(name = "findVendorProfileByVendorPassword", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.vendorPassword = ?1"),
		@NamedQuery(name = "findVendorProfileByVendorPasswordContaining", query = "select myVendorProfile from VendorProfile myVendorProfile where myVendorProfile.vendorPassword like ?1") })
@Table(schema = "SINGHS2", name = "VENDOR_PROFILE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "VendorProfile")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class VendorProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "REGISTRATION_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_profile_seq_gen")
	@SequenceGenerator(name="vendor_profile_seq_gen", sequenceName="VENDOR_PROFILE_ID_SEQ", allocationSize=1)
	Integer registrationId;
	/**
	 */

	@Column(name = "REGISTRATION_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String registrationName;
	/**
	 */

	@Column(name = "REGISTRATION_EMAIL", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String registrationEmail;
	/**
	 */

	@Column(name = "FIRST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "MIDDLE_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String middleName;
	/**
	 */

	@Column(name = "LAST_NAME", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
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

	@Column(name = "FAX_1", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fax1;
	/**
	 */

	@Column(name = "FAX_2", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fax2;
	/**
	 */

	@Column(name = "PROFILE_STATUS", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String profileStatus;
	/**
	 */

	@Column(name = "INACTIVITY_DURATION")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer inactivityDuration;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_SUCESS_LOGIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar lastSucessLogin;
	/**
	 */

	@Column(name = "EDUCATION_DEGREE", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String educationDegree;
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

	@Column(name = "VENDOR_PASSWORD", length = 150)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String vendorPassword;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "USER_ROLE_ID", referencedColumnName = "USER_ROLE_ID") })
	@XmlTransient
	UserRole userRole;
	/**
	 */
	@OneToMany(mappedBy = "vendorProfile", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorLocationAssociations> vendorLocationAssociationses;
	/**
	 */
	@OneToMany(mappedBy = "vendorProfile", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.Products> productses;

	/**
	 */
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	/**
	 */
	public Integer getRegistrationId() {
		return this.registrationId;
	}

	/**
	 */
	public void setRegistrationName(String registrationName) {
		this.registrationName = registrationName;
	}

	/**
	 */
	public String getRegistrationName() {
		return this.registrationName;
	}

	/**
	 */
	public void setRegistrationEmail(String registrationEmail) {
		this.registrationEmail = registrationEmail;
	}

	/**
	 */
	public String getRegistrationEmail() {
		return this.registrationEmail;
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
	public void setFax1(String fax1) {
		this.fax1 = fax1;
	}

	/**
	 */
	public String getFax1() {
		return this.fax1;
	}

	/**
	 */
	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}

	/**
	 */
	public String getFax2() {
		return this.fax2;
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
	public void setInactivityDuration(Integer inactivityDuration) {
		this.inactivityDuration = inactivityDuration;
	}

	/**
	 */
	public Integer getInactivityDuration() {
		return this.inactivityDuration;
	}

	/**
	 */
	public void setLastSucessLogin(Calendar lastSucessLogin) {
		this.lastSucessLogin = lastSucessLogin;
	}

	/**
	 */
	public Calendar getLastSucessLogin() {
		return this.lastSucessLogin;
	}

	/**
	 */
	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	/**
	 */
	public String getEducationDegree() {
		return this.educationDegree;
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
	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}

	/**
	 */
	public String getVendorPassword() {
		return this.vendorPassword;
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
	public void setVendorLocationAssociationses(Set<VendorLocationAssociations> vendorLocationAssociationses) {
		this.vendorLocationAssociationses = vendorLocationAssociationses;
	}

	/**
	 */
	public Set<VendorLocationAssociations> getVendorLocationAssociationses() {
		if (vendorLocationAssociationses == null) {
			vendorLocationAssociationses = new java.util.LinkedHashSet<main.app.domain.VendorLocationAssociations>();
		}
		return vendorLocationAssociationses;
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
	public VendorProfile() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(VendorProfile that) {
		setRegistrationId(that.getRegistrationId());
		setRegistrationName(that.getRegistrationName());
		setRegistrationEmail(that.getRegistrationEmail());
		setFirstName(that.getFirstName());
		setMiddleName(that.getMiddleName());
		setLastName(that.getLastName());
		setNameSuffix(that.getNameSuffix());
		setNameTitle(that.getNameTitle());
		setPhone1(that.getPhone1());
		setPhone2(that.getPhone2());
		setFax1(that.getFax1());
		setFax2(that.getFax2());
		setProfileStatus(that.getProfileStatus());
		setInactivityDuration(that.getInactivityDuration());
		setLastSucessLogin(that.getLastSucessLogin());
		setEducationDegree(that.getEducationDegree());
		setCreatedBy(that.getCreatedBy());
		setCreatedOn(that.getCreatedOn());
		setModifiedBy(that.getModifiedBy());
		setModifiedOn(that.getModifiedOn());
		setVendorPassword(that.getVendorPassword());
		setUserRole(that.getUserRole());
		setVendorLocationAssociationses(new java.util.LinkedHashSet<main.app.domain.VendorLocationAssociations>(that.getVendorLocationAssociationses()));
		setProductses(new java.util.LinkedHashSet<main.app.domain.Products>(that.getProductses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("registrationId=[").append(registrationId).append("] ");
		buffer.append("registrationName=[").append(registrationName).append("] ");
		buffer.append("registrationEmail=[").append(registrationEmail).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("middleName=[").append(middleName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("nameSuffix=[").append(nameSuffix).append("] ");
		buffer.append("nameTitle=[").append(nameTitle).append("] ");
		buffer.append("phone1=[").append(phone1).append("] ");
		buffer.append("phone2=[").append(phone2).append("] ");
		buffer.append("fax1=[").append(fax1).append("] ");
		buffer.append("fax2=[").append(fax2).append("] ");
		buffer.append("profileStatus=[").append(profileStatus).append("] ");
		buffer.append("inactivityDuration=[").append(inactivityDuration).append("] ");
		buffer.append("lastSucessLogin=[").append(lastSucessLogin).append("] ");
		buffer.append("educationDegree=[").append(educationDegree).append("] ");
		buffer.append("createdBy=[").append(createdBy).append("] ");
		buffer.append("createdOn=[").append(createdOn).append("] ");
		buffer.append("modifiedBy=[").append(modifiedBy).append("] ");
		buffer.append("modifiedOn=[").append(modifiedOn).append("] ");
		buffer.append("vendorPassword=[").append(vendorPassword).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((registrationId == null) ? 0 : registrationId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof VendorProfile))
			return false;
		VendorProfile equalCheck = (VendorProfile) obj;
		if ((registrationId == null && equalCheck.registrationId != null) || (registrationId != null && equalCheck.registrationId == null))
			return false;
		if (registrationId != null && !registrationId.equals(equalCheck.registrationId))
			return false;
		return true;
	}
}
