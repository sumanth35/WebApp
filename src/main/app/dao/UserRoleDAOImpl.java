package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.UserRole;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage UserRole entities.
 * 
 */
@Repository("UserRoleDAO")
@Transactional
public class UserRoleDAOImpl extends AbstractJpaDao<UserRole> implements
		UserRoleDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { UserRole.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UserRoleDAOImpl
	 *
	 */
	public UserRoleDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleId
	 *
	 */
	@Transactional
	public UserRole findUserRoleByUserRoleId(Integer userRoleId) throws DataAccessException {

		return findUserRoleByUserRoleId(userRoleId, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleId
	 *
	 */

	@Transactional
	public UserRole findUserRoleByUserRoleId(Integer userRoleId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserRoleByUserRoleId", startResult, maxRows, userRoleId);
			return (main.app.domain.UserRole) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserRoleByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByCreatedByContaining(String createdBy) throws DataAccessException {

		return findUserRoleByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleNameContaining
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleNameContaining(String userRoleName) throws DataAccessException {

		return findUserRoleByUserRoleNameContaining(userRoleName, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleNameContaining(String userRoleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByUserRoleNameContaining", startResult, maxRows, userRoleName);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByModifiedBy
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByModifiedBy(String modifiedBy) throws DataAccessException {

		return findUserRoleByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleDescriptionContaining
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleDescriptionContaining(String userRoleDescription) throws DataAccessException {

		return findUserRoleByUserRoleDescriptionContaining(userRoleDescription, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleDescriptionContaining(String userRoleDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByUserRoleDescriptionContaining", startResult, maxRows, userRoleDescription);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleDescription
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleDescription(String userRoleDescription) throws DataAccessException {

		return findUserRoleByUserRoleDescription(userRoleDescription, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleDescription(String userRoleDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByUserRoleDescription", startResult, maxRows, userRoleDescription);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByCreatedBy
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByCreatedBy(String createdBy) throws DataAccessException {

		return findUserRoleByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByPrimaryKey
	 *
	 */
	@Transactional
	public UserRole findUserRoleByPrimaryKey(Integer userRoleId) throws DataAccessException {

		return findUserRoleByPrimaryKey(userRoleId, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByPrimaryKey
	 *
	 */

	@Transactional
	public UserRole findUserRoleByPrimaryKey(Integer userRoleId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserRoleByPrimaryKey", startResult, maxRows, userRoleId);
			return (main.app.domain.UserRole) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserRoleByModifiedOn
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findUserRoleByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findUserRoleByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByCreatedOn
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findUserRoleByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleName
	 *
	 */
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleName(String userRoleName) throws DataAccessException {

		return findUserRoleByUserRoleName(userRoleName, -1, -1);
	}

	/**
	 * JPQL Query - findUserRoleByUserRoleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findUserRoleByUserRoleName(String userRoleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserRoleByUserRoleName", startResult, maxRows, userRoleName);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserRoles
	 *
	 */
	@Transactional
	public Set<UserRole> findAllUserRoles() throws DataAccessException {

		return findAllUserRoles(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserRoles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UserRole> findAllUserRoles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserRoles", startResult, maxRows);
		return new LinkedHashSet<UserRole>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(UserRole entity) {
		return true;
	}
}
