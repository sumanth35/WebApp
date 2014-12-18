<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shipmentdetails-resources"/>
<html>
<head>
<title>View <fmt:message key="shipmentdetails.title"/> <fmt:message key="orderrequest.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="orderrequest.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectShipmentDetails?shipmentIdKey=${shipmentdetails_shipmentId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteShipmentDetailsOrderRequest?shipmentdetails_shipmentId=${shipmentdetails_shipmentId}&related_orderrequest_orderRequestId=${orderrequest.orderRequestId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
