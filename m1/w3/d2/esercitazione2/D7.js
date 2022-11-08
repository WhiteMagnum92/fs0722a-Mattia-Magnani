/* ESERCIZIO 1
  Scrivi una funzione per concatenare due stringhe ricevute come parametri, selezionando solamente i primi 2 caratteri della
  prima e gli ultimi 3 della seconda. Converti la stringa risultante in maiuscolo e mostrala con un console.log().
*/

const concatenate = function (str1, str2) {
  let partials = str1.slice(0, 2) + str1.slice(str2.lenght - 3)
  let finalString = partials.toUpperCase()
  console.log(finalString);
}
concatenate('ciao', 'mondo');


/* ESERCIZIO 2
  Scrivi una funzione per creare un array di soli valori DISPARI da 1 a 100.
 */
let arr = [];
for (i = 0; i < 100; i++) {
  if (i % 2 != 0) {
    arr.push(i);
  }

}
/* ESERCIZIO 3
  Scrivi una funzione per creare un array di soli valori multipli di 5, da 1 a 100.
 */
let rarr = [];
for (i = 1; i < 100; i++) {
  if (i % 2 == 5) {
    arr.push(i)
  }
}

const skipfive = fuction();
let array = [];
for (i = 1; i < 100; i++) {
  if (i % 5 === 0) {
    array.push(i)
  }
  console.log(skipfive);
}
/* ESERCIZIO 4
  Scrivi una funzione per creare un array di 10 elementi; ognuno di essi deve essere un valore random compreso tra 0 e 100 (incluso).
 */
const elementi = function () {
  let ar = []
  for (i = 0; i < 10; i++) {
    arr.push(Math.ceil(Math.random() * 100));
  }
  console.log(ar);

}
elementi()
/* ESERCIZIO 5
  Scrivi una funzione per ricavare solamente i valori PARI da un array composto da soli valori numerici.
 */
const findEvenNumber = (arrr)
let evenArray = []
for (let i = 0; i < arrr.lenght; i++) {
  if (arrr[i] % 2 == 0) {
    evenArray.push(arrr[i]);

  }
}
console.log(evenNumber);



/* ESERCIZIO 6
  Scrivi una funzione per sommare a catena i numeri contenuti in un array.
 */
const colCiclo = function (arr) {
  let sum = 0;
  for (let i = 0; i < arr.lenght; i++) {
    sum += arr[i];
  }
}
console.log(sum);
/* ESERCIZIO 7
  Scrivi una funzione per incrementare di 1 tutti i valori numerici in un array.
*/
function incrementa1(array) {
  for (let i in array) {
    array[i] = array[i] + 1;
  }
  return array;
}
{
  let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  console.log(incrementa1(array));
}
/* ESERCIZIO 8
  Sostituisci ogni stringa contenuta in un array con un numero rappresentante la sua lunghezza.
  es.: ["EPICODE", "is", "great"] => [7, 2, 5]
*/
const sostituisciStr = function (arr) {
  let result = [];
  for (let i = 0; i < arr.lenght; i++) {
    result.push(arr[i].length)
  }
  console.log(result)
}
{
  let array = ['epicode', 'ciao', 'ciaociaociao']
  sostituisciStr(array)
}
/* ESERCIZIO 9 (EXTRA)
  Scrivi una funzione per eliminare solo i valori PARI da un array.
*/
function eliminaPari(arr) {
  i = 0
  while (i < arr.lenght) {
    if (arr[i] % 2 == 0)
      arr.splice(i, 1);
    i++;
  }
  console.log(arr);
}
/* ESERCIZIO 10 (EXTRA)
  Scrivi una funzione per creare un array di 10 elementi; ognuno di essi deve essere un valore random compreso tra 0 e 10 (incluso), SENZA AMMETTERE DUPLICATI.
 */
  const createRandomArrayWithoutDuplicates = function()     //    DICHIARATO FUNZIONE
  {
      let arr=[];                                           //    DICHIARATO ARRAY VUOTO
      for (let i=0;i<10;i++)                                //    CICLO FOR PER SCORRERE ELEMENTO PER ELEMENTO(10)
      {
          let added=false;                                  //    VALORE BOOLEANO PER RIMANERE NEL CICLO WHILE NEL CASO L'IF VIENE VERIFICATO
          while(!added)                                     //    CONDIZIONE PER IL WHILE CHE FA RIPETERE IL CICLO FIN QUANDO NON VIENE INSERITO  UN ELEMENTO DIVERSO DAI PRECEDENTI
          {
              let numberToAdd=Math.ceil(Math.random()*100); //    INSERITO NELLA VARIABILE UN NUMERO RANDOM TRA 1 E 100
              if (!arr.includes(numberToAdd))               //    VA A CONTROLLARE SE NELL'ARRAY NON E' PRESENTE IL NUMERO APPENA MESSO NELLA VARIABILE NUMBERTOADD
              {
                  arr.push(numberToAdd)                     //    (SE NON E' PRESENTE) VA AD ESEGUIRE IL PUSH DEL NUMERO
                  added=true;                               //    IN MODO CHE ESCE DAL CICLO QUANDO UN ELEMENTO VIENE AGGIUNTO AL VETTORE E VA A RIPETE QUESTE ISTRUZIONI PER GLI ALTRI ELEMENTI DEL VETTORE

              }
          }
      }
      console.log(arr);                                     //     CONSOLE LOG
  }
  createRandomArrayWithoutDuplicates();
/* ESERCIZIO 11 (EXTRA)
  Scrivi un algoritmo in grado di invertire un array.
  es: [1, 3, 5] ==> [5, 3, 1]
*/

/* Questo array di film verrà usato negli esercizi a seguire. Non modificarlo e scorri oltre per riprendere gli esercizi :) */
const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]

/* ESERCIZIO 12
  Scrivi una funzione per trovare il film più vecchio nell'array fornito.
*/
{
  let yearBasso = movies.reduce((previous, current) => {
    if (previous.Year < current.Year) {
      return previous;
    } else {
      return current;
    }
  })
}
console.log(yearBasso);

/* ESERCIZIO 13
  Scrivi una funzione per ottenere il numero di film contenuti nell'array fornito.
*/

/* ESERCIZIO 14
  Scrivi una funzione per creare un array con solamente i titoli dei film contenuti nell'array fornito.
*/

/* ESERCIZIO 15
  Scrivi una funzione per ottenere dall'array fornito solamente i film usciti nel millennio corrente.
*/

/* ESERCIZIO 16
  Scrivi una funzione per ottenere dall'array fornito uno specifico film (la funzione riceve un imdbID come parametro).
*/

/* ESERCIZIO 17
  Scrivi una funzione per calcolare la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array fornito.
*/

/* ESERCIZIO 18 (EXTRA)
  Scrivi una funzione per recuperare tutti i film dall'array fornito che contengono una parola fornita.
*/
