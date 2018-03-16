#include <iostream>

using namespace std;

int main() {
  int s;
  cin >> s;

  int hours = s/(60*60);
  int minutes = (s-hours*(60*60))/60;
  int seconds = s-(hours*(60*60)+minutes*60);

  cout << hours << ":" << minutes << ":" << seconds<< endl;
  return 0;
}
