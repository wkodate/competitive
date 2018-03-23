#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
  while (true) {
    double s[1000];
    int n;
    cin >> n;
    if (n == 0) {
      break;
    }
    long sum=0;
    for (int i=0;i<n;i++) {
      cin >> s[i];
      sum += s[i];
    }
    double average = (double)sum/n;
    double variance=0;
    for (int i=0;i<n;i++) {
      variance += pow(s[i]-average,2);
    }
    variance /= n;
    double sd = sqrt(variance);
    cout << fixed << setprecision(10) << sd << endl;
  }

  return 0;
}
