function solve(number) {
    let sum = 0;
    let myFunc = num => Number(num);
    let arr =  Array.from(String(number), myFunc);
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i]
        
    }

    let allEqual = true
    for (let i = 0; i < arr.length - 1; i++) {
        if(arr[i] != arr[i + 1]) {
            allEqual = false;
        }
    }

    console.log(allEqual)

    console.log(sum)
}

solve(2222222)