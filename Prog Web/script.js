function calc() {
let saldo = Number(document.getElementById("sal").value);
let salario;

saldo = calcInit(saldo, document.getElementById("children").value, document.getElementById("misc").value);

switch (true) {
    case (base > 4664.68):
        salario = faixa275(saldo);
        break;
    case (base > 3751.06):
        salario = faixa225(saldo);
        break;
    case (base > 2826.66):
        salario = faixa15(saldo);
        break;
    case (base > 2112):
        salario = faixa75(saldo);
        break;
    case (base < 0):
        base = 0;
        desc = 0;
        break;
    default:
        salario = faixa0(saldo);
        break;
    }

    let desc = calcDesc(salario, saldo);

    document.getElementById("basef").textContent = salario;
    document.getElementById("divida").textContent = desc;
    document.getElementById("faixa").textContent = calcAliquota(salario, desc);
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

function calcAliquota(salario, desconto) {
    if (desconto != 0) {
        let aliq = desconto / salario;
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
    salario -= (base * 0.075);
    return salario.toFixed(2);
}
function faixa15(salario) {
    salario -= 53.59;
    salario -= (base * 0.15);
    return salario.toFixed(2);
}
function faixa225(salario) {
    salario -= 192.25;
    salario -= (base * 0.225);
    return salario.toFixed(2);
}
function faixa275(salario) {
    salario -= 397.81;
    salario -= (base * 0.275);
    return salario.toFixed(2);
}

function calcDesc(base, salarioFinal) {
    if (salarioFinal > 0) {
        return (base - salarioFinal).toFixed(2);
    } else {
        return base.toFixed(2);
    }
}