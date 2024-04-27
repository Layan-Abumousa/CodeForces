#include <iostream>
using namespace std;

int main() {
	int t = 0;
	cin >> t; 
	for (size_t i = 0; i < t; i++)
	{
		int r; 
		cin >> r;
		if (r >= 1900) {
			cout << "Division 1" << "\n";
		}
		else if (r >= 1600 and r < 1900) {
			cout << "Division 2" << "\n";
		}
		else if (r >= 1400 and r < 1600) {
			cout << "Division 3" << "\n";
		}
		else {
			cout << "Division 4" << "\n";
		}

	}


}
