import {IShape} from './IShape';
import { Rectangle } from './Rectangle';
import {Square} from './Square';
import { Circle } from './Circle';

function drawAllShapes(shapeToDraw: IShape){
    shapeToDraw.Draw();
}

var cObj = new Circle(5);
drawAllShapes(new Circle(5));
console.log("Area of Circle: "+cObj.Area());

var sObj = new Square(5);
drawAllShapes(new Square(5));
console.log("Area of Square: "+sObj.Area());

var rObj = new Rectangle(6,5);
drawAllShapes(new Rectangle(6,5));
console.log("Area of Rectangle: "+rObj.Area());
