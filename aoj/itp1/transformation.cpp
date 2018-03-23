#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
  string str;
  int q;
  cin >> str >> q;
  for (int i=0;i<q;i++) {
    string instruction, p;
    int a, b;
    cin >> instruction >> a >> b;
    if (instruction == "print") {
      cout << str.substr(a, b-a+1) << endl;
    } else if (instruction == "reverse") {
      reverse(str.begin()+a, str.begin()+b+1);
    } else if (instruction == "replace") {
      cin >> p;
      str.replace(a,b-a+1,p);
    }
  }

  return 0;
}
