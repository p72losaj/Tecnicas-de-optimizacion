/*
    Author: JAIME LORENZO SANCHEZ
*/

// Libraries
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
int A[128][128][128];
int B[128][128][128];
int C[64][64][64][64];
int D[64][64][64][64];

int main(){
    srand(time(NULL));
    clock_t t0;
    clock_t t1;
    
    for(int i=0; i<128; i++){
        for(int j=0; j<128; j++){
            for(int k=0; k<128; k++){
                A[i][j][k] = rand() % 10 + 1;
                B[i][j][k] = 0;
            }
        }
    }
    
    for(int i=0; i < 64; i++){
        for(int j=0; j < 64; j++){
            for(int k=0; k < 64; k++){
                for(int l=0; l < 64; l++){
                    C[i][j][k][l] = rand() % 10 + 1;
                    D[i][j][k][l] = rand() % 10 + 1;
                }
            }
        }
    }
    // Start the time
    t0 = clock();
    // Alñgorithm
    for(int k=0; k<64; k++){
        for(int l=0; l<64; l++){
            for(int i=0; i<64; i++){
                for(int j=0; j<64; j++){
                    B[k][l][i] =+ A[i][k][j] + C[l][j][k][i] * D[k][j][l][i];
                }
            }
        }
    }
    // End the time
    t1 = clock();
    float time = (float)(t1-t0) / CLOCKS_PER_SEC;
    cout << "Algorithm's time: " << time*1000 << " ms" << endl;    
    cout << "B[64][64][64]: " << B[64][64][64] << endl;
    return 0;
}
