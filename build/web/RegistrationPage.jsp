<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Page</title>
        </head>
        <body>
            <jsp:include page="Template.jsp"></jsp:include>
            <td valign="top">
                <html:form action="/RegistrationAction">
                    <table cellspacing='10' align='center'>
                        <tr>
                            <td><font color='darkblue' size='+2'>New User Registration Form
                                </tr>
                                </td>
                                </table>
                        <table cellspacing='10' align='center'border='2' bordercolor='black'>
                        <tr><td bordercolor='white'>User Name:<td COLSPAN='2' bordercolor='white'><html:text property="username"/>
                        <tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'><html:text property="userid"/>
                        <tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'><html:password property="password"/>
                        <tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2' bordercolor='white'><html:password property="reenterpassword"/>
                        <tr><td bordercolor='white'>Address:<td COLSPAN='2' bordercolor='white'><html:text property="adress"/>
                        <tr><td bordercolor='white'>State:<td COLSPAN='2' bordercolor='white'><html:text property="state"/>
                        <tr><td bordercolor='white'>Country:<td COLSPAN='2' bordercolor='white'><html:text property="country"/>
                        <tr><td bordercolor='white'></br>
                        <tr><td bordercolor='white'><input type='Submit'value='Submit'>
                                <td bordercolor='white'><input type='RESET' text='Reset'>
                    </table>
                    </html:form> 
                </body>            
</html>