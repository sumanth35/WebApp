<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorprofile-resources"/>
<html>
<head>
<title>View <fmt:message key="vendorprofile.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="vendorprofile.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexVendorProfile"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="userrole.title"/></h1>
					
						<c:if test='${vendorprofile.userRole != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.userroleid.title"/>:
						</td>
						<td>
							${vendorprofile.userRole.userRoleId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.userrolename.title"/>:
						</td>
						<td>
							${vendorprofile.userRole.userRoleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.userroledescription.title"/>:
						</td>
						<td>
							${vendorprofile.userRole.userRoleDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorprofile.userRole.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.createdby.title"/>:
						</td>
						<td>
							${vendorprofile.userRole.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${vendorprofile.userRole.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="userrole.modifiedby.title"/>:
						</td>
						<td>
							${vendorprofile.userRole.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVendorProfileUserRole?vendorprofile_registrationId=${vendorprofile.registrationId}&userrole_userRoleId=${vendorprofile.userRole.userRoleId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVendorProfileUserRole?vendorprofile_registrationId=${vendorprofile.registrationId}&related_userrole_userRoleId=${vendorprofile.userRole.userRoleId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${vendorprofile.userRole == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorProfileUserRole?vendorprofile_registrationId=${vendorprofile.registrationId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="userrole.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="vendorlocationassociations.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorProfileVendorLocationAssociationses?vendorprofile_registrationId=${vendorprofile.registrationId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorlocationassociations.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="vendorlocationassociations.vendorlocationassociationid.title"/></th>
						<th class="thead"><fmt:message key="vendorlocationassociations.locationid.title"/></th>
						<th class="thead"><fmt:message key="vendorlocationassociations.createdby.title"/></th>
						<th class="thead"><fmt:message key="vendorlocationassociations.createdon.title"/></th>
						<th class="thead"><fmt:message key="vendorlocationassociations.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="vendorlocationassociations.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vendorprofile.vendorLocationAssociationses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorProfileVendorLocationAssociationses?vendorprofile_registrationId=${vendorprofile.registrationId}&vendorlocationassociationses_vendorLocationAssociationId=${current.vendorLocationAssociationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorProfileVendorLocationAssociationses?vendorprofile_registrationId=${vendorprofile.registrationId}&vendorlocationassociationses_vendorLocationAssociationId=${current.vendorLocationAssociationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorProfileVendorLocationAssociationses?vendorprofile_registrationId=${vendorprofile.registrationId}&related_vendorlocationassociationses_vendorLocationAssociationId=${current.vendorLocationAssociationId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.vendorLocationAssociationId}
						&nbsp;
						</td>
						<td>
							${current.locationId}
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
			<h1><fmt:message key="products.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorProfileProductses?vendorprofile_registrationId=${vendorprofile.registrationId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
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
					<c:forEach items="${vendorprofile.productses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorProfileProductses?vendorprofile_registrationId=${vendorprofile.registrationId}&productses_productId=${current.productId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorProfileProductses?vendorprofile_registrationId=${vendorprofile.registrationId}&productses_productId=${current.productId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorProfileProductses?vendorprofile_registrationId=${vendorprofile.registrationId}&related_productses_productId=${current.productId}&"><img src="images/icons/delete.gif" /></a>
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>