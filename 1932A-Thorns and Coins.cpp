#include<iostream>
using namespace std;
int main(){
int t;
    cin >> t;
    while(t--) {
        int n;
        string s;
        cin >> n >> s;
        int coins = 0;
        for(int i = 0; i < n; i++) {
            if(s[i] == '@') coins++;
            else if(i < n - 1 && s[i] == '*' && s[i + 1] == '*') break;
        }
        cout << coins << "\n";
    } 
}
