
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
    name: "Aurora",
    health: 150,
    Strength: 25
};
describe(aurora);
//console.log(`${aurora.name} has ${aurora.health} health points and ${aurora.Strength} as strength`)
// Aurora is harmed by an arrrow for 20 damage - reduce health by 20
aurora.health -=20;

describe(aurora);
//console.log(`${aurora.name} has ${aurora.health} health points remaining`);

//Aurora equips a strength necklace - increase strength by 20
aurora.Strength += 10;
describe(aurora);
//console.log(`${aurora.name} has ${aurora.Strength} strength`)

function describe(character)
{
    console.log(`${character.name} has ${character.health} health points and ${character.Strength} as strength`)
}

const boris =
{
    name: "boris",
    health: "100",
    strength: "150",
    describe(newName){
        //console.log(`My name is ${this.name}!`)
        this.name = newName;
        return `My name is ${this.name}!`;
    }
}


console.log(boris.describe('john'));
