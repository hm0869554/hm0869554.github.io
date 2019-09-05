var myAppName = "index"

function myGreeting(myName){
    myName = document.getElementById('theName').value;
    var aString = "<h2>Greetings " + myName + " from " + myAppName + "</h2>";
    document.getElementById('greet').innerHTML = aString;
}