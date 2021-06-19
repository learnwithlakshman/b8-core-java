
if(localStorage.getItem("todos")==null){
    localStorage.setItem("todos",JSON.stringify(["Reading JS"]));
}

const todoInput = document.querySelector("#todoInput");
const showTodos = document.querySelector("#showTodos");


index = -1;
showUpdatedTodo();

function removeTodo(pos){
    let todos = JSON.parse(localStorage.getItem("todos"));
    todos.splice(pos,1);
    localStorage.setItem("todos",JSON.stringify(todos));
    showUpdatedTodo();
}

function editTodo(pos){
    let todos = JSON.parse(localStorage.getItem("todos"));
    index = pos;
    let val = todos[pos];
    todoInput.value = val;
}
function clearTodos(){
    localStorage.removeItem("todos");
}
function showUpdatedTodo(){
    let todos = JSON.parse(localStorage.getItem("todos"));
    let str = "";
    if(todos.length == 0){
            str = "<p class='lead'>No TODOS are added yet, please add your todos....</p>";
    }else{
        str = '<ul class="list-group">';
        for(let i=0;i<todos.length;i++){
            str += `<li class="list-group-item">${todos[i]}<span style='float:right'><i class='fa fa-edit' onclick=editTodo(${i})></i>&nbsp;<i class='fa fa-trash' onclick=removeTodo(${i})></i></span></li>`;
        }
        str+= "</ul>";
    }
    showTodos.innerHTML = str;
}

todoInput.addEventListener('keyup',(event)=>{
        if(event.code === 'Enter'){
            let val = event.target.value;
            todos = JSON.parse(localStorage.getItem("todos"));
            if(val.trim() !== ""){
                if(index == -1){
                    todos.push(val);
                }
                else{
                    todos[index] = val;
                    index = -1;
                }
                localStorage.setItem("todos",JSON.stringify(todos));
                todoInput.value = '';
                showUpdatedTodo();
            }
        }
});



