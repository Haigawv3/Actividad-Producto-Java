+----------------+
|    Materia     |
+----------------+
| nombre         |
| clave          |
| creditos       |
| horasSemanales |
+----------------+

+----------------+
|     Curso      |
+----------------+
| nombre         |
| materia1       |
| materia2       |
| materia3       |
+----------------+

+----------------+
|    Profesor    |
+----------------+
| nombre         |
| numeroNomina   |
| sueldoHora     |
| materia        |
+----------------+

+----------------+
|    Alumno      |
+----------------+
| matricula      |
| nombre         |
| edad           |
| curso          |
+----------------+


Usuario inicia programa
        ↓
Main crea Materias
        ↓
Main crea Curso
        ↓
Main crea Profesor
        ↓
Main crea Alumno
        ↓
Alumno recibe Curso
        ↓
Sistema muestra información


Usuario → Main : ejecutar programa
Main → Materia : crear materias
Main → Curso : crear curso
Main → Profesor : crear profesor
Main → Alumno : crear alumno
Main → Alumno : mostrar datos
