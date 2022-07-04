function cook(number, ...params) {
    let array = Array.from(params)
    let n = number
    for (let i = 0; i < array.length; i++) {
        if(array[i] == "chop") {
            n /= 2
        } else if (array[i] == "dice") {
            n = Math.sqrt(n);
        } else if (array[i] == "spice") {
            n +=1
        } else if (array[i] == "bake") {
            n *= 3
        } else if (array[i] == "fillet") {
            let percent = (n * 20) / 100
            n -= percent;
        }
        console.log(n)
    }
}

cook('32', 'chop', 'chop', 'chop', 'chop', 'chop')