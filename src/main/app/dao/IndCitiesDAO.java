package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.IndCities;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage IndCities entities.
 * 
 */
public interface IndCitiesDAO extends JpaDao<IndCities> {

	/**
	 * JPQL Query - findIndCitiesByCreatedByContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCreatedByContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByModifiedByContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByModifiedByContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityId
	 *
	 */
	public IndCities findIndCitiesByCityId(Integer cityId) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityId
	 *
	 */
	public IndCities findIndCitiesByCityId(Integer cityId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityNameContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByCityNameContaining(String cityName) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityNameContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByCityNameContaining(String cityName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByModifiedBy
	 *
	 */
	public Set<IndCities> findIndCitiesByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByModifiedBy
	 *
	 */
	public Set<IndCities> findIndCitiesByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityAbbrContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByCityAbbrContaining(String cityAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityAbbrContaining
	 *
	 */
	public Set<IndCities> findIndCitiesByCityAbbrContaining(String cityAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityName
	 *
	 */
	public Set<IndCities> findIndCitiesByCityName(String cityName_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityName
	 *
	 */
	public Set<IndCities> findIndCitiesByCityName(String cityName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityAbbr
	 *
	 */
	public Set<IndCities> findIndCitiesByCityAbbr(String cityAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCityAbbr
	 *
	 */
	public Set<IndCities> findIndCitiesByCityAbbr(String cityAbbr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByModifiedOn
	 *
	 */
	public Set<IndCities> findIndCitiesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByModifiedOn
	 *
	 */
	public Set<IndCities> findIndCitiesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByPrimaryKey
	 *
	 */
	public IndCities findIndCitiesByPrimaryKey(Integer cityId_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByPrimaryKey
	 *
	 */
	public IndCities findIndCitiesByPrimaryKey(Integer cityId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCreatedBy
	 *
	 */
	public Set<IndCities> findIndCitiesByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCreatedBy
	 *
	 */
	public Set<IndCities> findIndCitiesByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCreatedOn
	 *
	 */
	public Set<IndCities> findIndCitiesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findIndCitiesByCreatedOn
	 *
	 */
	public Set<IndCities> findIndCitiesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllIndCitiess
	 *
	 */
	public Set<IndCities> findAllIndCitiess() throws DataAccessException;

	/**
	 * JPQL Query - findAllIndCitiess
	 *
	 */
	public Set<IndCities> findAllIndCitiess(int startResult, int maxRows) throws DataAccessException;

}