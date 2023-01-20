var resultado;
var valores;
var num1;
var num2;
var suma;
var resta;
var mult;
var div;
var mod;
valores = [true, 5, false, "hola", "adios", 2];

console.log("Determinar cual de los dos elementos de texto es mayor");
if (valores[3] > valores[4]) {
    console.log(valores[3]);
}else if (valores[3] < valores[4]) {
    console.log(valores[4]);
}else {
    console.log(valores[3] + " y " + valores[4] + " son iguales");
}
console.log("Utilizando exclusivamente los dos valores booleanos del array, determinar los operadores necesarios para obtener un resultado true y otro resultado false");
console.log(valores[0] || valores[2]);
console.log(valores[0] && valores[2]);

console.log("Determinar el resultado de las cinco operaciones matemáticas realizadas con los dos elementos numéricos");
num1 = valores[1];
num2 = valores[5];

suma = num1 + num2;
console.log("Suma: " + suma);

resta = num1 - num2;
console.log("Resta: " + resta);

mult = num1 * num2;
console.log("Multiplicacion: " + mult);

div = num1 / num2;
console.log("Division: " + div);

mod = num1 % num2;
console.log("Modulo: " + mod);