<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.indcities-resources"/>
<html>
<head>
<title>View <fmt:message key="indcities.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="indcities.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexIndCities"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.cityid.title"/>:
						</td>
						<td>
							${indcities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.cityname.title"/>:
						</td>
						<td>
							${indcities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.cityabbr.title"/>:
						</td>
						<td>
							${indcities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indcities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.createdby.title"/>:
						</td>
						<td>
							${indcities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indcities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="indcities.modifiedby.title"/>:
						</td>
						<td>
							${indcities.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="inddistrict.title"/></h1>
					
						<c:if test='${indcities.indDistrict != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtid.title"/>:
						</td>
						<td>
							${indcities.indDistrict.districtId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtname.title"/>:
						</td>
						<td>
							${indcities.indDistrict.districtName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtabbr.title"/>:
						</td>
						<td>
							${indcities.indDistrict.districtAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdby.title"/>:
						</td>
						<td>
							${indcities.indDistrict.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indcities.indDistrict.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indcities.indDistrict.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedby.title"/>:
						</td>
						<td>
							${indcities.indDistrict.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editIndCitiesIndDistrict?indcities_cityId=${indcities.cityId}&inddistrict_districtId=${indcities.indDistrict.districtId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteIndCitiesIndDistrict?indcities_cityId=${indcities.cityId}&related_inddistrict_districtId=${indcities.indDistrict.districtId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${indcities.indDistrict == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newIndCitiesIndDistrict?indcities_cityId=${indcities.cityId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="inddistrict.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indstates.title"/></h1>
					
						<c:if test='${indcities.indStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateid.title"/>:
						</td>
						<td>
							${indcities.indStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.statename.title"/>:
						</td>
						<td>
							${indcities.indStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateabbr.title"/>:
						</td>
						<td>
							${indcities.indStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdby.title"/>:
						</td>
						<td>
							${indcities.indStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indcities.indStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${indcities.indStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedby.title"/>:
						</td>
						<td>
							${indcities.indStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editIndCitiesIndStates?indcities_cityId=${indcities.cityId}&indstates_stateId=${indcities.indStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteIndCitiesIndStates?indcities_cityId=${indcities.cityId}&related_indstates_stateId=${indcities.indStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${indcities.indStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newIndCitiesIndStates?indcities_cityId=${indcities.cityId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendorlocations.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newIndCitiesVendorLocationses?indcities_cityId=${indcities.cityId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorlocations.title"/></span></a></div>
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
					<c:forEach items="${indcities.vendorLocationses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectIndCitiesVendorLocationses?indcities_cityId=${indcities.cityId}&vendorlocationses_locationId=${current.locationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editIndCitiesVendorLocationses?indcities_cityId=${indcities.cityId}&vendorlocationses_locationId=${current.locationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteIndCitiesVendorLocationses?indcities_cityId=${indcities.cityId}&related_vendorlocationses_locationId=${current.locationId}&"><img src="images/icons/delete.gif" /></a>
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
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="recipientlocation.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newIndCitiesRecipientLocations?indcities_cityId=${indcities.cityId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="recipientlocation.title"/></span></a></div>
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
					<c:forEach items="${indcities.recipientLocations}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectIndCitiesRecipientLocations?indcities_cityId=${indcities.cityId}&recipientlocations_recipientLocationId=${current.recipientLocationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editIndCitiesRecipientLocations?indcities_cityId=${indcities.cityId}&recipientlocations_recipientLocationId=${current.recipientLocationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteIndCitiesRecipientLocations?indcities_cityId=${indcities.cityId}&related_recipientlocations_recipientLocationId=${current.recipientLocationId}&"><img src="images/icons/delete.gif" /></a>
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
			<h1><fmt:message key="vendororganizations.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newIndCitiesVendorOrganizationses?indcities_cityId=${indcities.cityId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendororganizations.title"/></span></a></div>
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
					<c:forEach items="${indcities.vendorOrganizationses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectIndCitiesVendorOrganizationses?indcities_cityId=${indcities.cityId}&vendororganizationses_organizationId=${current.organizationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editIndCitiesVendorOrganizationses?indcities_cityId=${indcities.cityId}&vendororganizationses_organizationId=${current.organizationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteIndCitiesVendorOrganizationses?indcities_cityId=${indcities.cityId}&related_vendororganizationses_organizationId=${current.organizationId}&"><img src="images/icons/delete.gif" /></a>
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
			<h1><fmt:message key="customerprofile.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newIndCitiesCustomerProfiles?indcities_cityId=${indcities.cityId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="customerprofile.title"/></span></a></div>
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
					<c:forEach items="${indcities.customerProfiles}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectIndCitiesCustomerProfiles?indcities_cityId=${indcities.cityId}&customerprofiles_customerId=${current.customerId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editIndCitiesCustomerProfiles?indcities_cityId=${indcities.cityId}&customerprofiles_customerId=${current.customerId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteIndCitiesCustomerProfiles?indcities_cityId=${indcities.cityId}&related_customerprofiles_customerId=${current.customerId}&"><img src="images/icons/delete.gif" /></a>
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>