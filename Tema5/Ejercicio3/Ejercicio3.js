const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');

const expresiones = {
    soloNumeros: /^[0-9]+$/,
    soloLetrasConTildes: /^[a-zA-ZÀ-ÿ]+$/,
    soloLetrasConEspaciosYtilde: /^[a-zA-ZÀ-ÿ\s]+$/,
    soloLetrasConEspaciosYtildeAptrofeYguion: /^[a-zA-ZÀ-ÿ\s\-\']+$/,
    soloNumeroConDosDeciamles: /^[0-9]+,[0-9]{2}$/,
    soloNumerosConEnterosYdecimales: /^([0-9]+)?([0-9]+,[0-9]+)?$/,
    soloNumerosConEnterosPositivosYnegativos: /^([0-9]+)?([\-0-9]+)?$/,
    soloNumeroRealesConDecimalesYmiles: /^([0-9\.\,]+)?([\-0-9\.\,]+)?$/,
    fecha: /^(0[1-9]|[1-2]\d|3[01])(\/)(0[1-9]|1[012])\2(\d{4})$/,
    hora12: /^[0-9]:[0-9]{2}\s(AM)?(PM)?$/,
    hora24: /^[0-9]:[0-9]{2}\s(AM)?(PM)?$/,
    usuario: /^[a-zA-Z0-9\_\-]{4,16}$/,
    password: /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{8,}$/,
    correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
    url: /^https?:\/\/[\w\-]+(\.[\w\-]+)+[/#?]?.*$/,
    ip4: /^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/,
    hexaDeciaml: /^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$/
}

const validarFormulario = (e) => {
    switch (e.target.name) {
        case "f1":
            if (expresiones.soloNumeros.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo numeros");
            }
            break;
        case "f2":
            if (expresiones.soloLetrasConTildes.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo letras");
            }
            break;
        case "f3":
            if (expresiones.soloLetrasConEspaciosYtilde.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo letras");
            }
            break;
        case "f4":
            if (expresiones.soloLetrasConEspaciosYtildeAptrofeYguion.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo letras");
            }
            break;
        case "f5":
            if (expresiones.soloNumeroConDosDeciamles.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo un numero con 2 deciamles");
            }
            break;
        case "f6":
            if (expresiones.soloNumerosConEnterosYdecimales.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo numeros enteros o decimales");
            }
            break;
        case "f7":
            if (expresiones.soloNumerosConEnterosPositivosYnegativos.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo numeros enteros positivos o negativos");
            }
            break;
        case "f8":
            if (expresiones.soloNumeroRealesConDecimalesYmiles.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Solo numeros reales positivos o negativos");
            }
            break;
        case "f9":
            if (expresiones.fecha.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Introduce una fecha con formato dd/mm/yyyy");
            }
            break;
        case "f10":
            if (expresiones.hora12.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Introduce una fecha con formato h:mm AM/PM");
            }
            break;
        case "f11":
            if (expresiones.hora24.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Introduce una fecha con formato hh:mm AM/PM");
            }
            break;
        case "f12":
            if (expresiones.password.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Introduce una contraseña con 1 Mayus, 1 Minus, 1 Num, 1 Caratcer Especial y minimo 8 digitos");
            }
            break;
        case "f13":
            break;
        case "f14":
            if (expresiones.correo.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Mail invalido");
            }
            break;
        case "f15":
            if (expresiones.url.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. URL invalida");
            }
            break;
        case "f16":
            if (expresiones.ip4.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Ip4 invalida");
            }
            break;
        case "f17":
            if (expresiones.hexaDeciaml.test(e.target.value)) {
                console.log("Bien");
            }else {
                console.log("Error. Ip4 invalida");
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