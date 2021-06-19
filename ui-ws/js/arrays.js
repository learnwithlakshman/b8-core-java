employees = [
    {"id":1001,"name":"Krish","dept":"SALES","salary":5000},
    {"id":1002,"name":"Manoj","dept":"SALES","salary":3000},
    {"id":1003,"name":"Charan","dept":"MARKETING","salary":4000},
    {"id":1004,"name":"Kiran","dept":"IT","salary":2000},
    {"id":1005,"name":"Rajesh","dept":"IT","salary":3000},
    {"id":1006,"name":"Suresh","dept":"MARKETING","salary":8000}
]


// employees.map(e=>e.name).forEach(ele => {
//     console.log(ele);
// });

employees.push({"id":1007,"name":"Ramesh","dept":"MARKETING","salary":6000})

// employees.forEach(element => {
//     console.log(element)
// });

// // Get only the employees who are working sales 
// console.log("------------Sales------------------")
// employees.filter(e=>e.dept==="SALES").forEach(e=>{
//     console.log(e);
// })

// Get only the name salary of each employee

emp_salary = employees.map(e=>e.salary);
console.log(emp_salary);

// Can you what is total salary paid to all employee;

 biggest =(a,b)=>a > b?a:b;


let t_salary=employees.map(e=>e.salary).reduce(biggest);

console.log(t_salary);
function myreduce(arr,callback){
        let ele = arr[0];
        for(let i=1;i<arr.length;i++){
            ele = callback(ele,arr[i]);
        }
        return ele;
}
console.log(myreduce([1,2,3,4,5,6],(a,b)=>a<b?a:b));
employees.splice(1,3);
