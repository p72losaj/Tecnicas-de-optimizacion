/*
    Author: JAIME LORENZO SANCHEZ
*/

// Libraries
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
const int size = 128; // Size matrices A and B
const int size2 = 64; // Size matrices C and D
int A[size][size][size],B[size][size][size];
int C[size2][size2][size2][size2],D[size2][size2][size2][size2];
const int N = 64;
int main(){
    srand(time(NULL));
    clock_t t0;
    clock_t t1;
    // Create the matrices with aleatory values
    for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
            for(int k=0; k<size; k++){
                A[i][j][k] = rand() % 10 + 1;
                B[i][j][k] = 0;
            }
        }
    }

    for(int i=0; i < size2; i++){
        for(int j=0; j < size2; j++){
            for(int k=0; k < size2; k++){
                for(int l=0; l < size2; l++){
                    C[i][j][k][l] = rand() % 10 + 1;
                    D[i][j][k][l] = rand() % 10 + 1;
                }
            }
        }
    }
    // Start the time
    t0 = clock();
    // Product of the matrices
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            for(int k=0; k<N; k++){
                for(int l=0; l<N; l++){
                    B[k][l][i] =+ A[i][k][j] + C[l][j][k][i] * D[k][j][l][i];
                }
            }
        }
    }
    // End the time
    t1 = clock();
    // Algorithm's time
    float time = (float)(t1-t0) / CLOCKS_PER_SEC;
    cout << "Time of the algorithm: " << time*1000 << " ms" << endl;
    cout << "B[100][100][100]: " << B[100][100][100] << endl;
    
    return 0;
}
