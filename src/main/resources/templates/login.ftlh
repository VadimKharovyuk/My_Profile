
<!DOCTYPE html>
<html>
<head>
    <title>Регистрация </title>
</head>
<body>
<h3>Авторизация </h3>
<form action="/welcome" method="post">
    Имя: <input type="name" name="username"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="">

    <input type="submit" value="Вход"/>
    <br>
    <br>
</form>
<a href="/registration">Зарегистрироваться</a>

</body>
<br><br>
<footer>
    Vadim Kharovyuk  1993-2024 &copy;
</footer>
</html>