<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderrequest-resources"/>
<html>
<head>
<title>View <fmt:message key="orderrequest.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="orderrequest.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOrderRequest"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.orderrequestid.title"/>:
						</td>
						<td>
							${orderrequest.orderRequestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.orderconfirmationnumber.title"/>:
						</td>
						<td>
							${orderrequest.orderConfirmationNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${orderrequest.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.createdby.title"/>:
						</td>
						<td>
							${orderrequest.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${orderrequest.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.modifiedby.title"/>:
						</td>
						<td>
							${orderrequest.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.totalcost.title"/>:
						</td>
						<td>
							${orderrequest.totalCost}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.tax.title"/>:
						</td>
						<td>
							${orderrequest.tax}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderrequeststatuses.title"/></h1>
					
						<c:if test='${orderrequest.orderRequestStatuses != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.orderrequeststatusid.title"/>:
						</td>
						<td>
							${orderrequest.orderRequestStatuses.orderRequestStatusId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.abbreviation.title"/>:
						</td>
						<td>
							${orderrequest.orderRequestStatuses.abbreviation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.description.title"/>:
						</td>
						<td>
							${orderrequest.orderRequestStatuses.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${orderrequest.orderRequestStatuses.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.createdby.title"/>:
						</td>
						<td>
							${orderrequest.orderRequestStatuses.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${orderrequest.orderRequestStatuses.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequeststatuses.modifiedby.title"/>:
						</td>
						<td>
							${orderrequest.orderRequestStatuses.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderRequestOrderRequestStatuses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&orderrequeststatuses_orderRequestStatusId=${orderrequest.orderRequestStatuses.orderRequestStatusId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderRequestOrderRequestStatuses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&related_orderrequeststatuses_orderRequestStatusId=${orderrequest.orderRequestStatuses.orderRequestStatusId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${orderrequest.orderRequestStatuses == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderRequestOrderRequestStatuses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderrequeststatuses.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="shipmentdetails.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderRequestShipmentDetailses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="shipmentdetails.title"/></span></a></div>
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
					<c:forEach items="${orderrequest.shipmentDetailses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrderRequestShipmentDetailses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&shipmentdetailses_shipmentId=${current.shipmentId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrderRequestShipmentDetailses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&shipmentdetailses_shipmentId=${current.shipmentId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrderRequestShipmentDetailses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&related_shipmentdetailses_shipmentId=${current.shipmentId}&"><img src="images/icons/delete.gif" /></a>
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
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="ordereditems.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderRequestOrderedItemses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="ordereditems.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="ordereditems.orderitemid.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.itemprice.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.createdon.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.createdby.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.modifiedon.title"/></th>
						<th class="thead"><fmt:message key="ordereditems.modifiedby.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${orderrequest.orderedItemses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrderRequestOrderedItemses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&ordereditemses_orderItemId=${current.orderItemId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrderRequestOrderedItemses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&ordereditemses_orderItemId=${current.orderItemId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrderRequestOrderedItemses?orderrequest_orderRequestId=${orderrequest.orderRequestId}&related_ordereditemses_orderItemId=${current.orderItemId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.orderItemId}
						&nbsp;
						</td>
						<td>
							${current.itemPrice}
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