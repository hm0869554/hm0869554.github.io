//var timer = setInterval(runTimer, 3000)

//function runTimer(){
//    var num = Math.ceil(Math.random() * 5)
//    document.getElementById('theTimer').innerHTML = num;
//}

function valForm(form)
{
    var isValid = true;
    if(form.userName.value  == "")
    {
        document.getElementById('err').innerHTML = 
        "please fill out pink fields";

        form.userName.style.backgroundColor = "pink";
        isValid = false;
    }
    else
    {form.userName.style.backgroundColor ="white"}


    if(form.Email.value == "")
    {
        document.getElementById('err').innerHTML =
        "please fill out pink fields";

        form.Email.style.backgroundColor = "pink";
        isValid = false;
    }
    else
    {
        form.Email.styel.backgroundColor="white";
    }


    var phoneNumber = form.phone.value ;
    var regex = /\d{3}[-]?\d{3}[-]?\d{4}/
    var phoneValid = regex.test(phoneNumber)
    if(!phoneValid)
    {
        document.getElementById('valPhone').innerHTML=
        "Please enter a valid phone number";
        form.phone.style.backgroundColor = "pink";
        isValid=false;
    }

    else
    {
        form.phone.style.backgroundColor = "white";
    }

    //if (isValid == true)
    //{
    //    form.submit();
    //}

    return isValid
    
}
function printQuery()
    {
        var query = window.location.search.substring(1);
        var valPairs = query.split("&");
        for (var i = 0; i < valPairs.length; i++)
        {
            var pair = valPairs[i].split("=")
            document.write(`${pair[0]} gets ${pair[1]}<br>` )
        }
    }