function gg(str) {
    let lastChar = str[str.length - 1]; 
    let rotatedStr = lastChar + str.slice(0, -1);
    console.log(rotatedStr);
}

gg("digiterati");
