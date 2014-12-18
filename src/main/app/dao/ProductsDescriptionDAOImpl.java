package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ProductsDescription;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductsDescription entities.
 * 
 */
@Repository("ProductsDescriptionDAO")
@Transactional
public class ProductsDescriptionDAOImpl extends AbstractJpaDao<ProductsDescription>
		implements ProductsDescriptionDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductsDescription.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductsDescriptionDAOImpl
	 *
	 */
	public ProductsDescriptionDAOImpl() {
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
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4Containing
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4Containing(String productSecondaryDescription4) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription4Containing(productSecondaryDescription4, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4Containing(String productSecondaryDescription4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription4Containing", startResult, maxRows, productSecondaryDescription4);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumber
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumber(String productModelNumber) throws DataAccessException {

		return findProductsDescriptionByProductModelNumber(productModelNumber, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumber(String productModelNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductModelNumber", startResult, maxRows, productModelNumber);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductOrigin
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductOrigin(String productOrigin) throws DataAccessException {

		return findProductsDescriptionByProductOrigin(productOrigin, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductOrigin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductOrigin(String productOrigin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductOrigin", startResult, maxRows, productOrigin);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadth
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadth(String productDimensionBreadth) throws DataAccessException {

		return findProductsDescriptionByProductDimensionBreadth(productDimensionBreadth, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadth
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadth(String productDimensionBreadth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductDimensionBreadth", startResult, maxRows, productDimensionBreadth);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductColor
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductColor(String productColor) throws DataAccessException {

		return findProductsDescriptionByProductColor(productColor, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductColor
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductColor(String productColor, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductColor", startResult, maxRows, productColor);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLengthContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLengthContaining(String productDimensionLength) throws DataAccessException {

		return findProductsDescriptionByProductDimensionLengthContaining(productDimensionLength, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLengthContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLengthContaining(String productDimensionLength, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductDimensionLengthContaining", startResult, maxRows, productDimensionLength);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductsDescriptionByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductsDescriptions
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findAllProductsDescriptions() throws DataAccessException {

		return findAllProductsDescriptions(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductsDescriptions
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findAllProductsDescriptions(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductsDescriptions", startResult, maxRows);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByPrimaryKey
	 *
	 */
	@Transactional
	public ProductsDescription findProductsDescriptionByPrimaryKey(Integer productDescriptionId) throws DataAccessException {

		return findProductsDescriptionByPrimaryKey(productDescriptionId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByPrimaryKey
	 *
	 */

	@Transactional
	public ProductsDescription findProductsDescriptionByPrimaryKey(Integer productDescriptionId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsDescriptionByPrimaryKey", startResult, maxRows, productDescriptionId);
			return (main.app.domain.ProductsDescription) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2Containing
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2Containing(String productSecondaryDescription2) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription2Containing(productSecondaryDescription2, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2Containing(String productSecondaryDescription2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription2Containing", startResult, maxRows, productSecondaryDescription2);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2(String productSecondaryDescription2) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription2(productSecondaryDescription2, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2(String productSecondaryDescription2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription2", startResult, maxRows, productSecondaryDescription2);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByModifiedOn
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductsDescriptionByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3Containing
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3Containing(String productSecondaryDescription3) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription3Containing(productSecondaryDescription3, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3Containing(String productSecondaryDescription3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription3Containing", startResult, maxRows, productSecondaryDescription3);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeightContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeightContaining(String productDimensionHeight) throws DataAccessException {

		return findProductsDescriptionByProductDimensionHeightContaining(productDimensionHeight, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeightContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeightContaining(String productDimensionHeight, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductDimensionHeightContaining", startResult, maxRows, productDimensionHeight);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5Containing
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5Containing(String productSecondaryDescription5) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription5Containing(productSecondaryDescription5, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5Containing(String productSecondaryDescription5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription5Containing", startResult, maxRows, productSecondaryDescription5);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescription
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescription(String productPrimaryDescription) throws DataAccessException {

		return findProductsDescriptionByProductPrimaryDescription(productPrimaryDescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescription(String productPrimaryDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductPrimaryDescription", startResult, maxRows, productPrimaryDescription);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductWeight
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductWeight(java.math.BigDecimal productWeight) throws DataAccessException {

		return findProductsDescriptionByProductWeight(productWeight, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductWeight
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductWeight(java.math.BigDecimal productWeight, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductWeight", startResult, maxRows, productWeight);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductOriginContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductOriginContaining(String productOrigin) throws DataAccessException {

		return findProductsDescriptionByProductOriginContaining(productOrigin, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductOriginContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductOriginContaining(String productOrigin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductOriginContaining", startResult, maxRows, productOrigin);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3(String productSecondaryDescription3) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription3(productSecondaryDescription3, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3(String productSecondaryDescription3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription3", startResult, maxRows, productSecondaryDescription3);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumberContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumberContaining(String productModelNumber) throws DataAccessException {

		return findProductsDescriptionByProductModelNumberContaining(productModelNumber, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumberContaining(String productModelNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductModelNumberContaining", startResult, maxRows, productModelNumber);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductsDescriptionByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeight
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeight(String productDimensionHeight) throws DataAccessException {

		return findProductsDescriptionByProductDimensionHeight(productDimensionHeight, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeight
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeight(String productDimensionHeight, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductDimensionHeight", startResult, maxRows, productDimensionHeight);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByCreatedOn
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductsDescriptionByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1Containing
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1Containing(String productSecondaryDescription1) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription1Containing(productSecondaryDescription1, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1Containing(String productSecondaryDescription1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription1Containing", startResult, maxRows, productSecondaryDescription1);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4(String productSecondaryDescription4) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription4(productSecondaryDescription4, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4(String productSecondaryDescription4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription4", startResult, maxRows, productSecondaryDescription4);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescriptionContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescriptionContaining(String productPrimaryDescription) throws DataAccessException {

		return findProductsDescriptionByProductPrimaryDescriptionContaining(productPrimaryDescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescriptionContaining(String productPrimaryDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductPrimaryDescriptionContaining", startResult, maxRows, productPrimaryDescription);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductNumber
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductNumber(java.math.BigDecimal productNumber) throws DataAccessException {

		return findProductsDescriptionByProductNumber(productNumber, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductNumber(java.math.BigDecimal productNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductNumber", startResult, maxRows, productNumber);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductColorContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductColorContaining(String productColor) throws DataAccessException {

		return findProductsDescriptionByProductColorContaining(productColor, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductColorContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductColorContaining(String productColor, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductColorContaining", startResult, maxRows, productColor);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByModifiedBy
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductsDescriptionByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLength
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLength(String productDimensionLength) throws DataAccessException {

		return findProductsDescriptionByProductDimensionLength(productDimensionLength, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLength
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLength(String productDimensionLength, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductDimensionLength", startResult, maxRows, productDimensionLength);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadthContaining
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadthContaining(String productDimensionBreadth) throws DataAccessException {

		return findProductsDescriptionByProductDimensionBreadthContaining(productDimensionBreadth, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadthContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadthContaining(String productDimensionBreadth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductDimensionBreadthContaining", startResult, maxRows, productDimensionBreadth);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByCreatedBy
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByCreatedBy(String createdBy) throws DataAccessException {

		return findProductsDescriptionByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDescriptionId
	 *
	 */
	@Transactional
	public ProductsDescription findProductsDescriptionByProductDescriptionId(Integer productDescriptionId) throws DataAccessException {

		return findProductsDescriptionByProductDescriptionId(productDescriptionId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductDescriptionId
	 *
	 */

	@Transactional
	public ProductsDescription findProductsDescriptionByProductDescriptionId(Integer productDescriptionId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsDescriptionByProductDescriptionId", startResult, maxRows, productDescriptionId);
			return (main.app.domain.ProductsDescription) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5(String productSecondaryDescription5) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription5(productSecondaryDescription5, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5(String productSecondaryDescription5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription5", startResult, maxRows, productSecondaryDescription5);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1
	 *
	 */
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1(String productSecondaryDescription1) throws DataAccessException {

		return findProductsDescriptionByProductSecondaryDescription1(productSecondaryDescription1, -1, -1);
	}

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1(String productSecondaryDescription1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsDescriptionByProductSecondaryDescription1", startResult, maxRows, productSecondaryDescription1);
		return new LinkedHashSet<ProductsDescription>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductsDescription entity) {
		return true;
	}
}
