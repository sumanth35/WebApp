package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.IndDistrict;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage IndDistrict entities.
 * 
 */
public interface IndDistrictDAO extends JpaDao<IndDistrict> {

	/**
	 * JPQL Query - findIndDistrictByModifiedByContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByModifiedByContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictId
	 *
	 */
	public IndDistrict findIndDistrictByDistrictId(Integer districtId) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictId
	 *
	 */
	public IndDistrict findIndDistrictByDistrictId(Integer districtId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByModifiedBy
	 *
	 */
	public Set<IndDistrict> findIndDistrictByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByModifiedBy
	 *
	 */
	public Set<IndDistrict> findIndDistrictByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbrContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictAbbrContaining(String districtAbbr) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbrContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictAbbrContaining(String districtAbbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbr
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictAbbr(String districtAbbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbr
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictAbbr(String districtAbbr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByModifiedOn
	 *
	 */
	public Set<IndDistrict> findIndDistrictByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByModifiedOn
	 *
	 */
	public Set<IndDistrict> findIndDistrictByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictNameContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictNameContaining(String districtName) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictNameContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictNameContaining(String districtName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByCreatedOn
	 *
	 */
	public Set<IndDistrict> findIndDistrictByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByCreatedOn
	 *
	 */
	public Set<IndDistrict> findIndDistrictByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByPrimaryKey
	 *
	 */
	public IndDistrict findIndDistrictByPrimaryKey(Integer districtId_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByPrimaryKey
	 *
	 */
	public IndDistrict findIndDistrictByPrimaryKey(Integer districtId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictName
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictName(String districtName_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByDistrictName
	 *
	 */
	public Set<IndDistrict> findIndDistrictByDistrictName(String districtName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByCreatedBy
	 *
	 */
	public Set<IndDistrict> findIndDistrictByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByCreatedBy
	 *
	 */
	public Set<IndDistrict> findIndDistrictByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllIndDistricts
	 *
	 */
	public Set<IndDistrict> findAllIndDistricts() throws DataAccessException;

	/**
	 * JPQL Query - findAllIndDistricts
	 *
	 */
	public Set<IndDistrict> findAllIndDistricts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByCreatedByContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findIndDistrictByCreatedByContaining
	 *
	 */
	public Set<IndDistrict> findIndDistrictByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

}