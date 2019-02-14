<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Flights</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
            <td valign="top" rowspan="200" colspan="80">
                <table>
                    <tr>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Domestic Flights</a></td>
                    <td><font color='darkblue'Size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>International Flights</a></td>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Hotels</a></td>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Car Rentals</a></td>
                    <td><font color='darkblue'size='+1'><a href='<c:url value="TourPackage.jsp"/>'>Tour Packages</a></td>
                    </tr>
            </table>
                    <font align="center" color="darkblue" size="+1">Please select the airline by which you want to go to your destination:
                    <br>
                    <br>
                    <form
                        action='<c:url value="SessionServlet"/>' name='MyForm' METHOD='POST'
                        <table cellspacing='10' align='center'boder='2' bordercolor='black'>
                            <tr>
                                <td bordercolor='white'><font color='darkblue'> Select the Airline:
                                    </font></td>
                                <td bodercolor='white'>
                                    <select name='Airline'>
                                        <option value='Qatar Airways'>Qatar Airways</option>
                                        <option value='US Airways'>US Airways</option>
                                        </select>
                                    <input type='hidden' value='FlightsServlet' name='PageName'/>
                                    </td>
                                    </tr>
                                    <tr>
                                        <td bordercolor='white'>
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' value="Next"></input></a>
                                        </td>
                                        </tr>
                        </table>
        </form>
        </body>

</html>