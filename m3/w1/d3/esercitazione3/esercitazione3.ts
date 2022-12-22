class Persona {
    codredd:number
    redditoannuolordo:number
    tasseinps:number
    tasseirpef:number
    constructor(redditoannuolordo:number){
        this.redditoannuolordo=redditoannuolordo;
        this.tasseirpef=this.getTasseIrpef();
        this.tasseinps=this.getTasseInps();
        this.codredd=this.getCoddRed();
    }
    getTasseIrpef():any{
        let el:number = this.redditoannuolordo
        let e:number = this.tasseirpef
        if(el <= 15000){
            e = 0.23
            return e
        }if(el > 15000 && el <= 28000){
            e = 0.25
            return e
        }if(el > 28000 && el <= 50000){
            e = 0.35
            return e
        }if(el > 50000){
            e = 0.43
            return e
        }
    }
    getTasseInps():any{
        let el:number = this.redditoannuolordo
        let e:number = this.tasseinps
        if(el <=  48279){
            e = 0.2328
            return e
        }else{
            e = 0.2428
            return e
        }
    }
    getCoddRed():any{
        let el:number = this.redditoannuolordo
        let e:number = this.codredd
        if(el <= 15000){
            e = 0.2
            return e
        }if(el > 15000 && el <= 28000){
            e = 0.4
            return e
        }if(el > 28000 && el <= 50000){
            e = 0.52
            return e
        }if(el > 50000 && el < 300000){
            e = 0.9
            return e
        }if(el >= 300000){
            e = 1
            return e
        } 
    }
    getUtileTasse():number{
        let el:number = this.redditoannuolordo
        let e:number = this.codredd
        console.log('Reddito tassabile: '+(el*e))
        return el*e
    }
    getRedditoAnnuoNetto():number{
        let redd:number = this.redditoannuolordo
        let el:number = this.getUtileTasse()
        let e1:number = this.tasseinps
        let e2:number = this.tasseirpef
        let f1:number = el*e1
        let f2:number = el*e2
        let f3:number = f1+f2
        console.log('Reddito al netto delle tasse: '+(redd - f3))
        return redd - f3
    }
}
var mariello = new Persona(20000) //20k
var gigi = new Persona(35000) //35k
var pierino = new Persona(49000) //49k
var richbuyer = new Persona(500000) //500k
console.log(mariello, gigi, pierino, richbuyer)
mariello.getRedditoAnnuoNetto()
gigi.getRedditoAnnuoNetto()
pierino.getRedditoAnnuoNetto()
richbuyer.getRedditoAnnuoNetto()
