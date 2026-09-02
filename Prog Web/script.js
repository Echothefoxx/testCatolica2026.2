function calc() {
let saldo = Number(document.getElementById("sal").value);
let descInit = ( document.getElementById("children").value * 189.59) + document.getElementById("misc").value;
let base = saldo - descInit - 528;
let baseinit = base;
let desc;

switch (true) {
    case (base > 4664.68):
        base -= 397.81;
        desc = (base * 0.275);
        break;
    case (base > 3751.06):
        base -= 192.25;
        desc = (base * 0.225);
        break;
    case (base > 2826.66):
        base -= 53.59;
        desc = (base * 0.15);
        break;
    case (base > 2112):
        desc = (base * 0.075);
        break;
    case (base < 0):
        base = 0;
        desc = 0;
        break;
    default:
        desc = 0;
        break;
    }
    if (desc != 0) {
        aliq = desc / baseinit;
    } else {
        aliq = 0;
    }
    Math.round(aliq * 100) / 100;

    document.getElementById("basef").textContent = base.toFixed(2);
    document.getElementById("divida").textContent = desc.toFixed(2);
}

function clean() {
    //reiniciando campos
    document.getElementById("sal").textContent = "";
    document.getElementById("children").textContent = "";
    document.getElementById("misc").textContent = "";

    // reiniciando resultados
    document.getElementById("basef").textContent = "";
    document.getElementById("divida").textContent = "";
    document.getElementById("faixa").textContent = "";
}

function calcAliquota(sal, ir) {
    if (desc != 0) {
        aliq = desc / baseinit;
    } else {
        aliq = 0;
    }
    Math.round(aliq * 100) / 100;
}

function faixa0(salario) {

}