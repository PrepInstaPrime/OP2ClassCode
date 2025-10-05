import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair {
    int node;
    int weight;
    public Pair(int val,int  w){
        this.node=val;
        this.weight=w;
    }
}
public class DijkstraAlgo {
    ArrayList<ArrayList<Pair>> graphList;
    int vertices;
    public DijkstraAlgo(int v){
        this.vertices= v;
        graphList= new ArrayList<>();
        for(int i=0;i<=v;i++){
            graphList.add(new ArrayList<>());
        }
    }
    public void insert(int src, int dest, int weight){
        Pair p1= new Pair(dest, weight);
        Pair p2= new Pair(src, weight);
        graphList.get(src).add(p1);
        graphList.get(dest).add(p2);
    }
    // dijkstra algorithm
    public void shortestPath(int src){
        int dist[]= new int[vertices+1];
        boolean visited[]= new boolean[vertices+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<Pair> q= new PriorityQueue<>((a,b)->a.weight-b.weight);
        q.offer(new Pair(src, 0));
        while (!q.isEmpty()) {
            Pair current= q.poll();
            int u=current.node;
            if(visited[u]) continue;
            visited[u]=true;
            for(Pair next:graphList.get(u)){
                int v=next.node;
                int weight=next.weight;
                if(!visited[v]&&dist[u]+weight<dist[v]){
                    dist[v]=dist[u]+weight;
                    q.offer(new Pair(v, weight));
                }
            }
        }
        // System.out.println(Arrays.toString(dist));
        for(int i=1;i<=vertices;i++){
            System.out.println("shortest path from "+src+" to "+ i+ " is "+dist[i]);
        }

    }
    public static void main(String[] args) {
        DijkstraAlgo uwg= new DijkstraAlgo(6);
        uwg.insert(1, 2, 2);
        uwg.insert(1, 3, 2);
        uwg.insert(1, 4, 3);
        uwg.insert(1, 5, 4);
        uwg.insert(2, 4, 6);
        uwg.insert(2, 5, 1);
        uwg.insert(3, 5, 2);
        uwg.insert(3, 6, 1);
        uwg.insert(4, 3, 1);
        uwg.insert(4, 6, 1);
        uwg.shortestPath(1);
        
    }
}
