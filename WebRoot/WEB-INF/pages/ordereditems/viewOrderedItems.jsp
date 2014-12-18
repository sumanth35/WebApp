<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.ordereditems-resources"/>
<html>
<head>
<title>View <fmt:message key="ordereditems.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="ordereditems.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOrderedItems"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ordereditems.orderitemid.title"/>:
						</td>
						<td>
							${ordereditems.orderItemId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ordereditems.itemprice.title"/>:
						</td>
						<td>
							${ordereditems.itemPrice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ordereditems.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ordereditems.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ordereditems.createdby.title"/>:
						</td>
						<td>
							${ordereditems.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ordereditems.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ordereditems.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="ordereditems.modifiedby.title"/>:
						</td>
						<td>
							${ordereditems.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="cartitems.title"/></h1>
					
						<c:if test='${ordereditems.cartItems != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.cartitemid.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.cartItemId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.producttitle.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.productTitle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.productcost.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.productCost}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.productquantity.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.productQuantity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.status.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.status}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ordereditems.cartItems.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.createdby.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ordereditems.cartItems.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="cartitems.modifiedby.title"/>:
						</td>
						<td>
							${ordereditems.cartItems.modifiedBy}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderedItemsCartItems?ordereditems_orderItemId=${ordereditems.orderItemId}&cartitems_cartItemId=${ordereditems.cartItems.cartItemId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderedItemsCartItems?ordereditems_orderItemId=${ordereditems.orderItemId}&related_cartitems_cartItemId=${ordereditems.cartItems.cartItemId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${ordereditems.cartItems == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderedItemsCartItems?ordereditems_orderItemId=${ordereditems.orderItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="cartitems.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderrequest.title"/></h1>
					
						<c:if test='${ordereditems.orderRequest != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.orderrequestid.title"/>:
						</td>
						<td>
							${ordereditems.orderRequest.orderRequestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.orderconfirmationnumber.title"/>:
						</td>
						<td>
							${ordereditems.orderRequest.orderConfirmationNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.createdon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ordereditems.orderRequest.createdOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.createdby.title"/>:
						</td>
						<td>
							${ordereditems.orderRequest.createdBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.modifiedon.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${ordereditems.orderRequest.modifiedOn.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.modifiedby.title"/>:
						</td>
						<td>
							${ordereditems.orderRequest.modifiedBy}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.totalcost.title"/>:
						</td>
						<td>
							${ordereditems.orderRequest.totalCost}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="orderrequest.tax.title"/>:
						</td>
						<td>
							${ordereditems.orderRequest.tax}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderedItemsOrderRequest?ordereditems_orderItemId=${ordereditems.orderItemId}&orderrequest_orderRequestId=${ordereditems.orderRequest.orderRequestId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderedItemsOrderRequest?ordereditems_orderItemId=${ordereditems.orderItemId}&related_orderrequest_orderRequestId=${ordereditems.orderRequest.orderRequestId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${ordereditems.orderRequest == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderedItemsOrderRequest?ordereditems_orderItemId=${ordereditems.orderItemId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderrequest.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>