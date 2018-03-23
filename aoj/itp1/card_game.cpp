#include <iostream>
#include <string>
using namespace std;

int main() {
  int n,taro=0,hanako=0;
  cin >> n;
  for (int i=0;i<n;i++) {
    string taro_str,hanako_str;
    cin >> taro_str >> hanako_str;
    if (taro_str > hanako_str) {
      taro = taro + 3;
    } else if (taro_str < hanako_str) {
      hanako = hanako + 3;
    } else {
      taro++;
      hanako++;
    }
  }
  cout << taro << " " << hanako << endl;

  return 0;
}
