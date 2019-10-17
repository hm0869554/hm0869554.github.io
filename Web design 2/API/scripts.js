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