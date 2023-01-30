function anade() {
    var elemento = document.createElement("li");
    var texto = document.createTextNode("Elemento");
    elemento.appendChild(texto);

    var lista = document.getElementById("lista");
    lista.appendChild(elemento);

    var nuevoElemento = "<li>Texto</li>";
    lista.innerHTML = lista.innerHTML + nuevoElemento;
}