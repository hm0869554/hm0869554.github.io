
document.getElementById('clippy').addEventListener('click', doSomething);

//anonymous function
document.getElementById('newAnon').addEventListener('dblclick',  function (){
    alert("I got double Clicked")
});

function myGreeting(firstName){
    document.getElementById('greet').innerHTML = firstName;
    alert("you've been alerted")
}

function doSomething() {
    alert("I did something")
}

function theobj(anObject){
    alert(anObject.innerHTML);
}