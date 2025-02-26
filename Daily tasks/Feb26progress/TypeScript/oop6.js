var Student = /** @class */ (function () {
    function Student(name, roll) {
        this.name = name;
        this.roll = roll !== null && roll !== void 0 ? roll : 9;
    }
    return Student;
}());
var s1 = new Student("Ramanand", 7);
var s2 = new Student("Chandra");
console.log(s1, s2);
