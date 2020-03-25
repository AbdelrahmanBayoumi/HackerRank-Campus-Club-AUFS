#include <bits/stdc++.h>
using namespace std;

void addEdge(vector<int> adj[], int u, int v)
{
	adj[u].push_back(v); // u -> v
	adj[v].push_back(u); // u -> v (for un-directed graph)
}
void printGraph(vector<int> adj[], int V)
{
	for (int v = 0; v < V; ++v)
	{
		cout << "\n Adjacency list of vertex " << v << "\n ";
		cout << v << " ";
		for (auto x : adj[v])
			cout << "-> " << x;
		cout << "\n";
	}
}
int main()
{
	int V = 5;
	vector<int> adj[V];
	addEdge(adj, 0, 1);
	addEdge(adj, 0, 4);
	addEdge(adj, 1, 2);
	addEdge(adj, 1, 3);
	addEdge(adj, 1, 4);
	addEdge(adj, 2, 3);
	addEdge(adj, 3, 4);
	printGraph(adj, V);
	return 0;
}

/*
// ============================================
// ================ User Input ================
// ============================================
int main()
{
	int V, E;
	cout << "Num of Vertices: ";
	cin >> V;
	cout << "Num of Edges: ";
	cin >> E;
	vector<int> adj[V];

	int a, b;
	for (int i = 0; i < E; i++)
	{
		cout << "Enter a and b:" << endl;
		cin >> a >> b;
		addEdge(adj, a, b);
	}
	printGraph(adj, V);
	return 0;
}
*/
