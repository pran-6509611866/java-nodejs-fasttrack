function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function run() {
    await delay(2000);
    console.log('async/await: Executed after 1 second');
}

run();