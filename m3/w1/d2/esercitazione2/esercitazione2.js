var BankAccount = /** @class */ (function () {
    function BankAccount(balanceInit) {
        this.balanceinit = balanceInit;
    }
    BankAccount.prototype.oneDeposit = function (n) {
        var newBalance = this.balanceinit + n;
        console.log('After this deposit your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.oneWithDraw = function (n) {
        var newBalance = this.balanceinit - n;
        console.log('After this withdraw your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.twoDeposit = function (n) {
        var newBalance = (this.balanceinit + n) - 1.5;
        console.log('After this deposit(unknown ATM) your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.twoWithDraw = function (n) {
        var newBalance = (this.balanceinit - n) - 1.5;
        console.log('After this withdraw(unknown ATM) your new balance is: ' + newBalance);
        this.balanceinit = newBalance;
    };
    BankAccount.prototype.addInterest = function () {
        var balance = (this.balanceinit * 0.1);
        var newBalance = this.balanceinit - balance;
        console.log('New balance after interest withdrew: ' + newBalance);
        this.balanceinit = newBalance;
    };
    return BankAccount;
}());
var MotherAccount = new BankAccount(20000); //apertura conto con 20k
var SonAccount = new BankAccount(2000); //apertura cionto con 2k
console.log(MotherAccount);
console.log(SonAccount);
//deposito n 1
MotherAccount.oneDeposit(2000); //22000
SonAccount.oneDeposit(50); //2050
//prelievo n1
MotherAccount.oneWithDraw(400); //21600
SonAccount.oneWithDraw(70); //1980
//deposito 2
MotherAccount.twoDeposit(700); //22298.5
SonAccount.twoDeposit(30); //2008.5
//prelievo 2
MotherAccount.twoWithDraw(250); //22047
SonAccount.twoWithDraw(150); //1857
//interessi
MotherAccount.addInterest(); //19842.3
