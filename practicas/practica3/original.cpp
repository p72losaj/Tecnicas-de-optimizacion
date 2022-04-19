/*
   Author: JAIME LORENZO SANCHEZ
*/

// Libraries
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
// Matrices
int A[2176][2176]; 
int B[2176][2176];
int C[2176][2176];
int D[2176][2176];

int main(){
    srand(time(NULL));
    clock_t t0;
    clock_t t1;
    // Create the matrices with aleatory values
    for(int i=0; i<2176; i++){
        for(int j=0; j<2176; j++){
                B[i][j]= rand() % 10 + 1;
                C[i][j]= rand() % 10 + 1;
                D[i][j]= rand() % 10 + 1;
                A[i][j]= 0;
        }
    }
    
    // Start the time
    t0 = clock();
    // Algorithm
    for(int k = 0; k < 200; k++){
        for(int i = 0; i < 2176; i++){
            for(int j = 0; j < 2176; j++){
                A[j][i] = A[j][i] * k + B[i][j] * C[j][i] + 3.14 * D[i][j];
            }
        }
  }
    // End the time
    t1 = clock();
    float time = (float)(t1-t0) / CLOCKS_PER_SEC;
    cout << "Algorithm's time: " << time*1000 << " ms" << endl;
    cout << "A[100][100] = " << A[100][100] << endl;
    return 0;
}

/*
        original_O0 -> Tarda 20093.6 ms
        original_O2 -> Tarda 7775.7 ms
        padding_O0 -> Tarda 10245.9 ms
        padding_O2 -> Tarda 7611.6 ms
        GCD (SetStrike,C (2^x) ) = Y -> Y = 1 or Y != 1
        Si GCD es par -> Stride = Stride + w
*/  
