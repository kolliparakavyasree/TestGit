function fooTraditional(x) {
    x = 10 + x;
    console.log(x);
}
var foo = function (x) {
    x = 10 + x;
    console.log(x);
};
var doSomething = function (y) { return function (x) { return y * y * x; }; };
var result1 = doSomething(5);
console.log(result1(10));
console.log(doSomething(10)(5)); //Currying of functions
function doSomethingTrad(y) {
    return function sub(x) {
        return y * y * x;
    };
}
(function (x) {
    x = 10 + x;
    console.log(x);
})(13);
fooTraditional(12);
foo(100);
