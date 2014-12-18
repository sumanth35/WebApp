<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.products-resources"/>
<html>
<head>
<title>Edit <fmt:message key="products.title"/> <fmt:message key="productsdescription.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="productsdescription.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectProducts?productIdKey=${products_productId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveProductsProductsDescriptions" method="POST" modelAttribute="productsdescription">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdescriptionid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="productsdescription_productDescriptionId" path="productDescriptionId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productDescriptionId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productdescriptionid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${productsdescription.productDescriptionId}
						&nbsp;
									<form:hidden id="productsdescription_productDescriptionId" path="productDescriptionId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productprimarydescription.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productPrimaryDescription" path="productPrimaryDescription" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productPrimaryDescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productprimarydescription.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription1.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productSecondaryDescription1" path="productSecondaryDescription1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productSecondaryDescription1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productsecondarydescription1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription2.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productSecondaryDescription2" path="productSecondaryDescription2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productSecondaryDescription2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productsecondarydescription2.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription3.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productSecondaryDescription3" path="productSecondaryDescription3" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productSecondaryDescription3",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productsecondarydescription3.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription4.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productSecondaryDescription4" path="productSecondaryDescription4" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productSecondaryDescription4",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productsecondarydescription4.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productsecondarydescription5.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productSecondaryDescription5" path="productSecondaryDescription5" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productSecondaryDescription5",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productsecondarydescription5.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productcolor.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productColor" path="productColor" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productColor",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productcolor.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdimensionlength.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productDimensionLength" path="productDimensionLength" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productDimensionLength",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productdimensionlength.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdimensionbreadth.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productDimensionBreadth" path="productDimensionBreadth" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productDimensionBreadth",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productdimensionbreadth.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productdimensionheight.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productDimensionHeight" path="productDimensionHeight" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productDimensionHeight",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productdimensionheight.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productweight.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productWeight" path="productWeight" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productWeight",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productweight.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productnumber.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productNumber" path="productNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productNumber",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productmodelnumber.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productModelNumber" path="productModelNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productModelNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productmodelnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.productorigin.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_productOrigin" path="productOrigin" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_productOrigin",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.productorigin.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.createdby.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_createdBy" path="createdBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_createdBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.createdby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.createdon.title"/>:
						</td>
						<td>
							<input id="productsdescription_createdOn" name="createdOn" type="text" value="<fmt:formatDate value="${productsdescription.createdOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_createdOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.modifiedby.title"/>:
						</td>
						<td>
							<form:input id="productsdescription_modifiedBy" path="modifiedBy" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_modifiedBy",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="productsdescription.modifiedby.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsdescription.modifiedon.title"/>:
						</td>
						<td>
							<input id="productsdescription_modifiedOn" name="modifiedOn" type="text" value="<fmt:formatDate value="${productsdescription.modifiedOn.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "productsdescription_modifiedOn",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="products_productId" value="${products_productId}" >
				
				
				
				
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
