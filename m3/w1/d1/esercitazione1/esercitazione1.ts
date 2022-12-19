//funzione che genera un numero casuale tra 1 e 100
var randomNumber = function(){
    return Math.floor(Math.random() * (100 - 1 ) +1 )
}
//inizializzo le variabili
let player1:number
let player2:number
//funzione di confronto
function confrontaNumeri(){
    let random = randomNumber()
    console.log(random) //inizializzo e stampo in console il numero random estratto
    if(random ===  player1){
        return console.log('Player1 wins!')//se il numero  del player1 è uguale al numero random allora stampo in console che ha vinto il player1
    }if(random === player2){
        return console.log('Player2 wins!')//se il numero 2 del player2 è uguale al numero random allora stampo in console che ha vinto il player2
    }else{
        var diff1:number = random - player1
        var diff2:number = random - player2 //calcolo le differenze e confronto il valore assoluto
        if(Math.abs(diff1) < Math.abs(diff2)){
            return console.log('Player 1 choosed closest number')
        }else{
            return console.log('Player 2 choosed closest number')
        }
    };
    
}
//assegno i numeri scelti dai player
player1 = 69   //player1 sceglie un numero
player2 = 90 // player2 sceglie un numero
confrontaNumeri() //evoco la funzione che fa partire il giuoco