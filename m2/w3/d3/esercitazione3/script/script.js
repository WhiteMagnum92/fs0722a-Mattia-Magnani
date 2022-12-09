var counter = 0
setInterval(() =>{
counter++
document.querySelector('#result').innerHTML = counter + " " + "secondi di sessione aperta"

}, 1000)

sessionStorage.setItem('counter',counter);