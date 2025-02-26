function scopeExample() {
    var a = 10;
    var b = 20;
    var c = 30;
    if (true) {
        var a = 40;
        var b_1 = 50;
    }
    console.log(a);
    console.log(b);
}
scopeExample();
