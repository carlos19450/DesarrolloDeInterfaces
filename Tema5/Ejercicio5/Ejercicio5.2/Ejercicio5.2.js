function palindromo(cadena) {

    var resultado = "La cadena \""+cadena+"\" \n";
    var cadenaOriginal = cadena.toLowerCase();
    var letrasEspacios = cadenaOriginal.split("");
    var cadenaSinEspacios = "";
    for(i in letrasEspacios) {
        if(letrasEspacios[i] !== " ") {
            cadenaSinEspacios += letrasEspacios[i];
        }
    }
    var letras = cadenaSinEspacios.split("");
    var letrasAlReves = cadenaSinEspacios.split("").reverse();
    var iguales = true;
    for(i in letras) {
        if(letras[i] === letrasAlReves[i]) {
            // Todo bien
        }
        else {
            iguales = false;
        }
    }
    if(iguales) {
        resultado += " es un palindromo";
    }
    else {
        resultado += " no es un palindromo";
    }
    return resultado;
}

alert(palindromo("Dabale arroz a la zorra el abad"));
alert(palindromo("Esto no creo que pueda ser un palindromo"));