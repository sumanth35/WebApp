package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ProductImages;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductImages entities.
 * 
 */
public interface ProductImagesDAO extends JpaDao<ProductImages> {

	/**
	 * JPQL Query - findAllProductImagess
	 *
	 */
	public Set<ProductImages> findAllProductImagess() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductImagess
	 *
	 */
	public Set<ProductImages> findAllProductImagess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByProductImageId
	 *
	 */
	public ProductImages findProductImagesByProductImageId(Integer productImageId) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByProductImageId
	 *
	 */
	public ProductImages findProductImagesByProductImageId(Integer productImageId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByCreatedBy
	 *
	 */
	public Set<ProductImages> findProductImagesByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByCreatedBy
	 *
	 */
	public Set<ProductImages> findProductImagesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByModifiedOn
	 *
	 */
	public Set<ProductImages> findProductImagesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByModifiedOn
	 *
	 */
	public Set<ProductImages> findProductImagesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByCreatedByContaining
	 *
	 */
	public Set<ProductImages> findProductImagesByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByCreatedByContaining
	 *
	 */
	public Set<ProductImages> findProductImagesByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByPrimaryKey
	 *
	 */
	public ProductImages findProductImagesByPrimaryKey(Integer productImageId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByPrimaryKey
	 *
	 */
	public ProductImages findProductImagesByPrimaryKey(Integer productImageId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByModifiedBy
	 *
	 */
	public Set<ProductImages> findProductImagesByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByModifiedBy
	 *
	 */
	public Set<ProductImages> findProductImagesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByCreatedOn
	 *
	 */
	public Set<ProductImages> findProductImagesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByCreatedOn
	 *
	 */
	public Set<ProductImages> findProductImagesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByModifiedByContaining
	 *
	 */
	public Set<ProductImages> findProductImagesByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductImagesByModifiedByContaining
	 *
	 */
	public Set<ProductImages> findProductImagesByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

}