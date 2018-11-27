#include <iostream>
#include <math.h>
using namespace std;

class PrimeNumber
{
  public:
    bool isPrimeNumber(int n);
};

bool PrimeNumber::isPrimeNumber(int n)
{
    if (n == 2) {
      return true;
    }
    if (n < 2 || n % 2 == 0) {
      return false;
    }
    int i = 3;
    while(i <= sqrt(n)) {
      if (n % i == 0) {
        return false;
      }
      i = i + 2;
    }
    return true;
}

int main() {
  int num;
  int count = 0;
  cin >> num;
  int a[10000] = {};
  for(int i=0;i<num;i++) {
    cin >> a[i];
  }
  PrimeNumber pn;
  for(int i=0;i<num;i++) {
    if (pn.isPrimeNumber(a[i])) {
      count++;
    }
  }
  cout << count << endl;
  return 0;
}
