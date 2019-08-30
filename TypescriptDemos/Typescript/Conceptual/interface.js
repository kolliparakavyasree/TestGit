"use strict";
exports.__esModule = true;
var Robot = /** @class */ (function () {
    function Robot(pName, pSpecs) {
        this.Talk = function () { return "Robot Talking...!"; };
        this.Name = pName;
        this.specs = pSpecs;
    }
    Robot.prototype.Walk = function () { return "Robot Walking...!"; };
    ;
    return Robot;
}());
var kitti = new Robot("kitti", "A869");
console.log(kitti);
console.log(kitti.Walk());
console.log(kitti.Talk());
