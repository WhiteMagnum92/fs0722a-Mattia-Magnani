/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/
var numero = 5;
var stringa = 'ciao';
var array = [1,2,3,'ciao',[]];
var oggetto = {
  nome:'Mattia',
  cognome:'Magnani',
}
var booleano = true/false;

var spiegone = 'I datatype in JS sono 5: numeri, stringhe, array, oggetti e booleani. Il datatype numero, altri non è che un numero. Va scritto senza apici o virgolette. Il datatype stringa contiene del testo, va scritta con virgolette e/o apici. Il datatype array è una lista di valori senza nome, puo contenere al suo interno numeri, stringhe e oggetti. La lista di valori va scritta dentro le parentesi quadre e ogni valore va separato da una virgola. Gli oggetti vanno inseririti all\'interno di parentesi quadre. IL datatype oggetto è una lista di valori nominativi, va scritto dentro una parentesi graffa e ad ogni valore andra assegnata una proprieta. Le proprieta di ogni oggetto si identificano coi due punti e andranno separati da una virgola. Il datatype booleano puo avere solo due valori che sono true o false, questi valori verranno scritti senza apici o virgolette.'

console.log (spiegone);
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/
var name = 'Mattia'
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/
var numero1 = 12
var numero2 = 20
var somma = (numero1 + numero2);
console.log (somma);
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/
var x = 12;
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/
var name = 'Magnani';
const PI = 3.141592653589793;
// PI = 3.14;       Questo dara errore
//PI = PI + 10;   // Anche questa somma dara errore
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/
var sottrazione = (4 - x);
console.log (sottrazione)
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/
var name1 = 'john';
var name2 = 'John';

if (name1 != name2) {
  disuguaglianza = 'Sono diversi!'
}
console.log (disuguaglianza);

var name3 = name2.toLowerCase();
if (name1 == name3) {
  uguaglianza = 'Sono uguali adesso!';
}
console.log (uguaglianza);
/* SCRIVI QUI LA TUA RISPOSTA */
