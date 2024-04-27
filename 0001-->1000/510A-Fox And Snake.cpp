#include <iostream>
using namespace std;
int main()
{
	int x, y;
	int c = 0;
	cin >> x >> y;
	for (int i = 0; i < x; i++)
	{
		if (i%2==1)
		{
			c++;
		}
		for (int j = 0; j < y; j++)
		{
			
			
			if (i % 2 == 0)
			{
				cout << "#";
				
				
			}
			else {
				
				if (j == 0 && (c % 2 == 0))
				{
					
					
						cout << "#";
						
						
						
				}
				else if (j == (y-1) && (c % 2 == 1))
				{
					
						cout << "#";
						
						
				}

				else
					cout << ".";
				
				
			}
		
			
			}
		
		
		cout << endl;
		
		

		

	}
}
