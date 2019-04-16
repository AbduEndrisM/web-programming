
var sr=0;
var timer;

function checkNumberOfClicked(x){
    sr = sr + x;
    if(sr <= 1){
          timer = setInterval(buttonclick,500);
        } else {
            clearInterval(timer);
        }
        }
    

function buttonclick(){
var text=document.getElementById("textarea");
// text.style.fontSize="24pt";
var style= window.getComputedStyle(document.getElementById("textarea")).fontSize;
var fontSize=parseFloat(style);
text.style.fontSize = (fontSize + 2) +'px';
}

function blingclick(){
    var text=document.getElementById("textarea");
    var check=document.getElementById("checkbox");
    if(check.checked){
        document.body.style.backgroundImage = "url('http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";        text.style.fontWeight="bold";
        text.style.color="green"; 
        text.style.textDecoration= "underline";
    
    }
    else{
        text.style.fontWeight="normal";
    }
    alert("checkbox clicked");

}

function pigLatin() {
	var text1 = document.getElementById("textarea").value;
	var textarr = text1.split(" ");
	var text="";
	
	
	var final="";

	for(let j=0;j<textarr.length;j++){
		text = textarr[j];
		var result="";

	if(text.match(/^[^aeiouAEIOU]/)){

		for(let i=0;i<text.length;i++){
			if(!text.charAt(i).match(/^[^aeiouAEIOU]/)){
				result = text.substring(i,text.length) + text.substring(0,i) + "ay";
				i=text.length;
			}
		}
	}

	if(text.match(/^[aeiou]/)){
		result=text+"ay";
	}

	if(j==0) final+=result;
	else final+=" "+result;

}

	document.getElementById("textarea").value =final;
}
    