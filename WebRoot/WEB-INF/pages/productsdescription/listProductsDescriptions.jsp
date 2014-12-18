<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productsdescription-resources"/>
<html>
<head>
<title>List <fmt:message key="productsdescription.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="productsdescription.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsDescription"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsdescription.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="productsdescription.productdescriptionid.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productprimarydescription.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productsecondarydescription1.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productsecondarydescription2.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productsecondarydescription3.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productsecondarydescription4.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productsecondarydescription5.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productcolor.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productdimensionlength.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productdimensionbreadth.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productdimensionheight.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productweight.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productnumber.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productmodelnumber.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.productorigin.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.createdby.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.createdon.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.modifiedby.title"/></th>
					<th class="thead"><fmt:message key="productsdescription.modifiedon.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productsdescriptions}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductsDescription?productDescriptionIdKey=${current.productDescriptionId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductsDescription?productDescriptionIdKey=${current.productDescriptionId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductsDescription?productDescriptionIdKey=${current.productDescriptionId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productDescriptionId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productPrimaryDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productSecondaryDescription1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productSecondaryDescription2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productSecondaryDescription3}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productSecondaryDescription4}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productSecondaryDescription5}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productColor}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productDimensionLength}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productDimensionBreadth}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productDimensionHeight}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productWeight}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productModelNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productOrigin}
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