let value = "";

let keys = document.querySelectorAll(".button");

let values = Array.from(keys)

values.forEach((key) => {
    key.addEventListener('click', (e) => {
        if(e.target.innerHTML == "=") {
            value = eval(value);
            document.querySelector('.textbox').value = value;
        }
        else if(e.target.innerHTML == "AC") {
            value = "";
            document.querySelector('.textbox').value = value;
        }
        else if(e.target.innerHTML == "←") {
            value = value.substring(0,value.length-1);
            document.querySelector('.textbox').value = value;
        }
        else {
            console.log(e.target)
            value = value + e.target.innerHTML;
            document.querySelector('input').value = value
        }
    })
}); 
