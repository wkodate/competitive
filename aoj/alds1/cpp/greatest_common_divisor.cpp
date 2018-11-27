#include <iostream>
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;

  while(true) {
    if (b > a) {
      int tmp = a;
      a = b;
      b = tmp;
    }
    int div = a / b;
    int rem = a % b;
    if (rem == 0) {
      cout << b << endl;
      break;
    }
    a = b;
    b = rem;
  }

  return 0;
}
