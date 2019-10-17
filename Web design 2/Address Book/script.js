var counter = 6
function contact(name, Lname, phone, email, image)
{
   this.contactName = name;
   this.contactLname = Lname;
   this.contactPhone = phone;
   this.contactEmail = email;
   this.contactImage = image; 
   {
        
   } 
}

const contact1 = new contact("Mike", "Wazowski", "(417)248-2553", "MikeWazowski@Monsters.inc", "Mike.jpg");
const contact2 = new contact("James", "Sullivan", "(417)722-7464", "JamesPSullivan@Monsters.inc", "Sully.png");
const contact3 = new contact("Roz", "", "(417)623-7584","TurnInYourPaperwork@Monsters.inc","Roz.jpg");
const contact4 = new contact("Randall", "Boggs", "(417)737-8453", "RandallBoggs@Monsters.inc", "Randall.jpg");
const contact5 = new contact("Henry", "Waternoose", "(417)666-7837", "HenryJWaternooseIII@Monsters.inc", "Waternoose.jpg");
const contact6 = new contact();
const contact7 = new contact();
const contact8 = new contact();
const contact9 = new contact();
const contact10 = new contact();
contactList = [contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10]

function changeContact(i)
{
    console.log(contact2.contactName);
    document.getElementById('name').innerHTML = contactList[i].contactName;
    document.getElementById('Lname').innerHTML = contactList[i].contactLname;
    document.getElementById('phone').innerHTML = contactList[i].contactPhone;
    document.getElementById('email').innerHTML = contactList[i].contactEmail;
    document.getElementById('contactImage').src = contactList[i].contactImage;

}
var count = 5
function addContact()
{   
    console.log(contactList[4].contactName)
    contactList[count].contactName = document.getElementById('FName').value;
    contactList[count].contactLname = document.getElementById('LName').value;
    contactList[count].contactPhone = document.getElementById('Phone').value;
    contactList[count].contactEmail = document.getElementById('Email').value;
    contactList[count].contactImage = "Default.png";
    document.getElementById('Contacts').innerHTML= document.getElementById('Contacts').innerHTML + "<ul onclick = changeContact(" + count + ")>" + document.getElementById('FName').value + " " + document.getElementById('LName').value + "</ul>";
    count++;
}

