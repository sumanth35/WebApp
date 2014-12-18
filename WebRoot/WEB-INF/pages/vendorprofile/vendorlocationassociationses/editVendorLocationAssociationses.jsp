<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorprofile-resources"/>
<html>
<head>
<title>Edit <fmt:message key="vendorprofile.title"/> <fmt:message key="vendorlocationassociations.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="vendorlocationassociations.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectVendorProfile?registrationIdKey=${vendorprofile_registrationId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveVendorProfileVendorLocationAssociationses" method="POST" modelAttribute="vendorlocationassociations">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.vendorlocationassociationid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="vendorlocationassociations_vendorLocationAssociationId" path="vendorLocationAssociationId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocationassociations_vendorLocationAssociationId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocationassociations.vendorlocationassociationid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${vendorlocationassociations.vendorLocationAssociationId}
						&nbsp;
									<form:hidden id="vendorlocationassociations_vendorLocationAssociationId" path="vendorLocationAssociationId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.locationid.title"/>:
						</td>
						<td>
							<form:input id="vendorlocationassociations_locationId" path="locationId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocationassociations_locationId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocationassociations.locationid.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.createdby.title"/>:
						</td>
						<td>
							<form:input id="vendorlocationassociations_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocationassociations_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocationassociations.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.createdon.title"/>:
						</td>
						<td>
							<input id="vendorlocationassociations_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${vendorlocationassociations.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocationassociations_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.modifiedon.title"/>:
						</td>
						<td>
							<input id="vendorlocationassociations_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${vendorlocationassociations.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocationassociations_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="vendorlocationassociations.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="vendorlocationassociations_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorlocationassociations_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorlocationassociations.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="vendorprofile_registrationId" value="${vendorprofile_registrationId}" >
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
