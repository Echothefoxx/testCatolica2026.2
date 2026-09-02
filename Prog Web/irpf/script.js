function calc() {
let saldo = Number(document.getElementById("sal").value);
let salario = 0;

saldo = calcInit(saldo, document.getElementById("children").value || 0, document.getElementById("misc").value || 0);

switch (true) {
    case (saldo > 4664.68):
        salario = faixa275(saldo);
        break;
    case (saldo > 3751.06):
        salario = faixa225(saldo);
        break;
    case (saldo > 2826.66):
        salario = faixa15(saldo);
        break;
    case (saldo > 2112):
        salario = faixa75(saldo);
        break;
    case (saldo < 0):
        saldo = 0;
        break;
    default:
        salario = faixa0(saldo);
        break;
    }

    let desc = calcDesc(saldo, salario);

    document.getElementById("basef").textContent = salario;
    document.getElementById("baseini").textContent = saldo;
    document.getElementById("divida").textContent = desc;
    document.getElementById("faixa").textContent = calcAliquota(salario, desc);
}

function clean() {
    //reiniciando campos
    document.getElementById("sal").value = "";
    document.getElementById("children").value = "";
    document.getElementById("misc").value = "";

    // reiniciando resultados
    document.getElementById("basef").value = "";
    document.getElementById("divida").value = "";
    document.getElementById("faixa").value = "";
}

function calcAliquota(salario, desconto) {
    if (desconto > 0) {
        let aliq = (desconto / salario) * 100;
        return Math.round(aliq * 100) / 100;
    } else {
        return 0;
    }
    
}

function calcInit(salario, child, other) {
    salario = salario - ( ( child * 189.59) + other + 528 );
    if (salario < 0) {
        salario = 0;
    }
    return salario;
}

function faixa0(salario) {
    return salario.toFixed(2);
}
function faixa75(salario) {
    salario -= (salario * 0.075);
    return salario.toFixed(2);
}
function faixa15(salario) {
    salario -= 53.59;
    salario -= (salario * 0.15);
    return salario.toFixed(2);
}
function faixa225(salario) {
    salario -= 192.25;
    salario -= (salario * 0.225);
    return salario.toFixed(2);
}
function faixa275(salario) {
    salario -= 397.81;
    salario -= (salario * 0.275);
    return salario.toFixed(2);
}

function calcDesc(saldo, salarioFinal) {
    if (salarioFinal > 0) {
        return (saldo - salarioFinal).toFixed(2);
    } else {
        return saldo.toFixed(2);
    }
}