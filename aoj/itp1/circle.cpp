#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;

int main() {
  double r;
  cin >> r;
  double a = (double)r*r*M_PI;
  double c = (double)2*r*M_PI;

  cout << fixed << setprecision(10) << a << " " << c << endl;
  return 0;
}
