function speedCheck(speed, place) {
    let status
    if(place == "city") {
        let allowed = 50
        let additional = speed - allowed
        if(speed > allowed) {
            if(additional <= 20) {
                status = "speeding"
            } else if (additional <= 40) {
                status = "excessive speeding"
            } else {
                status = "reckless driving"
            }

            console.log(`The speed is ${additional} km/h faster than the allowed speed of ${allowed} - ${status}`)
        } else {
            console.log(`Driving ${speed} km/h in a ${50} zone`)
        }
    } else if(place == "interstate") {
        let allowed = 90
        let additional = speed - allowed
        if(speed > allowed) {
            if(additional <= 20) {
                status = "speeding"
            } else if (additional <= 40) {
                status = "excessive speeding"
            } else {
                status = "reckless driving"
            }

            console.log(`The speed is ${additional} km/h faster than the allowed speed of ${allowed} - ${status}`)
        } else {
            console.log(`Driving ${speed} km/h in a ${90} zone`)
        }
    } else if (place == "motorway") {
        let allowed = 130
        let additional = speed - allowed
        if(speed > allowed) {
            if(additional <= 20) {
                status = "speeding"
            } else if (additional <= 40) {
                status = "excessive speeding"
            } else {
                status = "reckless driving"
            }
            console.log(`The speed is ${additional} km/h faster than the allowed speed of ${allowed} - ${status}`)
            
        } else {
            console.log(`Driving ${speed} km/h in a ${130} zone`)
        }
    } else if (place == "residential" ) {
        let allowed = 20
        let additional = speed - allowed
        if(speed > allowed) {
            if(additional <= 20) {
                status = "speeding"
            } else if (additional <= 40) {
                status = "excessive speeding"
            } else {
                status = "reckless driving"
            }

            console.log(`The speed is ${additional} km/h faster than the allowed speed of ${allowed} - ${status}`)
        } else {
            console.log(`Driving ${speed} km/h in a ${20} zone`)
        }
    }

}

speedCheck(21, 'residential')