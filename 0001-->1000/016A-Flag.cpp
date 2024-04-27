#include <iostream>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;
    char arr[100][100]; 

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            cin >> arr[i][j];
        }
    }

    bool found = false;

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c - 1; j++) {
            if (arr[i][j] != arr[i][j + 1]) {
                found = true;
                break;
            }
        }
        if (found) {
            break;
        }
    }

    if (!found) {
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }

    if (found) {
        cout << "NO" << endl;
    } else {
        cout << "YES" << endl;
    }

    return 0;
}
