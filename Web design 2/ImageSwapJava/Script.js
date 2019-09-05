var clicked = 0;

function imageSwap(Image)
{
    document.getElementById('Shift').src = Image;
}

document.getElementById('Shift').addEventListener('dblclick', function(){
    if (clicked % 2 == 0){
    document.getElementById('mike').src = "Cecillia.jpg";
    document.getElementById('Sully').src = "Boo.jpg";
    document.getElementById('Randall').src = "Fungus.jpg";
    document.getElementById('Roz').src = "Waternoose.jpg";
    clicked = clicked + 1;}
    else {
        document.getElementById('mike').src = "Mike.jpg";
        document.getElementById('Sully').src = "Sully.png";
        document.getElementById('Randall').src = "Randall.jpg";
        document.getElementById('Roz').src = "Roz.jpg";
        clicked = clicked + 1;
    }

})