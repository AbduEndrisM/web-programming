

var timer = null;
window.onload = document.getElementById("clickbtn").onclick = function () {

    if (timer = null) {
        timer = setInterval(rudy, 1000);
    } else {
        clearInterval(timer);
    }
}

function booyah() {
// called when the timer goes off
    document.getElementById("output").innerHTML = "BOOYAH!";
}


//OR

window.onload = document.getElementById("clickbtn").onclick = function () {

    if (timer = null) {
        timer = setInterval(function () {
            document.getElementById("output").innerHTML = "BOOYAH!";
        }, 1000);
    } else {
        clearInterval(timer);
    }
}