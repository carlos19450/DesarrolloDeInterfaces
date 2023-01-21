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
    usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
    password: /^.{4,12}$/, // 4 a 12 digitos.
    correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
    telefono: /^\d{7,14}$/ // 7 a 14 numeros.
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
            break;
        case "f9":
            break;
        case "f10":
            break;
        case "f11":
            break;
        case "f12":
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
            break;
        case "f16":
            break;
        case "f17":
            break;
    }
}

inputs.forEach((input) => {
    input.addEventListener('keyup', validarFormulario);
    input.addEventListener('blur', validarFormulario);
});

formulario.addEventListener('submit', (e) => {
})