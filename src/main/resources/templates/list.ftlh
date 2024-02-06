<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Id</th>
            <th>name</th>
            <th>lastName</th>
            <th>data</th>
            <th>phone</th>
            <th>money</th>
            <th>place</th>
        </tr>
        <#list customerList as customer >
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.lastname}</td>
                <td>${customer.data}</td>
                <td>${customer.phone}</td>
                <td>${customer.money}</td>
                <td>${customer.place}</td>
            </tr>
        </#list>


    </table>
    <form action="/welcome/new-user/api" method="get">
        <input type="submit" value="back">
    </form>


</div>


</body>
</html>