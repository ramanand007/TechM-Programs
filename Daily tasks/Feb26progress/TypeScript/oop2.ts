class Bus {
    make: string;
    model: string;
    year: number;
    constructor(make: string, model: string, year: number) {
      this.make = make;
      this.model = model;
      this.year = year;
    }
    start() {
      console.log("Bus has started");
    }
  }
  var b = new Bus("M Benz", "GLA", 2017);
  b.start();
  