class Engine {
    horsepower: number;
    fuelType: string;
    constructor(hp: number, fuel: string) {
      this.horsepower = hp;
      this.fuelType = fuel;
    }
  }
  class Car {
    make: string;
    model: string;
    year: number;
    engine: Engine;
    constructor(make: string, model: string, year: number, engine: Engine) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.engine = engine;
    }
    printCarDetails() {
      console.log(this.make, this.model, this.year, this.engine.horsepower, this.engine.fuelType);
    }
  }
  var c = new Car("BMW", "M5 CS", 2024, new Engine(800, "Petrol"));
  c.printCarDetails();
  