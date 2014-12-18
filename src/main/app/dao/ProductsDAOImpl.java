package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.Products;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Products entities.
 * 
 */
@Repository("ProductsDAO")
@Transactional
public class ProductsDAOImpl extends AbstractJpaDao<Products> implements
		ProductsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Products.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductsDAOImpl
	 *
	 */
	public ProductsDAOImpl() {
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
	 * JPQL Query - findProductsByModifiedOn
	 *
	 */
	@Transactional
	public Set<Products> findProductsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<Products> findProductsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<Products> findProductsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByProductTitleContaining
	 *
	 */
	@Transactional
	public Set<Products> findProductsByProductTitleContaining(String productTitle) throws DataAccessException {

		return findProductsByProductTitleContaining(productTitle, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByProductTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByProductTitleContaining(String productTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByProductTitleContaining", startResult, maxRows, productTitle);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByProductId
	 *
	 */
	@Transactional
	public Products findProductsByProductId(Integer productId) throws DataAccessException {

		return findProductsByProductId(productId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByProductId
	 *
	 */

	@Transactional
	public Products findProductsByProductId(Integer productId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsByProductId", startResult, maxRows, productId);
			return (main.app.domain.Products) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsByProductTitle
	 *
	 */
	@Transactional
	public Set<Products> findProductsByProductTitle(String productTitle) throws DataAccessException {

		return findProductsByProductTitle(productTitle, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByProductTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByProductTitle(String productTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByProductTitle", startResult, maxRows, productTitle);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByModifiedBy
	 *
	 */
	@Transactional
	public Set<Products> findProductsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByCreatedBy
	 *
	 */
	@Transactional
	public Set<Products> findProductsByCreatedBy(String createdBy) throws DataAccessException {

		return findProductsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByCreatedOn
	 *
	 */
	@Transactional
	public Set<Products> findProductsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByPercentageDiscount
	 *
	 */
	@Transactional
	public Set<Products> findProductsByPercentageDiscount(java.math.BigDecimal percentageDiscount) throws DataAccessException {

		return findProductsByPercentageDiscount(percentageDiscount, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByPercentageDiscount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByPercentageDiscount(java.math.BigDecimal percentageDiscount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByPercentageDiscount", startResult, maxRows, percentageDiscount);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByStatus
	 *
	 */
	@Transactional
	public Set<Products> findProductsByStatus(String status) throws DataAccessException {

		return findProductsByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByStatus", startResult, maxRows, status);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByDiscountPrice
	 *
	 */
	@Transactional
	public Set<Products> findProductsByDiscountPrice(java.math.BigDecimal discountPrice) throws DataAccessException {

		return findProductsByDiscountPrice(discountPrice, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByDiscountPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByDiscountPrice(java.math.BigDecimal discountPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByDiscountPrice", startResult, maxRows, discountPrice);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBySalesPrice
	 *
	 */
	@Transactional
	public Set<Products> findProductsBySalesPrice(java.math.BigDecimal salesPrice) throws DataAccessException {

		return findProductsBySalesPrice(salesPrice, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBySalesPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsBySalesPrice(java.math.BigDecimal salesPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBySalesPrice", startResult, maxRows, salesPrice);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByPrimaryKey
	 *
	 */
	@Transactional
	public Products findProductsByPrimaryKey(Integer productId) throws DataAccessException {

		return findProductsByPrimaryKey(productId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByPrimaryKey
	 *
	 */

	@Transactional
	public Products findProductsByPrimaryKey(Integer productId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsByPrimaryKey", startResult, maxRows, productId);
			return (main.app.domain.Products) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllProductss
	 *
	 */
	@Transactional
	public Set<Products> findAllProductss() throws DataAccessException {

		return findAllProductss(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findAllProductss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductss", startResult, maxRows);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByQuantity
	 *
	 */
	@Transactional
	public Set<Products> findProductsByQuantity(java.math.BigDecimal quantity) throws DataAccessException {

		return findProductsByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByQuantity(java.math.BigDecimal quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByStatusContaining
	 *
	 */
	@Transactional
	public Set<Products> findProductsByStatusContaining(String status) throws DataAccessException {

		return findProductsByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsByCostPrice
	 *
	 */
	@Transactional
	public Set<Products> findProductsByCostPrice(java.math.BigDecimal costPrice) throws DataAccessException {

		return findProductsByCostPrice(costPrice, -1, -1);
	}

	/**
	 * JPQL Query - findProductsByCostPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Products> findProductsByCostPrice(java.math.BigDecimal costPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsByCostPrice", startResult, maxRows, costPrice);
		return new LinkedHashSet<Products>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Products entity) {
		return true;
	}
}
