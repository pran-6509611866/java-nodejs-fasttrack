const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function length() {
    readline.question('Enter a string: ', async (input) => {
        await delay(1000);
        console.log(`The length of the string is: ${input.length}`);
        
        // เรียกฟังก์ชัน even หลังจาก length เสร็จ
        even();
    });
}

async function even() {
    readline.question('Enter numbers separated by space: ', async (input) => {
        await delay(1000);
        const numbers = input.split(' ').map(Number);
        const evenNumbers = numbers.filter((num) => {
            return num % 2 === 0;
        });
        console.log(`The even numbers are: ${evenNumbers.join(', ')}`);
        property();
    });
}

async function property() {
    readline.question('Enter a name and age separated by space: ', async (input) => {
        await delay(1000);
        const [name, age] = input.split(' ');
        console.log(`Name: ${name}`);
        readline.close(); // ปิด readline หลังจากเสร็จทุกอย่าง
    });
}

// เริ่มต้นด้วยฟังก์ชัน length ก่อน
length();