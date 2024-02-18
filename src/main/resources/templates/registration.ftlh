<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<nav>
    <a href="/welcome" > Home</a>
    <a href="/welcome/new-user/api"> Войти </a>
    <a href="/registration"> Зарегистрироваться </a>
    <a href="/logout">Выйти</a>

    <span></span>
</nav>



<h3>Регистрация</h3>
<form action="/welcome" method="post">
    Имя пользователя: <input type="text" name="name"><br><br>

    Пароль: <input type="password" name="password"><br><br>
    <br>
    <input type="submit" value="Зарегистрироваться"/>
</form>

</body>
<br><br>
<footer>
    Vadim Kharovyuk  1993-2024 &copy;
</footer>
</html>