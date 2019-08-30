export interface IActivities{
    Walk():string;
    Talk:()=>string;
}

class Robot implements IActivities{
    Name:string;
    protected specs:string;

    constructor(pName:string,pSpecs:string){
        this.Name = pName;
        this.specs = pSpecs;        
    }

    public Walk():string{ return "Robot Walking...!"};
    public Talk = () => "Robot Talking...!";

}

var kitti = new Robot("kitti","A869");
console.log(kitti);
console.log(kitti.Walk());
console.log(kitti.Talk());

