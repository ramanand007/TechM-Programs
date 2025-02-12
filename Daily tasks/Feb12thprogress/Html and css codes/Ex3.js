function dates() {
    let n = new Date(), d = n.getDate(), m = n.getMonth() + 1, y = n.getFullYear();

    console.log(`${m}-${d}-${y}`);
}
dates();
