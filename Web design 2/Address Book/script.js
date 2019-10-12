function contact(name, Lname, phone, email, image)
{
   this.contactName = name;
   this.contactLname = Lname;
   this.contactPhone = phone;
   this.contactEmail = email;
   this.contactImage = image; 
   this.displayContact = function(i)
   {
        document.getElementById('name').innerHTML = contactList[i].name;
        document.getElementById('Lname').innerHTML = contactList[i].Lname;
        document.getElementById('phone').innerHTML = contactList[i].phone;
        document.getElementById('email').innerHTML = contactList[i].email;
        document.getElementById('contactImage').src = contactList[i].image; 
   } 
}

var contactList = 
[
    {name = "Nancy", Lname = "Gillette", phone = "(417) 967-1125", email = "Nancygillette@gmail.com", image = "Mike.jpg"}
]

document.querySelector('ul').addEventListener('click', function()
{
    
})