function order(item, qty, Price){
    this.orderItem = item;
    this.orderQty = qty;
    this.orderPrice = Price;
    this.displayOrder = function()
    {
        var subTotal = this.orderQty * this.orderPrice;
        subTotal = Math.ceil(subTotal * 100)/100;
        return `${this.orderItem} and total is ${subTotal}`
    }
}

const order1 = new order("Game" , 1 , 50.99,);

const order2 = new order("Candy" , 2, 19.99);

var aryOrders = [order1,order2]

for(var i = 0; i < aryOrders.length; i++)
{
    //console.log(aryOrders[i].displayOrder());
}

document.querySelector('h4').addEventListener('click', function(){
    var myList = "";

    for (var i = 0; i < aryOrders.length; i++)
    {
        myList += `<li id=${i} > ${aryOrders[i].orderItem}</li>`;
    }
    
    document.getElementById('orders').innerHTML = myList;
})