#include <iostream>
using namespace std;

int main() {
  int r, c;
  long sheet[101][101] = {};
  cin >> r >> c;

  for (int i=0;i<r;i++) {
    for (int j=0;j<c;j++) {
      cin >> sheet[i][j];
    }
  }
  for (int i=0;i<r;i++) {
    for (int j=0;j<c;j++) {
      sheet[i][c] += sheet[i][j];
      cout << sheet[i][j] << " ";
    }
    cout << sheet[i][c] << endl;
  }
  for (int j=0;j<c;j++) {
    for (int i=0;i<r;i++) {
      sheet[r][j] += sheet[i][j];
    }
    cout << sheet[r][j] << " ";
    sheet[r][c] += sheet[r][j];
  }
  cout << sheet[r][c] << endl;

  return 0;
}
