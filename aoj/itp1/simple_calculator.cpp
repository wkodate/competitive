#include <iostream>
#include <string>
using namespace std;

int main() {
  int a,b,result;
  string op;

  while (true) {
    cin >> a >> op >> b;
    if (op == "+") {
      result = a+b;
    } else if (op == "-") {
      result = a-b;
    } else if (op == "*") {
      result = a*b;
    } else if (op == "/") {
      result = a/b;
    } else if (op == "?") {
      break;
    }
    cout << result << endl;
  }
  return 0;
}
