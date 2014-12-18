<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendororganizations-resources"/>
<html>
<head>
<title>List <fmt:message key="vendororganizations.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="vendororganizations.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorOrganizations"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendororganizations.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${vendororganizationss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorOrganizations?organizationIdKey=${current.organizationId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorOrganizations?organizationIdKey=${current.organizationId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorOrganizations?organizationIdKey=${current.organizationId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.organizationId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.organizationBusinessName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.organizationTypeId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contactPersonFirstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contactPersonMiddleName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contactPersonLastName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contactPersonSuffix}
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
						
							${current.status}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.zipCode5}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.createdBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.modifiedBy}
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