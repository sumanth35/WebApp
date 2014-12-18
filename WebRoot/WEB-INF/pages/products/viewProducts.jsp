<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.products-resources"/>
<html>
<head>
<title>View <fmt:message key="products.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="products.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProducts"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.productid.title"/>:
						</td>
						<td>
							${products.productId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.producttitle.title"/>:
						</td>
						<td>
							${products.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.salesprice.title"/>:
						</td>
						<td>
							${products.salesPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.costprice.title"/>:
						</td>
						<td>
							${products.costPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.discountprice.title"/>:
						</td>
						<td>
							${products.discountPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.percentagediscount.title"/>:
						</td>
						<td>
							${products.percentageDiscount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.createdby.title"/>:
						</td>
						<td>
							${products.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.modifiedby.title"/>:
						</td>
						<td>
							${products.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.status.title"/>:
						</td>
						<td>
							${products.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="products.quantity.title"/>:
						</td>
						<td>
							${products.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendorprofile.title"/></h1>
					
						<c:if test='${products.vendorProfile != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.registrationid.title"/>:
						</td>
						<td>
							${products.vendorProfile.registrationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.registrationname.title"/>:
						</td>
						<td>
							${products.vendorProfile.registrationName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.registrationemail.title"/>:
						</td>
						<td>
							${products.vendorProfile.registrationEmail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.firstname.title"/>:
						</td>
						<td>
							${products.vendorProfile.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.middlename.title"/>:
						</td>
						<td>
							${products.vendorProfile.middleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.lastname.title"/>:
						</td>
						<td>
							${products.vendorProfile.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.namesuffix.title"/>:
						</td>
						<td>
							${products.vendorProfile.nameSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.nametitle.title"/>:
						</td>
						<td>
							${products.vendorProfile.nameTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.phone1.title"/>:
						</td>
						<td>
							${products.vendorProfile.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.phone2.title"/>:
						</td>
						<td>
							${products.vendorProfile.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.fax1.title"/>:
						</td>
						<td>
							${products.vendorProfile.fax1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.fax2.title"/>:
						</td>
						<td>
							${products.vendorProfile.fax2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.profilestatus.title"/>:
						</td>
						<td>
							${products.vendorProfile.profileStatus}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.inactivityduration.title"/>:
						</td>
						<td>
							${products.vendorProfile.inactivityDuration}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.lastsucesslogin.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.vendorProfile.lastSucessLogin.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.educationdegree.title"/>:
						</td>
						<td>
							${products.vendorProfile.educationDegree}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.createdby.title"/>:
						</td>
						<td>
							${products.vendorProfile.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.vendorProfile.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.modifiedby.title"/>:
						</td>
						<td>
							${products.vendorProfile.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.vendorProfile.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.vendorpassword.title"/>:
						</td>
						<td>
							${products.vendorProfile.vendorPassword}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsVendorProfile?products_productId=${products.productId}&vendorprofile_registrationId=${products.vendorProfile.registrationId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsVendorProfile?products_productId=${products.productId}&related_vendorprofile_registrationId=${products.vendorProfile.registrationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${products.vendorProfile == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsVendorProfile?products_productId=${products.productId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorprofile.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendorlocations.title"/></h1>
					
						<c:if test='${products.vendorLocations != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationid.title"/>:
						</td>
						<td>
							${products.vendorLocations.locationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationname.title"/>:
						</td>
						<td>
							${products.vendorLocations.locationName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminfirstname.title"/>:
						</td>
						<td>
							${products.vendorLocations.locationAdminFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminmiddlename.title"/>:
						</td>
						<td>
							${products.vendorLocations.locationAdminMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminlastname.title"/>:
						</td>
						<td>
							${products.vendorLocations.locationAdminLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.locationadminsuffix.title"/>:
						</td>
						<td>
							${products.vendorLocations.locationAdminSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.status.title"/>:
						</td>
						<td>
							${products.vendorLocations.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.phone1.title"/>:
						</td>
						<td>
							${products.vendorLocations.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.phone2.title"/>:
						</td>
						<td>
							${products.vendorLocations.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.fax.title"/>:
						</td>
						<td>
							${products.vendorLocations.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.email.title"/>:
						</td>
						<td>
							${products.vendorLocations.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.addressline1.title"/>:
						</td>
						<td>
							${products.vendorLocations.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.addressline2.title"/>:
						</td>
						<td>
							${products.vendorLocations.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.addressline3.title"/>:
						</td>
						<td>
							${products.vendorLocations.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.zipcode5.title"/>:
						</td>
						<td>
							${products.vendorLocations.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.createdby.title"/>:
						</td>
						<td>
							${products.vendorLocations.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.vendorLocations.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.modifiedby.title"/>:
						</td>
						<td>
							${products.vendorLocations.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.vendorLocations.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorlocations.zipcode4.title"/>:
						</td>
						<td>
							${products.vendorLocations.zipCode4}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsVendorLocations?products_productId=${products.productId}&vendorlocations_locationId=${products.vendorLocations.locationId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsVendorLocations?products_productId=${products.productId}&related_vendorlocations_locationId=${products.vendorLocations.locationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${products.vendorLocations == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsVendorLocations?products_productId=${products.productId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorlocations.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productscategory.title"/></h1>
					
						<c:if test='${products.productsCategory != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.categoryid.title"/>:
						</td>
						<td>
							${products.productsCategory.categoryId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.categoryname.title"/>:
						</td>
						<td>
							${products.productsCategory.categoryName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.categorydescription.title"/>:
						</td>
						<td>
							${products.productsCategory.categoryDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.categorycode.title"/>:
						</td>
						<td>
							${products.productsCategory.categoryCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.createdby.title"/>:
						</td>
						<td>
							${products.productsCategory.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.productsCategory.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.modifiedby.title"/>:
						</td>
						<td>
							${products.productsCategory.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productscategory.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${products.productsCategory.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsProductsCategory?products_productId=${products.productId}&productscategory_categoryId=${products.productsCategory.categoryId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsProductsCategory?products_productId=${products.productId}&related_productscategory_categoryId=${products.productsCategory.categoryId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${products.productsCategory == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsProductsCategory?products_productId=${products.productId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productscategory.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsfeedback.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsProductsFeedbacks?products_productId=${products.productId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsfeedback.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="productsfeedback.feedbackid.title"/></th>
						<th class="thead"><fmt:message key="productsfeedback.feedbackcomments.title"/></th>
						<th class="thead"><fmt:message key="productsfeedback.createdon.title"/></th>
						<th class="thead"><fmt:message key="productsfeedback.createdby.title"/></th>
						<th class="thead"><fmt:message key="productsfeedback.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="productsfeedback.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products.productsFeedbacks}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsProductsFeedbacks?products_productId=${products.productId}&productsfeedbacks_feedbackId=${current.feedbackId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsProductsFeedbacks?products_productId=${products.productId}&productsfeedbacks_feedbackId=${current.feedbackId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsProductsFeedbacks?products_productId=${products.productId}&related_productsfeedbacks_feedbackId=${current.feedbackId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.feedbackId}
						&nbsp;
						</td>
						<td>
							${current.feedbackComments}
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
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsrating.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsProductsRatings?products_productId=${products.productId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsrating.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="productsrating.productratingid.title"/></th>
						<th class="thead"><fmt:message key="productsrating.productrating.title"/></th>
						<th class="thead"><fmt:message key="productsrating.createdon.title"/></th>
						<th class="thead"><fmt:message key="productsrating.createdby.title"/></th>
						<th class="thead"><fmt:message key="productsrating.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="productsrating.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products.productsRatings}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsProductsRatings?products_productId=${products.productId}&productsratings_productRatingId=${current.productRatingId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsProductsRatings?products_productId=${products.productId}&productsratings_productRatingId=${current.productRatingId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsProductsRatings?products_productId=${products.productId}&related_productsratings_productRatingId=${current.productRatingId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productRatingId}
						&nbsp;
						</td>
						<td>
							${current.productRating}
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
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsdescription.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsProductsDescriptions?products_productId=${products.productId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsdescription.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="productsdescription.productdescriptionid.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productprimarydescription.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productsecondarydescription1.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productsecondarydescription2.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productsecondarydescription3.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productsecondarydescription4.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productsecondarydescription5.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productcolor.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productdimensionlength.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productdimensionbreadth.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productdimensionheight.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productweight.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productnumber.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productmodelnumber.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.productorigin.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.createdby.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.createdon.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="productsdescription.modifiedon.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products.productsDescriptions}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsProductsDescriptions?products_productId=${products.productId}&productsdescriptions_productDescriptionId=${current.productDescriptionId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsProductsDescriptions?products_productId=${products.productId}&productsdescriptions_productDescriptionId=${current.productDescriptionId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsProductsDescriptions?products_productId=${products.productId}&related_productsdescriptions_productDescriptionId=${current.productDescriptionId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productDescriptionId}
						&nbsp;
						</td>
						<td>
							${current.productPrimaryDescription}
						&nbsp;
						</td>
						<td>
							${current.productSecondaryDescription1}
						&nbsp;
						</td>
						<td>
							${current.productSecondaryDescription2}
						&nbsp;
						</td>
						<td>
							${current.productSecondaryDescription3}
						&nbsp;
						</td>
						<td>
							${current.productSecondaryDescription4}
						&nbsp;
						</td>
						<td>
							${current.productSecondaryDescription5}
						&nbsp;
						</td>
						<td>
							${current.productColor}
						&nbsp;
						</td>
						<td>
							${current.productDimensionLength}
						&nbsp;
						</td>
						<td>
							${current.productDimensionBreadth}
						&nbsp;
						</td>
						<td>
							${current.productDimensionHeight}
						&nbsp;
						</td>
						<td>
							${current.productWeight}
						&nbsp;
						</td>
						<td>
							${current.productNumber}
						&nbsp;
						</td>
						<td>
							${current.productModelNumber}
						&nbsp;
						</td>
						<td>
							${current.productOrigin}
						&nbsp;
						</td>
						<td>
							${current.createdBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.modifiedBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productimages.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsProductImageses?products_productId=${products.productId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productimages.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="productimages.productimageid.title"/></th>
						<th class="thead"><fmt:message key="productimages.createdon.title"/></th>
						<th class="thead"><fmt:message key="productimages.createdby.title"/></th>
						<th class="thead"><fmt:message key="productimages.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="productimages.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products.productImageses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsProductImageses?products_productId=${products.productId}&productimageses_productImageId=${current.productImageId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsProductImageses?products_productId=${products.productId}&productimageses_productImageId=${current.productImageId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsProductImageses?products_productId=${products.productId}&related_productimageses_productImageId=${current.productImageId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productImageId}
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
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="cartitems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsCartItemses?products_productId=${products.productId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="cartitems.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="cartitems.cartitemid.title"/></th>
						<th class="thead"><fmt:message key="cartitems.producttitle.title"/></th>
						<th class="thead"><fmt:message key="cartitems.productcost.title"/></th>
						<th class="thead"><fmt:message key="cartitems.productquantity.title"/></th>
						<th class="thead"><fmt:message key="cartitems.status.title"/></th>
						<th class="thead"><fmt:message key="cartitems.createdon.title"/></th>
						<th class="thead"><fmt:message key="cartitems.createdby.title"/></th>
						<th class="thead"><fmt:message key="cartitems.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="cartitems.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products.cartItemses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsCartItemses?products_productId=${products.productId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsCartItemses?products_productId=${products.productId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsCartItemses?products_productId=${products.productId}&related_cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.cartItemId}
						&nbsp;
						</td>
						<td>
							${current.productTitle}
						&nbsp;
						</td>
						<td>
							${current.productCost}
						&nbsp;
						</td>
						<td>
							${current.productQuantity}
						&nbsp;
						</td>
						<td>
							${current.status}
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