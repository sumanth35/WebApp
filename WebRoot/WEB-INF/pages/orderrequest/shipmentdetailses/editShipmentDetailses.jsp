<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderrequest-resources"/>
<html>
<head>
<title>Edit <fmt:message key="orderrequest.title"/> <fmt:message key="shipmentdetails.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="shipmentdetails.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOrderRequest?orderRequestIdKey=${orderrequest_orderRequestId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveOrderRequestShipmentDetailses" method="POST" modelAttribute="shipmentdetails">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.shipmentid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="shipmentdetails_shipmentId" path="shipmentId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_shipmentId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="shipmentdetails.shipmentid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${shipmentdetails.shipmentId}
						&nbsp;
									<form:hidden id="shipmentdetails_shipmentId" path="shipmentId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.shipmentcarrier.title"/>:
						</td>
						<td>
							<form:input id="shipmentdetails_shipmentCarrier" path="shipmentCarrier" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_shipmentCarrier",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="shipmentdetails.shipmentcarrier.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.trackingnumber.title"/>:
						</td>
						<td>
							<form:input id="shipmentdetails_trackingNumber" path="trackingNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_trackingNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="shipmentdetails.trackingnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.expecteddelivery.title"/>:
						</td>
						<td>
							<input id="shipmentdetails_expectedDelivery" name="expectedDelivery" type="text" value="<fmt:formatDate value="${shipmentdetails.expectedDelivery.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_expectedDelivery",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.createdon.title"/>:
						</td>
						<td>
							<input id="shipmentdetails_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${shipmentdetails.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.createdby.title"/>:
						</td>
						<td>
							<form:input id="shipmentdetails_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="shipmentdetails.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.modifiedon.title"/>:
						</td>
						<td>
							<input id="shipmentdetails_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${shipmentdetails.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="shipmentdetails_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="shipmentdetails.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="shipmentdetails.status.title"/>:
						</td>
						<td>
							<form:input id="shipmentdetails_status" path="status" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "shipmentdetails_status",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="shipmentdetails.status.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="orderrequest_orderRequestId" value="${orderrequest_orderRequestId}" >
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
