function daysUntilChristmas() {
    let t = new Date(), c = new Date(t.getFullYear(), 11, 25);
    if (t > c) c.setFullYear(c.getFullYear() + 1);
    console.log(Math.ceil((c - t) / (1000 * 60 * 60 * 24)) + " days left until Christmas.");
}
daysUntilChristmas();
