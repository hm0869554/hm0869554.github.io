

function imageSwap(Image)
{
    document.getElementById('Shift').src = Image;
}

document.getElementById('Shift').addEventListener('dblclick', function(){
    if (document.getElementById('mike').src == "Mike.jpg"){
        document.getElementById('mike').src = "Cecillia.jpg";
        document.getElementById('Sully').src = "Boo.jpg";
        document.getElementById('Randall').src = "Fungus.jpg";
        document.getElementById('Roz').src = "Waternoose.jpg";
    }
    else{
        document.getElementById('mike').src = "Mike.jpg";
        document.getElementById('Sully').src = "Sully.png";
        document.getElementById('Roz').src = "Roz.jpg";
        document.getElementById('Randall').src = "Randall.jpg";
    }
})