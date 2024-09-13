
# Refactorization Quiz: Applying the SDLC Process

Documentacion de AgeValidation:
1. Fase de Requisitos
Objetivo: Definir claramente lo que el software debe hacer.

Descripción: El programa AgeValidation solicita la edad de un número específico de personas e informa si cada persona tiene acceso basado en su edad. La mayoría de edad para acceder está definida como 18 años.

Requisitos del sistema:

Permitir la entrada de edades de múltiples personas.
Comparar cada edad con la mayoría de edad (18 años).
Imprimir "Access granted" si la edad es igual o mayor a 18 años.
Imprimir "Access denied" si la edad es menor a 18 años.

2. Fase de Diseño
Objetivo: Planificar cómo se implementarán los requisitos del sistema.

Descripción:

Se usarán variables para almacenar valores en lugar de números mágicos.
Se utilizará un arreglo para almacenar las edades ingresadas.
Se empleará un bucle for para iterar sobre el arreglo y validar cada edad.
Diseño:

Variables constantes: MAYORIA_EDAD (18) y TOTAL_PERSONAS (4).
Arreglo: age para almacenar las edades.
Bucle: Para ingresar y validar edades.
Condiciones: Para determinar si la persona tiene acceso o no.

3. Fase de Implementación
Objetivo: Escribir el código de acuerdo con el diseño previamente definido.

Descripción del código:

Importación: Se importa Scanner para la entrada de datos.
Definición de constantes: MAYORIA_EDAD y TOTAL_PERSONAS.
Inicialización de arreglo: age para almacenar las edades.
Bucle for: Solicita la edad para cada persona, almacena en el arreglo y valida la edad.
Condicionales: Determinan el acceso basado en la edad ingresada.