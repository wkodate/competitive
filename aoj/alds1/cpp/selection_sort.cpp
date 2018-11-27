#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  int count = 0;
  int a[100] = {};
  for(int i=0;i<n;i++) {
    cin >> a[i];
  }

  for(int i=0;i<n;i++) {
    int minj = i;
    for(int j=i;j<n;j++) {
      if(a[j] < a[minj]) {
        minj = j;
      }
    }
    if(a[i] > a[minj]) {
      int tmp = a[i];
      a[i] = a[minj];
      a[minj] = tmp;
      count++;
    }
  }

  for(int i=0;i<n;i++) {
    cout << a[i];
    if(i != n-1) {
      cout << " ";
    } else {
      cout << endl;
    }
  }
  cout << count << endl;
  return 0;
}
