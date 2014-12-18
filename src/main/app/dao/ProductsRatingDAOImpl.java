package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ProductsRating;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductsRating entities.
 * 
 */
@Repository("ProductsRatingDAO")
@Transactional
public class ProductsRatingDAOImpl extends AbstractJpaDao<ProductsRating>
		implements ProductsRatingDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductsRating.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductsRatingDAOImpl
	 *
	 */
	public ProductsRatingDAOImpl() {
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
	 * JPQL Query - findProductsRatingByPrimaryKey
	 *
	 */
	@Transactional
	public ProductsRating findProductsRatingByPrimaryKey(Integer productRatingId) throws DataAccessException {

		return findProductsRatingByPrimaryKey(productRatingId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByPrimaryKey
	 *
	 */

	@Transactional
	public ProductsRating findProductsRatingByPrimaryKey(Integer productRatingId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsRatingByPrimaryKey", startResult, maxRows, productRatingId);
			return (main.app.domain.ProductsRating) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsRatingByModifiedBy
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductsRatingByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsRatingByCreatedOn
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductsRatingByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsRatingByCreatedBy
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByCreatedBy(String createdBy) throws DataAccessException {

		return findProductsRatingByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsRatingByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductsRatingByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsRatingByProductRating
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByProductRating(java.math.BigDecimal productRating) throws DataAccessException {

		return findProductsRatingByProductRating(productRating, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByProductRating
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByProductRating(java.math.BigDecimal productRating, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByProductRating", startResult, maxRows, productRating);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductsRatings
	 *
	 */
	@Transactional
	public Set<ProductsRating> findAllProductsRatings() throws DataAccessException {

		return findAllProductsRatings(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductsRatings
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findAllProductsRatings(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductsRatings", startResult, maxRows);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsRatingByProductRatingId
	 *
	 */
	@Transactional
	public ProductsRating findProductsRatingByProductRatingId(Integer productRatingId) throws DataAccessException {

		return findProductsRatingByProductRatingId(productRatingId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByProductRatingId
	 *
	 */

	@Transactional
	public ProductsRating findProductsRatingByProductRatingId(Integer productRatingId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsRatingByProductRatingId", startResult, maxRows, productRatingId);
			return (main.app.domain.ProductsRating) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsRatingByModifiedOn
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductsRatingByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsRatingByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsRating> findProductsRatingByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductsRatingByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsRatingByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsRating> findProductsRatingByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsRatingByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsRating>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductsRating entity) {
		return true;
	}
}
