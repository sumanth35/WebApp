<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productsrating-resources"/>
<html>
<head>
<title>View <fmt:message key="productsrating.title"/> <fmt:message key="customerprofile.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="customerprofile.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectProductsRating?productRatingIdKey=${productsrating_productRatingId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.customerid.title"/>:
						</td>
						<td>
							${customerprofile.customerId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.customername.title"/>:
						</td>
						<td>
							${customerprofile.customerName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.customerpassword.title"/>:
						</td>
						<td>
							${customerprofile.customerPassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.customeremail.title"/>:
						</td>
						<td>
							${customerprofile.customerEmail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.profilestatus.title"/>:
						</td>
						<td>
							${customerprofile.profileStatus}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.phone1.title"/>:
						</td>
						<td>
							${customerprofile.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.phone2.title"/>:
						</td>
						<td>
							${customerprofile.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.firstname.title"/>:
						</td>
						<td>
							${customerprofile.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.lastname.title"/>:
						</td>
						<td>
							${customerprofile.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.middlename.title"/>:
						</td>
						<td>
							${customerprofile.middleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.namesuffix.title"/>:
						</td>
						<td>
							${customerprofile.nameSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.nametitle.title"/>:
						</td>
						<td>
							${customerprofile.nameTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.lastsuccesslogin.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.lastSuccessLogin.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.visits.title"/>:
						</td>
						<td>
							${customerprofile.visits}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.createdip.title"/>:
						</td>
						<td>
							${customerprofile.createdIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.addressline1.title"/>:
						</td>
						<td>
							${customerprofile.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.addressline2.title"/>:
						</td>
						<td>
							${customerprofile.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.addressline3.title"/>:
						</td>
						<td>
							${customerprofile.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.zipcode5.title"/>:
						</td>
						<td>
							${customerprofile.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.zipcode4.title"/>:
						</td>
						<td>
							${customerprofile.zipCode4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.lastloginip.title"/>:
						</td>
						<td>
							${customerprofile.lastLoginIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.createdby.title"/>:
						</td>
						<td>
							${customerprofile.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customerprofile.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.modifiedBy}
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
