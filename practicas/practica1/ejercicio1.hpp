/**
*   Declaracion de las funciones
*   Realizado por Jaime Lorenzo Sanchez
*/

// Bibliotecas

#include <cstdlib>
#include <cstdio>
#include <time.h>
#include <vector>
using namespace std;

/**
*   Funcion que obtiene un valor aleatorio en un rango dado
*   @param a Valor minimo del rango
*   @param b Valor maximo del rango
*   @return Valor aleatorio en el rango dado
*/

float obtenerValorAleatorio(int a,int b);

/**
* Funcion que calcula el producto de 2 matrices cuadradas
*   @param A Matriz 2048x2048
*   @param B Matriz 2048x2048
*   @param C Matriz resultado
*/
void productoMatrices1(std::vector < std::vector <double> > &A, 
std::vector < std::vector <double> > &B, std::vector < std::vector <double> > &C);