#include <iostream>
using namespace std;

int main() {
  string s,p;
  cin >> s >> p;
  string ring = s+s;

  if (ring.find(p) != string::npos) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }

  return 0;
}
