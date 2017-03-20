var arma       = [];
var escudo     = [];
var botas      = [];
var traje      = [];
var casco      = [];
var x=[],y=[];
var ancho=50; var alto=50;
             


function dibujarCanvas(Personajes mispjs){
    var canvas = document.getElementById('miCanvas');
    var ctx = canvas.getContext('2d');
 
    mispjs=creador.getPersonajes();
    
    
    for(i = 0;i<mispjs.getPjsArmas().size();i++){
        arma[i] =   new Image();
        escudo[i]   =   new Image();
        botas[i]   =   new Image();
        traje[i]    =   new Image();
        casco[i]   =   new Image();
        
        x[i]=mispjs.getCordenadax().get(i);
        y[i]=mispjs.getCordenaday().get(i);
        arma[i].src    =   'mispjs.getPjsArmas().get(i).getImagenSrc()';
        escudo[i].src  =   'mispjs.getPjsEscudos().get(i).getImagenSrc()';
        botas[i].src   =   'mispjs.getPjsBotas().get(i).getImagenSrc()';
        traje[i].src   =   'mispjs.getPjsTrajes().get(i).getImagenSrc()';
        casco[i].src   =   'mispjs.getPjsCascos().get(i).getImagenSrc()';        

        traje[i].onload = function(){
        ctx.drawImage(traje[i],x[i],y[i],ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };

        casco[i].onload = function(){
        ctx.drawImage(casco[i],x[i],y[i]-alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        arma[i].onload = function(){
        ctx.drawImage(arma[i],x[i]-ancho,y[i],ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        escudo[i].onload = function(){
        ctx.drawImage(escudo[i],x[i]+ancho,y[i],ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        botas[i].onload = function(){
        ctx.drawImage(botas[i],x[i],y[i]+alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };     
    };
    ctx.strokeRect(0,0,900, 900); 
}