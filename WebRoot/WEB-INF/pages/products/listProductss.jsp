<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.products-resources"/>
<html>
<head>
<title>List <fmt:message key="products.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="products.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProducts"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="products.productid.title"/></th>
					<th class="thead"><fmt:message key="products.producttitle.title"/></th>
					<th class="thead"><fmt:message key="products.salesprice.title"/></th>
					<th class="thead"><fmt:message key="products.costprice.title"/></th>
					<th class="thead"><fmt:message key="products.discountprice.title"/></th>
					<th class="thead"><fmt:message key="products.percentagediscount.title"/></th>
					<th class="thead"><fmt:message key="products.createdon.title"/></th>
					<th class="thead"><fmt:message key="products.createdby.title"/></th>
					<th class="thead"><fmt:message key="products.modifiedon.title"/></th>
					<th class="thead"><fmt:message key="products.modifiedby.title"/></th>
					<th class="thead"><fmt:message key="products.status.title"/></th>
					<th class="thead"><fmt:message key="products.quantity.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProducts?productIdKey=${current.productId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProducts?productIdKey=${current.productId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProducts?productIdKey=${current.productId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productTitle}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.salesPrice}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.costPrice}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.discountPrice}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.percentageDiscount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.createdOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.createdBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.modifiedOn.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.modifiedBy}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.status}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.quantity}
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