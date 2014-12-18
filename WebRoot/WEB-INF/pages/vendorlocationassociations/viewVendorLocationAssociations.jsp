<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorlocationassociations-resources"/>
<html>
<head>
<title>View <fmt:message key="vendorlocationassociations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="vendorlocationassociations.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexVendorLocationAssociations"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendorprofile.title"/></h1>
					
						<c:if test='${vendorlocationassociations.vendorProfile != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.registrationid.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.registrationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.registrationname.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.registrationName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.registrationemail.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.registrationEmail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.firstname.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.middlename.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.middleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.lastname.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.namesuffix.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.nameSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.nametitle.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.nameTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.phone1.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.phone2.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.fax1.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.fax1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.fax2.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.fax2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.profilestatus.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.profileStatus}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.inactivityduration.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.inactivityDuration}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.lastsucesslogin.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocationassociations.vendorProfile.lastSucessLogin.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.educationdegree.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.educationDegree}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.createdby.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocationassociations.vendorProfile.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocationassociations.vendorProfile.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="vendorprofile.vendorpassword.title"/>:
						</td>
						<td>
							${vendorlocationassociations.vendorProfile.vendorPassword}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationAssociationsVendorProfile?vendorlocationassociations_vendorLocationAssociationId=${vendorlocationassociations.vendorLocationAssociationId}&vendorprofile_registrationId=${vendorlocationassociations.vendorProfile.registrationId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationAssociationsVendorProfile?vendorlocationassociations_vendorLocationAssociationId=${vendorlocationassociations.vendorLocationAssociationId}&related_vendorprofile_registrationId=${vendorlocationassociations.vendorProfile.registrationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocationassociations.vendorProfile == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationAssociationsVendorProfile?vendorlocationassociations_vendorLocationAssociationId=${vendorlocationassociations.vendorLocationAssociationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorprofile.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>