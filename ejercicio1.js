// Solicitar números por prompt
let A = prompt("Ingrese el primer número");
while (isNaN(A)) {
  A = prompt("El valor ingresado no es un número, ingrese un número");
}

let B = prompt("Ingrese el segundo número");
while (isNaN(B)) {
  B = prompt("El valor ingresado no es un número, ingrese un número");
}

let C = prompt("Ingrese el tercer número");
while (isNaN(C)) {
  C = prompt("El valor ingresado no es un número, ingrese un número");
}

// Identificar número mayor, número del centro y número menor
let mayor, centro, menor;
if (A >= B && A >= C) {
  mayor = A;
  if (B >= C) {
    centro = B;
    menor = C;
  } else {
    centro = C;
    menor = B;
  }
} else if (B >= A && B >= C) {
  mayor = B;
  if (A >= C) {
    centro = A;
    menor = C;
  } else {
    centro = C;
    menor = A;
  }
} else {
  mayor = C;
  if (A >= B) {
    centro = A;
    menor = B;
  } else {
    centro = B;
    menor = A;
  }
}

// Mostrar números ordenados de mayor a menor
console.log(mayor + ", " + centro + ", " + menor);
// Mostrar números ordenados de menor a mayor
console.log(menor + ", " + centro + ", " + mayor);
// Mostrar mensaje si los números son iguales
if (A == B && B == C) {
  console.log("Los números son iguales");
}

console.log("***********************************");