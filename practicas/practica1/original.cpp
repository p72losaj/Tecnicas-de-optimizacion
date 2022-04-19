/*
*       Exercise 1
*       Product of 2 matrices of dimension 2048x2048
*       Autor: Jaime Lorenzo Sanchez
*/

/* Libraries*/
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
/* Matriz's size */
const int size = 2048;
/* Declare the matrices */
int A[size][size];
int B[size][size];
int C[size][size];

/* Main function */
int main(){
    clock_t t0;
    clock_t t1;
    /* Start the time  */
    t0 = clock();
    /* Create the matrices with values between 1 and 10	 */
    for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
		A[i][j] = rand() % 10 + 1;
                B[i][j] = rand() % 10 + 1;
		C[i][j] = 0;
        }
    }
    /* Product of the 2 matrices with vector (i,j,k)  */
    for (int i = 0 ; i < size ; i++ ){
        for (int j = 0 ; j < size ; j++ ){
            for (int k = 0 ; k < size ; k++ ){
                C[i][j] = C[i][j] + A[i][k] * B[k][j];
            }
        }
    }
    /* End the time */
    t1 = clock();
    /* Calculate the time in ms */
    float time = (float)(t1-t0) / CLOCKS_PER_SEC;
    cout << "Time in ms: " << time*1000 << endl;
    cout << "C[100][100] = " << C[100][100] << endl;
    return 0;
}
