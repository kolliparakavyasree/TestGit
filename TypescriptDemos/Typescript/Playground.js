function HaveFun(partyName) {
    var a = "0";
    var a1 = 0;
    var arr = ["", "", ""];
    var obj = { k1: "", k2: "", k3: [1, 2, 3] };
    return "Nice party at " + partyName;
}
var output = HaveFun("Freshers' Party");
console.log(output);
//class interface public private protected static
var A = /** @class */ (function () {
    function A() {
    }
    A.prototype.fun = function () {
        this.prop1 = "value";
        console.log("Hello");
    };
    A.stProp = 100;
    return A;
}());
var objA = new A();
console.log(objA.fun());
console.log(objA.prop1);
console.log(A.stProp);
