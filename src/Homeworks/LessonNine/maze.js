'use strict';

var win = true;

$(document).ready(function() {
    $("#maze .boundary").mouseover(changeRedColor);
    $("#start").click(resetAll);
    $("#maze").mouseleave(changeRedColor);
    $("#end").mouseover(endTheGame);
    
    
});

function changeRedColor(){
    if(!win){
    $("#maze .boundary").addClass("youlose");
    $("#status").text("You Lose!");
    win = true;
    }
}
function resetAll(){
    win = false;
    $("#maze .boundary").removeClass("youlose");
    $("#status").text("Move through maze...");
}

function endTheGame(){
    if(!win){
    win = true;
    $("#status").text("You Win! :]");
    }
}
