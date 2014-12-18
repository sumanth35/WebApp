<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productscategory-resources"/>
<html>
<head>
<title>List <fmt:message key="productscategory.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="productscategory.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsCategory"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productscategory.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="productscategory.categoryid.title"/></th>
					<th class="thead"><fmt:message key="productscategory.categoryname.title"/></th>
					<th class="thead"><fmt:message key="productscategory.categorydescription.title"/></th>
					<th class="thead"><fmt:message key="productscategory.categorycode.title"/></th>
					<th class="thead"><fmt:message key="productscategory.createdby.title"/></th>
					<th class="thead"><fmt:message key="productscategory.createdon.title"/></th>
					<th class="thead"><fmt:message key="productscategory.modifiedby.title"/></th>
					<th class="thead"><fmt:message key="productscategory.modifiedon.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productscategorys}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsCategory?categoryIdKey=${current.categoryId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsCategory?categoryIdKey=${current.categoryId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsCategory?categoryIdKey=${current.categoryId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.categoryId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.categoryName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.categoryDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.categoryCode}
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