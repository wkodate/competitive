#include <iostream>
using namespace std;

int main() {
  int n;
  int count = 0;
  int array[100] = {};
  cin >> n;
  for(int i=0;i<n;i++) {
    cin >> array[i];
  }

  bool complete = true;
  while(complete) {
    complete = false;
    for(int i=n-1;i>0;i--) {
      if(array[i] < array[i-1]) {
        int tmp = array[i-1];
        array[i-1] = array[i];
        array[i] = tmp;
        count++;
        complete = true;
      }
    }
  }

  for(int i=0;i<n;i++) {
    cout << array[i];
    if(i < n-1) {
      cout << " ";
    }
  }
  cout << endl << count << endl;
  return 0;
}
