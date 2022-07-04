function solve(numbers) {
    let newArr = []
    let asc = numbers.sort((a, b) => a - b)
    for (let i = 0; i < asc.length/2; i++) {
        newArr.push(asc[i])
        newArr.push(asc[asc.length - i-1])
    }
    if(asc.length % 2 == 1) {
        newArr.pop();
    }
    return newArr
}

console.log(solve([1, 2,3,4 ]))