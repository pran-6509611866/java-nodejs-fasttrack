function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    if (b === 0) {
        throw new Error("Cannot divide by zero");
    }
    return a / b;
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

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
})