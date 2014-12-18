<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderrequest-resources"/>
<html>
<head>
<title>View <fmt:message key="orderrequest.title"/> <fmt:message key="shipmentdetails.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="shipmentdetails.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOrderRequest?orderRequestIdKey=${orderrequest_orderRequestId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.shipmentid.title"/>:
						</td>
						<td>
							${shipmentdetails.shipmentId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.shipmentcarrier.title"/>:
						</td>
						<td>
							${shipmentdetails.shipmentCarrier}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.trackingnumber.title"/>:
						</td>
						<td>
							${shipmentdetails.trackingNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.expecteddelivery.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.expectedDelivery.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.createdby.title"/>:
						</td>
						<td>
							${shipmentdetails.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.modifiedby.title"/>:
						</td>
						<td>
							${shipmentdetails.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.status.title"/>:
						</td>
						<td>
							${shipmentdetails.status}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteOrderRequestShipmentDetailses?orderrequest_orderRequestId=${orderrequest_orderRequestId}&related_shipmentdetailses_shipmentId=${shipmentdetails.shipmentId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
