<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.cartitems-resources"/>
<html>
<head>
<title>View <fmt:message key="cartitems.title"/> <fmt:message key="productsdescription.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="productsdescription.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectCartItems?cartItemIdKey=${cartitems_cartItemId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteCartItemsProductsDescription?cartitems_cartItemId=${cartitems_cartItemId}&related_productsdescription_productDescriptionId=${productsdescription.productDescriptionId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
