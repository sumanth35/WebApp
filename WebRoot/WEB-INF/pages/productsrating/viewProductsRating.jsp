<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productsrating-resources"/>
<html>
<head>
<title>View <fmt:message key="productsrating.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="productsrating.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProductsRating"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsrating.productratingid.title"/>:
						</td>
						<td>
							${productsrating.productRatingId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsrating.productrating.title"/>:
						</td>
						<td>
							${productsrating.productRating}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsrating.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsrating.createdby.title"/>:
						</td>
						<td>
							${productsrating.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsrating.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsrating.modifiedby.title"/>:
						</td>
						<td>
							${productsrating.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="products.title"/></h1>
					
						<c:if test='${productsrating.products != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="products.productid.title"/>:
						</td>
						<td>
							${productsrating.products.productId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.producttitle.title"/>:
						</td>
						<td>
							${productsrating.products.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.salesprice.title"/>:
						</td>
						<td>
							${productsrating.products.salesPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.costprice.title"/>:
						</td>
						<td>
							${productsrating.products.costPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.discountprice.title"/>:
						</td>
						<td>
							${productsrating.products.discountPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.percentagediscount.title"/>:
						</td>
						<td>
							${productsrating.products.percentageDiscount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.products.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdby.title"/>:
						</td>
						<td>
							${productsrating.products.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.products.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedby.title"/>:
						</td>
						<td>
							${productsrating.products.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.status.title"/>:
						</td>
						<td>
							${productsrating.products.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.quantity.title"/>:
						</td>
						<td>
							${productsrating.products.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsRatingProducts?productsrating_productRatingId=${productsrating.productRatingId}&products_productId=${productsrating.products.productId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsRatingProducts?productsrating_productRatingId=${productsrating.productRatingId}&related_products_productId=${productsrating.products.productId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${productsrating.products == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsRatingProducts?productsrating_productRatingId=${productsrating.productRatingId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="customerprofile.title"/></h1>
					
						<c:if test='${productsrating.customerProfile != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customerid.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.customerId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customername.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.customerName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customerpassword.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.customerPassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.customeremail.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.customerEmail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.profilestatus.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.profileStatus}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.phone1.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.phone2.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.firstname.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.lastname.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.middlename.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.middleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.namesuffix.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.nameSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.nametitle.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.nameTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.lastsuccesslogin.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.customerProfile.lastSuccessLogin.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.visits.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.visits}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.createdip.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.createdIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.addressline1.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.addressline2.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.addressline3.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.zipcode5.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.zipcode4.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.zipCode4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.lastloginip.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.lastLoginIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.customerProfile.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.createdby.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsrating.customerProfile.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customerprofile.modifiedby.title"/>:
						</td>
						<td>
							${productsrating.customerProfile.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsRatingCustomerProfile?productsrating_productRatingId=${productsrating.productRatingId}&customerprofile_customerId=${productsrating.customerProfile.customerId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsRatingCustomerProfile?productsrating_productRatingId=${productsrating.productRatingId}&related_customerprofile_customerId=${productsrating.customerProfile.customerId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${productsrating.customerProfile == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsRatingCustomerProfile?productsrating_productRatingId=${productsrating.productRatingId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="customerprofile.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsfeedback.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsRatingProductsFeedbacks?productsrating_productRatingId=${productsrating.productRatingId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsfeedback.title"/></span></a></div>
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
					<c:forEach items="${productsrating.productsFeedbacks}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsRatingProductsFeedbacks?productsrating_productRatingId=${productsrating.productRatingId}&productsfeedbacks_feedbackId=${current.feedbackId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsRatingProductsFeedbacks?productsrating_productRatingId=${productsrating.productRatingId}&productsfeedbacks_feedbackId=${current.feedbackId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsRatingProductsFeedbacks?productsrating_productRatingId=${productsrating.productRatingId}&related_productsfeedbacks_feedbackId=${current.feedbackId}&"><img src="images/icons/delete.gif" /></a>
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>