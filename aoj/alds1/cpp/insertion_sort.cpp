#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  int a[100] = {};
  for(int i=0;i<n;i++) {
    cin >> a[i];
  }

  for(int i = 0; i<n; i++) {
    int key = a[i];
    /* insert a[i] into the sorted sequence a[0,...,j-1] */
    int j = i - 1;
    while( j >= 0 && a[j] > key){
      a[j+1] = a[j];
      j--;
    }
    a[j+1] = key;
    for(int k=0;k<n;k++) {
      cout << a[k];
      if (k != n-1) {
        cout << " ";
      } else {
        cout << endl;
      }
    }
  }
  return 0;
}
