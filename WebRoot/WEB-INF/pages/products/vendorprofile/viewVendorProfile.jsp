<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.products-resources"/>
<html>
<head>
<title>View <fmt:message key="products.title"/> <fmt:message key="vendorprofile.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="vendorprofile.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectProducts?productIdKey=${products_productId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.registrationid.title"/>:
						</td>
						<td>
							${vendorprofile.registrationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.registrationname.title"/>:
						</td>
						<td>
							${vendorprofile.registrationName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.registrationemail.title"/>:
						</td>
						<td>
							${vendorprofile.registrationEmail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.firstname.title"/>:
						</td>
						<td>
							${vendorprofile.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.middlename.title"/>:
						</td>
						<td>
							${vendorprofile.middleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.lastname.title"/>:
						</td>
						<td>
							${vendorprofile.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.namesuffix.title"/>:
						</td>
						<td>
							${vendorprofile.nameSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.nametitle.title"/>:
						</td>
						<td>
							${vendorprofile.nameTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.phone1.title"/>:
						</td>
						<td>
							${vendorprofile.phone1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.phone2.title"/>:
						</td>
						<td>
							${vendorprofile.phone2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.fax1.title"/>:
						</td>
						<td>
							${vendorprofile.fax1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.fax2.title"/>:
						</td>
						<td>
							${vendorprofile.fax2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.profilestatus.title"/>:
						</td>
						<td>
							${vendorprofile.profileStatus}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.inactivityduration.title"/>:
						</td>
						<td>
							${vendorprofile.inactivityDuration}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.lastsucesslogin.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorprofile.lastSucessLogin.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.educationdegree.title"/>:
						</td>
						<td>
							${vendorprofile.educationDegree}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.createdby.title"/>:
						</td>
						<td>
							${vendorprofile.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorprofile.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.modifiedby.title"/>:
						</td>
						<td>
							${vendorprofile.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorprofile.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.vendorpassword.title"/>:
						</td>
						<td>
							${vendorprofile.vendorPassword}
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
