function sayHello(name) {
    return `Hello, ${name}!`;
}

const readline = require('readline').createInterface({
    input:process.stdin,
    output:process.stdout
});


readline.question('What is your name? ', (name) => {
    console.log(sayHello(name));
    readline.close();
});