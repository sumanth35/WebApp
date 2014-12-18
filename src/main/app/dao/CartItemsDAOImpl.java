package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.CartItems;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage CartItems entities.
 * 
 */
@Repository("CartItemsDAO")
@Transactional
public class CartItemsDAOImpl extends AbstractJpaDao<CartItems> implements
		CartItemsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { CartItems.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CartItemsDAOImpl
	 *
	 */
	public CartItemsDAOImpl() {
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
	 * JPQL Query - findCartItemsByModifiedBy
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findCartItemsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByCreatedBy
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByCreatedBy(String createdBy) throws DataAccessException {

		return findCartItemsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findCartItemsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByProductQuantity
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByProductQuantity(java.math.BigDecimal productQuantity) throws DataAccessException {

		return findCartItemsByProductQuantity(productQuantity, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByProductQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByProductQuantity(java.math.BigDecimal productQuantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByProductQuantity", startResult, maxRows, productQuantity);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByProductTitleContaining
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByProductTitleContaining(String productTitle) throws DataAccessException {

		return findCartItemsByProductTitleContaining(productTitle, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByProductTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByProductTitleContaining(String productTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByProductTitleContaining", startResult, maxRows, productTitle);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByStatus
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByStatus(String status) throws DataAccessException {

		return findCartItemsByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByStatus", startResult, maxRows, status);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByCreatedOn
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findCartItemsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByCartItemId
	 *
	 */
	@Transactional
	public CartItems findCartItemsByCartItemId(Integer cartItemId) throws DataAccessException {

		return findCartItemsByCartItemId(cartItemId, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByCartItemId
	 *
	 */

	@Transactional
	public CartItems findCartItemsByCartItemId(Integer cartItemId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCartItemsByCartItemId", startResult, maxRows, cartItemId);
			return (main.app.domain.CartItems) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCartItemsByModifiedOn
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findCartItemsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCartItemss
	 *
	 */
	@Transactional
	public Set<CartItems> findAllCartItemss() throws DataAccessException {

		return findAllCartItemss(-1, -1);
	}

	/**
	 * JPQL Query - findAllCartItemss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findAllCartItemss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCartItemss", startResult, maxRows);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findCartItemsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByStatusContaining
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByStatusContaining(String status) throws DataAccessException {

		return findCartItemsByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByProductCost
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByProductCost(java.math.BigDecimal productCost) throws DataAccessException {

		return findCartItemsByProductCost(productCost, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByProductCost
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByProductCost(java.math.BigDecimal productCost, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByProductCost", startResult, maxRows, productCost);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByProductTitle
	 *
	 */
	@Transactional
	public Set<CartItems> findCartItemsByProductTitle(String productTitle) throws DataAccessException {

		return findCartItemsByProductTitle(productTitle, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByProductTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CartItems> findCartItemsByProductTitle(String productTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCartItemsByProductTitle", startResult, maxRows, productTitle);
		return new LinkedHashSet<CartItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findCartItemsByPrimaryKey
	 *
	 */
	@Transactional
	public CartItems findCartItemsByPrimaryKey(Integer cartItemId) throws DataAccessException {

		return findCartItemsByPrimaryKey(cartItemId, -1, -1);
	}

	/**
	 * JPQL Query - findCartItemsByPrimaryKey
	 *
	 */

	@Transactional
	public CartItems findCartItemsByPrimaryKey(Integer cartItemId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCartItemsByPrimaryKey", startResult, maxRows, cartItemId);
			return (main.app.domain.CartItems) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(CartItems entity) {
		return true;
	}
}
