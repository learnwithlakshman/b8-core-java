function showDateFun(){
    let date = new Date();
    let ele = document.querySelector("#showdate");
    ele.innerHTML = `<h3> Today : ${date} </h3>`;
}

