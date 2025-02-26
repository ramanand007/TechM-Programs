var Bus = /** @class */ (function () {
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Bus.prototype.start = function () {
        console.log("Bus has started");
    };
    return Bus;
}());
var b = new Bus("M Benz", "GLA", 2017);
b.start();
