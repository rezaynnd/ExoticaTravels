<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Page</title>>
        </head>
        <body>
            <jsp:include page="Template.jsp"></jsp:include>
            
            <td valign="top"> <br/><br/><B><I><font style='font-family: 'Brush Script MT Italics, Gadget, sans-serif;' size='+1'>
                                                    <font color='darkblue'>Exotica Travels is travel management company established by Reza in Medan, Sumut. Today under the chairmanship of Prabowo, the company has spread across the country.
                                                    It provides online air tickets booking. In addition, it provides hotel booking suite booking in various exotic locations all over the world.
                                                    Moreover, it provides rental car bookings. To avail the travel package services kindly log on the website.</B></I>
                    <br/>
                    <br/>
                    <html:form  action="/SubmitAction">
                        <table cellspacing='10' align='center'>
                            <tr>
                                <td><font color='darkblue' size='+2'>LOGIN AS:
                                    </tr>
                                    </td>
                                    </table>
                        <table cellsapcing='10' align='center'border='2' bordercolor='black'>
                            <tr><td bordercolor='white'><html:radio property='r1' value="existinguser">Existing User</html:radio>
                            <tr><td bordercolor='white'><html:radio property='r1' value="newuser">New User</html:radio>
                            <tr><td bordercolor='white'><input type="submit" value="Submit"/>
                                    </table>
                        </html:form>
                    </tr>
                    </table>
                    </body>          
</html>
