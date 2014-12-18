package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ProductsDescription;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductsDescription entities.
 * 
 */
public interface ProductsDescriptionDAO extends JpaDao<ProductsDescription> {

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4Containing(String productSecondaryDescription4) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4Containing(String productSecondaryDescription4, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumber
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumber(String productModelNumber) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumber
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumber(String productModelNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductOrigin
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductOrigin(String productOrigin) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductOrigin
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductOrigin(String productOrigin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadth
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadth(String productDimensionBreadth) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadth
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadth(String productDimensionBreadth, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductColor
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductColor(String productColor) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductColor
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductColor(String productColor, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLengthContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLengthContaining(String productDimensionLength) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLengthContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLengthContaining(String productDimensionLength, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByModifiedByContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByModifiedByContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsDescriptions
	 *
	 */
	public Set<ProductsDescription> findAllProductsDescriptions() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsDescriptions
	 *
	 */
	public Set<ProductsDescription> findAllProductsDescriptions(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByPrimaryKey
	 *
	 */
	public ProductsDescription findProductsDescriptionByPrimaryKey(Integer productDescriptionId) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByPrimaryKey
	 *
	 */
	public ProductsDescription findProductsDescriptionByPrimaryKey(Integer productDescriptionId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2Containing(String productSecondaryDescription2) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2Containing(String productSecondaryDescription2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2(String productSecondaryDescription2_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription2
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription2(String productSecondaryDescription2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByModifiedOn
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByModifiedOn
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3Containing(String productSecondaryDescription3) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3Containing(String productSecondaryDescription3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeightContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeightContaining(String productDimensionHeight) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeightContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeightContaining(String productDimensionHeight, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5Containing(String productSecondaryDescription5) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5Containing(String productSecondaryDescription5, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescription
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescription(String productPrimaryDescription) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescription
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescription(String productPrimaryDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductWeight
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductWeight(java.math.BigDecimal productWeight) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductWeight
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductWeight(BigDecimal productWeight, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductOriginContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductOriginContaining(String productOrigin_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductOriginContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductOriginContaining(String productOrigin_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3(String productSecondaryDescription3_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription3
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription3(String productSecondaryDescription3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumberContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumberContaining(String productModelNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductModelNumberContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductModelNumberContaining(String productModelNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByCreatedByContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByCreatedByContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeight
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeight(String productDimensionHeight_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionHeight
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionHeight(String productDimensionHeight_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByCreatedOn
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByCreatedOn
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1Containing(String productSecondaryDescription1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1Containing
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1Containing(String productSecondaryDescription1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4(String productSecondaryDescription4_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription4
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription4(String productSecondaryDescription4_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescriptionContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescriptionContaining(String productPrimaryDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductPrimaryDescriptionContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductPrimaryDescriptionContaining(String productPrimaryDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductNumber
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductNumber(java.math.BigDecimal productNumber) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductNumber
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductNumber(BigDecimal productNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductColorContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductColorContaining(String productColor_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductColorContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductColorContaining(String productColor_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByModifiedBy
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByModifiedBy
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLength
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLength(String productDimensionLength_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionLength
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionLength(String productDimensionLength_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadthContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadthContaining(String productDimensionBreadth_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDimensionBreadthContaining
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductDimensionBreadthContaining(String productDimensionBreadth_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByCreatedBy
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByCreatedBy
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDescriptionId
	 *
	 */
	public ProductsDescription findProductsDescriptionByProductDescriptionId(Integer productDescriptionId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductDescriptionId
	 *
	 */
	public ProductsDescription findProductsDescriptionByProductDescriptionId(Integer productDescriptionId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5(String productSecondaryDescription5_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription5
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription5(String productSecondaryDescription5_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1(String productSecondaryDescription1_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsDescriptionByProductSecondaryDescription1
	 *
	 */
	public Set<ProductsDescription> findProductsDescriptionByProductSecondaryDescription1(String productSecondaryDescription1_1, int startResult, int maxRows) throws DataAccessException;

}