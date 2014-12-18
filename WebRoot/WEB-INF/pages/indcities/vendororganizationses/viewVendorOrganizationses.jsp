<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.indcities-resources"/>
<html>
<head>
<title>View <fmt:message key="indcities.title"/> <fmt:message key="vendororganizations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="vendororganizations.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectIndCities?cityIdKey=${indcities_cityId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.organizationid.title"/>:
						</td>
						<td>
							${vendororganizations.organizationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.organizationbusinessname.title"/>:
						</td>
						<td>
							${vendororganizations.organizationBusinessName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.organizationtypeid.title"/>:
						</td>
						<td>
							${vendororganizations.organizationTypeId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonfirstname.title"/>:
						</td>
						<td>
							${vendororganizations.contactPersonFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonmiddlename.title"/>:
						</td>
						<td>
							${vendororganizations.contactPersonMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonlastname.title"/>:
						</td>
						<td>
							${vendororganizations.contactPersonLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonsuffix.title"/>:
						</td>
						<td>
							${vendororganizations.contactPersonSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.phone1.title"/>:
						</td>
						<td>
							${vendororganizations.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.phone2.title"/>:
						</td>
						<td>
							${vendororganizations.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.fax.title"/>:
						</td>
						<td>
							${vendororganizations.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.email.title"/>:
						</td>
						<td>
							${vendororganizations.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.addressline1.title"/>:
						</td>
						<td>
							${vendororganizations.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.addressline2.title"/>:
						</td>
						<td>
							${vendororganizations.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.addressline3.title"/>:
						</td>
						<td>
							${vendororganizations.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.status.title"/>:
						</td>
						<td>
							${vendororganizations.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.zipcode5.title"/>:
						</td>
						<td>
							${vendororganizations.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.zipcode4.title"/>:
						</td>
						<td>
							${vendororganizations.zipCode4}
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
