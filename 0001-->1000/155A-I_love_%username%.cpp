#include <iostream>

using namespace std;

int main()
{
    int n, p;
    cin >> n >> p;
    int mn = p, mx = p, amz = 0;

    while (--n)
    {
        cin >> p;
        if (p < mn)
        {
            mn = p;
            ++amz;
        }
        if (p > mx)
        {
            mx = p;
            ++amz;
        }
    }

    cout << amz << endl;
    
}
