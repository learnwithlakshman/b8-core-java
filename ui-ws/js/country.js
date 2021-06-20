const url = "https://restcountries.eu/rest/v2/all";
const country_url = `https://restcountries.eu/rest/v2/region/`
const showRegionNames = document.querySelector("#showRegionNames");
const showDataId = document.querySelector("#showDataId");


c_codes = [];

fetch(url)
    .then(data=>data.json())
    .then(res=>{
        region_names = new Set();
        res.forEach(ele => {
            let r = ele["region"];
            if(r !== "")
                region_names.add(r);
            c_codes.push({"code":ele["alpha2Code"].toLowerCase(),"name":ele["name"]})
        });
        showRegions(region_names);
        console.log(c_codes)
    })
    .catch(error=>{
        console.log(error);
    })

function showRegions(rnames){
        let str = "";
        str += "<select id='selectRegion' class='form-control' onchange=showCountryInfo()>";
        str += "<option value=''>Select Region</option>"
        rnames.forEach(name=>{
                str+= `<option value=${name}>${name}</option>`;
        })
        str += "</select>";
        showRegionNames.innerHTML = str;
}
function showCountryInfo(regionId){
   let region = document.querySelector("#selectRegion").value;
   if(region !== ""){
       fetch(country_url+`${region}`).then(data=>data.json()).then(res=>{
           country = [];
           res.forEach(c=>{
               country.push({"name":c["name"],"capital":c["capital"],"population":c["population"],"flag":c["flag"]});
           });
           showCountryDetails(country);
       })
   }
}
function showCountryDetails(countryArr){
     str ="<table class='table table-striped'>";
     countryArr.forEach(country=>{
            str += `<tr>
                        <td>${country.name}</td>
                        <td>${country.capital}</td>
                        <td>${country.population}</td>
                        <td><img src=${country.flag} height='30px' width='30px'></td>
                    </tr>`;
     })
     str += "</table>";
     console.log(str);
     showDataId.innerHTML = str;
}