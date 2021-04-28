// Use const until you know the value of variable will be changed
let score;
const number = 10;
//====================================
// You can have different types of elements in an array
const fruits = ['apple', 1, true];
console.log(fruits);

// function
function addNums(num1 = 1, num2 = 2) {
    return num1 + num2;
}

// es6 arrow function -> name it as a variable
const addNums = (num1 =1, num2 = 2) => {
    console.log(num1 + num2)
};

const addNums = (num1 =1, num2 = 2) => console.log(num1 + num2);

// return value
const addNums = (num1 =1, num2 = 2) => num1 + num2;

// return value
const addNums = (num1 =1, num2 = 2) => {
    return num1 + num2;
};

//====================================
// 0 variable function
function randomNumber() {
    return Math.random;
}
// es6  variable function
let randomNumber2 = () => Math.random;

//====================================
// anomynous function
document.addEventListener('click', function() {
    console.log('click')
})

//es6  anomynous function
document.addEventListener('click', () => {
    console.log('click')
})

//es6  anomynous function
document.addEventListener('click', () => console.log('click'))