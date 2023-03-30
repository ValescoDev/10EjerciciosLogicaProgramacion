// Solicitar al usuario un número utilizando prompt y almacenarlo en una variable
let num = prompt("Ingresa un número");

// Utilizar la función parseInt() para convertir la entrada del usuario en un número entero
num = parseInt(num);

// Verificar que el usuario ingresó un número válido. Si no es así, mostrar un mensaje de error y volver a solicitar el número.
while (isNaN(num) || num < 0) { // Validamos que el número sea positivo
  alert("Error: Ingresa un número válido y positivo.");
  num = prompt("Ingresa un número");
  num = parseInt(num);
}

// Definir una variable para almacenar el factorial
let factorial = 1;

// Calcular el factorial del número ingresado por el usuario
for (let i = 1; i <= num; i++) {
  factorial *= i;
}

// Mostrar el resultado por consola
console.log(factorial);

// Mostrar el resultado en el DOM
document.write(`El factorial de ${num} es ${factorial}`);

console.log("***********************************");

