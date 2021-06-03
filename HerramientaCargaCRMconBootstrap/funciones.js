function ImprimirPorConsola() {
    var txtNombre = document.getElementById("txtNombre");
    var txtParentesco = document.getElementById("txtParentesco");
    var txtMotivo = document.getElementById("txtMotivo");
    // let adicionales: any = document.getElementById("adicional");
    var rdodat = document.getElementById("rdodat");
    var rdoHd12 = document.getElementById("rdoHd12");
    var rdopackboni = document.getElementById("rdopackboni");
    var rdoAumVel = document.getElementById("rdoAumVel");
    // let rdo325: any = document.getElementById("rdo325");
    // let rdo320: any = document.getElementById("rdo320");
    // let rdo625: any = document.getElementById("rdo625");
    // let rdo640: any = document.getElementById("rdo640");
    // let rdo650: any = document.getElementById("rdo650");
    var boniPrimaria = document.getElementsByName("rdoBoniPrimaria");
    var boni = document.getElementsByName("rdoBoni");
    // let rdovt: any = document.getElementById("rdovt");
    // let rdozonal: any = document.getElementById("rdozonal");
    var tec = document.getElementsByName("tecn");
    var resultado = document.getElementsByName("rdoresult");
    var rta;
    if (txtParentesco.value != "") {
        rta = "se comunica " + txtNombre.value + "(" + txtParentesco.value + ") de tt por mot  " + txtMotivo.value;
    }
    else {
        rta = "se comunica tt por mot " + txtMotivo.value;
    }
    rta += ObtenerSeleccionado(boni);
    rta += ObtenerSeleccionado(boniPrimaria);
    rta += ObtenerSeleccionado(tec);
    rta += ObtenerSeleccionado(resultado);
    document.getElementById("adicional").value = rta;
}
function ObtenerSeleccionado(dato) {
    var rta = "";
    for (var i = 0; i < dato.length; i++)
        if (dato[i].checked)
            rta = dato[i].value;
    return rta;
}
