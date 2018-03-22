#include <iostream>
#include <string>
using namespace std;

int main() {
  while (true) {
    string number;
    cin >> number;
    if (number == "0") {
      break;
    }
    int num = 0;
    for (int i=0;i<number.size();i++) {
      num += number[i] - '0';
    }
    cout << num << endl;
  }

  return 0;
}
