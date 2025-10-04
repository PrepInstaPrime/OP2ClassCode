import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class DirectedGraph {
    int vertices;
    ArrayList<ArrayList<Integer>> graphList;
    public DirectedGraph(int v){
        this.vertices=v;
        this.graphList= new ArrayList<>();
        for(int i=0;i<=v;i++){
            graphList.add(new ArrayList<>());
        }
    }
    public void insert(int src,int dest){
        graphList.get(src).add(dest);
    }
    public void read(){
        for(int i=1;i<=vertices;i++){
            System.out.println(i+"->"+graphList.get(i));
        }
    }
    public int delete(int src, int dest){
        int idx= graphList.get(src).indexOf(dest);
        if(idx==-1){
            System.out.println("Element not found");
            return -1;
        }
        return graphList.get(src).remove(idx);

    }
    public void bfs(int node){
        Queue<Integer> q= new LinkedList<>();
        boolean visited[]= new boolean[vertices+1];
        q.offer(node);
        visited[node]=true;
        while(!q.isEmpty()){
            int temp= q.poll();
            System.out.print(temp+" ");
            for(int next:graphList.get(temp)){
                if(!visited[next]){
                    q.offer(next);
                    visited[next]=true;
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
        for(int next:graphList.get(node)){
            if(!visited[next]){
                helperDfs(next, visited);
            }
        }
        System.out.print(node+" ");
    }
    public static void main(String[] args) {
        DirectedGraph graph= new DirectedGraph(6);
        graph.insert(1, 2);
        graph.insert(2, 3);
        graph.insert(2, 5);
        graph.insert(2, 6);
        graph.insert(3, 4);
        graph.insert(4, 6);
        graph.read();
        // graph.delete(2, 5);
        // System.out.println("after delete");
        // graph.read();
        System.out.println("BFS: ");
        graph.bfs(1);
        System.out.println("\nDFS: ");
        graph.dfs(1);
    }
}
