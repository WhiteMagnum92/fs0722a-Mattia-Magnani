var n: number = 5
while (n > 5) {
    console.log('entered while')
}
do {
    console.log('entered do while')
}
while (n > 5)

//es break
var i: number = 1
while (i <= 10) {
    if (i % 5 == 0) {
        console.log('the first multiple of 5 between 1 and 10 is :' + i);
        break //exit the loop
    }
    i++
}

var number: number = 0
var count: number = 0
for (number = 0; number <= 0; num++) {
    if (number % 2 == 0) {  //tutte le volte che e pari esci(continue)
        continue
    }
    count++
}
console.log('the count of odd values between 0 and 20 is: ' + count);