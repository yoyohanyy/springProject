<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <title>add post page</title>
    </head>
    <body>
        <h1>Add New Post</h1>
        <form action="addok" method="post">
            <table>
                <tr><td>Category:</td><td><input type="text" name="category"/></td></tr>
                <tr><td>Title:</td><td><input type="text" name="title"/></td></tr>
                <tr><td>Writer:</td><td><input type="text" name="writer"/></td></tr>
                <tr><td>Content:</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
            </table>
            <button type="button" onclick="location.href='list'">View list</button>
            <button type="submit">Add</button>
        </form>
    </body>
</html>