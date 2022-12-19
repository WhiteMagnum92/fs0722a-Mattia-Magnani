let nome = 'John';
let score1 = 50;
let score2 = 42.50;
let sum = score1 + score2;
console.log('name' + nome);
console.log('first score' + score1);
console.log('second score' + score2);
console.log('sum of the scores' + sum);
var code = 123;
let emplyeeCode = code;
console.log(typeof (emplyeeCode));
let num = 2;
var global_num = 12;
class Numbers {
    constructor() {
        this.num_val = 13;
    }
    storeNum() {
        var local_num = 14;
    }
}
Numbers.sval = 10;
console.log('Global number' + global_num);
console.log(Numbers.sval);
var obje = new Numbers();
console.log('Gobal num' + obje.num_val);
