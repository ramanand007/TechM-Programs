class Car {
    make: string;
    model: string;
    year: number;
    constructor(make: string, model: string, year: number) {
      this.make = make;
      this.model = model;
      this.year = year;
    }
  }
  class SUV extends Car {
    offroad: boolean;
    constructor(make: string, model: string, year: number, offroad: boolean) {
      super(make, model, year);
      this.offroad = offroad;
    }
    toggleOffroad() {
      this.offroad = !this.offroad;
      console.log("Offroad mode:", this.offroad);
    }
  }
  var s = new SUV("Thar", "Roxx", 2024, true);
  s.toggleOffroad();
  