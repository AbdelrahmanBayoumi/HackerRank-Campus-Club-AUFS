#include <bits/stdc++.h>
using namespace std;

void addEdge(vector<pair<int, int>> adj[], int u, int v, int wt)
{
  adj[u].push_back(make_pair(v, wt)); // u -> v with cost wt
  adj[v].push_back(make_pair(u, wt)); // u -> v with cost wt (for un-directed graph)
}
void printGraph(vector<pair<int, int>> adj[], int V)
{
  for (int v = 0; v < V; ++v)
  {
    cout << "\n Node " << v << " Makes an Edge with:\n";
    for (auto x : adj[v])
    {
      int node = x.first;
      int weight = x.second;
      cout << "\tNode " << node << " with cost= " << weight << endl;
    }
    cout << "\n";
  }
}
int main()
{
  int V = 5;
  vector<pair<int, int>> adj[V];
  addEdge(adj, 0, 1, 10);
  addEdge(adj, 0, 4, 20);
  addEdge(adj, 1, 2, 30);
  addEdge(adj, 1, 3, 40);
  addEdge(adj, 1, 4, 50);
  addEdge(adj, 2, 3, 60);
  addEdge(adj, 3, 4, 70);
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
  vector<pair<int, int>> adj[V];

  int a, b, w;
  for (int i = 0; i < E; i++)
  {
    cout << "Enter a ,b and weight:" << endl;
    cin >> a >> b >> w;
    addEdge(adj, a, b, w);
  }
  printGraph(adj, V);
  return 0;
}
*/
