
INSERT INTO colegio(nombre_colegio)VALUES('El colegio del Olimpo');
---------------------------------------------------------------------------
INSERT INTO cursos(salon, colegio_id)VALUES('A', 1);
INSERT INTO cursos(salon, colegio_id)VALUES('B', 1);
----------------------------------------------------------------------------
INSERT INTO grados (grado) VALUES(10);
INSERT INTO grados (grado) VALUES(11);
------------------------------------------------------------------------------
INSERT INTO profesor(nombre_profesor)VALUES('Nemesis');
INSERT INTO profesor(nombre_profesor)VALUES('Príapo');
INSERT INTO profesor(nombre_profesor)VALUES('Iris');
------------------------------------------------------------------------------
INSERT INTO asignatura(nombre_asignatura) VALUES ('Matematicas');
INSERT INTO asignatura(nombre_asignatura) VALUES ('Pre Icfes');
INSERT INTO asignatura(nombre_asignatura) VALUES ('Español');
INSERT INTO asignatura(nombre_asignatura) VALUES ('Ingles básico');
INSERT INTO asignatura(nombre_asignatura) VALUES ('Ingles avanzado');
-----------------------------------------------------------------------------------------------------------
INSERT INTO estudiantes(nombre)VALUES('Afrodita');
INSERT INTO estudiantes(nombre)VALUES('Apolo');
INSERT INTO estudiantes(nombre)VALUES('Ares');
INSERT INTO estudiantes(nombre)VALUES('Artemisa');
INSERT INTO estudiantes(nombre)VALUES('Atenea');
INSERT INTO estudiantes(nombre)VALUES('Dionisio');
INSERT INTO estudiantes(nombre)VALUES('Hefesto');
INSERT INTO estudiantes(nombre)VALUES('Hera');
INSERT INTO estudiantes(nombre)VALUES('Hermes');
INSERT INTO estudiantes(nombre)VALUES('Hades');
INSERT INTO estudiantes(nombre)VALUES('Poseidón');
INSERT INTO estudiantes(nombre)VALUES('Zeus');
-----------------------------------------------------------------------------
INSERT INTO grados_cursos (grado_id, curso_id) VALUES(1, 1);
INSERT INTO grados_cursos (grado_id, curso_id) VALUES(1, 2);
INSERT INTO grados_cursos (grado_id, curso_id) VALUES(2, 1);
INSERT INTO grados_cursos (grado_id, curso_id) VALUES(2, 2);
---------------------------------------------------------------------------------------------
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(1, 1);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(1, 2);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(3, 1);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(3, 2);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(4, 1);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(5, 2);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(2, 1);
INSERT INTO curso_asignatura (asignatura_id, curso_id)VALUES(2, 2);
----------------------------------------------------------------------------------------------
INSERT INTO profesor_asignatura (profesor_id, asignatura_id) VALUES(1, 1);
INSERT INTO profesor_asignatura (profesor_id, asignatura_id) VALUES(2, 3);
INSERT INTO profesor_asignatura (profesor_id, asignatura_id) VALUES(3, 4);
INSERT INTO profesor_asignatura (profesor_id, asignatura_id) VALUES(3, 5);
-----------------------------------------------------------------------------------------------------------
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 1);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (3, 1);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (4, 1);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 2);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (3, 2);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (4, 2);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 3);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (3, 3);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (4, 3);

INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 4);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (3, 4);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (5, 4);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 5);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (3, 5);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (5, 5);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 6);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (3, 6);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (5, 6);

INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 7);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (2, 7);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 8);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (2, 8);

INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 9);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (2, 9);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 10);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (2, 10);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 11);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (2, 11);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (1, 12);
INSERT INTO asignatura_estudiantes(asignaturas_id, estudiantes_id) VALUES (2, 12);


-----------------------------------------------------------------------------------------------











