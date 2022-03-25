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
    // Iniciamos inicio del temporizador para el vector (i,j,k)
    t0 = clock();
    // Calculamos el producto de las matrices con vector de iteración (i,k,j)
    
    for(int i=0; i < tamano; i++){
        for(int k=0; k<tamano; k++){
            for(int j=0; j<tamano; j++){
                C[i][j] = C[i][j] + A[i][k] * B[k][j];
            }
        }
    }
    
    // Finalizamos el temporizador
    t1 = clock();
    // Tiempo de ejecucion de los bucles en segundos
    float tiempo = (float)(t1-t0) / CLOCKS_PER_SEC;
    std::cout << "Vector (i,k,j): Se ha tardado " << tiempo*1000 << " ms en realizar el producto de las matrices" << std::endl;
    return 0;
}