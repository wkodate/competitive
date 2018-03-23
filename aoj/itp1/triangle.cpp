#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
  double a,b,c,s,l,h;
  cin >> a >> b >> c;
  s = a * b * sin(M_PI*c/180)/2;
  l = a + b + sqrt(pow(a,2)+pow(b,2)-2*a*b*cos(M_PI*c/180));
  h = b * sin(M_PI*c/180);
  cout << fixed << setprecision(10) << s << endl << l << endl << h << endl;

  return 0;
}
