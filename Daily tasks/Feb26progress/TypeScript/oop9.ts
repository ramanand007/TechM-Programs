class Animal {
    name: string;
    species: string;
    constructor(name: string, species: string) {
      this.name = name;
      this.species = species;
    }
  }
  class Tiger extends Animal {
    roar() {
      console.log(this.name, "is roaring!");
    }
  }
  var t = new Tiger("Madmax", "White Tiger");
  t.roar();
  