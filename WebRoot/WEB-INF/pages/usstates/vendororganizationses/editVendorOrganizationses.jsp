<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.usstates-resources"/>
<html>
<head>
<title>Edit <fmt:message key="usstates.title"/> <fmt:message key="vendororganizations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="vendororganizations.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectUsStates?stateIdKey=${usstates_stateId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveUsStatesVendorOrganizationses" method="POST" modelAttribute="vendororganizations">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.organizationid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="vendororganizations_organizationId" path="organizationId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_organizationId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.organizationid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${vendororganizations.organizationId}
						&nbsp;
									<form:hidden id="vendororganizations_organizationId" path="organizationId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.organizationbusinessname.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_organizationBusinessName" path="organizationBusinessName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_organizationBusinessName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.organizationbusinessname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.organizationtypeid.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_organizationTypeId" path="organizationTypeId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_organizationTypeId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.organizationtypeid.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonfirstname.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_contactPersonFirstName" path="contactPersonFirstName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_contactPersonFirstName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.contactpersonfirstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonmiddlename.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_contactPersonMiddleName" path="contactPersonMiddleName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_contactPersonMiddleName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.contactpersonmiddlename.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonlastname.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_contactPersonLastName" path="contactPersonLastName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_contactPersonLastName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.contactpersonlastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.contactpersonsuffix.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_contactPersonSuffix" path="contactPersonSuffix" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_contactPersonSuffix",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.contactpersonsuffix.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.phone1.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_phone1" path="phone1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_phone1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.phone1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.phone2.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_phone2" path="phone2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_phone2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.phone2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.fax.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_fax" path="fax" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_fax",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.fax.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.email.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_email" path="email" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_email",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.email.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.addressline1.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_addressLine1" path="addressLine1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_addressLine1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.addressline1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.addressline2.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_addressLine2" path="addressLine2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_addressLine2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.addressline2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.addressline3.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_addressLine3" path="addressLine3" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_addressLine3",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.addressline3.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.status.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_status" path="status" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_status",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.status.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.zipcode5.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_zipCode5" path="zipCode5" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_zipCode5",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.zipcode5.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.createdon.title"/>:
						</td>
						<td>
							<input id="vendororganizations_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${vendororganizations.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.createdby.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.modifiedon.title"/>:
						</td>
						<td>
							<input id="vendororganizations_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${vendororganizations.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendororganizations.zipcode4.title"/>:
						</td>
						<td>
							<form:input id="vendororganizations_zipCode4" path="zipCode4" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendororganizations_zipCode4",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendororganizations.zipcode4.help"/>"}})); </script>
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
