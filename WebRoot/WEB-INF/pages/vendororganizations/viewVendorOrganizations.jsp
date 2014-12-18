<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendororganizations-resources"/>
<html>
<head>
<title>View <fmt:message key="vendororganizations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="vendororganizations.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexVendorOrganizations"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscounties.title"/></h1>
					
						<c:if test='${vendororganizations.usCounties != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyid.title"/>:
						</td>
						<td>
							${vendororganizations.usCounties.countyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyname.title"/>:
						</td>
						<td>
							${vendororganizations.usCounties.countyName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyabbr.title"/>:
						</td>
						<td>
							${vendororganizations.usCounties.countyAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.usCounties.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.usCounties.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.usCounties.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.usCounties.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsUsCounties?vendororganizations_organizationId=${vendororganizations.organizationId}&uscounties_countyId=${vendororganizations.usCounties.countyId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsUsCounties?vendororganizations_organizationId=${vendororganizations.organizationId}&related_uscounties_countyId=${vendororganizations.usCounties.countyId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.usCounties == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsUsCounties?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscounties.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="usstates.title"/></h1>
					
						<c:if test='${vendororganizations.usStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateid.title"/>:
						</td>
						<td>
							${vendororganizations.usStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.statename.title"/>:
						</td>
						<td>
							${vendororganizations.usStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateabbr.title"/>:
						</td>
						<td>
							${vendororganizations.usStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.usStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.usStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.usStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.usStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsUsStates?vendororganizations_organizationId=${vendororganizations.organizationId}&usstates_stateId=${vendororganizations.usStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsUsStates?vendororganizations_organizationId=${vendororganizations.organizationId}&related_usstates_stateId=${vendororganizations.usStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.usStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsUsStates?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscities.title"/></h1>
					
						<c:if test='${vendororganizations.usCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityid.title"/>:
						</td>
						<td>
							${vendororganizations.usCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityname.title"/>:
						</td>
						<td>
							${vendororganizations.usCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityabbr.title"/>:
						</td>
						<td>
							${vendororganizations.usCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.usCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.usCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.usCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.usCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsUsCities?vendororganizations_organizationId=${vendororganizations.organizationId}&uscities_cityId=${vendororganizations.usCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsUsCities?vendororganizations_organizationId=${vendororganizations.organizationId}&related_uscities_cityId=${vendororganizations.usCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.usCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsUsCities?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indcities.title"/></h1>
					
						<c:if test='${vendororganizations.indCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityid.title"/>:
						</td>
						<td>
							${vendororganizations.indCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityname.title"/>:
						</td>
						<td>
							${vendororganizations.indCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityabbr.title"/>:
						</td>
						<td>
							${vendororganizations.indCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.indCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.indCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.indCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.indCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsIndCities?vendororganizations_organizationId=${vendororganizations.organizationId}&indcities_cityId=${vendororganizations.indCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsIndCities?vendororganizations_organizationId=${vendororganizations.organizationId}&related_indcities_cityId=${vendororganizations.indCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.indCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsIndCities?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indcities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indstates.title"/></h1>
					
						<c:if test='${vendororganizations.indStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateid.title"/>:
						</td>
						<td>
							${vendororganizations.indStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.statename.title"/>:
						</td>
						<td>
							${vendororganizations.indStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateabbr.title"/>:
						</td>
						<td>
							${vendororganizations.indStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.indStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.indStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.indStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.indStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsIndStates?vendororganizations_organizationId=${vendororganizations.organizationId}&indstates_stateId=${vendororganizations.indStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsIndStates?vendororganizations_organizationId=${vendororganizations.organizationId}&related_indstates_stateId=${vendororganizations.indStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.indStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsIndStates?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="inddistrict.title"/></h1>
					
						<c:if test='${vendororganizations.indDistrict != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtid.title"/>:
						</td>
						<td>
							${vendororganizations.indDistrict.districtId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtname.title"/>:
						</td>
						<td>
							${vendororganizations.indDistrict.districtName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtabbr.title"/>:
						</td>
						<td>
							${vendororganizations.indDistrict.districtAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.indDistrict.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.indDistrict.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.indDistrict.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.indDistrict.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsIndDistrict?vendororganizations_organizationId=${vendororganizations.organizationId}&inddistrict_districtId=${vendororganizations.indDistrict.districtId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsIndDistrict?vendororganizations_organizationId=${vendororganizations.organizationId}&related_inddistrict_districtId=${vendororganizations.indDistrict.districtId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.indDistrict == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsIndDistrict?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="inddistrict.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="countries.title"/></h1>
					
						<c:if test='${vendororganizations.countries != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryid.title"/>:
						</td>
						<td>
							${vendororganizations.countries.countryId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryname.title"/>:
						</td>
						<td>
							${vendororganizations.countries.countryName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countrycode.title"/>:
						</td>
						<td>
							${vendororganizations.countries.countryCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryabbr.title"/>:
						</td>
						<td>
							${vendororganizations.countries.countryAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.countries.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.createdby.title"/>:
						</td>
						<td>
							${vendororganizations.countries.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendororganizations.countries.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.modifiedby.title"/>:
						</td>
						<td>
							${vendororganizations.countries.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorOrganizationsCountries?vendororganizations_organizationId=${vendororganizations.organizationId}&countries_countryId=${vendororganizations.countries.countryId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizationsCountries?vendororganizations_organizationId=${vendororganizations.organizationId}&related_countries_countryId=${vendororganizations.countries.countryId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendororganizations.countries == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizationsCountries?vendororganizations_organizationId=${vendororganizations.organizationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="countries.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>