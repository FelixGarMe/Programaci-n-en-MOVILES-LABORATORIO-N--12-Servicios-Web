// Game Settings
const canvas = document.getElementById("game-canvas");
const ctx = canvas.getContext("2d");
const WIDTH = canvas.width;
const HEIGHT = canvas.height;
const FPS = 30;

// Plant Settings
const plantImage = new Image();
plantImage.src = "plant.png";
const plantWidth = 50;
const plantHeight = 75;
const plantSpeed = 5;
let plantX = WIDTH / 2 - plantWidth / 2;
let plantY = HEIGHT - plantHeight - 10;

// Enemy Settings
const enemyImage = new Image();
enemyImage.src = "enemy.png";
const enemyWidth = 50;
const enemyHeight = 50;
const enemySpeed = 3;
const enemyCount = 5;
let enemies = [];
for (let i = 0; i < enemyCount; i++) {
    enemies.push({
        x: Math.floor(Math.random() * (WIDTH - enemyWidth)),
        y: Math.floor(Math.random() * -HEIGHT),
        speed: enemySpeed,
        width: enemyWidth,
        height: enemyHeight
    });
}

// Game Variables
let score = 0;
let gameOver = false;

// Event Listeners
document.addEventListener("keydown", handleKeyDown);

// Main Game Loop
setInterval(function() {
    update();
    draw();
}, 1000 / FPS);

// Functions
function update() {
    if (!gameOver) {
        // Move Plant
        if (keys.left && plantX > 0) {
            plantX -= plantSpeed;
        }
        if (keys.right &&
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


