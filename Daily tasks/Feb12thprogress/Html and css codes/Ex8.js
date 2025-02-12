for(let y=2014;y<=2050;y++){ 
    if(new Date(y,0,1).getDay()===0) 
        console.log(`1st January ${y} is a Sunday.`);
}
