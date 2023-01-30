const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');

const expresiones = {
    soloLetrasConEspaciosYtildeAptrofeYguion: /^[a-zA-ZÀ-ÿ\s\-\']+$/,
    password: /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{8,}$/,
    correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
}

const validarFormulario = (e) => {
    switch (e.target.name) {
        case "f1":
            if (expresiones.soloLetrasConEspaciosYtildeAptrofeYguion.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo letras");
            }
            break;
        case "f2":
            if (expresiones.soloLetrasConEspaciosYtildeAptrofeYguion.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo letras");
            }
            break;
        case "f3":
            if (expresiones.password.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Introduce una contraseña con 1 Mayus, 1 Minus, 1 Num, 1 Caratcer Especial y minimo 8 digitos");
            }
            break;
        case "f4":
            if (expresiones.correo.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Mail invalido");
            }
            break;
    }
}

inputs.forEach((input) => {
    input.addEventListener('keyup', validarFormulario);
    input.addEventListener('blur', validarFormulario);
});

formulario.addEventListener('submit', (e) => {
})

function limita(elEvento, maximoCaracteres) {
    var elemento = document.getElementById("texto");

    var evento = elEvento || window.event;
    var codigoCaracter = evento.charCode || evento.keyCode;
    if(codigoCaracter === 37 || codigoCaracter === 39) {
        return true;
    }

    if(codigoCaracter === 8 || codigoCaracter === 46) {
        return true;
    }
    else if(elemento.value.length >= maximoCaracteres ) {
        return false;
    }
    else {
        return true;
    }
}

function actualizaInfo(maximoCaracteres) {
    var elemento = document.getElementById("texto");
    var info = document.getElementById("info");

    if(elemento.value.length >= maximoCaracteres ) {
        info.innerHTML = "Máximo "+maximoCaracteres+" caracteres";
    }
    else {
        info.innerHTML = "Puedes escribir hasta "+(maximoCaracteres-elemento.value.length)+" caracteres adicionales";
    }
}