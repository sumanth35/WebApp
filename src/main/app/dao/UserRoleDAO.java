package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.UserRole;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage UserRole entities.
 * 
 */
public interface UserRoleDAO extends JpaDao<UserRole> {

	/**
	 * JPQL Query - findUserRoleByUserRoleId
	 *
	 */
	public UserRole findUserRoleByUserRoleId(Integer userRoleId) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleId
	 *
	 */
	public UserRole findUserRoleByUserRoleId(Integer userRoleId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByCreatedByContaining
	 *
	 */
	public Set<UserRole> findUserRoleByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByCreatedByContaining
	 *
	 */
	public Set<UserRole> findUserRoleByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleNameContaining
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleNameContaining(String userRoleName) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleNameContaining
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleNameContaining(String userRoleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByModifiedBy
	 *
	 */
	public Set<UserRole> findUserRoleByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByModifiedBy
	 *
	 */
	public Set<UserRole> findUserRoleByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleDescriptionContaining
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleDescriptionContaining(String userRoleDescription) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleDescriptionContaining
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleDescriptionContaining(String userRoleDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleDescription
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleDescription(String userRoleDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleDescription
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleDescription(String userRoleDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByCreatedBy
	 *
	 */
	public Set<UserRole> findUserRoleByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByCreatedBy
	 *
	 */
	public Set<UserRole> findUserRoleByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByPrimaryKey
	 *
	 */
	public UserRole findUserRoleByPrimaryKey(Integer userRoleId_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByPrimaryKey
	 *
	 */
	public UserRole findUserRoleByPrimaryKey(Integer userRoleId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByModifiedOn
	 *
	 */
	public Set<UserRole> findUserRoleByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByModifiedOn
	 *
	 */
	public Set<UserRole> findUserRoleByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByModifiedByContaining
	 *
	 */
	public Set<UserRole> findUserRoleByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByModifiedByContaining
	 *
	 */
	public Set<UserRole> findUserRoleByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByCreatedOn
	 *
	 */
	public Set<UserRole> findUserRoleByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByCreatedOn
	 *
	 */
	public Set<UserRole> findUserRoleByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleName
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleName(String userRoleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserRoleByUserRoleName
	 *
	 */
	public Set<UserRole> findUserRoleByUserRoleName(String userRoleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserRoles
	 *
	 */
	public Set<UserRole> findAllUserRoles() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserRoles
	 *
	 */
	public Set<UserRole> findAllUserRoles(int startResult, int maxRows) throws DataAccessException;

}