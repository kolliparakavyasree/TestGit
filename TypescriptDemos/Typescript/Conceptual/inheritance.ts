import {IActivities} from './interface';

export class Person implements IActivities{
    Name:string;
    protected Age:number;
    Gender:any[] = ["Male","Female"];
    Aadhar:string;

    constructor(pName:string,pAge:number){
        this.Name = pName;
        this.Age = pAge;        
    }

    public Walk():string{ return "Walking...!"};
    public Talk = () => "Talking...!";
}

export class Employee extends Person{
    EmployeeId:number;
    Department:string;
    private _salary:number;
    static someNumber = 20000;

    constructor(pName:string,pAge:number,pDept:string,pSalary:number){
        super(pName,pAge);
        this.EmployeeId = this.GenerateEmpId();
        this.Department = pDept;
        this._salary = pSalary;
    }

    private GenerateEmpId(){
        return Employee.someNumber++;
    }

    GetEmployeeDetails(){
        return this;
    }
    
    GetAge(){
        return this.Age;
    }

    GetSalary(){
        return this._salary;
    }
}

// var keerthi = new Employee("Keerthi M",21,"BE",2000000);
// console.log(keerthi.GetEmployeeDetails());
// console.log(keerthi.GetAge());

var keerthi = new Person("Keerthi M",21);
console.log(keerthi);
console.log(keerthi.Talk());
console.log(keerthi.Walk());
