function biggest(a,b,c){
      if(a > b && a > c){
          return a;
      }else if(b > c){
          return b;
      }else {
          return c;
      }
}

let big = biggest(20,30,50)

console.log(123=="123");
console.log(123==="123");
console.log(new String("123") instanceof String)
console.log("Biggest is :"+big)