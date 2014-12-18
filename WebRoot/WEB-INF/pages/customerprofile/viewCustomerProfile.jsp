<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.customerprofile-resources"/>
<html>
<head>
<title>View <fmt:message key="customerprofile.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="customerprofile.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCustomerProfile"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscounties.title"/></h1>
					
						<c:if test='${customerprofile.usCounties != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyid.title"/>:
						</td>
						<td>
							${customerprofile.usCounties.countyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyname.title"/>:
						</td>
						<td>
							${customerprofile.usCounties.countyName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyabbr.title"/>:
						</td>
						<td>
							${customerprofile.usCounties.countyAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.usCounties.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdby.title"/>:
						</td>
						<td>
							${customerprofile.usCounties.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.usCounties.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.usCounties.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileUsCounties?customerprofile_customerId=${customerprofile.customerId}&uscounties_countyId=${customerprofile.usCounties.countyId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileUsCounties?customerprofile_customerId=${customerprofile.customerId}&related_uscounties_countyId=${customerprofile.usCounties.countyId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.usCounties == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileUsCounties?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscounties.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="usstates.title"/></h1>
					
						<c:if test='${customerprofile.usStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateid.title"/>:
						</td>
						<td>
							${customerprofile.usStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.statename.title"/>:
						</td>
						<td>
							${customerprofile.usStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateabbr.title"/>:
						</td>
						<td>
							${customerprofile.usStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdby.title"/>:
						</td>
						<td>
							${customerprofile.usStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.usStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.usStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.usStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileUsStates?customerprofile_customerId=${customerprofile.customerId}&usstates_stateId=${customerprofile.usStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileUsStates?customerprofile_customerId=${customerprofile.customerId}&related_usstates_stateId=${customerprofile.usStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.usStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileUsStates?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="userrole.title"/></h1>
					
						<c:if test='${customerprofile.userRole != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.userroleid.title"/>:
						</td>
						<td>
							${customerprofile.userRole.userRoleId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.userrolename.title"/>:
						</td>
						<td>
							${customerprofile.userRole.userRoleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.userroledescription.title"/>:
						</td>
						<td>
							${customerprofile.userRole.userRoleDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.userRole.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.createdby.title"/>:
						</td>
						<td>
							${customerprofile.userRole.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.userRole.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.userRole.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileUserRole?customerprofile_customerId=${customerprofile.customerId}&userrole_userRoleId=${customerprofile.userRole.userRoleId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileUserRole?customerprofile_customerId=${customerprofile.customerId}&related_userrole_userRoleId=${customerprofile.userRole.userRoleId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.userRole == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileUserRole?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="userrole.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscities.title"/></h1>
					
						<c:if test='${customerprofile.usCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityid.title"/>:
						</td>
						<td>
							${customerprofile.usCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityname.title"/>:
						</td>
						<td>
							${customerprofile.usCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityabbr.title"/>:
						</td>
						<td>
							${customerprofile.usCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdby.title"/>:
						</td>
						<td>
							${customerprofile.usCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.usCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.usCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.usCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileUsCities?customerprofile_customerId=${customerprofile.customerId}&uscities_cityId=${customerprofile.usCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileUsCities?customerprofile_customerId=${customerprofile.customerId}&related_uscities_cityId=${customerprofile.usCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.usCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileUsCities?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indcities.title"/></h1>
					
						<c:if test='${customerprofile.indCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityid.title"/>:
						</td>
						<td>
							${customerprofile.indCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityname.title"/>:
						</td>
						<td>
							${customerprofile.indCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityabbr.title"/>:
						</td>
						<td>
							${customerprofile.indCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.indCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdby.title"/>:
						</td>
						<td>
							${customerprofile.indCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.indCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.indCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileIndCities?customerprofile_customerId=${customerprofile.customerId}&indcities_cityId=${customerprofile.indCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileIndCities?customerprofile_customerId=${customerprofile.customerId}&related_indcities_cityId=${customerprofile.indCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.indCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileIndCities?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indcities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indstates.title"/></h1>
					
						<c:if test='${customerprofile.indStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateid.title"/>:
						</td>
						<td>
							${customerprofile.indStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.statename.title"/>:
						</td>
						<td>
							${customerprofile.indStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateabbr.title"/>:
						</td>
						<td>
							${customerprofile.indStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdby.title"/>:
						</td>
						<td>
							${customerprofile.indStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.indStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.indStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.indStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileIndStates?customerprofile_customerId=${customerprofile.customerId}&indstates_stateId=${customerprofile.indStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileIndStates?customerprofile_customerId=${customerprofile.customerId}&related_indstates_stateId=${customerprofile.indStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.indStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileIndStates?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="inddistrict.title"/></h1>
					
						<c:if test='${customerprofile.indDistrict != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtid.title"/>:
						</td>
						<td>
							${customerprofile.indDistrict.districtId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtname.title"/>:
						</td>
						<td>
							${customerprofile.indDistrict.districtName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtabbr.title"/>:
						</td>
						<td>
							${customerprofile.indDistrict.districtAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdby.title"/>:
						</td>
						<td>
							${customerprofile.indDistrict.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.indDistrict.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.indDistrict.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.indDistrict.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileIndDistrict?customerprofile_customerId=${customerprofile.customerId}&inddistrict_districtId=${customerprofile.indDistrict.districtId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileIndDistrict?customerprofile_customerId=${customerprofile.customerId}&related_inddistrict_districtId=${customerprofile.indDistrict.districtId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.indDistrict == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileIndDistrict?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="inddistrict.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="countries.title"/></h1>
					
						<c:if test='${customerprofile.countries != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryid.title"/>:
						</td>
						<td>
							${customerprofile.countries.countryId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryname.title"/>:
						</td>
						<td>
							${customerprofile.countries.countryName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countrycode.title"/>:
						</td>
						<td>
							${customerprofile.countries.countryCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryabbr.title"/>:
						</td>
						<td>
							${customerprofile.countries.countryAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.countries.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.createdby.title"/>:
						</td>
						<td>
							${customerprofile.countries.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${customerprofile.countries.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.modifiedby.title"/>:
						</td>
						<td>
							${customerprofile.countries.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCustomerProfileCountries?customerprofile_customerId=${customerprofile.customerId}&countries_countryId=${customerprofile.countries.countryId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileCountries?customerprofile_customerId=${customerprofile.customerId}&related_countries_countryId=${customerprofile.countries.countryId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${customerprofile.countries == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileCountries?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="countries.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsrating.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileProductsRatings?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsrating.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="productsrating.productratingid.title"/></th>
						<th class="thead"><fmt:message key="productsrating.productrating.title"/></th>
						<th class="thead"><fmt:message key="productsrating.createdon.title"/></th>
						<th class="thead"><fmt:message key="productsrating.createdby.title"/></th>
						<th class="thead"><fmt:message key="productsrating.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="productsrating.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${customerprofile.productsRatings}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCustomerProfileProductsRatings?customerprofile_customerId=${customerprofile.customerId}&productsratings_productRatingId=${current.productRatingId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCustomerProfileProductsRatings?customerprofile_customerId=${customerprofile.customerId}&productsratings_productRatingId=${current.productRatingId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileProductsRatings?customerprofile_customerId=${customerprofile.customerId}&related_productsratings_productRatingId=${current.productRatingId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productRatingId}
						&nbsp;
						</td>
						<td>
							${current.productRating}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.createdBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.modifiedBy}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="cartitems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfileCartItemses?customerprofile_customerId=${customerprofile.customerId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="cartitems.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="cartitems.cartitemid.title"/></th>
						<th class="thead"><fmt:message key="cartitems.producttitle.title"/></th>
						<th class="thead"><fmt:message key="cartitems.productcost.title"/></th>
						<th class="thead"><fmt:message key="cartitems.productquantity.title"/></th>
						<th class="thead"><fmt:message key="cartitems.status.title"/></th>
						<th class="thead"><fmt:message key="cartitems.createdon.title"/></th>
						<th class="thead"><fmt:message key="cartitems.createdby.title"/></th>
						<th class="thead"><fmt:message key="cartitems.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="cartitems.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${customerprofile.cartItemses}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCustomerProfileCartItemses?customerprofile_customerId=${customerprofile.customerId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCustomerProfileCartItemses?customerprofile_customerId=${customerprofile.customerId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfileCartItemses?customerprofile_customerId=${customerprofile.customerId}&related_cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.cartItemId}
						&nbsp;
						</td>
						<td>
							${current.productTitle}
						&nbsp;
						</td>
						<td>
							${current.productCost}
						&nbsp;
						</td>
						<td>
							${current.productQuantity}
						&nbsp;
						</td>
						<td>
							${current.status}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.createdBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.modifiedBy}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>