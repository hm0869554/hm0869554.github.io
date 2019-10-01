//var timer = setInterval(runTimer, 3000)

//function runTimer(){
//    var num = Math.ceil(Math.random() * 5)
//    document.getElementById('theTimer').innerHTML = num;
//}
function list(){
    var quantityValue;
    for(var i = 0; i< 11; i++)
    {
        quantityValue += "<option value='" + i + "'>" + i + "</option>"
    }

    document.getElementById('quantity').innerHTML= quantityValue;

    var pizzaArray= ["Cheese", "Pepperonni", "Supreme", "Taco", "Meat Lovers"];
    var pizzaValue;
    for(var i = 0; i< 5; i++)
    {
        pizzaValue += "<option value='" + pizzaArray[i] + "'>" + pizzaArray[i] + "</option>"
    }

    document.getElementById('items').innerHTML= pizzaValue;
}

function quantitySelect(quantity)
{
    var quantityValue = quantity;
    document.getElementById('quantity').value = quantityValue;

}

function itemSelect(Item)
{
    var itemSelection = Item;
    document.getElementById('items').String = itemSelection;
}

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
    {form.userName.style.backgroundColor ="white"
        document.getElementById('err').innerHTML=
        ""
    }


    var phoneNumber = form.phone.value ;
    var regex = /[(]?\d{3}[)]?\s?[-]?\d{3}[-]?\d{4}/
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
        document.getElementById('valPhone').innerHTML=
        ""
    }

    if(isValid)
    {
        var tax = .076;
        var pizzaType = document.getElementById('items').value;
        var pizzaQuantity = document.getElementById('quantity').value;
        var orderSubTotal = 5 * pizzaQuantity;
        var pizzaTax = tax * orderSubTotal;
        var orderTotal = orderSubTotal + pizzaTax;

        document.getElementById('orderTotal').innerHTML = 
       "<p>Your order is "+ pizzaQuantity + " " + pizzaType +" pizzas</p><br> "+
       "<p>Order subtotal is $" + orderSubTotal + "</p><br>" + 
       "<p>Tax is $" + pizzaTax + "</p><br>"+ 
       "<p>order total is $" + orderTotal + "</p>";


    }

    //if (isValid == true)
    //{
    //    form.submit();
    //}
    
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