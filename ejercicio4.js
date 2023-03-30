// Solicitamos el número al usuario y verificamos que sea un número
let number = prompt("Ingrese un número:");
while (isNaN(number) || number <= 0) { // Validamos que el número sea positivo
  alert("El valor ingresado no es un número válido. Inténtalo de nuevo.");
  number = prompt("Ingrese un número:");
}

// Convertimos el número a entero
number = parseInt(number);

// Declaramos la serie de fibonacci y los dos primeros números
let fibonacci = [0, 1];
let i = 2;

// Generamos la serie de fibonacci hasta el número ingresado por el usuario
while (i <= number) {
  fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
  i++;
}

// Imprimimos la serie de fibonacci por consola o DOM
console.log(fibonacci.slice(0, number));

console.log("***********************************");