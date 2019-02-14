<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Get Log Details Page</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
        <td valign="top" rowspan="200" colspan="80">
            <table>
                <tr>
                    <td><jsp:include page="/GetLogDetails">
                       <jsp:param name="title" value="GetLogDetails"/>
                    </jsp:include>
            </table>
        </body>
</html>
