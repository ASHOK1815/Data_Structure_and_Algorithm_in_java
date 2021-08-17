package dfs_and_bfs;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

class Dfs{

    public LinkedList<Integer> adj[];
    public int visited[];

    Dfs(int v)
    {
        adj=new LinkedList[v+1];
        visited = new int[v+1];
        for (int i=0; i<v; ++i) {
            adj[i] = new LinkedList();
            visited[i] = 0;
        }
    }

    void insertEdges(int a,int b)
    {
        adj[a].add(b);
        adj[b].add(a);
    }


    void dfsPrint(int  node)
    {
        visited[node]= 1;
        System.out.println("Node : "+node);
        for(int i=0;i<adj[node].size();i++)
        {
            int child = adj[node].get(i);
            if(visited[child] == 0)
            {
                dfsPrint(child);
            }

        }

    }
}



public class DfsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int e = scanner.nextInt();

        Dfs node = new Dfs(n);

        for(int i=0;i<e;i++)
        {
            int a,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            node.insertEdges(a,b);
        }

        node.dfsPrint(1);

    }
}
