function informacion(elEvento) {
    var evento = elEvento || window.event;
    switch(evento.type) {
        case 'mousemove':
            document.getElementById('info').style.backgroundColor = '#FFFFFF';
            var ie = navigator.userAgent.toLowerCase().indexOf('msie') !== -1;
            var Xrelativa, Yrelativa, Xabsoluta, Yabsoluta;
            if(ie) {
                if(document.documentElement && document.documentElement.scrollTop){
                    Xabsoluta = evento.clientX + document.documentElement.scrollLeft;
                    Yabsoluta = evento.clientY + document.documentElement.scrollTop;
                }
                else {
                    Xabsoluta = evento.clientX + document.body.scrollLeft;
                    Yabsoluta = evento.clientY + document.body.scrollTop;
                }
            }
            else {
                Xabsoluta = evento.pageX;
                Yabsoluta = evento.pageY;
            }
            Xrelativa = evento.clientX;
            Yrelativa = evento.clientY;
            muestraInformacion(['Ratón', 'Navegador [' + Xrelativa + ', ' + Yrelativa + ']', 'Pagina [' + Xabsoluta + ', '+Yabsoluta + ']']);
            break;
        case 'keypress':
            document.getElementById('info').style.backgroundColor = '#CCE6FF';
            var caracter = evento.charCode || evento.keyCode;
            var letra = String.fromCharCode(caracter);
            var codigo = letra.charCodeAt(0);
            muestraInformacion(['Teclado', 'Caracter ['+letra+']', 'Codigo ['+codigo+']']);
            break;
        case 'click':
            document.getElementById('info').style.backgroundColor = '#FFFFCC';
            break;
    }
}

function muestraInformacion(mensaje) {
    document.getElementById("info").innerHTML = '<h1>'+mensaje[0]+'</h1>';
    for(var i=1; i<mensaje.length; i++) {
        document.getElementById("info").innerHTML += '<p>'+mensaje[i]+'</p>';
    }
}

document.onmousemove = informacion;
document.onkeypress = informacion;

document.onclick = informacion;