function showResult(ope) {
  let num1 = Number.parseInt(document.querySelector("#num1").value);
  let num2 = Number.parseInt(document.querySelector("#num2").value);
  let res = 0;
  switch (ope) {
    case "+":
      res = num1 + num2;
      break;
    case "-":
      res = num1 - num2;
      break;
    case "*":
      res = num1 * num2;
      break;
    case "/":
      res = num1 / num2;
      break;
    case "%":
      res = num1 % num2;
      break;
  }

  document.querySelector("#res").value = `${num1} ${ope} ${num2} = ${res}`;
}


function convertTo(){
  
}

function calEmi(){

}