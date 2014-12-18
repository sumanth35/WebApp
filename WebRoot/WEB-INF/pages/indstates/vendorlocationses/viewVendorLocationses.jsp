<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.indstates-resources"/>
<html>
<head>
<title>View <fmt:message key="indstates.title"/> <fmt:message key="vendorlocations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="vendorlocations.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectIndStates?stateIdKey=${indstates_stateId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationid.title"/>:
						</td>
						<td>
							${vendorlocations.locationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationname.title"/>:
						</td>
						<td>
							${vendorlocations.locationName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminfirstname.title"/>:
						</td>
						<td>
							${vendorlocations.locationAdminFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminmiddlename.title"/>:
						</td>
						<td>
							${vendorlocations.locationAdminMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminlastname.title"/>:
						</td>
						<td>
							${vendorlocations.locationAdminLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminsuffix.title"/>:
						</td>
						<td>
							${vendorlocations.locationAdminSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.status.title"/>:
						</td>
						<td>
							${vendorlocations.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.phone1.title"/>:
						</td>
						<td>
							${vendorlocations.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.phone2.title"/>:
						</td>
						<td>
							${vendorlocations.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.fax.title"/>:
						</td>
						<td>
							${vendorlocations.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.email.title"/>:
						</td>
						<td>
							${vendorlocations.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.addressline1.title"/>:
						</td>
						<td>
							${vendorlocations.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.addressline2.title"/>:
						</td>
						<td>
							${vendorlocations.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.addressline3.title"/>:
						</td>
						<td>
							${vendorlocations.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.zipcode5.title"/>:
						</td>
						<td>
							${vendorlocations.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.zipcode4.title"/>:
						</td>
						<td>
							${vendorlocations.zipCode4}
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
