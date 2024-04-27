#include <iostream>
using namespace std;

int main() {
    int v = 0;
    long long p = 0;
    int k, r;
    cin >> k >> r;
    
    while (true) {
        if ((p % 10 == 0 && p != 0) || p % 10 == r) {
            break;
        }
        ++v;
        p += k;
    }

    cout << v;

    
}
