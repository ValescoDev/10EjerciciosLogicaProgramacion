let tempCelsius;

// Ciclo do-while para solicitar la temperatura en Celsius
do {
  tempCelsius = prompt("Ingresa la temperatura en grados Celsius:");
} while (isNaN(tempCelsius));

// Convertimos la temperatura de Celsius a Fahrenheit y Kelvin usando las fórmulas adecuadas
tempCelsius = Number(tempCelsius);
const tempFahrenheit = (tempCelsius * 9 / 5) + 32;
const tempKelvin = tempCelsius + 273.15;

// finalmente imprimimos las temperaturas convertidas en la consola
console.log("Grados Fahrenheit: " + tempFahrenheit.toFixed(2));
console.log("Grados Kelvin: " + tempKelvin.toFixed(2));

console.log("***********************************");