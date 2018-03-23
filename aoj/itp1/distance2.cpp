#include <iostream>
#include <math.h>
#include <iomanip>
#include <complex>
using namespace std;

int main() {
  int n,x[100],y[100];
  double d1=0,d2=0,d3=0,dinf=0;
  cin >> n;
  for (int i=0;i<n;i++) {
    cin >> x[i];
  }
  for (int i=0;i<n;i++) {
    cin >> y[i];
  }
  for (int i=0;i<n;i++) {
    d1 += abs(x[i]-y[i]);
    d2 += pow(abs(x[i]-y[i]), 2);
    d3 += pow(abs(x[i]-y[i]), 3);
    if (dinf < abs(x[i]-y[i])) {
      dinf = abs(x[i]-y[i]);
    }
  }
  d2 = sqrt(d2);
  d3 = pow(d3, 1.0/3.0);

  cout << fixed << setprecision(10) << d1 << endl << d2 << endl << d3 << endl << dinf << endl;

  return 0;
}
