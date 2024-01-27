# Proyecto: Clínica odóntologica

## Requerimientos
Una **clínica odontológica** necesita una **aplicacion web** para administrar los datos y turnos de cada uno de sus **pacientes**. Al mismo tiempo, cuenta con diferentes **odontólogos** (con sus respectivas **especialidades**) que pueden ser asignados a cada uno de los **turnos** de estos pacientes.

Cada odontólogo tiene su propio **horario** de atención (por ejemplo, de lunes a viernes de 08 a 17hs). y solo pueden asignar pacientes en dichos dias y horarios.
En caso de que se requiera una fecha y horario en el que el odontólogo no trabaje, el sistema debe manifestar una advertencia y no permitir el ingreso del turno.

Cada paciente debe estar registrado dentro del sistema en conjunto con sus datos personales, especificación de si cuenta con obra social o si pagará de forma particular, el tipo de tratamiento que necesita, afección que posee o si es control de rutina, etc.

En el caso de que el paciente sea menor de edad, se le deberá asignar un responsable (padre, madre, hermano, tutor, etc).

El sistema debe contar con login (control de acceso) y será utilizado principalmente por los/as secretarios/as de la clínica. Para poder llevar a cabo el control de acceso, se deberá tener en cuenta el uso de **usuarios** y contraseñas que permitan el ingreso al sistema.
Ademas de los secretarios, cada odontólogo podrá acceder al sistema para visualizar los turnos de sus pacientes. Ademas de esto, podrá registrar nuevos turnos y asignar una observación del trabajo realizado luego de atender al paciente.

### El sistema deberá permitir visualizar las siguientes consultas/informes:
- Cantidad de pacientes atendidos en un determinado día.
- Turnos de cada odontólogo por día.
- Cantidad de pacientes con obra social/prepaga y sin ella.
- Cualquier otro informe o consulta que pueda ser necesario (a criterio de analista/programador).