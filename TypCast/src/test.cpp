#include<iostream>
#include<typeinfo>
using namespace std;

int main(){
    int a = 10;
    cout << typeid(a).name() << endl;
    cout << typeid(10).name() << endl;
    cout<<"Size of int: "<<sizeof(int)<<endl;
    return 0;
}