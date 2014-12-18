<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.uscounties-resources"/>
<html>
<head>
<title>View <fmt:message key="uscounties.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="uscounties.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexUsCounties"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.countyid.title"/>:
						</td>
						<td>
							${uscounties.countyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.countyname.title"/>:
						</td>
						<td>
							${uscounties.countyName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.countyabbr.title"/>:
						</td>
						<td>
							${uscounties.countyAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${uscounties.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.createdby.title"/>:
						</td>
						<td>
							${uscounties.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${uscounties.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="uscounties.modifiedby.title"/>:
						</td>
						<td>
							${uscounties.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="usstates.title"/></h1>
					
						<c:if test='${uscounties.usStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateid.title"/>:
						</td>
						<td>
							${uscounties.usStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.statename.title"/>:
						</td>
						<td>
							${uscounties.usStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateabbr.title"/>:
						</td>
						<td>
							${uscounties.usStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdby.title"/>:
						</td>
						<td>
							${uscounties.usStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${uscounties.usStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${uscounties.usStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedby.title"/>:
						</td>
						<td>
							${uscounties.usStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editUsCountiesUsStates?uscounties_countyId=${uscounties.countyId}&usstates_stateId=${uscounties.usStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteUsCountiesUsStates?uscounties_countyId=${uscounties.countyId}&related_usstates_stateId=${uscounties.usStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${uscounties.usStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsCountiesUsStates?uscounties_countyId=${uscounties.countyId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendororganizations.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsCountiesVendorOrganizationses?uscounties_countyId=${uscounties.countyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendororganizations.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="vendororganizations.organizationid.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.organizationbusinessname.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.organizationtypeid.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.contactpersonfirstname.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.contactpersonmiddlename.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.contactpersonlastname.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.contactpersonsuffix.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.phone1.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.phone2.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.fax.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.email.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.addressline1.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.addressline2.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.addressline3.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.status.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.zipcode5.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.createdon.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.createdby.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="vendororganizations.zipcode4.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${uscounties.vendorOrganizationses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsCountiesVendorOrganizationses?uscounties_countyId=${uscounties.countyId}&vendororganizationses_organizationId=${current.organizationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsCountiesVendorOrganizationses?uscounties_countyId=${uscounties.countyId}&vendororganizationses_organizationId=${current.organizationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsCountiesVendorOrganizationses?uscounties_countyId=${uscounties.countyId}&related_vendororganizationses_organizationId=${current.organizationId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.organizationId}
						&nbsp;
						</td>
						<td>
							${current.organizationBusinessName}
						&nbsp;
						</td>
						<td>
							${current.organizationTypeId}
						&nbsp;
						</td>
						<td>
							${current.contactPersonFirstName}
						&nbsp;
						</td>
						<td>
							${current.contactPersonMiddleName}
						&nbsp;
						</td>
						<td>
							${current.contactPersonLastName}
						&nbsp;
						</td>
						<td>
							${current.contactPersonSuffix}
						&nbsp;
						</td>
						<td>
							${current.phone1}
						&nbsp;
						</td>
						<td>
							${current.phone2}
						&nbsp;
						</td>
						<td>
							${current.fax}
						&nbsp;
						</td>
						<td>
							${current.email}
						&nbsp;
						</td>
						<td>
							${current.addressLine1}
						&nbsp;
						</td>
						<td>
							${current.addressLine2}
						&nbsp;
						</td>
						<td>
							${current.addressLine3}
						&nbsp;
						</td>
						<td>
							${current.status}
						&nbsp;
						</td>
						<td>
							${current.zipCode5}
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
						<td>
							${current.zipCode4}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscities.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsCountiesUsCitieses?uscounties_countyId=${uscounties.countyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscities.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="uscities.cityid.title"/></th>
						<th class="thead"><fmt:message key="uscities.cityname.title"/></th>
						<th class="thead"><fmt:message key="uscities.cityabbr.title"/></th>
						<th class="thead"><fmt:message key="uscities.createdby.title"/></th>
						<th class="thead"><fmt:message key="uscities.createdon.title"/></th>
						<th class="thead"><fmt:message key="uscities.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="uscities.modifiedon.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${uscounties.usCitieses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsCountiesUsCitieses?uscounties_countyId=${uscounties.countyId}&uscitieses_cityId=${current.cityId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsCountiesUsCitieses?uscounties_countyId=${uscounties.countyId}&uscitieses_cityId=${current.cityId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsCountiesUsCitieses?uscounties_countyId=${uscounties.countyId}&related_uscitieses_cityId=${current.cityId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.cityId}
						&nbsp;
						</td>
						<td>
							${current.cityName}
						&nbsp;
						</td>
						<td>
							${current.cityAbbr}
						&nbsp;
						</td>
						<td>
							${current.createdBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.modifiedBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="customerprofile.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsCountiesCustomerProfiles?uscounties_countyId=${uscounties.countyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="customerprofile.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="customerprofile.customerid.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.customername.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.customerpassword.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.customeremail.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.profilestatus.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.phone1.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.phone2.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.firstname.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.lastname.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.middlename.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.namesuffix.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.nametitle.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.lastsuccesslogin.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.visits.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.createdip.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.addressline1.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.addressline2.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.addressline3.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.zipcode5.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.zipcode4.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.lastloginip.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.createdon.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.createdby.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="customerprofile.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${uscounties.customerProfiles}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsCountiesCustomerProfiles?uscounties_countyId=${uscounties.countyId}&customerprofiles_customerId=${current.customerId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsCountiesCustomerProfiles?uscounties_countyId=${uscounties.countyId}&customerprofiles_customerId=${current.customerId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsCountiesCustomerProfiles?uscounties_countyId=${uscounties.countyId}&related_customerprofiles_customerId=${current.customerId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.customerId}
						&nbsp;
						</td>
						<td>
							${current.customerName}
						&nbsp;
						</td>
						<td>
							${current.customerPassword}
						&nbsp;
						</td>
						<td>
							${current.customerEmail}
						&nbsp;
						</td>
						<td>
							${current.profileStatus}
						&nbsp;
						</td>
						<td>
							${current.phone1}
						&nbsp;
						</td>
						<td>
							${current.phone2}
						&nbsp;
						</td>
						<td>
							${current.firstName}
						&nbsp;
						</td>
						<td>
							${current.lastName}
						&nbsp;
						</td>
						<td>
							${current.middleName}
						&nbsp;
						</td>
						<td>
							${current.nameSuffix}
						&nbsp;
						</td>
						<td>
							${current.nameTitle}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.lastSuccessLogin.time}"/>
						&nbsp;
						</td>
						<td>
							${current.visits}
						&nbsp;
						</td>
						<td>
							${current.createdIp}
						&nbsp;
						</td>
						<td>
							${current.addressLine1}
						&nbsp;
						</td>
						<td>
							${current.addressLine2}
						&nbsp;
						</td>
						<td>
							${current.addressLine3}
						&nbsp;
						</td>
						<td>
							${current.zipCode5}
						&nbsp;
						</td>
						<td>
							${current.zipCode4}
						&nbsp;
						</td>
						<td>
							${current.lastLoginIp}
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
			<h1><fmt:message key="recipientlocation.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsCountiesRecipientLocations?uscounties_countyId=${uscounties.countyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="recipientlocation.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="recipientlocation.recipientlocationid.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.recipientfirstname.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.recipientmiddlename.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.recipientlastname.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.recipientsuffix.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.recipienttitle.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.addressline1.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.addressline2.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.addressline3.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.email.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.contactnumber.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.fax.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.zipcode5.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.zipcode4.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.createdon.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.createdby.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="recipientlocation.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${uscounties.recipientLocations}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsCountiesRecipientLocations?uscounties_countyId=${uscounties.countyId}&recipientlocations_recipientLocationId=${current.recipientLocationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsCountiesRecipientLocations?uscounties_countyId=${uscounties.countyId}&recipientlocations_recipientLocationId=${current.recipientLocationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsCountiesRecipientLocations?uscounties_countyId=${uscounties.countyId}&related_recipientlocations_recipientLocationId=${current.recipientLocationId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.recipientLocationId}
						&nbsp;
						</td>
						<td>
							${current.recipientFirstName}
						&nbsp;
						</td>
						<td>
							${current.recipientMiddleName}
						&nbsp;
						</td>
						<td>
							${current.recipientLastName}
						&nbsp;
						</td>
						<td>
							${current.recipientSuffix}
						&nbsp;
						</td>
						<td>
							${current.recipientTitle}
						&nbsp;
						</td>
						<td>
							${current.addressLine1}
						&nbsp;
						</td>
						<td>
							${current.addressLine2}
						&nbsp;
						</td>
						<td>
							${current.addressLine3}
						&nbsp;
						</td>
						<td>
							${current.email}
						&nbsp;
						</td>
						<td>
							${current.contactNumber}
						&nbsp;
						</td>
						<td>
							${current.fax}
						&nbsp;
						</td>
						<td>
							${current.zipCode5}
						&nbsp;
						</td>
						<td>
							${current.zipCode4}
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
			<h1><fmt:message key="vendorlocations.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsCountiesVendorLocationses?uscounties_countyId=${uscounties.countyId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorlocations.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="vendorlocations.locationid.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.locationname.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.locationadminfirstname.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.locationadminmiddlename.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.locationadminlastname.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.locationadminsuffix.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.status.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.phone1.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.phone2.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.fax.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.email.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.addressline1.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.addressline2.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.addressline3.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.zipcode5.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.createdby.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.createdon.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="vendorlocations.zipcode4.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${uscounties.vendorLocationses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsCountiesVendorLocationses?uscounties_countyId=${uscounties.countyId}&vendorlocationses_locationId=${current.locationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsCountiesVendorLocationses?uscounties_countyId=${uscounties.countyId}&vendorlocationses_locationId=${current.locationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsCountiesVendorLocationses?uscounties_countyId=${uscounties.countyId}&related_vendorlocationses_locationId=${current.locationId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.locationId}
						&nbsp;
						</td>
						<td>
							${current.locationName}
						&nbsp;
						</td>
						<td>
							${current.locationAdminFirstName}
						&nbsp;
						</td>
						<td>
							${current.locationAdminMiddleName}
						&nbsp;
						</td>
						<td>
							${current.locationAdminLastName}
						&nbsp;
						</td>
						<td>
							${current.locationAdminSuffix}
						&nbsp;
						</td>
						<td>
							${current.status}
						&nbsp;
						</td>
						<td>
							${current.phone1}
						&nbsp;
						</td>
						<td>
							${current.phone2}
						&nbsp;
						</td>
						<td>
							${current.fax}
						&nbsp;
						</td>
						<td>
							${current.email}
						&nbsp;
						</td>
						<td>
							${current.addressLine1}
						&nbsp;
						</td>
						<td>
							${current.addressLine2}
						&nbsp;
						</td>
						<td>
							${current.addressLine3}
						&nbsp;
						</td>
						<td>
							${current.zipCode5}
						&nbsp;
						</td>
						<td>
							${current.createdBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.modifiedBy}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
						</td>
						<td>
							${current.zipCode4}
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