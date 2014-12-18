<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.cartitems-resources"/>
<html>
<head>
<title>View <fmt:message key="cartitems.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="cartitems.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCartItems"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.cartitemid.title"/>:
						</td>
						<td>
							${cartitems.cartItemId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.producttitle.title"/>:
						</td>
						<td>
							${cartitems.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.productcost.title"/>:
						</td>
						<td>
							${cartitems.productCost}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.productquantity.title"/>:
						</td>
						<td>
							${cartitems.productQuantity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.status.title"/>:
						</td>
						<td>
							${cartitems.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.createdby.title"/>:
						</td>
						<td>
							${cartitems.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="cartitems.modifiedby.title"/>:
						</td>
						<td>
							${cartitems.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="products.title"/></h1>
					
						<c:if test='${cartitems.products != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="products.productid.title"/>:
						</td>
						<td>
							${cartitems.products.productId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.producttitle.title"/>:
						</td>
						<td>
							${cartitems.products.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.salesprice.title"/>:
						</td>
						<td>
							${cartitems.products.salesPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.costprice.title"/>:
						</td>
						<td>
							${cartitems.products.costPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.discountprice.title"/>:
						</td>
						<td>
							${cartitems.products.discountPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.percentagediscount.title"/>:
						</td>
						<td>
							${cartitems.products.percentageDiscount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.products.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdby.title"/>:
						</td>
						<td>
							${cartitems.products.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.products.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedby.title"/>:
						</td>
						<td>
							${cartitems.products.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.status.title"/>:
						</td>
						<td>
							${cartitems.products.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.quantity.title"/>:
						</td>
						<td>
							${cartitems.products.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCartItemsProducts?cartitems_cartItemId=${cartitems.cartItemId}&products_productId=${cartitems.products.productId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCartItemsProducts?cartitems_cartItemId=${cartitems.cartItemId}&related_products_productId=${cartitems.products.productId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${cartitems.products == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCartItemsProducts?cartitems_cartItemId=${cartitems.cartItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productimages.title"/></h1>
					
						<c:if test='${cartitems.productImages != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="productimages.productimageid.title"/>:
						</td>
						<td>
							${cartitems.productImages.productImageId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productimages.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.productImages.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productimages.createdby.title"/>:
						</td>
						<td>
							${cartitems.productImages.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productimages.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.productImages.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productimages.modifiedby.title"/>:
						</td>
						<td>
							${cartitems.productImages.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCartItemsProductImages?cartitems_cartItemId=${cartitems.cartItemId}&productimages_productImageId=${cartitems.productImages.productImageId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCartItemsProductImages?cartitems_cartItemId=${cartitems.cartItemId}&related_productimages_productImageId=${cartitems.productImages.productImageId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${cartitems.productImages == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCartItemsProductImages?cartitems_cartItemId=${cartitems.cartItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productimages.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="customerprofile.title"/></h1>
					
						<c:if test='${cartitems.customerProfile != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customerid.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.customerId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customername.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.customerName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customerpassword.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.customerPassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customeremail.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.customerEmail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.profilestatus.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.profileStatus}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.phone1.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.phone2.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.firstname.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.lastname.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.middlename.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.middleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.namesuffix.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.nameSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.nametitle.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.nameTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.lastsuccesslogin.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.customerProfile.lastSuccessLogin.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.visits.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.visits}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.createdip.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.createdIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.addressline1.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.addressline2.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.addressline3.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.zipcode5.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.zipcode4.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.zipCode4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.lastloginip.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.lastLoginIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.customerProfile.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.createdby.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.customerProfile.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.modifiedby.title"/>:
						</td>
						<td>
							${cartitems.customerProfile.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCartItemsCustomerProfile?cartitems_cartItemId=${cartitems.cartItemId}&customerprofile_customerId=${cartitems.customerProfile.customerId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCartItemsCustomerProfile?cartitems_cartItemId=${cartitems.cartItemId}&related_customerprofile_customerId=${cartitems.customerProfile.customerId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${cartitems.customerProfile == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCartItemsCustomerProfile?cartitems_cartItemId=${cartitems.cartItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="customerprofile.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendorlocations.title"/></h1>
					
						<c:if test='${cartitems.vendorLocations != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationid.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.locationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationname.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.locationName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminfirstname.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.locationAdminFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminmiddlename.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.locationAdminMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminlastname.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.locationAdminLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminsuffix.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.locationAdminSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.status.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.phone1.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.phone2.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.fax.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.email.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.addressline1.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.addressline2.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.addressline3.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.zipcode5.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.createdby.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.vendorLocations.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.modifiedby.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.vendorLocations.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.zipcode4.title"/>:
						</td>
						<td>
							${cartitems.vendorLocations.zipCode4}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCartItemsVendorLocations?cartitems_cartItemId=${cartitems.cartItemId}&vendorlocations_locationId=${cartitems.vendorLocations.locationId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCartItemsVendorLocations?cartitems_cartItemId=${cartitems.cartItemId}&related_vendorlocations_locationId=${cartitems.vendorLocations.locationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${cartitems.vendorLocations == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCartItemsVendorLocations?cartitems_cartItemId=${cartitems.cartItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorlocations.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsdescription.title"/></h1>
					
						<c:if test='${cartitems.productsDescription != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productdescriptionid.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productDescriptionId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productprimarydescription.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productPrimaryDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productsecondarydescription1.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productSecondaryDescription1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productsecondarydescription2.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productSecondaryDescription2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productsecondarydescription3.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productSecondaryDescription3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productsecondarydescription4.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productSecondaryDescription4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productsecondarydescription5.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productSecondaryDescription5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productcolor.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productColor}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productdimensionlength.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productDimensionLength}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productdimensionbreadth.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productDimensionBreadth}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productdimensionheight.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productDimensionHeight}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productweight.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productWeight}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productnumber.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productmodelnumber.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productModelNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.productorigin.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.productOrigin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.createdby.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.productsDescription.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.modifiedby.title"/>:
						</td>
						<td>
							${cartitems.productsDescription.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsdescription.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${cartitems.productsDescription.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCartItemsProductsDescription?cartitems_cartItemId=${cartitems.cartItemId}&productsdescription_productDescriptionId=${cartitems.productsDescription.productDescriptionId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCartItemsProductsDescription?cartitems_cartItemId=${cartitems.cartItemId}&related_productsdescription_productDescriptionId=${cartitems.productsDescription.productDescriptionId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${cartitems.productsDescription == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCartItemsProductsDescription?cartitems_cartItemId=${cartitems.cartItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsdescription.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="ordereditems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCartItemsOrderedItemses?cartitems_cartItemId=${cartitems.cartItemId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="ordereditems.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="ordereditems.orderitemid.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.itemprice.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.createdon.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.createdby.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cartitems.orderedItemses}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCartItemsOrderedItemses?cartitems_cartItemId=${cartitems.cartItemId}&ordereditemses_orderItemId=${current.orderItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCartItemsOrderedItemses?cartitems_cartItemId=${cartitems.cartItemId}&ordereditemses_orderItemId=${current.orderItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCartItemsOrderedItemses?cartitems_cartItemId=${cartitems.cartItemId}&related_ordereditemses_orderItemId=${current.orderItemId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.orderItemId}
						&nbsp;
						</td>
						<td>
							${current.itemPrice}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.createdBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.modifiedBy}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>