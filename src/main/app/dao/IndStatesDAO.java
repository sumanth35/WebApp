package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.IndStates;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage IndStates entities.
 * 
 */
public interface IndStatesDAO extends JpaDao<IndStates> {

	/**
	 * JPQL Query - findIndStatesByStateId
	 *
	 */
	public IndStates findIndStatesByStateId(Integer stateId) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateId
	 *
	 */
	public IndStates findIndStatesByStateId(Integer stateId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByModifiedByContaining
	 *
	 */
	public Set<IndStates> findIndStatesByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByModifiedByContaining
	 *
	 */
	public Set<IndStates> findIndStatesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByPrimaryKey
	 *
	 */
	public IndStates findIndStatesByPrimaryKey(Integer stateId_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByPrimaryKey
	 *
	 */
	public IndStates findIndStatesByPrimaryKey(Integer stateId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByModifiedBy
	 *
	 */
	public Set<IndStates> findIndStatesByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByModifiedBy
	 *
	 */
	public Set<IndStates> findIndStatesByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByCreatedBy
	 *
	 */
	public Set<IndStates> findIndStatesByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByCreatedBy
	 *
	 */
	public Set<IndStates> findIndStatesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByCreatedOn
	 *
	 */
	public Set<IndStates> findIndStatesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByCreatedOn
	 *
	 */
	public Set<IndStates> findIndStatesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateNameContaining
	 *
	 */
	public Set<IndStates> findIndStatesByStateNameContaining(String stateName) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateNameContaining
	 *
	 */
	public Set<IndStates> findIndStatesByStateNameContaining(String stateName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllIndStatess
	 *
	 */
	public Set<IndStates> findAllIndStatess() throws DataAccessException;

	/**
	 * JPQL Query - findAllIndStatess
	 *
	 */
	public Set<IndStates> findAllIndStatess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByModifiedOn
	 *
	 */
	public Set<IndStates> findIndStatesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByModifiedOn
	 *
	 */
	public Set<IndStates> findIndStatesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateAbbr
	 *
	 */
	public Set<IndStates> findIndStatesByStateAbbr(String stateAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateAbbr
	 *
	 */
	public Set<IndStates> findIndStatesByStateAbbr(String stateAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateName
	 *
	 */
	public Set<IndStates> findIndStatesByStateName(String stateName_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateName
	 *
	 */
	public Set<IndStates> findIndStatesByStateName(String stateName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByCreatedByContaining
	 *
	 */
	public Set<IndStates> findIndStatesByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByCreatedByContaining
	 *
	 */
	public Set<IndStates> findIndStatesByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateAbbrContaining
	 *
	 */
	public Set<IndStates> findIndStatesByStateAbbrContaining(String stateAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndStatesByStateAbbrContaining
	 *
	 */
	public Set<IndStates> findIndStatesByStateAbbrContaining(String stateAbbr_1, int startResult, int maxRows) throws DataAccessException;

}