# Makefile de la practica 2 de tecnicas de optimizacion

all: original_O0.exe original_O2.exe permutacion_O0.exe permutacion_O2.exe

# Creamos el fichero ejecutable original_O0.exe

original_O0.exe: ejercicio1.o
	g++ -o original_O0.exe ejercicio1.o -O0

# Creamos el fichero ejecutable original_O2.exe

original_O2.exe: ejercicio1.o
	g++ -o original_O2.exe ejercicio1.o -O2

# Creamos el fichero ejecutable permutacion_O0.exe

permutacion_O0.exe: ejercicio2.o
	g++ -o permutacion_O0.exe ejercicio2.o -O0

# Creamos el fichero ejecutable permutacion_O2.exe

permutacion_O2.exe: ejercicio2.o
	g++ -o permutacion_O2.exe ejercicio2.o -O2

# Creamos el fichero objeto del ejercicio1

ejercicio1.o: ejercicio1.cpp
	g++ -std=c++11 -c ejercicio1.cpp

# Creamos el fichero objeto del ejercicio2

ejercicio2.o: ejercicio2.cpp
	g++ -std=c++11 -c ejercicio2.cpp

.PHONY: clean

# Limpiamos los ficheros objeto y los ejecutables
clean:
	rm -rf *.o
	rm -rf *.exe