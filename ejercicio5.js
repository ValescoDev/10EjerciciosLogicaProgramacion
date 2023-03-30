// Generamos un número aleatorio entre 1 y 100
let numeroSecreto = Math.floor(Math.random() * 100) + 1;

// Declaramos una variable para almacenar los números ingresados
let numerosIngresados = [];

// Solicitamos al usuario que adivine el número
let numeroIngresado = parseInt(prompt("Adivina el número secreto (entre 1 y 100):"));

// Mientras el número ingresado no sea igual al número secreto
while (numeroIngresado !== numeroSecreto) {
  // Si el número ingresado no es válido, pedimos que ingrese otro número
  if (isNaN(numeroIngresado) || numeroIngresado < 1 || numeroIngresado > 100) {
    console.log("Por favor ingresa un número válido entre 1 y 100.");
  } else {
    // Si el número ingresado es válido pero no es el número secreto, se lo indicamos al usuario
    console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    numerosIngresados.push(numeroIngresado);
  }
  // Pedimos al usuario que ingrese otro número
  numeroIngresado = parseInt(prompt("Adivina el número secreto (entre 1 y 100):"));
}

// Si el usuario adivinó el número secreto, se lo indicamos y mostramos la lista de números ingresados
console.log("Felicidades, adivinaste el número secreto: ", numeroSecreto);
console.log("Números ingresados:", numerosIngresados);

console.log("***********************************");

