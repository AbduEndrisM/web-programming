var canvas, context, dragging = false, dragStartCoordinate, snapShot;



function takeSnapshot() {
    snapShot=context.getImageData(0,0, canvas.width, canvas.height);
    
}
function restoreSnapshot() {
    context.putImageData(snapShot, 0 ,0);
}

function getCanvasCoordinate(event) {
    let x = event.clientX - canvas.getBoundingClientRect().left;
    let y = event.clientY - canvas.getBoundingClientRect().top;
    return {x: x, y: y};
}

function drawLine(position) {
    context.beginPath();
    context.moveTo(dragStartCoordinate.x, dragStartCoordinate.y);
    context.lineTo(position.x, position.y);
    context.stroke();

}

function dragStart(event) {
    dragging = true;
    dragStartCoordinate = getCanvasCoordinate(event);
    takeSnapshot();
}

function drag(event) {
    let currentCoordinate;
    if (dragging == true) {
        restoreSnapshot();
        currentCoordinate = getCanvasCoordinate(event);
        // drawLine(currentCoordinate);
    }

}

function dragStop(event) {
    dragging = false;
    restoreSnapshot();
    let currentCoordinate = getCanvasCoordinate(event);
    drawLine(currentCoordinate);
}

function init() {

    canvas = document.getElementById("canvas");
    context = canvas.getContext("2d");
    context.strokeStyle = "Green";
    context.lineWidth = 5;
    context.lineCap = 'square';


    canvas.addEventListener("mousedown", dragStart, false);
    canvas.addEventListener("mousemove", drag, false);
    canvas.addEventListener("mouseup", dragStop, false);
}

window.addEventListener('load', init, false);
