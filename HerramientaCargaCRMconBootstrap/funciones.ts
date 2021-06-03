function ImprimirPorConsola():void{

    let txtNombre: any = document.getElementById("txtNombre");
    let txtParentesco: any = document.getElementById("txtParentesco");
    let txtMotivo: any = document.getElementById("txtMotivo");
    // let adicionales: any = document.getElementById("adicional");






    
    let rdodat: any = document.getElementById("rdodat");
    let rdoHd12: any = document.getElementById("rdoHd12");
    let rdopackboni: any = document.getElementById("rdopackboni");
    let rdoAumVel: any = document.getElementById("rdoAumVel");

    
    // let rdo325: any = document.getElementById("rdo325");
    // let rdo320: any = document.getElementById("rdo320");
    // let rdo625: any = document.getElementById("rdo625");
    // let rdo640: any = document.getElementById("rdo640");
    // let rdo650: any = document.getElementById("rdo650");
    
    let boniPrimaria:any =  document.getElementsByName("rdoBoniPrimaria");
    let boni:any =  document.getElementsByName("rdoBoni");
    
    
    
    // let rdovt: any = document.getElementById("rdovt");
    // let rdozonal: any = document.getElementById("rdozonal");
    let tec:any = document.getElementsByName("tecn");
    



    let resultado: any = document.getElementsByName("rdoresult");


    




    let rta:String;


    if(txtParentesco.value != ""){

    rta  = "se comunica "+ txtNombre.value + "("  +txtParentesco.value +  ") de tt por mot  " + txtMotivo.value;

    }else{
        rta  = "se comunica tt por mot " + txtMotivo.value;
    }


    rta += ObtenerSeleccionado(boni);
    rta += ObtenerSeleccionado(boniPrimaria);
    rta += ObtenerSeleccionado(tec);
    rta += ObtenerSeleccionado(resultado);



    document.getElementById("adicional").value = rta;

 



}


 function ObtenerSeleccionado(dato:any): string {

    let rta :string = "";
    for(var i=0;i<dato.length;i++)
    if(dato[i].checked) 
      rta =dato[i].value;

     
      return rta;

    



}