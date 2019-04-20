$.ajax("http://jsonplaceholder.typicode.com/users")
    .done(functionName); // we are expecting a JSON string/object
function functionName(jsonData) {
    // console.log(jsonData);
    console.log(JSON.stringify(jsonData));
    console.log("userid is: " + jsonData.id);
}