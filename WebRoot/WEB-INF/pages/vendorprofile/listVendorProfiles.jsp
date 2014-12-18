<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorprofile-resources"/>
<html>
<head>
<title>List <fmt:message key="vendorprofile.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="vendorprofile.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVendorProfile"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="vendorprofile.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="vendorprofile.registrationid.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.registrationname.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.registrationemail.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.firstname.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.middlename.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.lastname.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.namesuffix.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.nametitle.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.phone1.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.phone2.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.fax1.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.fax2.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.profilestatus.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.inactivityduration.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.lastsucesslogin.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.educationdegree.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.createdby.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.createdon.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.modifiedby.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.modifiedon.title"/></th>
					<th class="thead"><fmt:message key="vendorprofile.vendorpassword.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${vendorprofiles}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVendorProfile?registrationIdKey=${current.registrationId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVendorProfile?registrationIdKey=${current.registrationId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVendorProfile?registrationIdKey=${current.registrationId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.registrationId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.registrationName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.registrationEmail}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.firstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.middleName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.lastName}
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
						
							${current.phone1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.phone2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fax1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fax2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.profileStatus}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.inactivityDuration}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.lastSucessLogin.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.educationDegree}
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
						
							${current.vendorPassword}
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