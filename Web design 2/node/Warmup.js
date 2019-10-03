const dog = {
    name: "scout",
    breed: "Jack Russel",
    birthdate: new Date(),
    speak(sound){
        return sound;
    },
    setDate(birthday){
        this.birthdate = new Date(birthday);
    }
}

// console.log(`${dog.name} is a ${dog.breed} and says `);
// console.log(dog.speak("Woof Woof"));

// var d = new Date();
// console.log(d);

// d = new Date("2018-05-01");
// console.log(d);

// aryMon = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec']
// console.log(aryMon[dog.birthdate.getMonth()]);
// dog.setDate("2018-01-17");
// console.log(dog.birthdate);


//------------

function order(item,qty,price, purchaseDate){
    this.orderItem = item;
    this.orderQty = qty;
    this.orderPrice = price;
    this.orderDate = new Date(purchaseDate);
    this.displayOrder = function()
    {
        var subTotal = this.orderQty * this.orderPrice;
        return `${this.orderItem} and total is ${subTotal}`;
    },
    this.updateQty = function(qty)
    {
        this.orderQty = qty;
    }
}


const order1 = new order("DVD" , 1, 10.99, Date.now());
console.log(order1);
for (items in order1)
{
    //console.log(items);
    //console.log(order1[items]);
}

console.log(order1.displayOrder());

order1.updateQty(7);

console.log(order1.displayOrder());

const order2 = new order("Vinyl Record", 5, 29.99, Date.now());
console.log(order2.displayOrder());
order2.updateQty(1);
console.log(order2.displayOrder());

order3 = new order(dog, 1 , 100, Date.now());
console.log(order3);