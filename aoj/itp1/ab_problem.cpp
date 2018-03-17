#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;

int main() {
  double a, b;
  cin >> a >> b;
  int d = a/b;
  int r = fmod(a,b);
  double f = a/b;

  cout << d << " " << r << " " << fixed << setprecision(10) << f << endl;
  return 0;
}
