#include <iostream>
#include <string>
using namespace std;

int main() {
  while (true) {
    string string,sub;
    cin >> string;
    if (string == "-") {
      break;
    }
    int m;
    cin >> m;
    for (int i=0;i<m;i++) {
      int h;
      cin >> h;
      sub = string.substr(0, h);
      string.erase(string.begin(), string.begin() + h);
      string+=sub;
    }
    cout << string << endl;
  }

  return 0;
}
