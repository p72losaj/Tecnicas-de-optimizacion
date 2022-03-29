# Makefile de la practica 2 de tecnicas de optimizacion

all: ejercicio1_O0.exe ejercicio1_O2.exe ejercicio2_O0.exe ejercicio2_O2.exe

# Creamos el fichero ejecutable ejercicio1_O0.exe

ejercicio1_O0.exe: ejercicio1.o
	g++ -o ejercicio1_O0.exe ejercicio1.o -O0

# Creamos el fichero ejecutable ejercicio1_O2.exe

ejercicio1_O2.exe: ejercicio1.o
	g++ -o ejercicio1_O2.exe ejercicio1.o -O2

# Creamos el fichero ejecutable ejercicio2_O0.exe

ejercicio2_O0.exe: ejercicio2.o
	g++ -o ejercicio2_O0.exe ejercicio2.o -O0

# Creamos el fichero ejecutable ejercicio2_O0.exe

ejercicio2_O2.exe: ejercicio2.o
	g++ -o ejercicio2_O2.exe ejercicio2.o -O2

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