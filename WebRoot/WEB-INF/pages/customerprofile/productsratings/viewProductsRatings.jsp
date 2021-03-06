<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.customerprofile-resources"/>
<html>
<head>
<title>View <fmt:message key="customerprofile.title"/> <fmt:message key="productsrating.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="productsrating.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectCustomerProfile?customerIdKey=${customerprofile_customerId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
