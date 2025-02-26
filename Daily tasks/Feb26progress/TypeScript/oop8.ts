class Student {
    name: string;
    age: number;
    constructor(name: string, age: number) {
      this.name = name;
      this.age = age > 0 ? age : 0;
    }
  }
  var s = new Student("Sam",20);
  console.log(s);
  