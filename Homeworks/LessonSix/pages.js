function pageOne() {


    var text = document.getElementById("txt");
    text.innerHTML =
        "<ul> " +
        "<li> You may want to bring your textbook to labs to look up syntax and examples.\n</li>" +
        "<li> Have a question? Ask a TA for help, or look at the book or  <a href='http://mumstudents.org/cs472/2016-05-BL/Lectures/'>lecture slides. </a> \n</li>" +
        "<li> You may want to bring your textbook to labs to look up syntax and examples.\n</li> </ul>"
    ;

}
function pageTwo() {


    var text = document.getElementById("txt");
    text.style.fontSize="1.5em";
    text.style.textAlign="left";
    // nav.style.padding="5px";
    text.innerHTML  = "<p> Today you'll write a page where the user can type text into a box, and by clicking on UI controls, the user can decorate the text by giving it funny styling." +
        " </p> <p>The HTML page decoratemytext.html contains a basic HTML shell and page header. This skeleton already links to a CSS file decoratemytext.css that defines all the styles you need. You do not have to write any CSS code today.\n" +
        "\n</p> <p>You will write a JavaScript file decoratemytext.js that will manipulate the text.\n" +
        "\n</p><p> Download the HTML file below (right-click, Save Target As...) to get started:\n" +
        "\n</p> <ul><li><a href='http://mumstudents.org/cs472/2016-05-BL/Labs/6/decoratemytext.html'> decoratemytext.html</a> </li></ul>"


}
function pageThree() {

    var text = document.getElementById("txt");
    text.style.fontSize="1.5em";
    text.style.textAlign="left";
    text.innerHTML  = "<p> (See example screenshot on next slide.)</p> <p>The first task is to expand decoratemytext.html by adding UI controls. Add HTML code for the following:\n</p>" +
        "<ul><li>A field for users to enter large (multi-line) amounts of text.\n</li><ul><li> It should be 4 rows by 30 columns in size.</li><li>Wrap it in a bordered field set box with the label \"Text\".\n</li></ul></li>"+
        // "Add a second bordered field set box labeled \\\"Decoration\\\" that contains the following controls:\\n<li> A button labeled: Bigger Decorations!\\n</li><li> A checkbox labeled \\\"Bling\\\"\\n</li></ul><li> <strong>NOTE: Controls are sometimes used in forms; but you must not use the form tag on your page.</strong></li></ul>\"+"
"<li>Add a second bordered field set box labeled \"Decoration\" that contains the following controls:\n</li><ul><li> A button labeled: Bigger Decorations!\n</li><li>A checkbox labeled \"Bling\"\n</li></ul></li>" +

        "  <li><strong> NOTE: Controls are sometimes used in forms; but you must not use the form tag on your page. </strong></li>"
}

function change(x) {
    // let xx = select.options;
    let page = x.options.selectedIndex;
    switch (page) {
        case 0:
            pageZero();
            break;
        case 1:
            pageOne();
            break;
        case 2:
            pageTwo();
            break;
        case 3:
            pageThree();
            break;
        case 4:
            pageZero();
            break;
        case 5:
            pageOne();
            break;
        case 6:
            pageTwo();
            break;
        case 7:
            pageThree();
            break;
        case 8:
            pageZero();
            break;
        case 9:
            pageOne();
            break;
        case 10:
            pageTwo();
            break;
        case 11:
            pageThree();
            break;
        case 12:
            pageZero();
            break;
        case 13:
            pageOne();
            break;

    }
    // alert(page);
    // one.change(function() {
    //      var val = $("#myOptions option:selected").text();

    // });
}