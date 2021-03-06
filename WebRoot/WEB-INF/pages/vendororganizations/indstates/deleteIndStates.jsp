<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendororganizations-resources"/>
<html>
<head>
<title>View <fmt:message key="vendororganizations.title"/> <fmt:message key="indstates.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="indstates.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectVendorOrganizations?organizationIdKey=${vendororganizations_organizationId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.stateid.title"/>:
						</td>
						<td>
							${indstates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.statename.title"/>:
						</td>
						<td>
							${indstates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.stateabbr.title"/>:
						</td>
						<td>
							${indstates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.createdby.title"/>:
						</td>
						<td>
							${indstates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indstates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indstates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indstates.modifiedby.title"/>:
						</td>
						<td>
							${indstates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteVendorOrganizationsIndStates?vendororganizations_organizationId=${vendororganizations_organizationId}&related_indstates_stateId=${indstates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
