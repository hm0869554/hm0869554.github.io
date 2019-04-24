'use strict';

/*
   New Perspectives on HTML5 and CSS3, 7th Edition
   Tutorial 9
   Case Problem 1

   Planisphere Script
   Author: Hunter Murphy
   Date:   4/19/2019

*/

/* setting the time and formatting it to the user's areas date format*/
var thisTime = new Date();
var timeStr = thisTime.toLocaleString();
/* calculating the map to use based on time of year*/
document.getElementById("timeStamp").innerHTML = timeStr;
var thisHour = thisTime.getHours();
var thisMonth = thisTime.getMonth();
var mapNum = (2 * thisMonth + thisHour) % 24;
/* Inserting map based on calculations above*/
var imgStr = ("<img src='sd_sky"+mapNum+".png' />");
document.getElementById("planisphere").insertAdjacentHTML("afterbegin",imgStr);