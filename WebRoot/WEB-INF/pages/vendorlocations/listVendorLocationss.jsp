<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorlocations-resources"/>
<html>
<head>
<title>List <fmt:message key="vendorlocations.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="vendorlocations.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorLocations"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorlocations.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${vendorlocationss}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorLocations?locationIdKey=${current.locationId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorLocations?locationIdKey=${current.locationId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorLocations?locationIdKey=${current.locationId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.locationId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.locationName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.locationAdminFirstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.locationAdminMiddleName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.locationAdminLastName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.locationAdminSuffix}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.status}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.phone1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.phone2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fax}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.email}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.addressLine1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.addressLine2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.addressLine3}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.zipCode5}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.createdBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.modifiedBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.zipCode4}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>