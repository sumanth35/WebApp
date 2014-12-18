<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorlocations-resources"/>
<html>
<head>
<title>View <fmt:message key="vendorlocations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="vendorlocations.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexVendorLocations"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscounties.title"/></h1>
					
						<c:if test='${vendorlocations.usCounties != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyid.title"/>:
						</td>
						<td>
							${vendorlocations.usCounties.countyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyname.title"/>:
						</td>
						<td>
							${vendorlocations.usCounties.countyName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyabbr.title"/>:
						</td>
						<td>
							${vendorlocations.usCounties.countyAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.usCounties.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.usCounties.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.usCounties.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.usCounties.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationsUsCounties?vendorlocations_locationId=${vendorlocations.locationId}&uscounties_countyId=${vendorlocations.usCounties.countyId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsUsCounties?vendorlocations_locationId=${vendorlocations.locationId}&related_uscounties_countyId=${vendorlocations.usCounties.countyId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocations.usCounties == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsUsCounties?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscounties.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="usstates.title"/></h1>
					
						<c:if test='${vendorlocations.usStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateid.title"/>:
						</td>
						<td>
							${vendorlocations.usStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.statename.title"/>:
						</td>
						<td>
							${vendorlocations.usStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateabbr.title"/>:
						</td>
						<td>
							${vendorlocations.usStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.usStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.usStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.usStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.usStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationsUsStates?vendorlocations_locationId=${vendorlocations.locationId}&usstates_stateId=${vendorlocations.usStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsUsStates?vendorlocations_locationId=${vendorlocations.locationId}&related_usstates_stateId=${vendorlocations.usStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocations.usStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsUsStates?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscities.title"/></h1>
					
						<c:if test='${vendorlocations.usCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityid.title"/>:
						</td>
						<td>
							${vendorlocations.usCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityname.title"/>:
						</td>
						<td>
							${vendorlocations.usCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityabbr.title"/>:
						</td>
						<td>
							${vendorlocations.usCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.usCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.usCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.usCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.usCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationsUsCities?vendorlocations_locationId=${vendorlocations.locationId}&uscities_cityId=${vendorlocations.usCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsUsCities?vendorlocations_locationId=${vendorlocations.locationId}&related_uscities_cityId=${vendorlocations.usCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocations.usCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsUsCities?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indcities.title"/></h1>
					
						<c:if test='${vendorlocations.indCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityid.title"/>:
						</td>
						<td>
							${vendorlocations.indCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityname.title"/>:
						</td>
						<td>
							${vendorlocations.indCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityabbr.title"/>:
						</td>
						<td>
							${vendorlocations.indCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.indCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.indCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.indCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.indCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationsIndCities?vendorlocations_locationId=${vendorlocations.locationId}&indcities_cityId=${vendorlocations.indCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsIndCities?vendorlocations_locationId=${vendorlocations.locationId}&related_indcities_cityId=${vendorlocations.indCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocations.indCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsIndCities?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indcities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indstates.title"/></h1>
					
						<c:if test='${vendorlocations.indStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateid.title"/>:
						</td>
						<td>
							${vendorlocations.indStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.statename.title"/>:
						</td>
						<td>
							${vendorlocations.indStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateabbr.title"/>:
						</td>
						<td>
							${vendorlocations.indStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.indStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.indStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.indStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.indStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationsIndStates?vendorlocations_locationId=${vendorlocations.locationId}&indstates_stateId=${vendorlocations.indStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsIndStates?vendorlocations_locationId=${vendorlocations.locationId}&related_indstates_stateId=${vendorlocations.indStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocations.indStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsIndStates?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="inddistrict.title"/></h1>
					
						<c:if test='${vendorlocations.indDistrict != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtid.title"/>:
						</td>
						<td>
							${vendorlocations.indDistrict.districtId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtname.title"/>:
						</td>
						<td>
							${vendorlocations.indDistrict.districtName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtabbr.title"/>:
						</td>
						<td>
							${vendorlocations.indDistrict.districtAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdby.title"/>:
						</td>
						<td>
							${vendorlocations.indDistrict.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.indDistrict.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorlocations.indDistrict.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedby.title"/>:
						</td>
						<td>
							${vendorlocations.indDistrict.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorLocationsIndDistrict?vendorlocations_locationId=${vendorlocations.locationId}&inddistrict_districtId=${vendorlocations.indDistrict.districtId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsIndDistrict?vendorlocations_locationId=${vendorlocations.locationId}&related_inddistrict_districtId=${vendorlocations.indDistrict.districtId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorlocations.indDistrict == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsIndDistrict?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="inddistrict.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="products.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsProductses?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="products.productid.title"/></th>
						<th class="thead"><fmt:message key="products.producttitle.title"/></th>
						<th class="thead"><fmt:message key="products.salesprice.title"/></th>
						<th class="thead"><fmt:message key="products.costprice.title"/></th>
						<th class="thead"><fmt:message key="products.discountprice.title"/></th>
						<th class="thead"><fmt:message key="products.percentagediscount.title"/></th>
						<th class="thead"><fmt:message key="products.createdon.title"/></th>
						<th class="thead"><fmt:message key="products.createdby.title"/></th>
						<th class="thead"><fmt:message key="products.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="products.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="products.status.title"/></th>
						<th class="thead"><fmt:message key="products.quantity.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vendorlocations.productses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorLocationsProductses?vendorlocations_locationId=${vendorlocations.locationId}&productses_productId=${current.productId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorLocationsProductses?vendorlocations_locationId=${vendorlocations.locationId}&productses_productId=${current.productId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsProductses?vendorlocations_locationId=${vendorlocations.locationId}&related_productses_productId=${current.productId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productId}
						&nbsp;
						</td>
						<td>
							${current.productTitle}
						&nbsp;
						</td>
						<td>
							${current.salesPrice}
						&nbsp;
						</td>
						<td>
							${current.costPrice}
						&nbsp;
						</td>
						<td>
							${current.discountPrice}
						&nbsp;
						</td>
						<td>
							${current.percentageDiscount}
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
							${current.status}
						&nbsp;
						</td>
						<td>
							${current.quantity}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="cartitems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocationsCartItemses?vendorlocations_locationId=${vendorlocations.locationId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="cartitems.title"/></span></a></div>
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
					<c:forEach items="${vendorlocations.cartItemses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorLocationsCartItemses?vendorlocations_locationId=${vendorlocations.locationId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorLocationsCartItemses?vendorlocations_locationId=${vendorlocations.locationId}&cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorLocationsCartItemses?vendorlocations_locationId=${vendorlocations.locationId}&related_cartitemses_cartItemId=${current.cartItemId}&"><img src="images/icons/delete.gif" /></a>
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