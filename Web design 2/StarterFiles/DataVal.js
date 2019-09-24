var newStr = "My name is Stitch - Rambo was tough to watch";
//console.log(newStr.length);
//console.log(newStr.charat(5))


//******    for(var i=0 ; i < newStr.length; i++)
//{
  //  console.log(newStr.charAt(i));
//} 

//*********three use cases */


//**** Validation */

var phoneNumber = "41a7-447-8297"
var regex = /\d{3}[-.]\d{3}[.-]\d{4}/
var isValid = regex.test(phoneNumber)
console.log(isValid)


//*** Extraction */
var address = "1001 N Chestnut Expressway, Springfield, MO 65872";
var nameTest = address.match(/[A-Z]+\s\d{5}$/);
console.log(nameTest)
//**Replace */

var name = "Hunter does Javascript, aloha hunter";
var replaceIt = name.replace(/hunter/gi, "Stitch");
console.log(replaceIt);