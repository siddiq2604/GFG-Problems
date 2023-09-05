//{ Driver Code Starts
#include <iostream>
using namespace std;

void printPattern(string s);

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	string s;
	cin>>s;
	printPattern(s);
	cout<<endl;
	
}
	
	return 0;
}
// } Driver Code Ends


/*method prints the given pattern in a single line */
void printPattern(string s)
{
   //Your code here
    int i=1;
    int m=s.length()/2;
    while (i<=s.length())
    {
        for (int j=m;j<m+i;j++)
        {
            cout<<s[(j)%s.length()];
        }
        cout<<"$ ";
        i++;
    }
};