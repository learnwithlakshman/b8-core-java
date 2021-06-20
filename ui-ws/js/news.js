category = [
    "business",
    "entertainment",
    "general",
    "health",
    "science",
    "sports",
    "technology"
]
countryArr = [
    {
        "code": "sg",
        "name": "Singapore"
    }, {
        "code": "us",
        "name": "United States of America"
    }, {
        "code": "cn",
        "name": "China"
    }, {
        "code": "ca",
        "name": "Canada"
    },
    {
        "code": "in",
        "name": "India"
    }
]

const apikey = "5c636a468a90465aa7cab199265d7299";

function showNewsCountryInfo(){
    const countryId = document.querySelector("#countryId");
    str ="<select name='country' id='country' class='form-control' onchange='showNews()'>";
        countryArr.forEach(ele=>{
            str += `<option value=${ele.code}>${ele.name}</option>`
        })
    str +="</select>";
    countryId.innerHTML = str;
}
function showNewsCategoryInfo(){
    const categoryId = document.querySelector("#categoryId");
    str ="<select name='category' id='category' class='form-control' onchange='showNews()'>";
    category.forEach(ele=>{
            str += `<option value=${ele}>${ele}</option>`
        })
    str +="</select>";
    categoryId.innerHTML = str;
}

function showNews(){
    let country = document.querySelector("#country").value;
    let category = document.querySelector("#category").value;
    let url = `https://newsapi.org/v2/top-headlines?country=${country}&category=${category}&apiKey=${apikey}`;
    fetch(url).then(json=>json.json()).then(res=>{
          console.log(res);
          let articles = res["articles"];
          let newsItems = [];
          articles.forEach(item=>{
                newsItems.push({"title":item['title'],"description":item['description'],"urlImg":item['urlToImage']});
          })
          showNewsItems(newsItems);
    }).catch(error=>{
        console.log("Something went wrong",error);
    })
}

function showNewsItems(items){
    const showNewsId = document.querySelector("#showNewsId");
    let str = ""
    items.forEach(ele=>{
            str += `<div class="card">
            <img class="card-img-top" src=${ele.urlImg} alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">${ele.title}</h5>
              <p class="card-text">${ele.description}</p><a>Go somewhere</a>
            </div>
          </div>`
    })
    showNewsId.innerHTML = str;
}

showNewsCategoryInfo();
showNewsCountryInfo();