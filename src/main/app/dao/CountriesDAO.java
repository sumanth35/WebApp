package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.Countries;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Countries entities.
 * 
 */
public interface CountriesDAO extends JpaDao<Countries> {

	/**
	 * JPQL Query - findCountriesByCountryName
	 *
	 */
	public Set<Countries> findCountriesByCountryName(String countryName) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryName
	 *
	 */
	public Set<Countries> findCountriesByCountryName(String countryName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCreatedBy
	 *
	 */
	public Set<Countries> findCountriesByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCreatedBy
	 *
	 */
	public Set<Countries> findCountriesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCreatedOn
	 *
	 */
	public Set<Countries> findCountriesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCreatedOn
	 *
	 */
	public Set<Countries> findCountriesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCountriess
	 *
	 */
	public Set<Countries> findAllCountriess() throws DataAccessException;

	/**
	 * JPQL Query - findAllCountriess
	 *
	 */
	public Set<Countries> findAllCountriess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryId
	 *
	 */
	public Countries findCountriesByCountryId(Integer countryId) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryId
	 *
	 */
	public Countries findCountriesByCountryId(Integer countryId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByModifiedOn
	 *
	 */
	public Set<Countries> findCountriesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByModifiedOn
	 *
	 */
	public Set<Countries> findCountriesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryAbbr
	 *
	 */
	public Set<Countries> findCountriesByCountryAbbr(String countryAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryAbbr
	 *
	 */
	public Set<Countries> findCountriesByCountryAbbr(String countryAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryAbbrContaining
	 *
	 */
	public Set<Countries> findCountriesByCountryAbbrContaining(String countryAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryAbbrContaining
	 *
	 */
	public Set<Countries> findCountriesByCountryAbbrContaining(String countryAbbr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCreatedByContaining
	 *
	 */
	public Set<Countries> findCountriesByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCreatedByContaining
	 *
	 */
	public Set<Countries> findCountriesByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByPrimaryKey
	 *
	 */
	public Countries findCountriesByPrimaryKey(Integer countryId_1) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByPrimaryKey
	 *
	 */
	public Countries findCountriesByPrimaryKey(Integer countryId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByModifiedBy
	 *
	 */
	public Set<Countries> findCountriesByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByModifiedBy
	 *
	 */
	public Set<Countries> findCountriesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryNameContaining
	 *
	 */
	public Set<Countries> findCountriesByCountryNameContaining(String countryName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryNameContaining
	 *
	 */
	public Set<Countries> findCountriesByCountryNameContaining(String countryName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByModifiedByContaining
	 *
	 */
	public Set<Countries> findCountriesByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByModifiedByContaining
	 *
	 */
	public Set<Countries> findCountriesByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryCode
	 *
	 */
	public Set<Countries> findCountriesByCountryCode(java.math.BigDecimal countryCode) throws DataAccessException;

	/**
	 * JPQL Query - findCountriesByCountryCode
	 *
	 */
	public Set<Countries> findCountriesByCountryCode(BigDecimal countryCode, int startResult, int maxRows) throws DataAccessException;

}