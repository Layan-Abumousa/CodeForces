#include <iostream>
using namespace std;
int main() {
	int n;
	cin >> n;
	int arr[n];
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	int r = n - 1;
	int l = 0;
	int sum1 = 0;
	int sum2 = 0;
	for (int i = 0; i < n; i++) {
		if (i % 2 == 0) {
			if (arr[r] > arr[l])
			{
				sum1 += arr[r];
				--r;
			}
			else if (arr[r] < arr[l]) {
				sum1 += arr[l];
				++l;
			}
			else {
				sum1 += arr[l];
			}
		}
		else {
			if (arr[r] > arr[l])
			{
				sum2 += arr[r];
				--r;
			}
			else if (arr[r] < arr[l]) {
				sum2 += arr[l];
				++l;
			}
			else {
				sum2 += arr[l];
			}
		}
	}
	cout << sum1 << " " << sum2;
}
