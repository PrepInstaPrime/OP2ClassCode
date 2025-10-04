import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Pair {
    int node;
    int weight;
    public Pair(int node, int weight){
        this.node=node;
        this.weight=weight;
    }
}
public class WeightedGraph {
    int vertices;
    ArrayList<ArrayList<Pair>> graphList;
    public WeightedGraph(int v){
        this.vertices=v;
        this.graphList= new ArrayList<>();
        for(int i=0;i<=v;i++){
            graphList.add(new ArrayList<>());
        }
    }
    public void insert(int src,int dest, int weight){
        Pair newNode= new Pair(dest, weight);
        graphList.get(src).add(newNode);
    }
    public void read(){
        for(int i=1;i<=vertices;i++){
            System.out.print(i+"->");
            for(Pair p:graphList.get(i)){
                System.out.print("node: "+p.node +" and weight "+p.weight+" ,");
            }
            System.out.println();
        }
    }
    public void delete(int src, int dest){
      ArrayList<Pair> list = graphList.get(src);
      boolean found=false;
      for(int i=0;i<list.size();i++){
        if(list.get(i).node==dest){
            list.remove(i);
            found= true;
            return;
        }
      }
      if(!found){
        System.out.println("node is not in the graph");
      }
    }
    public void bfs(int src){
        Queue<Integer> q= new LinkedList<>();
        boolean visited[]= new boolean[vertices+1];
        q.offer(src);
        visited[src]=true;
        while(!q.isEmpty()){
            int temp= q.poll();
            System.out.print(temp+" ");
            for(Pair next:graphList.get(temp)){
                if(!visited[next.node]){
                    q.offer(next.node);
                    visited[next.node]=true;
                }
            }
        }
    }
    public void dfs(int node){
        boolean visited[]= new boolean[vertices+1];
        helperDfs(node, visited);

    }
    public void helperDfs(int node, boolean visited[]){
        visited[node]=true;
        for(Pair next:graphList.get(node)){
            if(!visited[next.node]){
                helperDfs(next.node, visited);
            }
        }
        System.out.print(node+" ");
    }
    public static void main(String[] args) {
        WeightedGraph wdg= new WeightedGraph(6);
        wdg.insert(1,2,3);
        wdg.insert(1, 4, 6);
        wdg.insert(1, 3, 2);
        wdg.insert(4, 5, 2);
        wdg.insert(4, 6, 2);
        // wdg.read();
        // wdg.delete(1,2);
        // System.out.println("after deletion");
        wdg.read();
        System.out.println("BFS: ");
        wdg.bfs(1);
        System.out.println();
        System.out.println("DFS :");
        wdg.dfs(1);

    }
}
