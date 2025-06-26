const fs =require('fs');
fs.readFile('output.txt', 'utf8', (err, data) => {
    if (err) {
        console.error(err);
        return;
    }
    console.log('File content:', data);
});
console.log('This print before the file reading finishes.');