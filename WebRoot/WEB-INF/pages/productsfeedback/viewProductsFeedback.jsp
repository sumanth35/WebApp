<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.productsfeedback-resources"/>
<html>
<head>
<title>View <fmt:message key="productsfeedback.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="productsfeedback.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProductsFeedback"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsfeedback.feedbackid.title"/>:
						</td>
						<td>
							${productsfeedback.feedbackId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsfeedback.feedbackcomments.title"/>:
						</td>
						<td>
							${productsfeedback.feedbackComments}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsfeedback.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsfeedback.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsfeedback.createdby.title"/>:
						</td>
						<td>
							${productsfeedback.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsfeedback.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsfeedback.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="productsfeedback.modifiedby.title"/>:
						</td>
						<td>
							${productsfeedback.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="products.title"/></h1>
					
						<c:if test='${productsfeedback.products != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="products.productid.title"/>:
						</td>
						<td>
							${productsfeedback.products.productId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.producttitle.title"/>:
						</td>
						<td>
							${productsfeedback.products.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.salesprice.title"/>:
						</td>
						<td>
							${productsfeedback.products.salesPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.costprice.title"/>:
						</td>
						<td>
							${productsfeedback.products.costPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.discountprice.title"/>:
						</td>
						<td>
							${productsfeedback.products.discountPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.percentagediscount.title"/>:
						</td>
						<td>
							${productsfeedback.products.percentageDiscount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsfeedback.products.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.createdby.title"/>:
						</td>
						<td>
							${productsfeedback.products.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsfeedback.products.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.modifiedby.title"/>:
						</td>
						<td>
							${productsfeedback.products.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.status.title"/>:
						</td>
						<td>
							${productsfeedback.products.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="products.quantity.title"/>:
						</td>
						<td>
							${productsfeedback.products.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsFeedbackProducts?productsfeedback_feedbackId=${productsfeedback.feedbackId}&products_productId=${productsfeedback.products.productId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsFeedbackProducts?productsfeedback_feedbackId=${productsfeedback.feedbackId}&related_products_productId=${productsfeedback.products.productId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${productsfeedback.products == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsFeedbackProducts?productsfeedback_feedbackId=${productsfeedback.feedbackId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="products.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="productsrating.title"/></h1>
					
						<c:if test='${productsfeedback.productsRating != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="productsrating.productratingid.title"/>:
						</td>
						<td>
							${productsfeedback.productsRating.productRatingId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsrating.productrating.title"/>:
						</td>
						<td>
							${productsfeedback.productsRating.productRating}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsrating.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsfeedback.productsRating.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsrating.createdby.title"/>:
						</td>
						<td>
							${productsfeedback.productsRating.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsrating.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${productsfeedback.productsRating.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="productsrating.modifiedby.title"/>:
						</td>
						<td>
							${productsfeedback.productsRating.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductsFeedbackProductsRating?productsfeedback_feedbackId=${productsfeedback.feedbackId}&productsrating_productRatingId=${productsfeedback.productsRating.productRatingId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductsFeedbackProductsRating?productsfeedback_feedbackId=${productsfeedback.feedbackId}&related_productsrating_productRatingId=${productsfeedback.productsRating.productRatingId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${productsfeedback.productsRating == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductsFeedbackProductsRating?productsfeedback_feedbackId=${productsfeedback.feedbackId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="productsrating.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>