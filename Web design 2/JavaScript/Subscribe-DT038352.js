

function Joseph()
{
    var fname;
    var lname;
    var contact;
    var aString;

    fname = document.getElementById("fName").value;
    lname = document.getElementById("lName").value;
    contact = document.getElementById("contact").value;

    aString= "<label>First Name</label><p>" + fname + "</p><label>Last Name</label><p>" + lname 
    + "</p><label>Contact</label><p>" + contact + "</p>";

    document.getElementById('subClick').innerHTML = aString;
}