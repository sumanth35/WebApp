<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderrequest-resources"/>
<html>
<head>
<title>Edit <fmt:message key="orderrequest.title"/> <fmt:message key="orderrequeststatuses.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="orderrequeststatuses.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOrderRequest?orderRequestIdKey=${orderrequest_orderRequestId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveOrderRequestOrderRequestStatuses" method="POST" modelAttribute="orderrequeststatuses">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.orderrequeststatusid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="orderrequeststatuses_orderRequestStatusId" path="orderRequestStatusId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_orderRequestStatusId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequeststatuses.orderrequeststatusid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${orderrequeststatuses.orderRequestStatusId}
						&nbsp;
									<form:hidden id="orderrequeststatuses_orderRequestStatusId" path="orderRequestStatusId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.abbreviation.title"/>:
						</td>
						<td>
							<form:input id="orderrequeststatuses_abbreviation" path="abbreviation" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_abbreviation",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequeststatuses.abbreviation.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.description.title"/>:
						</td>
						<td>
							<form:input id="orderrequeststatuses_description" path="description" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_description",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequeststatuses.description.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.createdon.title"/>:
						</td>
						<td>
							<input id="orderrequeststatuses_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${orderrequeststatuses.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.createdby.title"/>:
						</td>
						<td>
							<form:input id="orderrequeststatuses_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequeststatuses.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.modifiedon.title"/>:
						</td>
						<td>
							<input id="orderrequeststatuses_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${orderrequeststatuses.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderrequeststatuses.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="orderrequeststatuses_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "orderrequeststatuses_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="orderrequeststatuses.modifiedby.help"/>"}})); </script>
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
