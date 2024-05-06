#include<iostream>
using namespace std ;
int main(){
    int arr[20] ,arr2[20] , merg[40] ,i , j , k , search ,n , n2 ;
    cout <<"enter a size first  of the array " ;
    cin >> n;
    for ( i = 0; i <= n; i++)
    {
        cout<<"enter a element = " << " "  ;
        cin>>arr[i];
        merg[i] = arr[i] ;
    }
     k=i;
    cout <<"enter a size second  of the array " ;
    cin >> n2;
    for ( i = 0; i <= n2; i++)
    {
        cout<<"enter a element = " << " "  ;
        cin>>arr[i];
        merg[k] = arr[i] ;
        k++ ;

    }
    
    
    for ( i = 0; i <=  k ; i++)
    {
        cout << merg[i] ;
    }
    
    
    }