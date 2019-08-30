"use strict";
exports.__esModule = true;
var Circle = /** @class */ (function () {
    function Circle(pRadius) {
        this.Radius = pRadius;
    }
    Circle.prototype.Draw = function () {
        console.log(" O ");
    };
    Circle.prototype.Area = function () {
        return 3.14 * this.Radius * this.Radius;
    };
    return Circle;
}());
exports.Circle = Circle;
