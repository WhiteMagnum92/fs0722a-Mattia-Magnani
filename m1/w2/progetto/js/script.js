//funzione per visualizzare i tasti pigiati in display
function aggiungiCifra(elemento) {
    let cifraCliccata = elemento.getAttribute('data-simbolo');
    document.getElementById('numeri').value += cifraCliccata;
}
//funzione per fare il totale
function totale() {
    let numeri = document.getElementById('numeri');
    numeri.value = eval(numeri.value);
}
//funzione per cancellare la cifra a dx
function cancelladx() {
    let str = document.getElementById("numeri").value.slice(0, -1);
    document.getElementById("numeri").value = str;
}
//funzione per svuotare il display
function svuota(){
    let str='';
    console.log(str);
document.getElementById("numeri").value = str;
}