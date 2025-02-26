var Student = /** @class */ (function () {
    function Student(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
    return Student;
}());
var s = new Student("Sam", 20);
console.log(s);
