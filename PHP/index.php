<?php
require_once('Car.php');
require_once('Account.php');
require_once("UberX.php");
$uberX = new UberX("AGD47E",new Account("Jorge Cruz","1032445038"),"Yamaha","Fz2.0");
$uberX->printDataCar();
?>