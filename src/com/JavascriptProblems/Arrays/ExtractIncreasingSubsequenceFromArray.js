function solve(arr) {
    let newArr = [arr[0]]
    for (let i = 1; i < arr.length; i++) {
        if (newArr.slice(-1) < arr[i]) {
            newArr.push(arr[i])
        }
    }
    return newArr
}

solve([1, 
    3, 
    8, 
    4, 
    10, 
    12, 
    3, 
    2, 
    24]
    )