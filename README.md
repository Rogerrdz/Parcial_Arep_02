
Problema matematico
Secuencia de Tribonacchi
Sus servicios matemáticos deben incluir una función.
Una para calcular la secuencia de Tribonacci hasta un índice dado: tribseq(n) retorna un JSON con los términos desde
T(0) hasta T(n). (Recibe solo enteros no negativos).
Definición
T(0)=0, T(1)=0,  T(2)=1, T(n)=T(n−1)+T(n−2)+T(n−3)
paran≥3
Implementación requerida
Implemente la secuencia en forma iterativa usando la recurrencia, acumulando cada término desde 0 hasta n. No use funciones de librerías ni APIs que ya entreguen la secuencia.

Detalles adicionales de la arquitectura y del API
Implemente el servicio para responder al método HTTP GET. Use el nombre de la función especificado y pase el parámetro en la variable de query con nombre "value".

Ejemplo de llamado (EC2)

https://amazonxxx.x.xxx.x.xxx:{port}/tribseq?value=13

Salida (JSON)

{
  "operation": "Secuencia de Tribonacci",
  "input": 13,
  "output": "0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504"
}

En el campo de texto escriba la dirección de su repositorio GITHUB.