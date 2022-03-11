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
#include <vector>

using namespace std;

// Tamano de la matriz
const int tamano = 2048;

float obtenerValorAleatorio(int a,int b){
    return ( a + rand() % (b-a) )/100;
}

void productoMatrices1(std::vector < std::vector <double> > &A, 
std::vector < std::vector <double> > &B, std::vector < std::vector <double> > &C){
    for (size_t i = 0 ; i < tamano ; i++ ){
        for (size_t j = 0 ; j < tamano ; j++ ){
            float temporal = 0.0;
            for (size_t k = 0 ; k < tamano ; k++ ){
                temporal = temporal + A[i][k] * B[k][j];
                C[i][j] = temporal ;
            }
        }
    }
}

// Funcion principal
int main(){
    clock_t t1;
    clock_t t2;
    // Inicializamos la semilla aleatorio
    srand(time(NULL));
    // Declaramos las matrices de tamano 2048x2048
    std::vector <std::vector<double>> A(tamano,std::vector<double>(tamano));
    std::vector <std::vector<double>> B(tamano,std::vector<double>(tamano));
    std::vector <std::vector<double>> C(tamano,std::vector<double>(tamano));; // Matriz resultado
    // Rellenamos las matrices con valores aleatorios
    for(int i=0; i<tamano; i++){ // Recorremos las filas de la matriz
        for(int j=0; j<tamano; j++){ // Recorremos las columnas de la matriz
            // Rellenamos ambas matrices
            A[i][j] = obtenerValorAleatorio(95,105);
            B[i][j] = obtenerValorAleatorio(90,106);
        }
    }
    // Iniciamos inicio del temporizador
    t1 = clock();
    // Calculamos el producto de las matrices
    productoMatrices1(A, B,C);
    // Calculamos el tiempo del producto de las matrices
    t1 = clock() - t1;
    std::cout << "TU PUTA MADRE PROGRAMA DE LOS COJONES" << std::endl;
    return 0;
}



/*
*       APARTADO 3. MEDIR LOS TIEMPOS DE EJECUCION DE LOS BUCLES
*       USAR FUNCION CLOCK -> t1 -t0 / CLK_YER = x tiempo por segundos
*/

/*
*       APARTADO 5. REALIZAR COMPARATIVA PARA LA COMPILACION DE LAS OPCIONES -O0 Y -O2
*       g++ fichero.cpp -o Executableijk -O0 -> x ms
*       g++ fichero.c++ -o executableijk -O2 -> y ms
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