function aggiungiCifra(elemento) {
    let cifraCliccata = elemento.getAttribute('data-simbolo');
    document.getElementById('numeri').value += cifraCliccata;
}

function totale() {
    let numeri = document.getElementById('numeri');
    numeri.value = eval(numeri.value);
}

function cancelladx() {
    let str = document.getElementById("numeri").value.slice(0, -1);
    document.getElementById("numeri").value = str;
}

function svuota(){
    let str='';
    console.log(str);
document.getElementById("numeri").value = str;
}