const companies = [
    {name: "Company One", category: "Finance", start: 1981, end: 2003},
    {name: "Company Two", category: "Retail", start: 1992, end: 2008},
    {name: "Company Three", category: "Auto", start: 1999, end: 2007},
    {name: "Company Four", category: "Retail", start: 1989, end: 2010},
    {name: "Company Five", category: "Technology", start: 2009, end: 2014},
    {name: "Company Six", category: "Finance", start: 1987, end: 2010},
    {name: "Company Seven", category: "Auto", start: 1986, end: 1996},
    {name: "Company Eight", category: "Technology", start: 2011, end: 2016},
    {name: "Company Nine", category: "Retail", start: 1981, end: 1989}
];

const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];﻿

// document.writeln(ages.forEach());
console.log(ages);
//for

for (let i = 0; i < companies.length; i++) {
    // console.log(companies[i].category);
}
// for each
companies.forEach(function (start) {
    // console.log(start.start);

})


// filter
const newAge = [];

for (let i = 0; i < ages.length; i++) {
    if (ages[i] > 18)
        newAge.push(ages[i]);
}
// console.log(newAge.toString());

const newAge2 = ages.filter(function (age) {
    if (age > 21) {
        return true;
    }

});
// console.log(newAge2)

const newAge3 = ages.filter(age => age > 30);
console.log(newAge3);


//get 80s factories

const eighties = companies.filter(company => company.start >= 1990 && company.start <= 2000);
console.log(eighties);

//lasted for 10 years

const ten = companies.filter(company => company.end - company.start >= 10);
console.log(ten);


//MAP

// all company names
// Name of retails = filter + map

// const compNames = companies.map(function (company) {
//     return company.name;
// })
// console.log(compNames);

const agesDouble = ages.map(age => age * 2);
console.log("Double Ages = " + agesDouble);


const compName = companies
    .map(name => name.name);
console.log(compName);


//  MAP + Filter
// Name of retails = filter + map
const compNames = companies
    .filter(retail => retail.category == "Retail")
    .map(name => name.name);
console.log(compNames);


//ES6 Template string
const compYear = companies.map(function (company) {
    return `${company.name} [${company.start} -${company.end}]`;
});
console.log(compYear);

const compYears = companies.map(x => (x.name + " [" + x.start + "- " + x.end + " ]"));
console.log(compYears);


//SORT

const sortComp = companies.sort(function (comp1, comp2) {
    if (comp1.start > comp2.start)
        return 1;
    else
        return -1;
});
// console.log(sortComp);


const sortCompany = companies.sort((c1, c2) => c1.start > c2.start ? 1 : -1);
// console.log(sortCompany);
console.log(sortCompany.sort((c1, c2) => c1.name > c2.name ? 1 : -1));


//sort ages
console.log(ages.sort((a, b) => a > b ? 1 : -1));
console.log(ages.sort((a,b)=>a-b));
// console.log(ages.sort());

console.log(ages.sort((a, b) => b > a ? 1 : -1));
console.log(ages.sort((a,b)=>b-a));


//REDUCE

//sum ages for loop
let ageSum = 0;
for (let i = 0;i < ages.length;i++)
{
    ageSum = ageSum + ages[i];
}
console.log(ageSum);

//.reduce

let sumAge = ages.reduce(function (total, age) {
    return total + age;
},0);
console.log(sumAge);

let sumTotal = ages.reduce((total, age)=> total+age, 0);
console.log(sumTotal);

//multip of ages
let ageMult = ages.reduce((total, age)=>total*age, 1);
console.log(ageMult);

//get Total comapnies year

const sumYear = companies.reduce((total, company)=> total + (company.end-company.start), 0);
console.log(sumYear);


//
const companyNames = companies
    .filter(company=> company.start>=2000)
    .map(company=>company.category)
    .map(cata=>cata.toLowerCase());

console.log(companyNames);