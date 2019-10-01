
const pen = {
    type: "ballpoint",
    color: "blue",
    brand: "bic"
};

//console.log(pen.type);
//console.log(pen.brand);
//console.log(pen.color);

pen.color = "red";
//console.log(pen.color)
//console.log(`I write wiath a ${pen.color} ${pen.brand} ${pen.type} pen` )

pen.price = 2.50
//console.log(`My pen costs $${pen.price}`)


//********************************************
const aurora = {
    name:"Aurora",
    health: 150,
    Strength: 25,
    xp: 0
};
//describe(aurora);
//console.log(`${aurora.name} has ${aurora.health} health points and ${aurora.Strength} as strength`)
// Aurora is harmed by an arrrow for 20 damage - reduce health by 20
aurora.health -=20;

//console.log(`${aurora.name} has ${aurora.health} health points remaining`);

//Aurora equips a strength necklace - increase strength by 20
aurora.Strength += 10;
aurora.xp +=15;
describe(aurora);
//console.log(`${aurora.name} has ${aurora.Strength} strength`)

function describe(character)
{
    console.log(`${character.name} has ${character.health} health points, ${character.Strength} as strength and ${character.xp} as XP`)
}

//const boris =
//{
//    name: "boris",
//    health: "100",
//    strength: "150",
//    describe(newName){
//        //console.log(`My name is ${this.name}!`)
//        this.name = newName;
//        return `My name is ${this.name}!`;
//    }
//}

// TODO : Make a dog object

const dog ={
    name: "Reggie",
    species: "St. Bernard",
    weight: "25 lbs",
    bark: "Woof Woof"
};

console.log(`${dog.name} is a ${dog.species} dog measuring ${dog.size}`);
console.log(`Look, a cat! ${dog.name} barks: ${dog.bark}`);

const account = {
    name : "Alex",
    balance: 0,
    credit(credit){
        //var balanceChange = credit - debit;
        this.balance += credit;
    },
    describe(){
        console.log(`owner : ${this.name}, balance ${this.balance}`)
    }
};

account.credit(250);
account.describe();
account.credit(-80);
account.describe();