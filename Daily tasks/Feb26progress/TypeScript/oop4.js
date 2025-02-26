var Engine = /** @class */ (function () {
    function Engine(hp, fuel) {
        this.horsepower = hp;
        this.fuelType = fuel;
    }
    return Engine;
}());
var Car = /** @class */ (function () {
    function Car(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    Car.prototype.printCarDetails = function () {
        console.log(this.make, this.model, this.year, this.engine.horsepower, this.engine.fuelType);
    };
    return Car;
}());
var c = new Car("BMW", "M5 CS", 2024, new Engine(800, "Petrol"));
c.printCarDetails();
