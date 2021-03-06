<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.cartitems-resources"/>
<html>
<head>
<title>View <fmt:message key="cartitems.title"/> <fmt:message key="productimages.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="productimages.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectCartItems?cartItemIdKey=${cartitems_cartItemId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
