// sintassi per dichiarare una variabile
//let nome:string = 'Mary'            // la variabile memorizza un tipo di dato stringa
//let nome:string                     // la varibile e una stringa, il valore e undefined
//let nome='Mary'                     // il tipo di dato e dedotto dal valore -> la varibile e di tipo stringa
//let nome                            // il tipo di dato e any, il valore e undefined

let nome: string = 'John';
let score1: number = 50;
let score2: number = 42.50;
let sum = score1 + score2;
console.log('name' + nome);
console.log('first score' + score1);
console.log('second score' + score2);
console.log('sum of the scores' + sum);

var code: any = 123;
let emplyeeCode = <number>code;
console.log(typeof (emplyeeCode));

//inferred typing
let num = 2;                            //data type inferred as number
//let num = '12';                       // da errore perche num e impostato su tipo number

//ambiti delle variabili

var global_num = 12;
class Numbers {
    num_val = 13;                       // class variable
    static sval = 10;                   // static variable
    storeNum(): void {
        var local_num = 14;             // varrible locale
    }
}
console.log('Global number'+ global_num);
console.log(Numbers.sval);
var obje = new Numbers()
console.log('Gobal num' + obje.num_val );
//console.log('loca num' + local_num);  non lo stampa, perche si tenta di accedere alla variabile fuori dal local scope quindi fuori dal metodo 


