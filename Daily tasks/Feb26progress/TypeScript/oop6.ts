class Student {
    name: string;
    roll: number;
    constructor(name: string, roll?: number) {
      this.name = name;
      this.roll = roll ?? 9;
    }
  }
  var s1 = new Student("Ramanand", 7);
  var s2 = new Student("Chandra");
  console.log(s1, s2);
  