
# Refactorization Quiz: Applying the SDLC Process


--- Etapas del SDLC ---

---*Quiz 1 : Store*---

   -Análisis: El objetivo del programa es implementar una solución para una tienda que desea calcular las ventas y evaluar su rendimiento. Basandose en la existencia de 3 productos y 3 precios diferentes correspondientes a cada uno. Se identificaron necesidades como almacenar precios y cantidades de productos y calcular el total de ventas. También se definió el umbral de 50 para evaluar si las ventas son "buenas" o "malas".

   -Diseño: 
      1. Se utilizará la entrada del usuario (a través de Scanner) para introducir la cantidad de productos vendidos.
      2. Se usa un array para los precios (prices) y otro array para las cantidades (amount), en lugar de usar variables individuales.
      3. Se implementa un ciclo for para iterar a través de los productos, calcular el total de ventas y luego evaluar el rendimiento de ventas mediante una estructura condicional if-else.
      4. Eliminar los magic numbers y crear una constante MAYOR_VENTA para representar el valor crítico de ventas
   
   -Implementación: Se codfica el programa usando Java, basados en el diseño como el uso de un array para los precios y las cantidades mejorando la estructura del código, haciéndolo más fácil de mantener.

   -Prueba: Se verifica que el sistema funcione correctamente bajo diferentes escenarios. Se probarían diferentes combinaciones de cantidades para los tres productos. Se podría probar con diferentes entradas para asegurarse de que el cálculo total de las ventas sea correcto y que el sistema evalúe correctamente el rendimiento de ventas.

   -Mantenimiento: Esta fase implica realizar mejoras o correcciones después de que el programa ha sido probado.


---*Quiz 2: TaxCalculation*---

   -Análisis: Para el cálculo de impuestos, se define la necesidad de calcular el impuesto total basado en el precio de los productos y el porcentaje de impuestos aplicables. El sistema también necesita clasificar el resultado en "alto" o "bajo" según un umbral predeterminado. Se analiza que el sistema debe recibir precios de productos y sus impuestos asociados, calcular el impuesto total y luego determinar si es "alto" o "bajo" en función de un umbral (definido como TAX_THRESHOLD).

   -Diseño: 
      1. Los precios de los productos y los porcentajes de impuestos se almacenan en arrays (productPrice y percentage).
      2. Se usará un ciclo for para iterar sobre los productos, calcular los impuestos y luego clasificar el total de impuestos usando una estructura condicional (if-else).
      3. El sistema evalúa si el total de impuestos es mayor que el umbral definido, TAX_THRESHOLD, para determinar si es "alto" o "bajo".
      4. Utilizar una constante (TAX_THRESHOLD) para mejorar la claridad y evitar magic numbers.

   -Implementación: En esta fase, el diseño se convierte en código funcional, se crean los arrays respectivos. El cálculo del impuesto se implementa utilizando un bucle for que itera sobre los productos. Además, se implementa una estructura condicional if-else para comparar el impuesto total con el umbral.

   -Prueba: Verificar que el cálculo de los impuestos se realiza correctamente para varios valores de precios y porcentajes. Probar con impuestos justo en el umbral de 50, por debajo y por encima para asegurarse de que el sistema clasifica correctamente el impuesto como "alto" o "bajo".

   -Mantenimiento: Esta fase implica realizar ajustes y mejoras continuas en el sistema una vez que ya está en uso. Esto podría incluir la actualización de los porcentajes de impuestos, agregar más productos, o ajustar el umbral de clasificación del impuesto.


---*Quiz 3: AgeValidation*---

   -Análisis: El programa AgeValidation solicita la edad de un número específico de personas e informa si cada persona tiene acceso basado en su edad. La mayoría de edad para acceder está definida como 18 años. 
   Requisitos: Permitir la entrada de edades de múltiples personas. Comparar cada edad con la mayoría de edad (18 años). Imprimir "Access granted" si la edad es igual o mayor a 18 años. Imprimir "Access denied" si la edad es menor a 18 años.

   -Diseño: 
      1. Se utiliza el Scanner para recibir la entrada del usuario, que en este caso es la edad de varias personas.
      2. Se crea un ciclo for que recorre las edades de todas las personas y evalúa si son mayores o menores de edad. Dependiendo de la evaluación, se imprime un mensaje de "Access granted" o "Access denied".
      3. Se reemplazan los magic numbers con variables constantes (MAYORIA_EDAD y TOTAL_PERSONAS), lo que mejora la legibilidad y el mantenimiento del código.

   - Implementación: Fase donde se codifican las decisiones tomadas durante el diseño. Se escribe el bucle que solicita las edades y se verifica si cada persona es mayor o menor de edad, imprimiendo los mensajes correspondientes.

   -Prueba: Se debe probar con personas cuya edad esté justo en el límite de mayoría de edad (por ejemplo, 18 años) para asegurar que el sistema maneje correctamente este caso. Ingresar edades mayores y menores de 18 para verificar que el sistema responda correctamente.
   
   -Mantenimiento: Esta fase implica ajustar y mejorar el sistema a lo largo del tiempo en función de nuevas necesidades o errores detectados.

Unit 1: Data Storage and Control Flow**:
  - Writing variables and constants
  - Arithmetic operators
  - Input/output system
  - Conditional operators
  - Control structures
  - Avoiding magic numbers
  - Lists of data with arrays
  - Basic SDLC principles

---


## Overview

This quiz is designed to test your ability to refactor code using **professional best practices**. Working in **pairs**, you will refactor provided code by improving its readability, efficiency, and scalability. You will also apply the **Software Development Life Cycle (SDLC)**, using structured phases to enhance the code. Each group will fork the repository, refactor the code, and submit a pull request with their improvements.

---

## Objectives

- Apply concepts from **
## SDLC Approach

You must follow the **SDLC process** to refactor the code:

1. **Phase 1: Requirements Analysis** – Understand the original code, identify its weaknesses, and define improvement requirements.
2. **Phase 2: Design** – Plan how to improve the code structure, renaming variables, optimizing logic, and making it more efficient.
3. **Phase 3: Implementation** – Refactor the code following your design plan, ensuring better readability and efficiency.
4. **Phase 4: Testing** – Test the refactored code with multiple inputs to ensure correctness and improvements.
5. **Phase 5: Documentation & Maintenance** – Write clear comments, and submit your final version, ensuring the code is easy to maintain.

---

## Instructions

1. **Repository Forking**:
   - Fork the repository to create a copy in your GitHub account.
   - Clone the repository to your local machine.

2. **Analyze the Code**:
   - Carefully read the provided code.
   - Identify magic numbers, unclear variable names, or inefficient logic.

3. **Refactor the Code**:
   - Improve the variable names, replace magic numbers with constants, and optimize the control structures.
   - Make sure to add comments explaining the logic and changes you made.
   - Apply **arrays** where repetition of variables exists.

4. **Test the Refactored Code**:
   - Run the program with different inputs to validate that the refactored code functions as expected.
   - Ensure the program handles errors gracefully (e.g., invalid input, edge cases).

5. **Submit Your Work**:
   - Once you complete the refactorization, push your changes to your forked repository.
   - Create a pull request (PR) to the original repository, explaining the improvements you made and how you followed the **SDLC** approach.





