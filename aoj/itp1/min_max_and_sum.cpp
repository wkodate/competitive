#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int main() {
  long n;
  cin >> n;
  vector<long> a(n);
  for (int i=0;i<n;i++) {
    cin >> a[i];
  }
  long min = *min_element(a.begin(), a.end());
  long max = *max_element(a.begin(), a.end());
  long sum = accumulate(a.begin(), a.end(), 0LL);
  cout << min << " " << max << " " << sum << endl;
  return 0;
}
