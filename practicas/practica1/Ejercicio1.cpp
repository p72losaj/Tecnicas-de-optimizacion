/*
*       PRACTICA 1
*       Implementacion del producto de 2 matrices de dimensiones 2048x2048  
*       REALIZADO POR JAIME LORENZO SANCHEZ
*/

// Bibliotecas
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
// Tamano de la matriz
const int tamano = 2048;
// Declaramos las matrices
int A[tamano][tamano];
int B[tamano][tamano];
int C[tamano][tamano];

// Funcion principal
int main(){
    clock_t t0;
    clock_t t1;
    // Iniciamos inicio del temporizador
    t0 = clock();
    // Calculamos el producto de las matrices
    for (int i = 0 ; i < tamano ; i++ ){
        for (int j = 0 ; j < tamano ; j++ ){
            for (int k = 0 ; k < tamano ; k++ ){
                C[i][j] = C[i][j] + A[i][k] * B[k][j];
            }
        }
    }
    // Finalizamos el temporizador
    t1 = clock();
    // Tiempo de ejecucion de los bucles en segundos
    float tiempo = (float)(t1-t0) / CLOCKS_PER_SEC;
    std::cout << "Se ha tardado " << tiempo*1000 << " ms en realizar el producto de las matrices" << std::endl;
    return 0;
}

/*
*       APARTADO 5. REALIZAR COMPARATIVA PARA LA COMPILACION DE LAS OPCIONES -O0 Y -O2
*       g++ fichero.cpp -o Executableijk -O0 -> 56826.3 ms
*       g++ fichero.c++ -o executableijk -O2 -> 52149.9 ms
*           1- Puede pasar que O0 no optimiza nada
            2- Puede pasar que O2 realiza optimizaciones
        Conclusiones generales compilador
            1- 500 ms -> compilador buena y aplica primero optimizaciones del bucle
            2- 8000 ms -> Compilador malo y no hace optimizacion del bucle
            3- 0 ms -> Programa no funciona correctamente
        g++ fichero.cpp -o Executableikj -O0 -> x ms
        g++ fichero.c++ -o executableikj -O2 -> y ms
        Conclusiones generales compilador
*/

/*      APARTADO 6
*                           MEMORIA PRINCIPAL
*           u15             u0
*       0   A(0,15)         A(0,0)      B(0,15)         B(0,0)      C(0,15)          C(0,0)     B(1,15)     B(1,0)
*       1   B(0,32)         B(0,16)
*       ---------------------------
*
*       63

*       A(0,0), A(0,1),...,A(0,2047),A(1,0),...,A(2047,2047)
*       B(0,0), B(0,1),...,B(0,2047),B(1,0), ... , B(2047,2047)

*   i=0,j=0,k=0 -> A(0,0), B(0,0),C(0,0)
*    i=0,j=0,k=1 -> A(0,1), B(1,0), C(1,0)
**                    B(1,0) -> Error de cache -> (2048/16) mod 64 = 128 mod 64 = 0 -> Se produce un set de strike de 0 -> Salto de 0
*
*    l1 -> solo se ocupa la linea 0 -> Despues de 6 elementos de B reemplazamos
*    l2 -> Tras rellenarse la ultima linea
*    l3
*/