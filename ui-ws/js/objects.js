employee = {
    name: "Krish",
    email: "krish@gmail.com",
    details: function(){
        return "Name :"+this.name+" and email:"+this.email;
    }
}

emp = {
    "name" : "Krish",
    "email address" : "krish@gmail.com",
    "address":{
            "city":"BLR",
            "state":"KA"
    },
    "contactInfo":[
        {
            "number":"8765456789",
            "relation":"Parent"
        },
        {
            "number":"8765456789",
            "relation":"Brother"
        }
    ],
    "age":32,
    "isworking":false

}


emp.contactInfo.forEach(e=>{
        console.log(e);
})

console.log(emp["email address"]);