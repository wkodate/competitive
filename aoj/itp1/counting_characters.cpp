#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main() {
  string line;
  int counter[26] = {};
  while (getline(cin,line)) {
    for (int i=0;i<line.size();i++) {
      if(line[i] >= 'a' && line[i] <= 'z') {
        counter[line[i]-'a']++;
      } else if (line[i] >= 'A' && line[i] <= 'Z') {
        counter[line[i]-'A']++;
      }
    }
  }
  for (int i=0;i<26;i++) {
    cout << (char)('a'+i) << " : " << counter[i] << endl;
  }
  return 0;
}
