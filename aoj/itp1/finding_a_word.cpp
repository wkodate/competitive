#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main() {
  int count=0;
  string w,t;
  cin >> w;

  for (int i=0;i<w.size();i++) {
    w[i] = tolower(w[i]);
  }
  while (cin >> t) {
    if (t == "END_OF_TEXT") {
      break;
    }
    for (int i=0;i<t.size();i++) {
      t[i] = tolower(t[i]);
    }
    if (w == t) {
      count++;
    }
  }
  cout << count << endl;

  return 0;
}
