package main.app.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllUserRoles", query = "select myUserRole from UserRole myUserRole"),
		@NamedQuery(name = "findUserRoleByCreatedBy", query = "select myUserRole from UserRole myUserRole where myUserRole.createdBy = ?1"),
		@NamedQuery(name = "findUserRoleByCreatedByContaining", query = "select myUserRole from UserRole myUserRole where myUserRole.createdBy like ?1"),
		@NamedQuery(name = "findUserRoleByCreatedOn", query = "select myUserRole from UserRole myUserRole where myUserRole.createdOn = ?1"),
		@NamedQuery(name = "findUserRoleByModifiedBy", query = "select myUserRole from UserRole myUserRole where myUserRole.modifiedBy = ?1"),
		@NamedQuery(name = "findUserRoleByModifiedByContaining", query = "select myUserRole from UserRole myUserRole where myUserRole.modifiedBy like ?1"),
		@NamedQuery(name = "findUserRoleByModifiedOn", query = "select myUserRole from UserRole myUserRole where myUserRole.modifiedOn = ?1"),
		@NamedQuery(name = "findUserRoleByPrimaryKey", query = "select myUserRole from UserRole myUserRole where myUserRole.userRoleId = ?1"),
		@NamedQuery(name = "findUserRoleByUserRoleDescription", query = "select myUserRole from UserRole myUserRole where myUserRole.userRoleDescription = ?1"),
		@NamedQuery(name = "findUserRoleByUserRoleDescriptionContaining", query = "select myUserRole from UserRole myUserRole where myUserRole.userRoleDescription like ?1"),
		@NamedQuery(name = "findUserRoleByUserRoleId", query = "select myUserRole from UserRole myUserRole where myUserRole.userRoleId = ?1"),
		@NamedQuery(name = "findUserRoleByUserRoleName", query = "select myUserRole from UserRole myUserRole where myUserRole.userRoleName = ?1"),
		@NamedQuery(name = "findUserRoleByUserRoleNameContaining", query = "select myUserRole from UserRole myUserRole where myUserRole.userRoleName like ?1") })
@Table(schema = "SINGHS2", name = "USER_ROLE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "WebApp/main/app/domain", name = "UserRole")
@XmlRootElement(namespace = "WebApp/main/app/domain")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "USER_ROLE_ID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_role_seq_gen")
	@SequenceGenerator(name="user_role_seq_gen", sequenceName="USER_ROLE_ID_SEQ", allocationSize=1)
	Integer userRoleId;
	/**
	 */

	@Column(name = "USER_ROLE_NAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userRoleName;
	/**
	 */

	@Column(name = "USER_ROLE_DESCRIPTION", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userRoleDescription;
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
	@OneToMany(mappedBy = "userRole", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.CustomerProfile> customerProfiles;
	/**
	 */
	@OneToMany(mappedBy = "userRole", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<main.app.domain.VendorProfile> vendorProfiles;

	/**
	 */
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	/**
	 */
	public Integer getUserRoleId() {
		return this.userRoleId;
	}

	/**
	 */
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	/**
	 */
	public String getUserRoleName() {
		return this.userRoleName;
	}

	/**
	 */
	public void setUserRoleDescription(String userRoleDescription) {
		this.userRoleDescription = userRoleDescription;
	}

	/**
	 */
	public String getUserRoleDescription() {
		return this.userRoleDescription;
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
	public void setVendorProfiles(Set<VendorProfile> vendorProfiles) {
		this.vendorProfiles = vendorProfiles;
	}

	/**
	 */
	public Set<VendorProfile> getVendorProfiles() {
		if (vendorProfiles == null) {
			vendorProfiles = new java.util.LinkedHashSet<main.app.domain.VendorProfile>();
		}
		return vendorProfiles;
	}

	/**
	 */
	public UserRole() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(UserRole that) {
		setUserRoleId(that.getUserRoleId());
		setUserRoleName(that.getUserRoleName());
		setUserRoleDescription(that.getUserRoleDescription());
		setCreatedOn(that.getCreatedOn());
		setCreatedBy(that.getCreatedBy());
		setModifiedOn(that.getModifiedOn());
		setModifiedBy(that.getModifiedBy());
		setCustomerProfiles(new java.util.LinkedHashSet<main.app.domain.CustomerProfile>(that.getCustomerProfiles()));
		setVendorProfiles(new java.util.LinkedHashSet<main.app.domain.VendorProfile>(that.getVendorProfiles()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("userRoleId=[").append(userRoleId).append("] ");
		buffer.append("userRoleName=[").append(userRoleName).append("] ");
		buffer.append("userRoleDescription=[").append(userRoleDescription).append("] ");
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
		result = (int) (prime * result + ((userRoleId == null) ? 0 : userRoleId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof UserRole))
			return false;
		UserRole equalCheck = (UserRole) obj;
		if ((userRoleId == null && equalCheck.userRoleId != null) || (userRoleId != null && equalCheck.userRoleId == null))
			return false;
		if (userRoleId != null && !userRoleId.equals(equalCheck.userRoleId))
			return false;
		return true;
	}
}
