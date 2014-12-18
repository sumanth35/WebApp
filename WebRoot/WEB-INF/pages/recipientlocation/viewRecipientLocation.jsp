<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.recipientlocation-resources"/>
<html>
<head>
<title>View <fmt:message key="recipientlocation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="recipientlocation.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRecipientLocation"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientlocationid.title"/>:
						</td>
						<td>
							${recipientlocation.recipientLocationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientfirstname.title"/>:
						</td>
						<td>
							${recipientlocation.recipientFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientmiddlename.title"/>:
						</td>
						<td>
							${recipientlocation.recipientMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientlastname.title"/>:
						</td>
						<td>
							${recipientlocation.recipientLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientsuffix.title"/>:
						</td>
						<td>
							${recipientlocation.recipientSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipienttitle.title"/>:
						</td>
						<td>
							${recipientlocation.recipientTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline1.title"/>:
						</td>
						<td>
							${recipientlocation.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline2.title"/>:
						</td>
						<td>
							${recipientlocation.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline3.title"/>:
						</td>
						<td>
							${recipientlocation.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.email.title"/>:
						</td>
						<td>
							${recipientlocation.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.contactnumber.title"/>:
						</td>
						<td>
							${recipientlocation.contactNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.fax.title"/>:
						</td>
						<td>
							${recipientlocation.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.zipcode5.title"/>:
						</td>
						<td>
							${recipientlocation.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.zipcode4.title"/>:
						</td>
						<td>
							${recipientlocation.zipCode4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscounties.title"/></h1>
					
						<c:if test='${recipientlocation.usCounties != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyid.title"/>:
						</td>
						<td>
							${recipientlocation.usCounties.countyId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyname.title"/>:
						</td>
						<td>
							${recipientlocation.usCounties.countyName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.countyabbr.title"/>:
						</td>
						<td>
							${recipientlocation.usCounties.countyAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.usCounties.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.usCounties.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.usCounties.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscounties.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.usCounties.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationUsCounties?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&uscounties_countyId=${recipientlocation.usCounties.countyId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationUsCounties?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_uscounties_countyId=${recipientlocation.usCounties.countyId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.usCounties == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationUsCounties?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscounties.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="usstates.title"/></h1>
					
						<c:if test='${recipientlocation.usStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateid.title"/>:
						</td>
						<td>
							${recipientlocation.usStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.statename.title"/>:
						</td>
						<td>
							${recipientlocation.usStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.stateabbr.title"/>:
						</td>
						<td>
							${recipientlocation.usStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.usStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.usStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.usStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="usstates.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.usStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationUsStates?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&usstates_stateId=${recipientlocation.usStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationUsStates?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_usstates_stateId=${recipientlocation.usStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.usStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationUsStates?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="uscities.title"/></h1>
					
						<c:if test='${recipientlocation.usCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityid.title"/>:
						</td>
						<td>
							${recipientlocation.usCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityname.title"/>:
						</td>
						<td>
							${recipientlocation.usCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.cityabbr.title"/>:
						</td>
						<td>
							${recipientlocation.usCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.usCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.usCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.usCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="uscities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.usCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationUsCities?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&uscities_cityId=${recipientlocation.usCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationUsCities?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_uscities_cityId=${recipientlocation.usCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.usCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationUsCities?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="uscities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indcities.title"/></h1>
					
						<c:if test='${recipientlocation.indCities != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityid.title"/>:
						</td>
						<td>
							${recipientlocation.indCities.cityId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityname.title"/>:
						</td>
						<td>
							${recipientlocation.indCities.cityName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.cityabbr.title"/>:
						</td>
						<td>
							${recipientlocation.indCities.cityAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.indCities.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.indCities.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.indCities.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indcities.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.indCities.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationIndCities?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&indcities_cityId=${recipientlocation.indCities.cityId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationIndCities?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_indcities_cityId=${recipientlocation.indCities.cityId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.indCities == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationIndCities?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indcities.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="indstates.title"/></h1>
					
						<c:if test='${recipientlocation.indStates != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateid.title"/>:
						</td>
						<td>
							${recipientlocation.indStates.stateId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.statename.title"/>:
						</td>
						<td>
							${recipientlocation.indStates.stateName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.stateabbr.title"/>:
						</td>
						<td>
							${recipientlocation.indStates.stateAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.indStates.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.indStates.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.indStates.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="indstates.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.indStates.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationIndStates?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&indstates_stateId=${recipientlocation.indStates.stateId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationIndStates?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_indstates_stateId=${recipientlocation.indStates.stateId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.indStates == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationIndStates?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="indstates.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="inddistrict.title"/></h1>
					
						<c:if test='${recipientlocation.indDistrict != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtid.title"/>:
						</td>
						<td>
							${recipientlocation.indDistrict.districtId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtname.title"/>:
						</td>
						<td>
							${recipientlocation.indDistrict.districtName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.districtabbr.title"/>:
						</td>
						<td>
							${recipientlocation.indDistrict.districtAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.indDistrict.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.indDistrict.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.indDistrict.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="inddistrict.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.indDistrict.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationIndDistrict?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&inddistrict_districtId=${recipientlocation.indDistrict.districtId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationIndDistrict?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_inddistrict_districtId=${recipientlocation.indDistrict.districtId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.indDistrict == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationIndDistrict?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="inddistrict.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="countries.title"/></h1>
					
						<c:if test='${recipientlocation.countries != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryid.title"/>:
						</td>
						<td>
							${recipientlocation.countries.countryId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryname.title"/>:
						</td>
						<td>
							${recipientlocation.countries.countryName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countrycode.title"/>:
						</td>
						<td>
							${recipientlocation.countries.countryCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.countryabbr.title"/>:
						</td>
						<td>
							${recipientlocation.countries.countryAbbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.countries.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.createdby.title"/>:
						</td>
						<td>
							${recipientlocation.countries.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${recipientlocation.countries.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="countries.modifiedby.title"/>:
						</td>
						<td>
							${recipientlocation.countries.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRecipientLocationCountries?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&countries_countryId=${recipientlocation.countries.countryId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationCountries?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_countries_countryId=${recipientlocation.countries.countryId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${recipientlocation.countries == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationCountries?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="countries.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="shipmentdetails.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocationShipmentDetailses?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="shipmentdetails.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="shipmentdetails.shipmentid.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.shipmentcarrier.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.trackingnumber.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.expecteddelivery.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.createdon.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.createdby.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="shipmentdetails.status.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${recipientlocation.shipmentDetailses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRecipientLocationShipmentDetailses?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&shipmentdetailses_shipmentId=${current.shipmentId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRecipientLocationShipmentDetailses?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&shipmentdetailses_shipmentId=${current.shipmentId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocationShipmentDetailses?recipientlocation_recipientLocationId=${recipientlocation.recipientLocationId}&related_shipmentdetailses_shipmentId=${current.shipmentId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.shipmentId}
						&nbsp;
						</td>
						<td>
							${current.shipmentCarrier}
						&nbsp;
						</td>
						<td>
							${current.trackingNumber}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.expectedDelivery.time}"/>
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