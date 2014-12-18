<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.vendorprofile-resources"/>
<html>
    <head>
        <title>Login <fmt:message key="vendorprofile.title"/></title>
    </head>
    <body>
    <div id="contentarea">
   		<div id="content">
   		<a href="${pageContext.request.contextPath}/newVendorProfile"><span><fmt:message key="navigation.register"/></span></a>
    	<form:form action="${pageContext.request.contextPath}/saveVendorProfile" method="POST" modelAttribute="vendorprofile">
    	<table id="viewTable">
				<tbody>
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
							<fmt:message key="vendorprofile.vendorpassword.title"/>:
						</td>
						<td>
							<form:password id="vendorprofile_vendorPassword" path="vendorPassword" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "vendorprofile_vendorPassword",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="vendorprofile.vendorpassword.help"/>"}})); </script>
						&nbsp;
						</td>
					</tr>
					
				</tbody>
				
			</table>
			<p class="buttonBox" align="right">
				<div class="navitem">				
					<span class="inputbutton">
						<input class="savebutton" id="signin" type="submit" value="<fmt:message key="navigation.signin"/>"/>				
					</span>				
				<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'signin', event:'onclick'}));</script>					
				</div>
			</p>	
			
		</form:form><br/><br/><br/>
		
		<div class="clear">&nbsp;</div>				
    	</div>    
    </div>   
    </body>
</html>