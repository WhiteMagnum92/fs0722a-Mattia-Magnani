var Persona = /** @class */ (function () {
    function Persona(redditoannuolordo) {
        this.redditoannuolordo = redditoannuolordo;
        this.tasseirpef = this.getTasseIrpef();
        this.tasseinps = this.getTasseInps();
        this.codredd = this.getCoddRed();
    }
    Persona.prototype.getTasseIrpef = function () {
        var el = this.redditoannuolordo;
        var e = this.tasseirpef;
        if (el <= 15000) {
            e = 0.23;
            return e;
        }
        if (el > 15000 && el <= 28000) {
            e = 0.25;
            return e;
        }
        if (el > 28000 && el <= 50000) {
            e = 0.35;
            return e;
        }
        if (el > 50000) {
            e = 0.43;
            return e;
        }
    };
    Persona.prototype.getTasseInps = function () {
        var el = this.redditoannuolordo;
        var e = this.tasseinps;
        if (el <= 48279) {
            e = 0.2328;
            return e;
        }
        else {
            e = 0.2428;
            return e;
        }
    };
    Persona.prototype.getCoddRed = function () {
        var el = this.redditoannuolordo;
        var e = this.codredd;
        if (el <= 15000) {
            e = 0.2;
            return e;
        }
        if (el > 15000 && el <= 28000) {
            e = 0.4;
            return e;
        }
        if (el > 28000 && el <= 50000) {
            e = 0.52;
            return e;
        }
        if (el > 50000 && el < 300000) {
            e = 0.9;
            return e;
        }
        if (el >= 300000) {
            e = 1;
            return e;
        }
    };
    Persona.prototype.getUtileTasse = function () {
        var el = this.redditoannuolordo;
        var e = this.codredd;
        console.log('Reddito tassabile: ' + (el * e));
        return el * e;
    };
    Persona.prototype.getRedditoAnnuoNetto = function () {
        var redd = this.redditoannuolordo;
        var el = this.getUtileTasse();
        var e1 = this.tasseinps;
        var e2 = this.tasseirpef;
        var f1 = el * e1;
        var f2 = el * e2;
        var f3 = f1 + f2;
        console.log('Reddito al netto delle tasse: ' + (redd - f3));
        return redd - f3;
    };
    return Persona;
}());
var mariello = new Persona(20000); //20k
var gigi = new Persona(35000); //35k
var piero = new Persona(49000); //49k
var richbuyer = new Persona(500000); //500k
console.log(mariello, gigi, piero, richbuyer);
mariello.getRedditoAnnuoNetto();
gigi.getRedditoAnnuoNetto();
piero.getRedditoAnnuoNetto();
richbuyer.getRedditoAnnuoNetto();
