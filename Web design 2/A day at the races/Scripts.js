//Starts the race
var timer
function StartRace()
{

    document.getElementById("Light").src= "GreenLight.png";
    timer = setInterval(Race, 100);
    
}

//Reset the Race after the winner is declared
function ResetRace()
{
    if(document.getElementById('Winner').src != "Green.png")
    {
        document.getElementById('Light').src = "Red Light.png";
        img1 = 300;
        img2 = 300;
        document.getElementById('Randall').style.left = img1 + "px";
        document.getElementById('Mike').style.left = img2 +"px";
        document.getElementById('Winner').src = "Green.png"
        document.getElementById('WinnerMessage').src = "Green.png"
    }
}

//Starting pixel values for the race
var img1 = 300;
var img2 = 300;

function Race()
{   
    //Gets a random number for the new pixel value
    img1 += Math.ceil( Math.random() * 10);
    img2 += Math.ceil( Math.random() * 10);
    
    //Moves the images along the racetrack based on the random value
    document.getElementById('Randall').style.left = img1 + "px";
    document.getElementById('Mike').style.left = img2 + "px";
    
    //Breaks the loop if one of the racers crosses the line
    if(img1 >= 1475){
        img1 = 1475;
        document.getElementById('Randall').style.left = img1 + "px";
        document.getElementById('Winner').src = "RandallRunning.png";
        document.getElementById('WinnerMessage').src = "Winner.png";
        clearInterval(timer);
        
    }
    if(img2 >= 1475){
        img2 = 1475;
        document.getElementById('Mike').style.left = img2 + "px";
        document.getElementById('Winner').src = "MikeRunning.png"
        document.getElementById('WinnerMessage').src = "Winner.png";
        clearInterval(timer);
        
    }
    
}
