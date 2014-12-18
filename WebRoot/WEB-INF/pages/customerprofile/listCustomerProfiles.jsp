<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.customerprofile-resources"/>
<html>
<head>
<title>List <fmt:message key="customerprofile.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="customerprofile.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerProfile"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="customerprofile.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${customerprofiles}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCustomerProfile?customerIdKey=${current.customerId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCustomerProfile?customerIdKey=${current.customerId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCustomerProfile?customerIdKey=${current.customerId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.customerId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.customerName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.customerPassword}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.customerEmail}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.profileStatus}
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
						
							${current.firstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.lastName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.middleName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.nameSuffix}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.nameTitle}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.lastSuccessLogin.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.visits}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.createdIp}
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
						
							${current.zipCode4}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.lastLoginIp}
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