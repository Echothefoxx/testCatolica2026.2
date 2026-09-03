/*
A sociedade fala que tenho que ter essas coisas bobas como "boas práticas de programação" e "bons comentários", então vamos lá...
Índice:
calc() -> delega as variáveis e valores para as respectivas funções
clean() -> Limpa todos os campos por meio de x.textContent = ""
calcAliquota(num x, num y) -> calcula a aliquota com os valores de desconto e bruto do salário
calcInit(num x, num y, num z, boolean a) -> calcula o salario base por meio do bruto, deduções mistas, e a opção de utilizar a dedução base
faixaXXX(num x) -> Calcula o salário final
calcDesc(num x, num y) -> calcula o desconto pegando o valor base e final do salário 
*/

function calc() {
    //Define as variáveis necessárias
    let saldo = Number(document.getElementById("sal").value);
    let checkbox = document.querySelector("#deduzir");
    let salario = 0;

    //Calcula o salário base
    saldo = calcInit(saldo, document.getElementById("children").value || 0, document.getElementById("misc").value || 0, checkbox.checked);

    //Algorítimo de delegação de faixa
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
    
    //define o desconto com o valores definidos anteriormente
    let desc = calcDesc(saldo, salario);

    //Envia os valores para os elementos com ids específicos
    document.getElementById("basef").textContent = salario;
    document.getElementById("baseini").textContent = saldo;
    document.getElementById("divida").textContent = desc;
    document.getElementById("faixa").textContent = calcAliquota(Number(document.getElementById("sal").value), desc); //calcula a alíquota na definição
}

function clean() {
    //reiniciando campos
    document.getElementById("sal").value = "";
    document.getElementById("children").value = "";
    document.getElementById("misc").value = "";

    // reiniciando resultados
    document.getElementById("basef").textContent = "";
    document.getElementById("divida").textContent = "";
    document.getElementById("faixa").textContent = "";
    document.getElementById("baseini").textContent = "";
}

function calcAliquota(salario, desconto) {
    if (desconto > 0) {
        let aliq = (desconto / salario) * 100;
        return Math.round(aliq * 100) / 100;
    } else {
        return 0;
    }
    
}

function calcInit(salario, child, other, deducaoBase) {
    let base = 0;
    if (deducaoBase === false) {
        base = 528;
    }
    salario = salario - ( ( child * 189.59) + other + base );
    if (salario < 0) {
        salario = 0;
    }
    return salario;
}

function faixa0(salario) {
    return salario.toFixed(2);
}
function faixa75(salario) {
    salario -= ((salario - 2112) * 0.075);
    return salario.toFixed(2);
}
function faixa15(salario) {
    salario -= 2826.66
    salario -= 53.59;
    salario -= (salario * 0.15);
    return salario.toFixed(2);
}
function faixa225(salario) {
    salario -= 3751.06;
    salario -= 192.25;
    salario -= (salario * 0.225);
    return salario.toFixed(2);
}
function faixa275(salario) {
    salario -= 4664.68;
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