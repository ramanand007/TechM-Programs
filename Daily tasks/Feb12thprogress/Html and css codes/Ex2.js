function d(){ 
    let d=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
    let n=new Date(),h=n.getHours(),m=n.getMinutes(),s=n.getSeconds();
    let p=h>=12?"PM":"AM"; 
    h=h%12||12; 
    console.log(`Today is : ${d[n.getDay()]}.`);
    console.log(`Current time is : ${h} ${p} : ${m} : ${s}`);
}
d();
