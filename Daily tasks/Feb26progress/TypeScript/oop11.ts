class Shape {
    color: string;
    constructor(color: string) {
      this.color = color;
    }
    draw() {
      console.log("Drawing");
    }
  }
  class Circle extends Shape {
    draw() {
      console.log("Drawing a circle");
    }
  }
  var c = new Circle("Red");
  c.draw();
  