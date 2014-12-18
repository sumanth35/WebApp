package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ProductImages;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductImages entities.
 * 
 */
@Repository("ProductImagesDAO")
@Transactional
public class ProductImagesDAOImpl extends AbstractJpaDao<ProductImages>
		implements ProductImagesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductImages.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductImagesDAOImpl
	 *
	 */
	public ProductImagesDAOImpl() {
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
	 * JPQL Query - findAllProductImagess
	 *
	 */
	@Transactional
	public Set<ProductImages> findAllProductImagess() throws DataAccessException {

		return findAllProductImagess(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductImagess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findAllProductImagess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductImagess", startResult, maxRows);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductImagesByProductImageId
	 *
	 */
	@Transactional
	public ProductImages findProductImagesByProductImageId(Integer productImageId) throws DataAccessException {

		return findProductImagesByProductImageId(productImageId, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByProductImageId
	 *
	 */

	@Transactional
	public ProductImages findProductImagesByProductImageId(Integer productImageId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductImagesByProductImageId", startResult, maxRows, productImageId);
			return (main.app.domain.ProductImages) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductImagesByCreatedBy
	 *
	 */
	@Transactional
	public Set<ProductImages> findProductImagesByCreatedBy(String createdBy) throws DataAccessException {

		return findProductImagesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findProductImagesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductImagesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductImagesByModifiedOn
	 *
	 */
	@Transactional
	public Set<ProductImages> findProductImagesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductImagesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findProductImagesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductImagesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductImagesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ProductImages> findProductImagesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductImagesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findProductImagesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductImagesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductImagesByPrimaryKey
	 *
	 */
	@Transactional
	public ProductImages findProductImagesByPrimaryKey(Integer productImageId) throws DataAccessException {

		return findProductImagesByPrimaryKey(productImageId, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByPrimaryKey
	 *
	 */

	@Transactional
	public ProductImages findProductImagesByPrimaryKey(Integer productImageId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductImagesByPrimaryKey", startResult, maxRows, productImageId);
			return (main.app.domain.ProductImages) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductImagesByModifiedBy
	 *
	 */
	@Transactional
	public Set<ProductImages> findProductImagesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductImagesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findProductImagesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductImagesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductImagesByCreatedOn
	 *
	 */
	@Transactional
	public Set<ProductImages> findProductImagesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductImagesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findProductImagesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductImagesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductImagesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ProductImages> findProductImagesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductImagesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductImagesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductImages> findProductImagesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductImagesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductImages>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductImages entity) {
		return true;
	}
}
