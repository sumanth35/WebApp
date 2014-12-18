package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ProductsBrand;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductsBrand entities.
 * 
 */
@Repository("ProductsBrandDAO")
@Transactional
public class ProductsBrandDAOImpl extends AbstractJpaDao<ProductsBrand>
		implements ProductsBrandDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductsBrand.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductsBrandDAOImpl
	 *
	 */
	public ProductsBrandDAOImpl() {
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
	 * JPQL Query - findProductsBrandByBrandDescription
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandDescription(String brandDescription) throws DataAccessException {

		return findProductsBrandByBrandDescription(brandDescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandDescription(String brandDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByBrandDescription", startResult, maxRows, brandDescription);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByBrandCodeContaining
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandCodeContaining(String brandCode) throws DataAccessException {

		return findProductsBrandByBrandCodeContaining(brandCode, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandCodeContaining(String brandCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByBrandCodeContaining", startResult, maxRows, brandCode);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByModifiedBy
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductsBrandByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByBrandNameContaining
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandNameContaining(String brandName) throws DataAccessException {

		return findProductsBrandByBrandNameContaining(brandName, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandNameContaining(String brandName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByBrandNameContaining", startResult, maxRows, brandName);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByPrimaryKey
	 *
	 */
	@Transactional
	public ProductsBrand findProductsBrandByPrimaryKey(Integer brandId) throws DataAccessException {

		return findProductsBrandByPrimaryKey(brandId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByPrimaryKey
	 *
	 */

	@Transactional
	public ProductsBrand findProductsBrandByPrimaryKey(Integer brandId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsBrandByPrimaryKey", startResult, maxRows, brandId);
			return (main.app.domain.ProductsBrand) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsBrandByCreatedBy
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByCreatedBy(String createdBy) throws DataAccessException {

		return findProductsBrandByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByBrandDescriptionContaining
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandDescriptionContaining(String brandDescription) throws DataAccessException {

		return findProductsBrandByBrandDescriptionContaining(brandDescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandDescriptionContaining(String brandDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByBrandDescriptionContaining", startResult, maxRows, brandDescription);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByModifiedOn
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductsBrandByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductsBrandByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByBrandId
	 *
	 */
	@Transactional
	public ProductsBrand findProductsBrandByBrandId(Integer brandId) throws DataAccessException {

		return findProductsBrandByBrandId(brandId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandId
	 *
	 */

	@Transactional
	public ProductsBrand findProductsBrandByBrandId(Integer brandId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsBrandByBrandId", startResult, maxRows, brandId);
			return (main.app.domain.ProductsBrand) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllProductsBrands
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findAllProductsBrands() throws DataAccessException {

		return findAllProductsBrands(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductsBrands
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findAllProductsBrands(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductsBrands", startResult, maxRows);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByBrandName
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandName(String brandName) throws DataAccessException {

		return findProductsBrandByBrandName(brandName, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandName(String brandName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByBrandName", startResult, maxRows, brandName);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByBrandCode
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandCode(String brandCode) throws DataAccessException {

		return findProductsBrandByBrandCode(brandCode, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByBrandCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByBrandCode(String brandCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByBrandCode", startResult, maxRows, brandCode);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByCreatedOn
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductsBrandByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsBrandByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsBrand> findProductsBrandByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductsBrandByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsBrandByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsBrand> findProductsBrandByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsBrandByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsBrand>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductsBrand entity) {
		return true;
	}
}
