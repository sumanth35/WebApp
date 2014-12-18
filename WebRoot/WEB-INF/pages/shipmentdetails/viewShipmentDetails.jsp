<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.shipmentdetails-resources"/>
<html>
<head>
<title>View <fmt:message key="shipmentdetails.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="shipmentdetails.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexShipmentDetails"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderrequest.title"/></h1>
					
						<c:if test='${shipmentdetails.orderRequest != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.orderrequestid.title"/>:
						</td>
						<td>
							${shipmentdetails.orderRequest.orderRequestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.orderconfirmationnumber.title"/>:
						</td>
						<td>
							${shipmentdetails.orderRequest.orderConfirmationNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.orderRequest.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.createdby.title"/>:
						</td>
						<td>
							${shipmentdetails.orderRequest.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.orderRequest.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.modifiedby.title"/>:
						</td>
						<td>
							${shipmentdetails.orderRequest.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.totalcost.title"/>:
						</td>
						<td>
							${shipmentdetails.orderRequest.totalCost}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.tax.title"/>:
						</td>
						<td>
							${shipmentdetails.orderRequest.tax}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editShipmentDetailsOrderRequest?shipmentdetails_shipmentId=${shipmentdetails.shipmentId}&orderrequest_orderRequestId=${shipmentdetails.orderRequest.orderRequestId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteShipmentDetailsOrderRequest?shipmentdetails_shipmentId=${shipmentdetails.shipmentId}&related_orderrequest_orderRequestId=${shipmentdetails.orderRequest.orderRequestId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${shipmentdetails.orderRequest == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newShipmentDetailsOrderRequest?shipmentdetails_shipmentId=${shipmentdetails.shipmentId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderrequest.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="recipientlocation.title"/></h1>
					
						<c:if test='${shipmentdetails.recipientLocation != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.recipientlocationid.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.recipientLocationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.recipientfirstname.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.recipientFirstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.recipientmiddlename.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.recipientMiddleName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.recipientlastname.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.recipientLastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.recipientsuffix.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.recipientSuffix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.recipienttitle.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.recipientTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.addressline1.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.addressLine1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.addressline2.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.addressLine2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.addressline3.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.addressLine3}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.email.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.contactnumber.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.contactNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.fax.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.fax}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.zipcode5.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.zipCode5}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.zipcode4.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.zipCode4}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.recipientLocation.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.createdby.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${shipmentdetails.recipientLocation.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="recipientlocation.modifiedby.title"/>:
						</td>
						<td>
							${shipmentdetails.recipientLocation.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editShipmentDetailsRecipientLocation?shipmentdetails_shipmentId=${shipmentdetails.shipmentId}&recipientlocation_recipientLocationId=${shipmentdetails.recipientLocation.recipientLocationId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteShipmentDetailsRecipientLocation?shipmentdetails_shipmentId=${shipmentdetails.shipmentId}&related_recipientlocation_recipientLocationId=${shipmentdetails.recipientLocation.recipientLocationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${shipmentdetails.recipientLocation == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newShipmentDetailsRecipientLocation?shipmentdetails_shipmentId=${shipmentdetails.shipmentId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="recipientlocation.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>