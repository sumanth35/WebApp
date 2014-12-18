<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.recipientlocation-resources"/>
<html>
<head>
<title>List <fmt:message key="recipientlocation.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="recipientlocation.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRecipientLocation"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="recipientlocation.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${recipientlocations}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRecipientLocation?recipientLocationIdKey=${current.recipientLocationId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRecipientLocation?recipientLocationIdKey=${current.recipientLocationId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRecipientLocation?recipientLocationIdKey=${current.recipientLocationId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recipientLocationId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recipientFirstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recipientMiddleName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recipientLastName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recipientSuffix}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recipientTitle}
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
						
							${current.email}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contactNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fax}
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