<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productscategory-resources"/>
<html>
<head>
<title>View <fmt:message key="productscategory.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="productscategory.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProductsCategory"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.categoryid.title"/>:
						</td>
						<td>
							${productscategory.categoryId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.categoryname.title"/>:
						</td>
						<td>
							${productscategory.categoryName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.categorydescription.title"/>:
						</td>
						<td>
							${productscategory.categoryDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.categorycode.title"/>:
						</td>
						<td>
							${productscategory.categoryCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.createdby.title"/>:
						</td>
						<td>
							${productscategory.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productscategory.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.modifiedby.title"/>:
						</td>
						<td>
							${productscategory.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productscategory.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productscategory.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsbrand.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsCategoryProductsBrands?productscategory_categoryId=${productscategory.categoryId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsbrand.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="productsbrand.brandid.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.brandname.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.branddescription.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.brandcode.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.createdby.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.createdon.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="productsbrand.modifiedon.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${productscategory.productsBrands}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsCategoryProductsBrands?productscategory_categoryId=${productscategory.categoryId}&productsbrands_brandId=${current.brandId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsCategoryProductsBrands?productscategory_categoryId=${productscategory.categoryId}&productsbrands_brandId=${current.brandId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsCategoryProductsBrands?productscategory_categoryId=${productscategory.categoryId}&related_productsbrands_brandId=${current.brandId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.brandId}
						&nbsp;
						</td>
						<td>
							${current.brandName}
						&nbsp;
						</td>
						<td>
							${current.brandDescription}
						&nbsp;
						</td>
						<td>
							${current.brandCode}
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
			<h1><fmt:message key="products.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsCategoryProductses?productscategory_categoryId=${productscategory.categoryId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="products.productid.title"/></th>
						<th class="thead"><fmt:message key="products.producttitle.title"/></th>
						<th class="thead"><fmt:message key="products.salesprice.title"/></th>
						<th class="thead"><fmt:message key="products.costprice.title"/></th>
						<th class="thead"><fmt:message key="products.discountprice.title"/></th>
						<th class="thead"><fmt:message key="products.percentagediscount.title"/></th>
						<th class="thead"><fmt:message key="products.createdon.title"/></th>
						<th class="thead"><fmt:message key="products.createdby.title"/></th>
						<th class="thead"><fmt:message key="products.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="products.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="products.status.title"/></th>
						<th class="thead"><fmt:message key="products.quantity.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${productscategory.productses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsCategoryProductses?productscategory_categoryId=${productscategory.categoryId}&productses_productId=${current.productId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsCategoryProductses?productscategory_categoryId=${productscategory.categoryId}&productses_productId=${current.productId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsCategoryProductses?productscategory_categoryId=${productscategory.categoryId}&related_productses_productId=${current.productId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productId}
						&nbsp;
						</td>
						<td>
							${current.productTitle}
						&nbsp;
						</td>
						<td>
							${current.salesPrice}
						&nbsp;
						</td>
						<td>
							${current.costPrice}
						&nbsp;
						</td>
						<td>
							${current.discountPrice}
						&nbsp;
						</td>
						<td>
							${current.percentageDiscount}
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
						<td>
							${current.status}
						&nbsp;
						</td>
						<td>
							${current.quantity}
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