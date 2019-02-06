//Increment.cpp
//Prefix increment and postfix increment operators.
#include <iostream>
using namespace std;

int main()
{
		int c = 7;
		cout<<"c before postincrement: "<< c<<endl; // prints 7
		cout << "    postincrementing c: "<< c++ << endl; // prints 7
		cout << " c after postincrement: "<< c << endl; // prints 8

		cout << "\n"; // skip a line

		// demonstrate prefix increment operator
		c = 7;
		cout << " c before preincrement: "<< c << endl; // prints 7
		cout << "     preincrementing c: "<< ++c << endl; // prints 8
		cout << "  c after preincrement: "<< c << endl; // prints 8
		system("pause");
} // end class 
