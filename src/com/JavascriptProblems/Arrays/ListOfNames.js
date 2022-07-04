function solve(arr) {
    arr = arr.sort()
    let count = 1
    for (const name of arr) {
        console.log(`${count}.${name}`)
        count++
    }
}

solve(["John", "Bob", "Christina", "Ema"])