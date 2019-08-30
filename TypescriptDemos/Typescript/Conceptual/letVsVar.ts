var abc = 100;
if(abc==100){
    let abc = 200;
    console.log(abc);
}
console.log(abc);

var tuple:any[] = [122,"abc",[1,2,3],{id:1,value:488587}];

for(let index = 0;index<tuple.length;index++){
    var item:number = <number>tuple[index]; //typecasting

}
// union - use | symbol
function show(name:string|string[]){

}

//>tsc filename.ts --module commonjs
//>