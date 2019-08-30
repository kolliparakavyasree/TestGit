class Greeter{
    private _privateVar="I'm private";
    public Name:string;
    public Contact:string[];
    public Place:string;
    public Extras:string[];
    constructor(pName:string="",pContact:string[],pPlace?:string,...pExtras:string[]){
        this.Name = pName;
        this.Contact = pContact;
        this.Place = pPlace;
        this.Extras = pExtras;
    }
}

// var greet = new Greeter("kavya",["Hyatt","Gachibowli"]);
// var greet = new Greeter("kavya",["Hyatt","Gachibowli"],"Hyderabad");
// var greet = new Greeter("kavya",["Hyatt","Gachibowli"],"Hyderabad","9898989898");
 var greet = new Greeter("kavya",["Hyatt","Gachibowli"],null,"9898989898");

console.log("Name: "+greet.Name);
console.log("Contact: "+greet.Contact);
console.log("Place: "+greet.Place);
console.log("Extras: "+greet.Extras);
