
const add = require('./math.js').add;
const subtract = require('./math.js').subtract;
const multiply = require('./math.js').multiply;
const divide = require('./math.js').divide;
readline.question('Enter two numbers separated by space: ', (input) => {
    const [a, b] = input.split(' ').map(Number);
    console.log(`Addition: ${add(a, b)}`);
    console.log(`Subtraction: ${subtract(a, b)}`);
    console.log(`Multiplication: ${multiply(a, b)}`);
    try {
        console.log(`Division: ${divide(a, b)}`);
    } catch (error) {
        console.error(error.message);
    }
    readline.close();
});
