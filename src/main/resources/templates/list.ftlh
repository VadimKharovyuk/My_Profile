<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<nav>
    <a href="/welcome" > Home</a>
    <a href="/welcome/new-user/api"> Войти </a>
    <a href=""> Зарегистрироваться </a>
    <a href="/logout">Выйти</a>

    <span></span>
</nav>
<div class="container">
    <div class="row">
        <h2>Список Гостей</h2>
    </div>

</div>

<table class="table table-striped-columns" >

    <tr>
<#--        <th>Id</th>-->
        <th>name</th>
        <th>lastName</th>
        <th>data</th>
        <th>phone</th>
        <th>place</th>
    </tr>
    <#list customerList  as customer >
        <tr>
<#--            <td>${customer.id}</td>-->
            <td>${customer.name}</td>
            <td>${customer.lastname}</td>
            <td>${customer.data}</td>
            <td>${customer.phone}</td>
            <td>${customer.place}</td>
        </tr>
    </#list>
</table>

<form action="/welcome/new-user/api" method="get">
    <input type="submit" value="back">
</form>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>