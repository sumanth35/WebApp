package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ProductsCategory;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductsCategory entities.
 * 
 */
@Repository("ProductsCategoryDAO")
@Transactional
public class ProductsCategoryDAOImpl extends AbstractJpaDao<ProductsCategory>
		implements ProductsCategoryDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductsCategory.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductsCategoryDAOImpl
	 *
	 */
	public ProductsCategoryDAOImpl() {
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
	 * JPQL Query - findProductsCategoryByCreatedOn
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductsCategoryByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductsCategoryByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryCode
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryCode(String categoryCode) throws DataAccessException {

		return findProductsCategoryByCategoryCode(categoryCode, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryCode(String categoryCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCategoryCode", startResult, maxRows, categoryCode);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryName
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryName(String categoryName) throws DataAccessException {

		return findProductsCategoryByCategoryName(categoryName, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryName(String categoryName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCategoryName", startResult, maxRows, categoryName);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryId
	 *
	 */
	@Transactional
	public ProductsCategory findProductsCategoryByCategoryId(Integer categoryId) throws DataAccessException {

		return findProductsCategoryByCategoryId(categoryId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryId
	 *
	 */

	@Transactional
	public ProductsCategory findProductsCategoryByCategoryId(Integer categoryId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsCategoryByCategoryId", startResult, maxRows, categoryId);
			return (main.app.domain.ProductsCategory) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsCategoryByCreatedBy
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCreatedBy(String createdBy) throws DataAccessException {

		return findProductsCategoryByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryNameContaining
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryNameContaining(String categoryName) throws DataAccessException {

		return findProductsCategoryByCategoryNameContaining(categoryName, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryNameContaining(String categoryName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCategoryNameContaining", startResult, maxRows, categoryName);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByModifiedBy
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductsCategoryByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByPrimaryKey
	 *
	 */
	@Transactional
	public ProductsCategory findProductsCategoryByPrimaryKey(Integer categoryId) throws DataAccessException {

		return findProductsCategoryByPrimaryKey(categoryId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByPrimaryKey
	 *
	 */

	@Transactional
	public ProductsCategory findProductsCategoryByPrimaryKey(Integer categoryId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsCategoryByPrimaryKey", startResult, maxRows, categoryId);
			return (main.app.domain.ProductsCategory) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsCategoryByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductsCategoryByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductsCategorys
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findAllProductsCategorys() throws DataAccessException {

		return findAllProductsCategorys(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductsCategorys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findAllProductsCategorys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductsCategorys", startResult, maxRows);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByModifiedOn
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductsCategoryByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescriptionContaining
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryDescriptionContaining(String categoryDescription) throws DataAccessException {

		return findProductsCategoryByCategoryDescriptionContaining(categoryDescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryDescriptionContaining(String categoryDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCategoryDescriptionContaining", startResult, maxRows, categoryDescription);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescription
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryDescription(String categoryDescription) throws DataAccessException {

		return findProductsCategoryByCategoryDescription(categoryDescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryDescription(String categoryDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCategoryDescription", startResult, maxRows, categoryDescription);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryCodeContaining
	 *
	 */
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryCodeContaining(String categoryCode) throws DataAccessException {

		return findProductsCategoryByCategoryCodeContaining(categoryCode, -1, -1);
	}

	/**
	 * JPQL Query - findProductsCategoryByCategoryCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsCategory> findProductsCategoryByCategoryCodeContaining(String categoryCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsCategoryByCategoryCodeContaining", startResult, maxRows, categoryCode);
		return new LinkedHashSet<ProductsCategory>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductsCategory entity) {
		return true;
	}
}
