<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productsbrand-resources"/>
<html>
<head>
<title>List <fmt:message key="productsbrand.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="productsbrand.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsBrand"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsbrand.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="productsbrand.brandid.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.brandname.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.branddescription.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.brandcode.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.createdby.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.createdon.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.modifiedby.title"/></th>
					<th class="thead"><fmt:message key="productsbrand.modifiedon.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productsbrands}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsBrand?brandIdKey=${current.brandId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsBrand?brandIdKey=${current.brandId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsBrand?brandIdKey=${current.brandId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.brandId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.brandName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.brandDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.brandCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.createdBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.modifiedBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>