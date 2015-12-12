<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<form method="post" action="searchtrips">
    <p>by campus :</p>
    <SELECT name="campus_list" id="campus_list" size="1">
        <OPTION id="caen" name="caen" value="caen">Caen
        <OPTION id="paris" name="paris" value="paris">Paris
        <OPTION id="nantes" name="nantes" value="nantes">Nantes
        <OPTION id="marseille" name="marseille" value="marseille">Marseille
        <OPTION id="lille" name="lille" value="lille">Lille
    </SELECT>
    <input type="radio" name="choice" value="1" checked />Arrive<br/>
    <input type="radio" name="choice" value="0" />Depart<br/>
    <input type="submit" value="Search">
</form>

<form method="post" action="searchtripsbyairport">
    <input type="text" id="airport" name="airport" placeholder="Search your trip by airport .." />
    <input type="submit" value="Search">
</form>