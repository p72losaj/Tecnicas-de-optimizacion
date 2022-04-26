/*
	Original algorithm practice 4
	Autor: Jaime Lorenzo Sanchez
*/
#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <time.h>
using namespace std;
int A[4224][4224], B[4224][4224], C[4224][4224], D[4224][4224];

int main(){
	srand(time(NULL));
	clock_t t0, t1;
	// Create the matrices with aleatory values
    	for(int i=0; i<4024; i++){
		for(int j=0; j<4024; j++){
			B[i][j]= rand() % 10 + 1;
                	C[i][j]= rand() % 10 + 1;
                	D[i][j]= rand() % 10 + 1;
                	A[i][j]= 0;
        	}
    	}
    	// Start the time
	t0 = clock();
	// Algorithm
	for (int i=0; i < 4224; i++){
		for (int j=0; j < 4224; j++){
			A[j][i] = A[j][i] + B[i][j] + C[j][i]*D[i][j]; 	
		} 
	} 
	// End the time
	t1 = clock();
	float time = (float)(t1-t0) / CLOCKS_PER_SEC;
	cout << "Algorithm's time: " << time*1000 << " ms" << endl;
	cout << "A[100][100] = " << A[100][100] << endl;
	cout << "END OF PROGRAM" << endl;
	return 0;
} 
