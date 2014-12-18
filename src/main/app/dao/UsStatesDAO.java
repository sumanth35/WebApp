package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.UsStates;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage UsStates entities.
 * 
 */
public interface UsStatesDAO extends JpaDao<UsStates> {

	/**
	 * JPQL Query - findUsStatesByStateNameContaining
	 *
	 */
	public Set<UsStates> findUsStatesByStateNameContaining(String stateName) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateNameContaining
	 *
	 */
	public Set<UsStates> findUsStatesByStateNameContaining(String stateName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByPrimaryKey
	 *
	 */
	public UsStates findUsStatesByPrimaryKey(Integer stateId) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByPrimaryKey
	 *
	 */
	public UsStates findUsStatesByPrimaryKey(Integer stateId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByModifiedBy
	 *
	 */
	public Set<UsStates> findUsStatesByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByModifiedBy
	 *
	 */
	public Set<UsStates> findUsStatesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateId
	 *
	 */
	public UsStates findUsStatesByStateId(Integer stateId_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateId
	 *
	 */
	public UsStates findUsStatesByStateId(Integer stateId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByModifiedOn
	 *
	 */
	public Set<UsStates> findUsStatesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByModifiedOn
	 *
	 */
	public Set<UsStates> findUsStatesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateAbbrContaining
	 *
	 */
	public Set<UsStates> findUsStatesByStateAbbrContaining(String stateAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateAbbrContaining
	 *
	 */
	public Set<UsStates> findUsStatesByStateAbbrContaining(String stateAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByCreatedOn
	 *
	 */
	public Set<UsStates> findUsStatesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByCreatedOn
	 *
	 */
	public Set<UsStates> findUsStatesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByCreatedByContaining
	 *
	 */
	public Set<UsStates> findUsStatesByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByCreatedByContaining
	 *
	 */
	public Set<UsStates> findUsStatesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUsStatess
	 *
	 */
	public Set<UsStates> findAllUsStatess() throws DataAccessException;

	/**
	 * JPQL Query - findAllUsStatess
	 *
	 */
	public Set<UsStates> findAllUsStatess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByCreatedBy
	 *
	 */
	public Set<UsStates> findUsStatesByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByCreatedBy
	 *
	 */
	public Set<UsStates> findUsStatesByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByModifiedByContaining
	 *
	 */
	public Set<UsStates> findUsStatesByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByModifiedByContaining
	 *
	 */
	public Set<UsStates> findUsStatesByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateName
	 *
	 */
	public Set<UsStates> findUsStatesByStateName(String stateName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateName
	 *
	 */
	public Set<UsStates> findUsStatesByStateName(String stateName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateAbbr
	 *
	 */
	public Set<UsStates> findUsStatesByStateAbbr(String stateAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsStatesByStateAbbr
	 *
	 */
	public Set<UsStates> findUsStatesByStateAbbr(String stateAbbr_1, int startResult, int maxRows) throws DataAccessException;

}