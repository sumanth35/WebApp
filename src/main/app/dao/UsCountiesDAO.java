package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.UsCounties;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage UsCounties entities.
 * 
 */
public interface UsCountiesDAO extends JpaDao<UsCounties> {

	/**
	 * JPQL Query - findUsCountiesByCountyNameContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyNameContaining(String countyName) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyNameContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyNameContaining(String countyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCreatedBy
	 *
	 */
	public Set<UsCounties> findUsCountiesByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCreatedBy
	 *
	 */
	public Set<UsCounties> findUsCountiesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByModifiedByContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByModifiedByContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByModifiedOn
	 *
	 */
	public Set<UsCounties> findUsCountiesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByModifiedOn
	 *
	 */
	public Set<UsCounties> findUsCountiesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyAbbrContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyAbbrContaining(String countyAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyAbbrContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyAbbrContaining(String countyAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByModifiedBy
	 *
	 */
	public Set<UsCounties> findUsCountiesByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByModifiedBy
	 *
	 */
	public Set<UsCounties> findUsCountiesByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCreatedOn
	 *
	 */
	public Set<UsCounties> findUsCountiesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCreatedOn
	 *
	 */
	public Set<UsCounties> findUsCountiesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUsCountiess
	 *
	 */
	public Set<UsCounties> findAllUsCountiess() throws DataAccessException;

	/**
	 * JPQL Query - findAllUsCountiess
	 *
	 */
	public Set<UsCounties> findAllUsCountiess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyId
	 *
	 */
	public UsCounties findUsCountiesByCountyId(Integer countyId) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyId
	 *
	 */
	public UsCounties findUsCountiesByCountyId(Integer countyId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCreatedByContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCreatedByContaining
	 *
	 */
	public Set<UsCounties> findUsCountiesByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyName
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyName(String countyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyName
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyName(String countyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByPrimaryKey
	 *
	 */
	public UsCounties findUsCountiesByPrimaryKey(Integer countyId_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByPrimaryKey
	 *
	 */
	public UsCounties findUsCountiesByPrimaryKey(Integer countyId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyAbbr
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyAbbr(String countyAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsCountiesByCountyAbbr
	 *
	 */
	public Set<UsCounties> findUsCountiesByCountyAbbr(String countyAbbr_1, int startResult, int maxRows) throws DataAccessException;

}