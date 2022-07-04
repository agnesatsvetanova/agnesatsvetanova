function solve(arrCommands) {
    let arr = []
    let number = 1

    for (let i = 0; i < arrCommands.length; i++) {
        let command = arrCommands[i]
        switch(command) {
            case 'add':
                arr.push(number)
                number++
            break

            case 'remove':
                if(arr.length == 0) {
                    number++
                    continue
                } else {
                    number++
                    arr.pop();
                }
            break

        }
    }

    if(arr.length != 0) {
    for (const number of arr) {
        console.log(number)
    }} else{
        console.log('Empty')
    }
}

solve(['add', 
'add', 
'remove',
'add',
'add']
)