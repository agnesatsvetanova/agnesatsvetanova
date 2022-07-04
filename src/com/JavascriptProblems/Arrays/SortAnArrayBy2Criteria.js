function solve(arr) {
    arr.sort(function(a, b) {

        if(a.length != b.length) {
            return a.length - b.length;
        } else {
            return a.localeCompare(b);
        }
    })

    for (const iterator of arr) {
        console.log(iterator)
    }
}

solve(['test', 
'Deny', 
'omen', 
'Default']
)