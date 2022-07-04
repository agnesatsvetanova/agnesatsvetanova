function prevDay(year, month, day) {
    let newDate = new Date(year, month - 1, day);
    newDate.setDate(newDate.getDate() - 1);
    
    console.log(`${newDate.getFullYear()}-${newDate.getMonth() + 1}-${newDate.getDate()}`)
}

prevDay(2016, 10, 1)