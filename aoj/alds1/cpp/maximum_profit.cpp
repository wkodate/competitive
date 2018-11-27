#include <iostream>
using namespace std;

class MaximumProfit
{
  public:
    int max(int n, int p[]);
    int maxv2(int n, int p[]);
};

int MaximumProfit::max(int n, int price[])
{
  int maxv;
  for(int j=1;j<n;j++) {
    for(int i=0;i<j;i++) {
      int diff = price[j] - price[i];
      if ((j == 1 && i == 0) || maxv < diff) {
        maxv = diff;
      }
    }
  }
  return maxv;
}

int MaximumProfit::maxv2(int n, int price[])
{
  int maxv;
  int minv = price[0];
  for (int i=1;i<n;i++) {
    int diff = price[i] - minv;
    if (i == 1 || maxv < diff) {
      maxv = diff;
    }
    if (minv > price[i]) {
      minv = price[i];
    }
    //cout << "i=" << i << ",minv=" << minv << ",maxv=" << maxv << endl;
  }
  return maxv;
}

int main() {
  int num;
  int profit = 0;
  int p[200000] = {};
  cin >> num;
  for(int i=0;i<num;i++) {
    cin >> p[i];
  }
  MaximumProfit mp;
  profit = mp.maxv2(num, p);
  cout << profit << endl;
  return 0;
}
