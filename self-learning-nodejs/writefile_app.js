readline =  require('readline').createInterface({
    input:process.stdin,
    output:process.stdout
})

const fs = require('fs');
readline.question('Write something to a file: ', (data) => {
    fs.writeFileSync('output.txt', data);
    const word = fs.readFileSync('output.txt', 'utf8');
    console.log(word);
    readline.close();
});