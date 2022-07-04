function solve(steps, footprintLength, speed) {
    let distance = steps * footprintLength
    let ms = speed / 3.6
    let time = distance / ms
    let add = Math.floor(distance / 500)
   
    let timeMin = Math.floor(time / 60)
    let timeSec = Math.round(time - (timeMin * 60))
    let timeHr = Math.floor(time/3600)
    console.log((timeHr < 10 ? "0" : "") + timeHr + ":" + (timeMin + add < 10 ? "0" : "") + (timeMin + add) +  ":" + (timeSec < 10 ? "0" : "" + timeSec))
   

}

solve(4000, 0.6, 5)