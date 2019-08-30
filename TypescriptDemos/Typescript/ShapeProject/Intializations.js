"use strict";
exports.__esModule = true;
var Rectangle_1 = require("./Rectangle");
var Square_1 = require("./Square");
var Circle_1 = require("./Circle");
function drawAllShapes(shapeToDraw) {
    shapeToDraw.Draw();
}
var cObj = new Circle_1.Circle(5);
drawAllShapes(new Circle_1.Circle(5));
console.log("Area of Circle: " + cObj.Area());
var sObj = new Square_1.Square(5);
drawAllShapes(new Square_1.Square(5));
console.log("Area of Square: " + sObj.Area());
var rObj = new Rectangle_1.Rectangle(6, 5);
drawAllShapes(new Rectangle_1.Rectangle(6, 5));
console.log("Area of Rectangle: " + rObj.Area());
