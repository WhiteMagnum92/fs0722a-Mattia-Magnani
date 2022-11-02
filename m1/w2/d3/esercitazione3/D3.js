/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/
function maggiore(a, b) {
  if (a > b)
    return a;
  else if (b > a)
    return b;
  else
    console.log('I due numeri sono uguali!');
}
console.log('Esercizio 1:')
let c = 1, d = 2, e = 1;
let mag;
mag = maggiore(c, d);
console.log('Il piu grande e:', mag);
mag = maggiore(c, e);

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/
console.log('Esercizio 2:')
f = 6
if (f !== 5) {
  console.log('not equal');
}

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/
console.log('Esercizio 3:')
let g = 15
if (g % 5 == 0) {
  console.log('divisibile per 5')
}
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/
console.log('Esercizio 4:')
let x1 = 4
let y1 = 4
if (x1==8||y1==8||x1+y1==8||x1-y1==8||y1-x1==8)
console.log('condizione verificata');


/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/
console.log('Esercizio 5:')
var totalShoppingCart = 60;
var saldo; 
if (totalShoppingCart>50){
saldo = totalShoppingCart;
}
else {saldo=totalShoppingCart + 10}
console.log('Il saldo finale è: ' + saldo);

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/
console.log('Esercizio 6:')
var totalShoppingCart = (60/100)*80;
var saldo; 
if (totalShoppingCart>50){
saldo = totalShoppingCart;
}
else {saldo=totalShoppingCart + 10}
console.log('Il saldo finale è: ' + saldo);
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/
console.log('Esercizio 7:')
let a1 = 1, b1 = 11, c1 = 111;
let numeri = [a1,b1,c1];
let numeriOrdinati = numeri.sort(function(a,b){return b - a})
console.log(numeriOrdinati)

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/
console.log ('Esercizio 8:')
let d1 = 5;
console.log(typeof d1)
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/
console.log ('Esercizio 9:')
let e1 = prompt ('Inserisci un numero');
if (e1%2==0){
  console.log ('Il numero è pari');
}
else {
  console.log('Il numero è dispari');
}
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/
console.log('Esercizio 11:')
const me = {
  name: 'John',
  lastName: 'Doe',
  city: 'Toronto',
  skills: ['javascript', 'html', 'css'],
}

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/
console.log ('Esercizio 12:');
delete me.lastName;
console.log(me);
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/
console.log ('Esercizio 13:')
delete me.skills [2];
console.log (me)
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
