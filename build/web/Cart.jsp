<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
          <title>Cart</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
            <td valign="top" rowspan="200" colspan="80">
                <table>
                    <tr>
                    <c:set var="Destination" value="${sessionScope.selDestination}"/>
                    <c:set var="Hotel" value="${sessionScope.selHotel}"/>
                    <c:set var="NumberOfDays" value="${numDays}"/>
                    <c:set var="Airline" value="${sessionScope.selAirline}"/>
                    
                    <c:choose>
                        <c:when test="${Hotel=='Malibu'}">
                            <c:set var="HotelPrice" value="150"/>
                        </c:when>
                    </c:choose>
                    
                    <c:choose>
                        <c:when test="${Airline=='Qatar Airways'}">
                            <c:set var="TicketPrice" value="100"/>
                        </c:when>
                        <c:when test="${Airline=='US Airways'}">
                            <c:set var="TicketPrice" value="100"/>
                        </c:when>
                    </c:choose>
                    
                    <c:set var="TotalHotelPrice" value="${HotelPrice*NumberOfDays}"/>
                    <c:set var="TotalPackagePrice"
                           value="${TotalHotelPrice+TicketPrice}"/>
                                           
                    <td><font color='darkblue'size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Domestic Flights</a></td>
                    <td><font color='darkblue'Size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>International Flights</a></td>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Hotels</a></td>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Car Rentals</a></td>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="TourPackage.jsp"/>'>Tour Packages</a></td>
                    </tr>
            </table>
                    <br>
                    <font align="center" color="darkblue" size="+1">You have added the following centents to your cart:
                    <br>
                    <br>
                    <br>
                    <table cellspacing='10' align='center'border='2' bordercolor='black'>
                        <tr><td bordercolor='white'>Destination:<d
                            COLSPAN='2'bordercolor='white'><c:out value="${Destination}"/>
                        <tr><td bordercolor='white'>Hotel:<d
                            OLSPAN='2'bordercolor='white'><c:out value="${Hotel}"/>
                        <tr><td bordercolor='white'>The number of days:<d
                            COLSPAN='2'bordercolor='white'><c:out value="${NumberOfDays}"/>
                        <tr><td bordercolor='white'>Airline:<d
                            COLSPAN='2'bordercolor='white'><c:out value="${Airline}"/>
                            <tr><td bordercolor='white'><b>Total Package Cost</b>:<td
                                    bodercolor='white'><b><fmt:formatNumber type="Currency" value="${TotalPackagePrice}"/></b>
                            </table>
    </body>
                    
                    
</html>