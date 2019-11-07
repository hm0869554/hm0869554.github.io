//Declared variables are at the bottom to avoid clutter at the top
var countdown;
countdown = setInterval(updateCountdown,1000);
//Function for the loading of the next five launches

function aFunction()
{
    if(nextFive.readyState == 4 && nextFive.status == 200)
    {   var nextFivelaunches = nextFive.responseText;
        var jsNextFive = JSON.parse(nextFivelaunches);
        console.log(jsNextFive);
        name1 = jsNextFive.launches[0].name;
        name2 = jsNextFive.launches[1].name;
        name3 = jsNextFive.launches[2].name;
        name4 = jsNextFive.launches[3].name;
        name5 = jsNextFive.launches[4].name;
        launchTime1 = jsNextFive.launches[0].net;
        launchTime2 = jsNextFive.launches[1].net;
        launchTime3 = jsNextFive.launches[2].net;
        launchTime4 = jsNextFive.launches[3].net;
        launchTime5 = jsNextFive.launches[4].net;
        updateList();
        updateCountdown();
        document.getElementById('Title').innerHTML = "Next Five Launches"
    }
      
}

//Function for the next five Falcon Launches
function bFunction()
{  
    if(Falcon.readyState == 4 && Falcon.status == 200)
    {
        var FalconLaunches = Falcon.responseText;
        var jsFalconLaunches = JSON.parse(FalconLaunches);
        console.log(jsFalconLaunches);
        name1 = jsFalconLaunches.launches[0].name;
        name2 = jsFalconLaunches.launches[1].name;
        name3 = jsFalconLaunches.launches[2].name;
        name4 = jsFalconLaunches.launches[3].name;
        name5 = jsFalconLaunches.launches[4].name;
        launchTime1 = jsFalconLaunches.launches[0].net;
        launchTime2 = jsFalconLaunches.launches[1].net;
        launchTime3 = jsFalconLaunches.launches[2].net;
        launchTime4 = jsFalconLaunches.launches[3].net;
        launchTime5 = jsFalconLaunches.launches[4].net;
        updateList();
        updateCountdown();
        document.getElementById('Title').innerHTML = "Next Five Falcon Launches";
    }
}

//Function for the next five Ariane Launches
function cFunction()
{
    if(Ariane.readyState == 4 && Ariane.status == 200)
    {
        var ArianeLaunches = Ariane.responseText;
        var jsArianeLaunches = JSON.parse(ArianeLaunches);
        console.log(jsArianeLaunches);
        name1 = jsArianeLaunches.launches[0].name;
        name2 = jsArianeLaunches.launches[1].name;
        name3 = jsArianeLaunches.launches[2].name;
        name4 = jsArianeLaunches.launches[3].name;
        name5 = jsArianeLaunches.launches[4].name;
        launchTime1 = jsArianeLaunches.launches[0].net;
        launchTime2 = jsArianeLaunches.launches[1].net;
        launchTime3 = jsArianeLaunches.launches[2].net;
        launchTime4 = jsArianeLaunches.launches[3].net;
        launchTime5 = jsArianeLaunches.launches[4].net;
        updateList();
        updateCountdown();
        document.getElementById('Title').innerHTML = "Next Five Ariane Launches";
    }
}

//Function for the next five Launcherone launches
function dFunction() 
{
    if(Launcherone.readyState == 4 && Launcherone.status == 200)
    {
        var LauncheroneLaunches = Launcherone.responseText;
        var jsLauncheroneLaunches = JSON.parse(LauncheroneLaunches);
        console.log(jsLauncheroneLaunches);
        
    }
        name1 = jsLauncheroneLaunches.launches[0].name;
        name2 = jsLauncheroneLaunches.launches[1].name;
        name3 = jsLauncheroneLaunches.launches[2].name;
        name4 = jsLauncheroneLaunches.launches[3].name;
        name5 = jsLauncheroneLaunches.launches[4].name;
        launchTime1 = jsLauncheroneLaunches.launches[0].net;
        launchTime2 = jsLauncheroneLaunches.launches[1].net;
        launchTime3 = jsLauncheroneLaunches.launches[2].net;
        launchTime4 = jsLauncheroneLaunches.launches[3].net;
        launchTime5 = jsLauncheroneLaunches.launches[4].net;
        updateList();
        updateCountdown();
        document.getElementById('Title').innerHTML = "Next Five Launcher One Launches";
}


//Updates the list when the functions above changes the values
function updateList()
{
    document.getElementById('launch1').innerHTML = "<strong>Launch 1  </strong> " + name1 + " " + launchTime1;
    document.getElementById('launch2').innerHTML = "<strong>Launch 2  </strong> " + name2 + " " + launchTime2;
    document.getElementById('launch3').innerHTML = "<strong>Launch 3  </strong> " + name3 + " " + launchTime3;
    document.getElementById('launch4').innerHTML = "<strong>Launch 4  </strong>" + name4 + " " + launchTime4;
    document.getElementById('launch5').innerHTML = "<strong>Launch 5  </strong> " + name5 + " " + launchTime5;
}

function updateCountdown()
{
    console.log("Countdown Updated");
    var dateToday = new Date();

    var dateconvert = Date.parse(launchTime1);
    console.log(dateconvert);
    var dateFrom = Date.UTC(dateToday.getFullYear(),dateToday.getMonth(), dateToday.getDate(), dateToday.getHours(), dateToday.getMinutes(), dateToday.getSeconds());
    
     //var dateTo = Date.UTC(dateconvert.getfullYear(),dateconvert.getMonth(), dateconvert.getDate(),19,0,0);
       // .getFullYear,launchTime1.getMonth, launchTime1.getDate,19,0,0);
    var daysUntil = Math.floor((dateconvert - dateFrom) / 86400000);
    document.getElementById("countdown").innerHTML = "Countdown to next launch  <br>" + daysUntil + " days ";

    var fractionalDay = (dateconvert - dateFrom) % 86400000; 
    hoursUntil = Math.floor(fractionalDay / 3600000);
    if(hoursUntil < 10){
        hoursUntil = "0" + hoursUntil;
    }
    document.getElementById("countdown").innerHTML += ": " + hoursUntil + " hours ";

    var fractionalHour = fractionalDay % 3600000;
    minutesUntil = Math.floor(fractionalHour / 60000);
    if(minutesUntil < 10) {
        minutesUntil = "0" + minutesUntil;
    }
    
    document.getElementById("countdown").innerHTML += ": " + minutesUntil + " minutes ";

    var fractionalMinute = fractionalHour % 60000;
    secondsUntil = Math.floor(fractionalMinute / 1000);
    if(secondsUntil < 10){
        secondsUntil = "0" + secondsUntil;
    }

    document.getElementById("countdown").innerHTML += ": " + secondsUntil + " seconds "
}

//gets the information for the 4 different kinds of launches
var nextFive = new XMLHttpRequest();
    nextFive.open("get", "https://launchlibrary.net/1.4/launch/next/5")
    nextFive.send(null);
    nextFive.onreadystatechange = aFunction;

var Falcon = new XMLHttpRequest();
    Falcon.open("get", "https://launchlibrary.net/1.4/launch/next/5?name=falcon")
    Falcon.send(null);
    //Falcon.onreadystatechange = bFunction

var Ariane = new XMLHttpRequest();
    Ariane.open("get", "https://launchlibrary.net/1.4/launch/next/5?name=ariane")
    Ariane.send(null);
    //Ariane.onreadystatechange = cFunction

var Launcherone = new XMLHttpRequest();    
    Launcherone.open("get", "https://launchlibrary.net/1.4/launch/next/5?name=launcherone")
    Launcherone.send(null);
    //Launcherone.onreadystatechange = dFunction

    // name and launch time variables
    var name1;
    var name2;
    var name3;
    var name4;
    var name5;
    var launchTime1 = new Date();
    var launchTime2 = new Date();
    var launchTime3 = new Date();
    var launchTime4 = new Date();
    var launchTime5 = new Date();


