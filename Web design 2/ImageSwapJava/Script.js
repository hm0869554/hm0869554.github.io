var clicked = 0;
var counter = 0;
var myPictures = ["Mike.jpg",
"Sully.png",
"Roz.jpg",
"Randall.jpg",
"Cecillia.jpg",
"Boo.jpg",
"Waternoose.jpg",
"Fungus.jpg"]

var myTimer = setInterval(imageSwap, 3000);
function imageSwap(Image)
{
    counter++;
    if (counter > myPictures.length -1){
        counter = 0;
    }
    Image = myPictures[counter];
    document.getElementById('Shift').src = Image;
}
