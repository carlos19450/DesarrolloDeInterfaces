const nombre = document.getElementById('f1');

function future() {
    let frases = [' ,el cielo sera tu limite, pues grandes acontecimientos te sucederán',
    ' ,hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas',
    ' ,nunca tendrás que preocuparte por un ingreso estable',
    ' ,no olvides que un amigo es un regalo que te das a ti mismo',
    ' ,siente la felicidad que espera por ti y no olvides atraparla para mantenerla contigo',
    ' ,la rueda de la fortuna te favorecerá y estarás rodeado de prosperidad',
    ' ,seras promovido en tu trabajo debido a tus logros y capacidades',
    ' ,mañana puede ser muy tarde para disfrutar lo que tienes hoy',
    ' ,confía en tu suerte, que es mucha y te rodeara de prosperidad',
    ' ,hoy es el momento de explorar: no temas'];
        alert("Consultando a los espíritus…");
        alert(nombre.value + frases[Math.floor(Math.random() * frases.length)]);


}
function add() {
    let frases = [document.getElementById('f2').value];
    alert("Consultando a los espíritus…");
    alert(nombre.value + ", " + frases[Math.floor(Math.random() * frases.length)]);
}

const cargarSonido = function (fuente) {
    const sonido = document.createElement("audio");
    sonido.src = fuente;
    sonido.setAttribute("preload", "auto");
    sonido.setAttribute("controls", "none");
    sonido.style.display = "none"; // <-- oculto
    document.body.appendChild(sonido);
    return sonido;
};
const $botonReproducir = document.querySelector("#btnReproducir"),
    $botonPausar = document.querySelector("#btnPausar"),
    $botonReiniciar = document.querySelector("#btnReiniciar");
// El sonido que podemos reproducir o pausar
const sonido = cargarSonido("sonido.flac");
$botonReproducir.onclick = () => {
    sonido.play();
};
$botonPausar.onclick = () => {
    sonido.pause();
};
$botonReiniciar.onclick = () => {
    sonido.currentTime = 0;
};