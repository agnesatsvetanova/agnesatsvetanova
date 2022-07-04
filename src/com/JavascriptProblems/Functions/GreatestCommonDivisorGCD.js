function gcd(a, b) {
    a = Math.max(a,b);
    b = Math.min(a,b);
    if (a % b == 0) {
       return b;
    }
    return gcd(a, --b)
}

console.log(gcd(15, 5))