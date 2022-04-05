/*
    PRACTICA 2
    REALIZADO POR JAIME LORENZO SANCHEZ
*/

// Bibliotecas
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
// Tamano de las matrices 
const int tamano = 2176;
// Declaramos las matrices
int A[tamano][tamano]; 
int B[tamano][tamano];
int C[tamano][tamano];
int D[tamano][tamano];
// Rango de valores aleatorios
const int nMax = 10, nMin = 1;

// Funcion principal

int main(){
    // Inicializamos la semilla aleatoria
    srand(time(NULL));
    clock_t t0,t1;
    int k=1;
    // Rellenamos las matriz A y B
    for(int i=0; i<tamano; i++){
        for(int j=0; j<tamano; j++){
                // Rellenamos las matrices B,C y D con valores aleatorios en el rango [1,10]
                B[i][j]= rand() % nMax + nMin;
                C[i][j]= rand() % nMax + nMin;
                D[i][j]= rand() % nMax + nMin;
                // Rellenamos la matriz A con el valor 0
                A[i][j]= 0;
        }
    }
    
    // Inicializamos el temporizador t0
    t0 = clock();
    // Aplicamos el algoritmo
    //for(int k = 0; k < 200; k++){
        for(int i = 0; i < 2176; i++){
            for(int j = 0; j < 2176; j++){
                A[j][i] = A[j][i] * k + B[i][j] * C[j][i] + 3.14 * D[i][j];
            }
        }
  //  }
    // Inicializamos el temporizador t1
    t1 = clock();
    // Obtenemos el tiempo de computo del algoritmo
    float tiempo = (float)(t1-t0) / CLOCKS_PER_SEC;
    cout << "Se ha tardado " << tiempo*1000 << " ms en realizar el producto de las matrices" << endl;
    
    
    return 0;
}

/*
        GCD (SetStrike,C (2^x) ) = Y -> Y = 1 or Y != 1
        Si GCD es par -> Stride = Stride + w
*/  