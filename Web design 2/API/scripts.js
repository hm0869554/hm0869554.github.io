var obj = 
{
    movie: "hawaii 5-0",
    budget : 63000000,
    genres: {
        id: 18,
        name: "Drama"
    }
}

//conver javascript Object to JSON
var jsonString = JSON.stringify(obj);
console.log(jsonString);

//convert JSON to a javascript object
var backtoObject = JSON.parse(jsonString);
console.log(backtoObject);

window.addEventListener("load" , initializePage)


function initializePage()
{
    document.getElementById('movieTitle').innerHTML = backtoObject.movie;
    document.getElementById('desc').innerHTML = backtoObject.genres.name;
}