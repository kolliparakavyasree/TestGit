var Greeter = /** @class */ (function () {
    function Greeter(pName, pContact, pPlace) {
        if (pName === void 0) { pName = ""; }
        var pExtras = [];
        for (var _i = 3; _i < arguments.length; _i++) {
            pExtras[_i - 3] = arguments[_i];
        }
        this._privateVar = "I'm private";
        this.Name = pName;
        this.Contact = pContact;
        this.Place = pPlace;
        this.Extras = pExtras;
    }
    return Greeter;
}());
// var greet = new Greeter("kavya",["Hyatt","Gachibowli"]);
// var greet = new Greeter("kavya",["Hyatt","Gachibowli"],"Hyderabad");
// var greet = new Greeter("kavya",["Hyatt","Gachibowli"],"Hyderabad","9898989898");
var greet = new Greeter("kavya", ["Hyatt", "Gachibowli"], null, "9898989898");
console.log("Name: " + greet.Name);
console.log("Contact: " + greet.Contact);
console.log("Place: " + greet.Place);
console.log("Extras: " + greet.Extras);
