class Shape {
    color: string;
    constructor(color: string) {
      this.color = color;
    }
  }
  class Circle extends Shape {
    radius: number;
    constructor(color: string, radius: number) {
      super(color);
      this.radius = radius;
    }
  }
  var c = new Circle("Grey", 7);
  console.log(c);
  