//const chalk = require('chalk');

const moment = require('moment');

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

// var fiveYears = moment(now).add('years', 5);
// fiveYears = moment(fiveYears).format("MMMM Do YYYY")
//     console.log("The Date five years from now will be " + fiveYears);


readline.question("What is the date? ", (date) => {
    var now = moment(date, ["YYYY-MM-DD", "MM-DD-YYYY",]);
    var newFormat;
    newFormat = moment(now).format()
    console.log(newFormat);
    newFormat = moment(now).format("MMMM Do YYYY");
    console.log(newFormat);
    newFormat = moment(now).format("MMM Do YYYY");
    console.log(newFormat);
    var fiveYears = moment(now).add('years', 5);
    fiveYears = moment(fiveYears).format("MMMM Do YYYY");
    console.log("The Date five years from now will be " + fiveYears);
    readline.close();
    
    
})