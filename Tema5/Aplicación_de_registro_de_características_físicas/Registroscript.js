$(document).ready(function () {

    if (window.localStorage.length === 0) {
        grafoTension(0);
        grafoPulsaciones(0);
        grafoPesoEdad(0);
    } else {
        grafoTension( window.localStorage.length - 1);
        grafoPulsaciones(window.localStorage.length - 1);
        grafoPesoEdad(window.localStorage.length - 1);
    }

    $("#enviar").click(function () {
        contNewCockies = 0;
        let correcto = true;
        let nombre = $("#nombre").val();
        let edad = $("#edad").val();
        let peso = $("#peso").val();
        let tensionSis = $("#sistolica").val();
        let tensionDias = $("#diastolica").val();
        let pulsaciones = $("#pulsacion").val();
        // COMPROBACIONES
        comprobarNombre(nombre);

        comprobarEdad(edad);

        comprobarPeso(peso);

        comprobarSis(tensionSis);

        comprobarDias(tensionDias);

        comprobarPuls(pulsaciones);

        if (correcto) {
            guardar();
        }
    });
});

function grafoTension(cookies) {
    let x = [];
    let y1 = [];
    let y2 = [];

    for (let i = 0; i < (cookies / 5); i++) {
        y1.push(window.localStorage.getItem("tensionSis" + i));
        y2.push(window.localStorage.getItem("tensionDias" + i));
        x.push(i + 1);
    }

    let data = [
        {x: x, y: y1, mode: "markers"},
        {x: x, y: y2, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 30], title: "Tiempo"},
        yaxis: {range: [40, 200], title: "Tensión"},
        title: "Tensión Sistolica y Diastolica"
    };

    Plotly.newPlot("grafo-tension", data, layout);
}

function grafoPulsaciones(cookies) {
    let x = [];
    let y = [];

    for (let i = 0; i < (cookies / 5); i++) {
        y.push(window.localStorage.getItem("pulsaciones" + i));
        x.push(i + 1);
    }

    let data = [
        {x: x, y: y, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 30], title: "Tiempo"},
        yaxis: {range: [40, 200], title: "Pulsaciones"},
        title: "Pulsaciones"
    };

    Plotly.newPlot("grafo-pulsaciones", data, layout);
}

function grafoPesoEdad(cookies) {
    let x = [];
    let y = [];

    for (let i = 0; i < (cookies / 5); i++) {
        x.push(window.localStorage.getItem("edad" + i));
        y.push(window.localStorage.getItem("peso" + i));
    }

    let data = [
        {x: x, y: y, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 160], title: "Edad"},
        yaxis: {range: [0, 200], title: "Peso"},
        title: "Peso y Edad"
    };

    Plotly.newPlot("grafo-peso-edad", data, layout);
}

function comprobarNombre(nombre) {
    if (nombre.match(/^[A-Za-zÀ-ÿ]+$/) == null) {
        console.log("Error. Introduce un Nombre.");
        return false;
    }
}

function comprobarEdad(edad) {
    if (edad <= 0 || edad > 150) {
        console.log("Error. Introduce una Edad con el formato correcto");
        return false;
    }
}

function comprobarPeso(peso) {
    if (peso <= 0) {
        console.log("Error. Introduce un peso positivo.");
        return false;
    }
}

function comprobarSis(tensionSis) {
    if (tensionSis < 60) {
        console.log("Error. Introduce una Tensión Sistólica positiva.");
        return false;
    }
}

function comprobarDias(tensionDias) {
    if (tensionDias < 60) {
        console.log("Error. Introduce una Tensión Diastólica positiva.");
        return false;
    }
}

function comprobarPuls(pulsaciones) {
    if (pulsaciones < 60) {
        console.log("Error. Introduce Pulsaciones positiva.");
        return false;
    }
}

function guardar() {
    window.localStorage.setItem("nombre", nombre);
    if (window.localStorage.length <= 1) {
        window.localStorage.setItem("edad" + contNewCockies, edad);
        window.localStorage.setItem("peso" + contNewCockies, peso);
        window.localStorage.setItem("tensionSis" + contNewCockies, tensionSis);
        window.localStorage.setItem("tensionDias" + contNewCockies, tensionDias);
        window.localStorage.setItem("pulsaciones" + contNewCockies, pulsaciones);
    } else {
        contNewCockies = (window.localStorage.length - 1) / 5;
        window.localStorage.setItem("edad" + contNewCockies, edad);
        window.localStorage.setItem("peso" + contNewCockies, peso);
        window.localStorage.setItem("tensionSis" + contNewCockies, tensionSis);
        window.localStorage.setItem("tensionDias" + contNewCockies, tensionDias);
        window.localStorage.setItem("pulsaciones" + contNewCockies, pulsaciones);
    }
    grafoTension(window.localStorage.length - 1);
    grafoPulsaciones(window.localStorage.length - 1);
    grafoPesoEdad(window.localStorage.length - 1);
}