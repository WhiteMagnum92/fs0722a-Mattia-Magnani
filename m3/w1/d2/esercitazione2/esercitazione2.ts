class BankAccount { //creo una classe 
    balanceinit:number;
    constructor(balanceInit:number){ //costruttore per scegliere saldo iniziale
        this.balanceinit=balanceInit;
    }
    oneDeposit(n:number){ //metodo per deposito alla propria banca
        let newBalance = this.balanceinit + n;
        console.log('After this deposit your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    oneWithDraw(n:number){ //metodo per prelievo alla propria banca
        let newBalance = this.balanceinit - n;
        console.log('After this withdraw your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    twoDeposit(n:number){ //metodo per deposito ad un altra banca
        let newBalance = (this.balanceinit + n)-1.5;
        console.log('After this deposit(unknown ATM) your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    twoWithDraw(n:number){ //metodo per prelievo ad un altra banca
        let newBalance = (this.balanceinit - n)-1.5;
        console.log('After this withdraw(unknown ATM) your new balance is: '+newBalance)
        this.balanceinit = newBalance
    }
    addInterest(){ //metodo per interessi conto corrente
        let balance = (this.balanceinit * 0.1);
        let newBalance = this.balanceinit - balance;
        console.log('New balance after interest withdrew: '+newBalance)
        this.balanceinit = newBalance
    }
}

let MotherAccount = new BankAccount(20000) //apertura conto con 20k
let SonAccount = new BankAccount(2000) //apertura conto con 2k
console.log(MotherAccount)
console.log(SonAccount)
//deposito n 1
MotherAccount.oneDeposit(2000) //22000
SonAccount.oneDeposit(50) //2050
//prelievo n1
MotherAccount.oneWithDraw(400) //21600
SonAccount.oneWithDraw(70) //1980
//deposito 2
MotherAccount.twoDeposit(700) //22298.5
SonAccount.twoDeposit(30) //2008.5
//prelievo 2
MotherAccount.twoWithDraw(250) //22047
SonAccount.twoWithDraw(150) //1857
//interessi
MotherAccount.addInterest() //19842.3
