#include <iostream>
#include <map>
using namespace std;

int main() {
  bool cards[4][13] = {};
  map<string, int> mp;
  mp["S"]=0;
  mp["H"]=1;
  mp["C"]=2;
  mp["D"]=3;
  string c;
  int n, i;
  cin >> n;
  for (int j=0;j<n;j++) {
    cin >> c >> i;
    cards[mp[c]][i-1] = true;
  }

  for (int j=0;j<4;j++) {
    string charcter;
    for(auto itr = mp.begin(); itr != mp.end(); ++itr) {
      if (j == itr->second) {
          charcter=itr->first;
      }
    }
    for (int k=0;k<13;k++) {
      if (cards[j][k] == false) {
        cout << charcter <<  " " << k+1 << endl;
      }
    }
  }
  return 0;
}
