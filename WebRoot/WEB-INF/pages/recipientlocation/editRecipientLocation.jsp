<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.recipientlocation-resources"/>
<html>
<head>
<title>Edit <fmt:message key="recipientlocation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="recipientlocation.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRecipientLocation"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveRecipientLocation" method="POST" modelAttribute="recipientlocation">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientlocationid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="recipientlocation_recipientLocationId" path="recipientLocationId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_recipientLocationId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.recipientlocationid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${recipientlocation.recipientLocationId}
						&nbsp;
									<form:hidden id="recipientlocation_recipientLocationId" path="recipientLocationId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientfirstname.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_recipientFirstName" path="recipientFirstName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_recipientFirstName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.recipientfirstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientmiddlename.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_recipientMiddleName" path="recipientMiddleName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_recipientMiddleName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.recipientmiddlename.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientlastname.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_recipientLastName" path="recipientLastName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_recipientLastName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.recipientlastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipientsuffix.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_recipientSuffix" path="recipientSuffix" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_recipientSuffix",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.recipientsuffix.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.recipienttitle.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_recipientTitle" path="recipientTitle" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_recipientTitle",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.recipienttitle.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline1.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_addressLine1" path="addressLine1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_addressLine1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.addressline1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline2.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_addressLine2" path="addressLine2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_addressLine2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.addressline2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.addressline3.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_addressLine3" path="addressLine3" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_addressLine3",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.addressline3.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.email.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_email" path="email" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_email",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.email.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.contactnumber.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_contactNumber" path="contactNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_contactNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.contactnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.fax.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_fax" path="fax" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_fax",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.fax.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.zipcode5.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_zipCode5" path="zipCode5" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_zipCode5",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.zipcode5.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.zipcode4.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_zipCode4" path="zipCode4" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_zipCode4",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.zipcode4.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.createdon.title"/>:
						</td>
						<td>
							<input id="recipientlocation_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${recipientlocation.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.createdby.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.modifiedon.title"/>:
						</td>
						<td>
							<input id="recipientlocation_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${recipientlocation.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="recipientlocation.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="recipientlocation_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "recipientlocation_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="recipientlocation.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>