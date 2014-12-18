package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ProductsFeedback;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductsFeedback entities.
 * 
 */
public interface ProductsFeedbackDAO extends JpaDao<ProductsFeedback> {

	/**
	 * JPQL Query - findProductsFeedbackByPrimaryKey
	 *
	 */
	public ProductsFeedback findProductsFeedbackByPrimaryKey(Integer feedbackId) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByPrimaryKey
	 *
	 */
	public ProductsFeedback findProductsFeedbackByPrimaryKey(Integer feedbackId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByModifiedOn
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByModifiedOn
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByModifiedBy
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByModifiedBy
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsFeedbacks
	 *
	 */
	public Set<ProductsFeedback> findAllProductsFeedbacks() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsFeedbacks
	 *
	 */
	public Set<ProductsFeedback> findAllProductsFeedbacks(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackComments
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackComments(String feedbackComments) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackComments
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackComments(String feedbackComments, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackCommentsContaining
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackCommentsContaining(String feedbackComments_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackCommentsContaining
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByFeedbackCommentsContaining(String feedbackComments_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackId
	 *
	 */
	public ProductsFeedback findProductsFeedbackByFeedbackId(Integer feedbackId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByFeedbackId
	 *
	 */
	public ProductsFeedback findProductsFeedbackByFeedbackId(Integer feedbackId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByModifiedByContaining
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByModifiedByContaining
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByCreatedByContaining
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByCreatedByContaining
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByCreatedBy
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByCreatedBy
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByCreatedOn
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsFeedbackByCreatedOn
	 *
	 */
	public Set<ProductsFeedback> findProductsFeedbackByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

}