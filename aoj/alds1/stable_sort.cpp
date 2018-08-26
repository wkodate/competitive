#include <iostream>
using namespace std;

struct Card {
  char suit, value;
};

void bubbleSort(struct Card c[], int n) {
  for(int i=0;i<n;i++) {
    for(int j=n-1;j>= i;j--) {
      if(c[j].value < c[j-1].value) {
        Card t = c[j];
        c[j] = c[j-1];
        c[j-1] = t;
      }
    }
  }
}

void selectionSort(struct Card c[], int n) {
  for(int i=0;i<n;i++) {
    int minj = i;
    for(int j=i;j<n;j++) {
      if(c[j].value < c[minj].value) {
        minj = j;
      }
    }
    Card t = c[i];
    c[i] = c[minj];
    c[minj] = t;
  }
}

bool isStable(struct Card c1[], struct Card c2[], int n) {
  for(int i=0;i<n;i++) {
    if(c1[i].suit != c2[i].suit) {
      return false;
    }
  }
  return true;
}

int main() {
  int n;
  Card c1[100], c2[100];
  char ch;

  cin >> n;
  for(int i=0;i<n;i++) {
    cin >> c1[i].suit >> c1[i].value;
  }

  for(int i=0;i<n;i++) {
    c2[i] = c1[i];
  }

  bubbleSort(c1, n);
  selectionSort(c2, n);

  for(int i=0;i<n;i++) {
    if(i>0) {
      cout << " ";
    }
    cout << c1[i].suit << c1[i].value;
  }
  cout << endl;
  cout << "Stable" << endl;
  for(int i=0;i<n;i++) {
    if(i>0) {
      cout << " ";
    }
    cout << c2[i].suit << c2[i].value;
  }
  cout << endl;

  if(isStable(c1, c2, n)) {
    cout << "Stable" << endl;
  } else {
    cout << "Not stable" << endl;
  }

  return 0;
}
