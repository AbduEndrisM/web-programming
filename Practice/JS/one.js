// functions

//Anonymous
var square = function (number) {
    return number * number
};
var x = square(4) // x gets the value 16
console.log(x);


//Named
function square(number) {
    return number * number;
}

console.log(square(4))


//Named
function square(number) {
    return number * number;
}

let x = square(4);
console.log(x);


/*
< button onclick = "changeText();" > Click me! < /button>
< input id = "output" type = "text" value = "replace me" / >
*/
    function changeText() {
        const textbox = document.getElementById("output");
        textbox.value = "Hello, world!";
    }

