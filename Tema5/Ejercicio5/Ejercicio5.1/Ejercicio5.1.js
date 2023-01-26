function info(cadena) {

    var resultado = "La cadena \""+cadena+"\" ";

    if(cadena === cadena.toUpperCase()) {
        resultado += " cadena formada solo por mayusculas";
    }
    else if(cadena === cadena.toLowerCase()) {
        resultado += " cadena formada solo por minusculas";
    }
    else {
        resultado += " cadena formada por mayusculas y minusculas";
    }

    return resultado;
}

alert(info("HOLA PEPE. ¿ COMO ESTAS PEPE ?"));
alert(info("Ayer enconrte 2 euros"));
alert(info("ji ji ji ja"));