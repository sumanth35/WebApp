<%@ tag pageEncoding="windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag import="main.app.util.AppConstants"%>
<%@ attribute name="module"%>

<div id="trc">
    <ul id="navlist">
    	 <li>
            <c:choose>
                <c:when test="${module=='VENDOR_PROFILE'}"> <a id="current"> </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/newVendorProfile"  title="Click to Vendor Profile"  onFocus="newTabColor(this);" onBlur="oldTabColor(this);">
                </c:otherwise>
            </c:choose>
            Vendor Profile </a>
        </li>
    
    	
        <li>
            <c:choose>
                <c:when test="${module=='VENDOR_ORGANIZATION'}"> <a id="current"> </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/newVendorOrganizations"  title="Click to Vendor Organization"  onFocus="newTabColor(this);" onBlur="oldTabColor(this);">
                </c:otherwise>
            </c:choose>
            Vendor Organization </a>
        </li>
        
        <li>
            <c:choose>
                <c:when test="${module=='VENDOR_ORGANIZATION'}"> <a id="current"> </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/newVendorLocations" title="Click to Vendor Locations"  onFocus="newTabColor(this);" onBlur="oldTabColor(this);">
                </c:otherwise>
            </c:choose>
                Vendor Location</a>
        </li>
        
        
    </ul>
</div>