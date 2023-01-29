send.addEventListener('click', ()=>{
    let nombre = document.getElementById('nombre').value;
    let apellido = document.getElementById('apellido').value;
    let genero = document.getElementById('genero').value;

    let p1 = new Persona(nombre,apellido,genero);

    result.innerHTML = '<p>> ' + p1.obtDetalles(p1) + '</p>';
});

// Person Model
function Persona(n,a,g){
    this.nombre = n;
    this.apellido = a;
    this.genero = g;
}

// Metodo
Persona.prototype.obtDetalles = (instance) => {
    return 'Nombre: ' + instance.nombre + ', Apellido: ' + instance.apellido + ', Genero: ' + instance.genero;
}