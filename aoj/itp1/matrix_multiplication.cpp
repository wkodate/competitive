#include <iostream>
using namespace std;

int main() {
  int n, m, l;
  cin >> n >> m >> l;
  int a[100][100] = {};
  int b[100][100] = {};
  long c[100][100] = {};
  for (int i=0;i<n;i++) {
    for (int j=0;j<m;j++) {
      cin >> a[i][j];
    }
  }
  for (int j=0;j<m;j++) {
    for (int k=0;k<l;k++) {
      cin >> b[j][k];
    }
  }

  for (int i=0;i<n;i++) {
    for (int k=0;k<l;k++) {
      for (int j=0;j<m;j++) {
        c[i][k] += a[i][j]*b[j][k];
      }
    }
  }

  for (int i=0;i<n;i++) {
    for (int k=0;k<l;k++) {
      cout << c[i][k];
      if (k != l-1) {
        cout << " ";
      }
    }
    cout << endl;
  }

  return 0;
}
