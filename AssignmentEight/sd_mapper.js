"use strict";

/*
   New Perspectives on HTML5 and CSS3, 7th Edition
   Tutorial 9
   Case Problem 1

   Planisphere Script
   Author: Hunter Murphy
   Date:   4/19/2019

*/

var thisTime = new Date("February 3, 2018 3:15:28");
var timeStr = thisTime.toLocaleString()
document.getElementById("timeStamp").innerHTML = timeStr
var thisHour = timeStr.getHours()
var thisMonth = timeStr.getMonth()
var mapNum = (2 * thisMonth + thisHour)%24
imgStr = ("<img src='sd_sky" + mapNum + ".png' />")
var pic = document.getElementById("planisphere")
insertAdjacentHTML("afterbegin", imgStr)