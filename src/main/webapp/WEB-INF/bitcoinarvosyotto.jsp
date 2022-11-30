<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Bitcoin arvon syöttö</title>
	<link rel="stylesheet" href="/styles/demo.css">
</head>
<body>
	<h1>Bitcoinin arvon syöttö tänään 30.1.2022</h1>

	<form action="/arvonsyotto" method="get">
	Syötä bitcoin arvo nyt
	<input type="text" name="bitcoinarvo">
	<input type="submit" name="talleta" value="Talleta">
	</form>

	
</body>
</html>