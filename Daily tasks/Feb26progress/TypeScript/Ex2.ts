function scopeExample() {
    var a = 10;
    let b = 20;
    const c = 30;

    if (true) {
        var a = 40;
        let b = 50; 
        
    }
    console.log(a);
    console.log(b);
}
scopeExample();