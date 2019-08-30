"use strict";
exports.__esModule = true;
var Rectangle = /** @class */ (function () {
    function Rectangle(pLength, pBreadth) {
        this.Length = pLength;
        this.Breadth = pBreadth;
    }
    Rectangle.prototype.Draw = function () {
        console.log(" ___ ");
        console.log("|___|");
    };
    Rectangle.prototype.Area = function () {
        return this.Length * this.Breadth;
    };
    return Rectangle;
}());
exports.Rectangle = Rectangle;
