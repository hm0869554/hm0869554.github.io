const Sword = {
    Item: "Sword",
    Strength: 30
}

function char(name, Strength, item){
    this.charName = name;
    this.charStrength = Strength;
    this.charItem = item;
    this.collectitems = function(newItem){
        var newStrength;
        this.CharItem = newItem;
        newStrength = this.charStrength + newItem.Strength;
        this.charStrength = newStrength;
        return this.charStrength;
    }
}

const char1 = new char("Jack" , 30, "");

console.log(char1);

char1.collectitems(Sword);

console.log(char1);

const char2 = new char("Joseph" , 45, "")

console.log(char2.charName);