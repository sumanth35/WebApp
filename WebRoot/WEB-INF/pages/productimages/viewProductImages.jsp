<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productimages-resources"/>
<html>
<head>
<title>View <fmt:message key="productimages.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="productimages.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProductImages"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productimages.productimageid.title"/>:
						</td>
						<td>
							${productimages.productImageId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productimages.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productimages.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productimages.createdby.title"/>:
						</td>
						<td>
							${productimages.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productimages.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productimages.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productimages.modifiedby.title"/>:
						</td>
						<td>
							${productimages.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="products.title"/></h1>
					
						<c:if test='${productimages.products != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="products.productid.title"/>:
						</td>
						<td>
							${productimages.products.productId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.producttitle.title"/>:
						</td>
						<td>
							${productimages.products.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.salesprice.title"/>:
						</td>
						<td>
							${productimages.products.salesPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.costprice.title"/>:
						</td>
						<td>
							${productimages.products.costPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.discountprice.title"/>:
						</td>
						<td>
							${productimages.products.discountPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.percentagediscount.title"/>:
						</td>
						<td>
							${productimages.products.percentageDiscount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productimages.products.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdby.title"/>:
						</td>
						<td>
							${productimages.products.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productimages.products.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedby.title"/>:
						</td>
						<td>
							${productimages.products.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.status.title"/>:
						</td>
						<td>
							${productimages.products.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.quantity.title"/>:
						</td>
						<td>
							${productimages.products.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductImagesProducts?productimages_productImageId=${productimages.productImageId}&products_productId=${productimages.products.productId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductImagesProducts?productimages_productImageId=${productimages.productImageId}&related_products_productId=${productimages.products.productId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${productimages.products == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductImagesProducts?productimages_productImageId=${productimages.productImageId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="cartitems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductImagesCartItemses?productimages_productImageId=${productimages.productImageId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="cartitems.title"/></span></a></div>
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
					<c:forEach items="${productimages.cartItemses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductImagesCartItemses?productimages_productImageId=${productimages.productImageId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductImagesCartItemses?productimages_productImageId=${productimages.productImageId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductImagesCartItemses?productimages_productImageId=${productimages.productImageId}&related_cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/delete.gif" /></a>
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