class Person {
    name: string;
    age: number;
    constructor(name: string, age: number) {
      this.name = name;
      this.age = age;
    }
  }
  class Employee extends Person {
    empId: number;
    constructor(name: string, age: number, empId: number) {
      super(name, age);
      this.empId = empId;
    }
  }
  var e = new Employee("Shruthi", 29, 2220);
  console.log(e);
  