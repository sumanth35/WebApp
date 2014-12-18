<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.userrole-resources"/>
<html>
<head>
<title>Edit <fmt:message key="userrole.title"/> <fmt:message key="vendorprofile.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="vendorprofile.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectUserRole?userRoleIdKey=${userrole_userRoleId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveUserRoleVendorProfiles" method="POST" modelAttribute="vendorprofile">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.registrationid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="vendorprofile_registrationId" path="registrationId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_registrationId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.registrationid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${vendorprofile.registrationId}
						&nbsp;
									<form:hidden id="vendorprofile_registrationId" path="registrationId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.registrationname.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_registrationName" path="registrationName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_registrationName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.registrationname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.registrationemail.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_registrationEmail" path="registrationEmail" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_registrationEmail",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.registrationemail.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.firstname.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_firstName" path="firstName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_firstName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.firstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.middlename.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_middleName" path="middleName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_middleName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.middlename.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.lastname.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_lastName" path="lastName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_lastName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.lastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.namesuffix.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_nameSuffix" path="nameSuffix" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_nameSuffix",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.namesuffix.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.nametitle.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_nameTitle" path="nameTitle" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_nameTitle",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.nametitle.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.phone1.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_phone1" path="phone1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_phone1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.phone1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.phone2.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_phone2" path="phone2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_phone2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.phone2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.fax1.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_fax1" path="fax1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_fax1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.fax1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.fax2.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_fax2" path="fax2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_fax2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.fax2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.profilestatus.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_profileStatus" path="profileStatus" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_profileStatus",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.profilestatus.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.inactivityduration.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_inactivityDuration" path="inactivityDuration" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_inactivityDuration",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.inactivityduration.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.lastsucesslogin.title"/>:
						</td>
						<td>
							<input id="vendorprofile_lastSucessLogin" name="lastSucessLogin" type="text" value="<fmt:formatDate value="${vendorprofile.lastSucessLogin.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_lastSucessLogin",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.educationdegree.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_educationDegree" path="educationDegree" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_educationDegree",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.educationdegree.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.createdby.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.createdon.title"/>:
						</td>
						<td>
							<input id="vendorprofile_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${vendorprofile.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.modifiedon.title"/>:
						</td>
						<td>
							<input id="vendorprofile_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${vendorprofile.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorprofile.vendorpassword.title"/>:
						</td>
						<td>
							<form:input id="vendorprofile_vendorPassword" path="vendorPassword" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_vendorPassword",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.vendorpassword.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="userrole_userRoleId" value="${userrole_userRoleId}" >
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
