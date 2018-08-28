#include <iostream>
#include <vector>
using namespace std;

int cnt;
vector<int> G;

void insertionSort(int a[], int n, int g) {
  for(int i=g;i<n;i++) {
    int v = a[i];
    int j = i-g;
    while(j>=0 && a[j]>v) {
      a[j+g] = a[j];
      j = j-g;
      cnt++;
    }
    a[j+g] = v;
  }
}

void shellSort(int a[], int n) {
  cnt = 0;
  for(int h=1;;) {
    if(h>n) {
      break;
    }
    G.push_back(h);
    h = 3*h+1;
  }
  for(int i=0;i<G.size();i++) {
    insertionSort(a, n, G[i]);
  }
}

int main() {
  int n;
  int a[100];
  char ch;

  cin >> n;
  for(int i=0;i<n;i++) {
    cin >> a[i];
  }

  shellSort(a, n);

  cout << G.size() << endl;
  for(int i=0;i<G.size();i++) {
    if(i>=G.size()-1) {
      cout << G[i] << endl;
      continue;
    }
    cout << G[i] << " ";
  }

  cout << cnt << endl;

  for(int i=0;i<n;i++) {
    cout << a[i] << endl;
  }

  return 0;
}
