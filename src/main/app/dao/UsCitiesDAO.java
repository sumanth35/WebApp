package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.UsCities;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage UsCities entities.
 * 
 */
public interface UsCitiesDAO extends JpaDao<UsCities> {

	/**
	 * JPQL Query - findUsCitiesByCreatedBy
	 *
	 */
	public Set<UsCities> findUsCitiesByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCreatedBy
	 *
	 */
	public Set<UsCities> findUsCitiesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityName
	 *
	 */
	public Set<UsCities> findUsCitiesByCityName(String cityName) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityName
	 *
	 */
	public Set<UsCities> findUsCitiesByCityName(String cityName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityAbbr
	 *
	 */
	public Set<UsCities> findUsCitiesByCityAbbr(String cityAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityAbbr
	 *
	 */
	public Set<UsCities> findUsCitiesByCityAbbr(String cityAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityNameContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByCityNameContaining(String cityName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityNameContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByCityNameContaining(String cityName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCreatedByContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCreatedByContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByModifiedBy
	 *
	 */
	public Set<UsCities> findUsCitiesByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByModifiedBy
	 *
	 */
	public Set<UsCities> findUsCitiesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCreatedOn
	 *
	 */
	public Set<UsCities> findUsCitiesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCreatedOn
	 *
	 */
	public Set<UsCities> findUsCitiesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByModifiedOn
	 *
	 */
	public Set<UsCities> findUsCitiesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByModifiedOn
	 *
	 */
	public Set<UsCities> findUsCitiesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUsCitiess
	 *
	 */
	public Set<UsCities> findAllUsCitiess() throws DataAccessException;

	/**
	 * JPQL Query - findAllUsCitiess
	 *
	 */
	public Set<UsCities> findAllUsCitiess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByModifiedByContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByModifiedByContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityId
	 *
	 */
	public UsCities findUsCitiesByCityId(Integer cityId) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityId
	 *
	 */
	public UsCities findUsCitiesByCityId(Integer cityId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityAbbrContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByCityAbbrContaining(String cityAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByCityAbbrContaining
	 *
	 */
	public Set<UsCities> findUsCitiesByCityAbbrContaining(String cityAbbr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByPrimaryKey
	 *
	 */
	public UsCities findUsCitiesByPrimaryKey(Integer cityId_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCitiesByPrimaryKey
	 *
	 */
	public UsCities findUsCitiesByPrimaryKey(Integer cityId_1, int startResult, int maxRows) throws DataAccessException;

}