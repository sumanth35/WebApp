package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ProductsFeedback;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductsFeedback entities.
 * 
 */
@Repository("ProductsFeedbackDAO")
@Transactional
public class ProductsFeedbackDAOImpl extends AbstractJpaDao<ProductsFeedback>
		implements ProductsFeedbackDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductsFeedback.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductsFeedbackDAOImpl
	 *
	 */
	public ProductsFeedbackDAOImpl() {
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
	 * JPQL Query - findProductsFeedbackByPrimaryKey
	 *
	 */
	@Transactional
	public ProductsFeedback findProductsFeedbackByPrimaryKey(Integer feedbackId) throws DataAccessException {

		return findProductsFeedbackByPrimaryKey(feedbackId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByPrimaryKey
	 *
	 */

	@Transactional
	public ProductsFeedback findProductsFeedbackByPrimaryKey(Integer feedbackId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsFeedbackByPrimaryKey", startResult, maxRows, feedbackId);
			return (main.app.domain.ProductsFeedback) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsFeedbackByModifiedOn
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findProductsFeedbackByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByModifiedBy
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByModifiedBy(String modifiedBy) throws DataAccessException {

		return findProductsFeedbackByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductsFeedbacks
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findAllProductsFeedbacks() throws DataAccessException {

		return findAllProductsFeedbacks(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductsFeedbacks
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findAllProductsFeedbacks(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductsFeedbacks", startResult, maxRows);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackComments
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackComments(String feedbackComments) throws DataAccessException {

		return findProductsFeedbackByFeedbackComments(feedbackComments, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackComments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackComments(String feedbackComments, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByFeedbackComments", startResult, maxRows, feedbackComments);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackCommentsContaining
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackCommentsContaining(String feedbackComments) throws DataAccessException {

		return findProductsFeedbackByFeedbackCommentsContaining(feedbackComments, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackCommentsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackCommentsContaining(String feedbackComments, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByFeedbackCommentsContaining", startResult, maxRows, feedbackComments);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackId
	 *
	 */
	@Transactional
	public ProductsFeedback findProductsFeedbackByFeedbackId(Integer feedbackId) throws DataAccessException {

		return findProductsFeedbackByFeedbackId(feedbackId, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackId
	 *
	 */

	@Transactional
	public ProductsFeedback findProductsFeedbackByFeedbackId(Integer feedbackId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductsFeedbackByFeedbackId", startResult, maxRows, feedbackId);
			return (main.app.domain.ProductsFeedback) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductsFeedbackByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findProductsFeedbackByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByCreatedByContaining(String createdBy) throws DataAccessException {

		return findProductsFeedbackByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByCreatedBy
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByCreatedBy(String createdBy) throws DataAccessException {

		return findProductsFeedbackByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductsFeedbackByCreatedOn
	 *
	 */
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findProductsFeedbackByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findProductsFeedbackByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductsFeedback> findProductsFeedbackByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductsFeedbackByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ProductsFeedback>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductsFeedback entity) {
		return true;
	}
}
