var fname;
var lname;
var contact;
var submitOut

function Submit(){
    fname = document.getElementById('fName').value;
    lname = document.getElementById('lName').value;
    contact = document.getElementById('contact').value;
    submitOut = "<label>First Name</label><p>" + fname + "</p>" + "<label>Last Name</label><p>" 
    + lname +"</p>" + "<label>Contact Method</label><p>" + contact + "</p>";
     document.getElementById("subDiv").innerHTML = submitOut;
}