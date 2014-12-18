<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderrequeststatuses-resources"/>
<html>
<head>
<title>View <fmt:message key="orderrequeststatuses.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="orderrequeststatuses.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOrderRequestStatuses"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.orderrequeststatusid.title"/>:
						</td>
						<td>
							${orderrequeststatuses.orderRequestStatusId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.abbreviation.title"/>:
						</td>
						<td>
							${orderrequeststatuses.abbreviation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.description.title"/>:
						</td>
						<td>
							${orderrequeststatuses.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${orderrequeststatuses.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.createdby.title"/>:
						</td>
						<td>
							${orderrequeststatuses.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${orderrequeststatuses.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.modifiedby.title"/>:
						</td>
						<td>
							${orderrequeststatuses.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderrequest.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderRequestStatusesOrderRequests?orderrequeststatuses_orderRequestStatusId=${orderrequeststatuses.orderRequestStatusId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderrequest.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="orderrequest.orderrequestid.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.orderconfirmationnumber.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.createdon.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.createdby.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.modifiedby.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.totalcost.title"/></th>
						<th class="thead"><fmt:message key="orderrequest.tax.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${orderrequeststatuses.orderRequests}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrderRequestStatusesOrderRequests?orderrequeststatuses_orderRequestStatusId=${orderrequeststatuses.orderRequestStatusId}&orderrequests_orderRequestId=${current.orderRequestId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrderRequestStatusesOrderRequests?orderrequeststatuses_orderRequestStatusId=${orderrequeststatuses.orderRequestStatusId}&orderrequests_orderRequestId=${current.orderRequestId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrderRequestStatusesOrderRequests?orderrequeststatuses_orderRequestStatusId=${orderrequeststatuses.orderRequestStatusId}&related_orderrequests_orderRequestId=${current.orderRequestId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.orderRequestId}
						&nbsp;
						</td>
						<td>
							${current.orderConfirmationNumber}
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
							${current.totalCost}
						&nbsp;
						</td>
						<td>
							${current.tax}
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