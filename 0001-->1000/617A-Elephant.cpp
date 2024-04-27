#include <iostream>
using namespace std;
int main()
{
	int l,c=0,i=5;
	cin >> l;
	while (l!=0){
		if (i <= l) {
			l -= i;
			c++;
		}
		else {
			i--;
		}
	}
	cout <<  c;

}
