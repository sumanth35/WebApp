<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorprofile-resources"/>
<html>
<head>
<title>View <fmt:message key="vendorprofile.title"/> <fmt:message key="vendorlocationassociations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="vendorlocationassociations.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectVendorProfile?registrationIdKey=${vendorprofile_registrationId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.vendorlocationassociationid.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorLocationAssociationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.locationid.title"/>:
						</td>
						<td>
							${vendorlocationassociations.locationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.createdby.title"/>:
						</td>
						<td>
							${vendorlocationassociations.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocationassociations.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocationassociations.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocationassociations.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteVendorProfileVendorLocationAssociationses?vendorprofile_registrationId=${vendorprofile_registrationId}&related_vendorlocationassociationses_vendorLocationAssociationId=${vendorlocationassociations.vendorLocationAssociationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
