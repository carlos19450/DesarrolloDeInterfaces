const nombre = document.getElementById('f1');
function future() {
    let shopping = [' ,el cielo sera tu limite, pues grandes acontecimientos te sucederán',
    ' ,hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas',
    ' ,nunca tendrás que preocuparte por un ingreso estable',
    ' ,no olvides que un amigo es un regalo que te das a ti mismo',
    ' ,siente la felicidad que espera por ti y no olvides atraparla para mantenerla contigo',
    ' ,la rueda de la fortuna te favorecerá y estarás rodeado de prosperidad',
    ' ,seras promovido en tu trabajo debido a tus logros y capacidades',
    ' ,mañana puede ser muy tarde para disfrutar lo que tienes hoy',
    ' ,confía en tu suerte, que es mucha y te rodeara de prosperidad',
    ' ,hoy es el momento de explorar: no temas'];
    if (nombre.style.display !== null) {
        alert("Consultando a los espíritus…");
        alert(nombre. + shopping[Math.floor(Math.random() * 10)]);
    }
}