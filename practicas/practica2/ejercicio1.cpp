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
// Tamano de las matrices A y B
const int tamano = 128;
// Tamano de las matrices C y D
const int tamano_2 = 64;
// Declaramos las matrices
int A[tamano][tamano][tamano],B[tamano][tamano][tamano];
int C[tamano_2][tamano_2][tamano_2][tamano_2],D[tamano_2][tamano_2][tamano_2][tamano_2];
// Rango de valores aleatorios
const int nMax = 10, nMin = 1;
// Numero de elementos del algoritmo a probar
const int N = 64;
// Funcion principal

int main(){
    // Inicializamos la semilla aleatoria
    srand(time(NULL));
    clock_t t0,t1;
    // Rellenamos las matriz A y B
    for(int i=0; i<tamano; i++){
        for(int j=0; j<tamano; j++){
            for(int k=0; k<tamano; k++){
                // Rellenamos la matriz A con valores aleatorios en el rango [1,10]
                A[i][j][k] = rand() % nMax + nMin;
                // Rellenamos la matriz B con el valor 0
                B[i][j][k] = 0;
            }
        }
    }
    // Rellenamos las matrices C y D
    for(int i=0; i < tamano_2; i++){
        for(int j=0; j < tamano_2; j++){
            for(int k=0; k < tamano_2; k++){
                for(int l=0; l < tamano_2; l++){
                    // Rellenamos las matrices con valores aleatorios en el rango [1,10]
                    C[i][j][k][l] = rand() % nMax + nMin;
                    D[i][j][k][l] = rand() % nMax + nMin;
                }
            }
        }
    }
    // Inicializamos el temporizador t0
    t0 = clock();
    // Aplicamos el algoritmo
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            for(int k=0; k<N; k++){
                for(int l=0; l<N; l++){
                    B[k][l][i] = A[i][k][j] + C[l][j][k][i] * D[k][j][l][i];
                }
            }
        }
    }
    // Inicializamos el temporizador t1
    t1 = clock();
    // Obtenemos el tiempo de computo del algoritmo
    float tiempo = (float)(t1-t0) / CLOCKS_PER_SEC;
    cout << "Se ha tardado " << tiempo*1000 << " ms en realizar el producto de las matrices" << endl;
    
    
    return 0;
}