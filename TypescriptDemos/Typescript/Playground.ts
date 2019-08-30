function HaveFun(partyName:string):string{
    var a:string = "0";
    var a1:number = 0;
    var arr:string[] = ["","",""];
    var obj:any = {k1:"",k2:"",k3:[1,2,3]}; 
    return "Nice party at "+partyName;
}

var output = HaveFun("Freshers' Party");
console.log(output);

//class interface public private protected static

class A{
    public prop1: string;
    public static stProp:number = 100;
    public fun(){
        this.prop1 ="value";
        console.log("Hello");
    }
}

var objA:A = new A();
console.log(objA.fun());
console.log(objA.prop1);
console.log(A.stProp);
