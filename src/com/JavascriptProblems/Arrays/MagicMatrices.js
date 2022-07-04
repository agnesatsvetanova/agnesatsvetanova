function solve(matrix) {
    let sumArr = []
    rowEquality(matrix);
    colEquality(matrix)
    
    function rowEquality() {
        
        for (let i = 0; i < matrix.length; i++) {
            let sum = 0
            for (let j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j] 
            }
            sumArr.push(sum)
        }
    }

    function colEquality() {
        
        for (let i = 0; i < matrix.length; i++) {
            let sumCol = 0
            for (let j = 0; j < matrix[i].length; j++) {
                sumCol += matrix[j][i] 
            }
            sumArr.push(sumCol)
        }
    }

    function identical(sumArr) {
        for(let i = 0; i < sumArr.length - 1; i++) {
            if(sumArr[i] !== sumArr[i+1]) {
                console.log('false');
                return
            }
        }
        console.log('true');
    }
    identical(sumArr)
}

solve([[4, 5, 6],
    [6, 5, 4],
    [5, 5, 5]]
   )