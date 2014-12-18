<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.ordereditems-resources"/>
<html>
<head>
<title>Edit <fmt:message key="ordereditems.title"/> <fmt:message key="orderrequest.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="orderrequest.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOrderedItems?orderItemIdKey=${ordereditems_orderItemId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveOrderedItemsOrderRequest" method="POST" modelAttribute="orderrequest">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.orderrequestid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="orderrequest_orderRequestId" path="orderRequestId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_orderRequestId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequest.orderrequestid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${orderrequest.orderRequestId}
						&nbsp;
									<form:hidden id="orderrequest_orderRequestId" path="orderRequestId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.orderconfirmationnumber.title"/>:
						</td>
						<td>
							<form:input id="orderrequest_orderConfirmationNumber" path="orderConfirmationNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_orderConfirmationNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequest.orderconfirmationnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.createdon.title"/>:
						</td>
						<td>
							<input id="orderrequest_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${orderrequest.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.createdby.title"/>:
						</td>
						<td>
							<form:input id="orderrequest_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequest.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.modifiedon.title"/>:
						</td>
						<td>
							<input id="orderrequest_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${orderrequest.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="orderrequest_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequest.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.totalcost.title"/>:
						</td>
						<td>
							<form:input id="orderrequest_totalCost" path="totalCost" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_totalCost",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequest.totalcost.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequest.tax.title"/>:
						</td>
						<td>
							<form:input id="orderrequest_tax" path="tax" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequest_tax",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequest.tax.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="ordereditems_orderItemId" value="${ordereditems_orderItemId}" >
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
