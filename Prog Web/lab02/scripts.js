let dias = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"];
let meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio","Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];

function nomeDoDia(numero) {
    return dias[numero];
}

function nomeDoMes(numero) {
    return meses[numero];
}

function dataFormatada(d) {
    return d.getDate() + " de " + nomeDoMes(d.getMonth()) + " de " + d.getFullYear();
}

function horaFormatada(d) {
    let h = d.getHours();
    let m = d.getMinutes();

    if (m < 10) {
        m = "0" + m;
    }
    return h + ":" + m;
}

function diasAte(dataAtual, dataFutura) {
    return Math.floor((dataFutura - dataAtual) / 86400000);
}

let hoje = new Date();
let fimSemestre = new Date(2026, 11, 1); //fim do semestre
document.getElementById("agora").innerHTML = nomeDoDia(hoje.getDay()) + ", " + dataFormatada(hoje);
document.getElementById("hora").innerHTML = horaFormatada(hoje);
document.getElementById("fut").innerHTML = diasAte(hoje, fimSemestre);

//Parte do adicionar

let tarefas = [];

function adicionarTarefa() {
    let texto = document.getElementById("tarefa").value;
    if (texto == "") {
        alert("Digite alguma coisa!");
        return;
    }
    tarefas.push(texto);
    document.getElementById("tarefa").value = "";
    mostrarTarefas();
}

function mostrarTarefas() {
    let html = "";
    for (let i = 0; i < tarefas.length; i++) {
        html = html + (i+1) + ". " + tarefas[i] + "<br>";
    }
    document.getElementById("lista").innerHTML = html;
}