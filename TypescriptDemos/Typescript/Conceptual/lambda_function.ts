function fooTraditional(x:number){
    x= 10 + x
    console.log(x)
}

var foo = (x:number)=> {
    x= 10+x
    console.log(x)
}

var doSomething=(y:number) => (x) => y*y*x;

var result1 = doSomething(5);

console.log(result1(10));

console.log(doSomething(10)(5)); //Currying of functions

function doSomethingTrad(y:number):any{
    return function sub(x:any):number{
        return y*y*x;
    }
}

((x:number)=> {
    x= 10+x
    console.log(x)
})(13);

fooTraditional(12);
foo(100);