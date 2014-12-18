<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.usstates-resources"/>
<html>
<head>
<title>Edit <fmt:message key="usstates.title"/> <fmt:message key="vendorlocations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="vendorlocations.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectUsStates?stateIdKey=${usstates_stateId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveUsStatesVendorLocationses" method="POST" modelAttribute="vendorlocations">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="vendorlocations_locationId" path="locationId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_locationId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.locationid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${vendorlocations.locationId}
						&nbsp;
									<form:hidden id="vendorlocations_locationId" path="locationId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationname.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_locationName" path="locationName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_locationName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.locationname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminfirstname.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_locationAdminFirstName" path="locationAdminFirstName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_locationAdminFirstName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.locationadminfirstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminmiddlename.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_locationAdminMiddleName" path="locationAdminMiddleName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_locationAdminMiddleName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.locationadminmiddlename.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminlastname.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_locationAdminLastName" path="locationAdminLastName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_locationAdminLastName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.locationadminlastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.locationadminsuffix.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_locationAdminSuffix" path="locationAdminSuffix" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_locationAdminSuffix",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.locationadminsuffix.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.status.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_status" path="status" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_status",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.status.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.phone1.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_phone1" path="phone1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_phone1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.phone1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.phone2.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_phone2" path="phone2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_phone2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.phone2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.fax.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_fax" path="fax" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_fax",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.fax.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.email.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_email" path="email" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_email",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.email.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.addressline1.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_addressLine1" path="addressLine1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_addressLine1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.addressline1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.addressline2.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_addressLine2" path="addressLine2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_addressLine2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.addressline2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.addressline3.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_addressLine3" path="addressLine3" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_addressLine3",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.addressline3.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.zipcode5.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_zipCode5" path="zipCode5" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_zipCode5",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.zipcode5.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.createdby.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.createdon.title"/>:
						</td>
						<td>
							<input id="vendorlocations_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${vendorlocations.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.modifiedon.title"/>:
						</td>
						<td>
							<input id="vendorlocations_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${vendorlocations.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocations.zipcode4.title"/>:
						</td>
						<td>
							<form:input id="vendorlocations_zipCode4" path="zipCode4" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocations_zipCode4",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocations.zipcode4.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="usstates_stateId" value="${usstates_stateId}" >
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
