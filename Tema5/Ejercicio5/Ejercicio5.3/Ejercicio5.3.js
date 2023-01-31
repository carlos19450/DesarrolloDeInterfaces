// Añadimos un escucha
send.addEventListener("click", ()=>{
    var nombre = document.getElementById("nombre").value;
    var apellido = document.getElementById("apellido").value;
    var genero = document.getElementById("genero").value;

    var p1 = new Persona(nombre, apellido, genero);

    result.innerHTML = "OBJETO: " + p1.obtDetalles(p1);
});

// Este es el Objeto Persona
function Persona(n,a,g){
    this.nombre = n;
    this.apellido = a;
    this.genero = g;
}

// Este es el metodo para mostrar la persona
Persona.prototype.obtDetalles = (instance) => {
    return "Nombre: " + instance.nombre + ", Apellido: " + instance.apellido + ", Genero: " + instance.genero;
}