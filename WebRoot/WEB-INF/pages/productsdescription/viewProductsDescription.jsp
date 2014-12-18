<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productsdescription-resources"/>
<html>
<head>
<title>View <fmt:message key="productsdescription.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="productsdescription.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProductsDescription"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdescriptionid.title"/>:
						</td>
						<td>
							${productsdescription.productDescriptionId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productprimarydescription.title"/>:
						</td>
						<td>
							${productsdescription.productPrimaryDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription1.title"/>:
						</td>
						<td>
							${productsdescription.productSecondaryDescription1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription2.title"/>:
						</td>
						<td>
							${productsdescription.productSecondaryDescription2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription3.title"/>:
						</td>
						<td>
							${productsdescription.productSecondaryDescription3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription4.title"/>:
						</td>
						<td>
							${productsdescription.productSecondaryDescription4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription5.title"/>:
						</td>
						<td>
							${productsdescription.productSecondaryDescription5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productcolor.title"/>:
						</td>
						<td>
							${productsdescription.productColor}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdimensionlength.title"/>:
						</td>
						<td>
							${productsdescription.productDimensionLength}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdimensionbreadth.title"/>:
						</td>
						<td>
							${productsdescription.productDimensionBreadth}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdimensionheight.title"/>:
						</td>
						<td>
							${productsdescription.productDimensionHeight}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productweight.title"/>:
						</td>
						<td>
							${productsdescription.productWeight}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productnumber.title"/>:
						</td>
						<td>
							${productsdescription.productNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productmodelnumber.title"/>:
						</td>
						<td>
							${productsdescription.productModelNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productorigin.title"/>:
						</td>
						<td>
							${productsdescription.productOrigin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.createdby.title"/>:
						</td>
						<td>
							${productsdescription.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsdescription.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.modifiedby.title"/>:
						</td>
						<td>
							${productsdescription.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsdescription.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="products.title"/></h1>
					
						<c:if test='${productsdescription.products != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="products.productid.title"/>:
						</td>
						<td>
							${productsdescription.products.productId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.producttitle.title"/>:
						</td>
						<td>
							${productsdescription.products.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.salesprice.title"/>:
						</td>
						<td>
							${productsdescription.products.salesPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.costprice.title"/>:
						</td>
						<td>
							${productsdescription.products.costPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.discountprice.title"/>:
						</td>
						<td>
							${productsdescription.products.discountPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.percentagediscount.title"/>:
						</td>
						<td>
							${productsdescription.products.percentageDiscount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsdescription.products.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdby.title"/>:
						</td>
						<td>
							${productsdescription.products.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsdescription.products.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedby.title"/>:
						</td>
						<td>
							${productsdescription.products.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.status.title"/>:
						</td>
						<td>
							${productsdescription.products.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.quantity.title"/>:
						</td>
						<td>
							${productsdescription.products.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsDescriptionProducts?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&products_productId=${productsdescription.products.productId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsDescriptionProducts?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&related_products_productId=${productsdescription.products.productId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${productsdescription.products == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsDescriptionProducts?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="cartitems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsDescriptionCartItemses?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="cartitems.title"/></span></a></div>
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
					<c:forEach items="${productsdescription.cartItemses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsDescriptionCartItemses?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsDescriptionCartItemses?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsDescriptionCartItemses?productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&related_cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/delete.gif" /></a>
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