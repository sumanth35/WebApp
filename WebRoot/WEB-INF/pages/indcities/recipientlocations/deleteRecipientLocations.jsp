<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.indcities-resources"/>
<html>
<head>
<title>View <fmt:message key="indcities.title"/> <fmt:message key="recipientlocation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="recipientlocation.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectIndCities?cityIdKey=${indcities_cityId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientlocationid.title"/>:
						</td>
						<td>
							${recipientlocation.recipientLocationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientfirstname.title"/>:
						</td>
						<td>
							${recipientlocation.recipientFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientmiddlename.title"/>:
						</td>
						<td>
							${recipientlocation.recipientMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientlastname.title"/>:
						</td>
						<td>
							${recipientlocation.recipientLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientsuffix.title"/>:
						</td>
						<td>
							${recipientlocation.recipientSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipienttitle.title"/>:
						</td>
						<td>
							${recipientlocation.recipientTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline1.title"/>:
						</td>
						<td>
							${recipientlocation.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline2.title"/>:
						</td>
						<td>
							${recipientlocation.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline3.title"/>:
						</td>
						<td>
							${recipientlocation.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.email.title"/>:
						</td>
						<td>
							${recipientlocation.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.contactnumber.title"/>:
						</td>
						<td>
							${recipientlocation.contactNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.fax.title"/>:
						</td>
						<td>
							${recipientlocation.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.zipcode5.title"/>:
						</td>
						<td>
							${recipientlocation.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.zipcode4.title"/>:
						</td>
						<td>
							${recipientlocation.zipCode4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteIndCitiesRecipientLocations?indcities_cityId=${indcities_cityId}&related_recipientlocations_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
