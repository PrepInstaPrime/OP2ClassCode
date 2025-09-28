public class UnDirectedGraph {
    int vertices;
    int graph[][];
    public UnDirectedGraph(int v){
        this.vertices=v;
        this.graph=new int[v+1][v+1];
    }
    public void insert(int src, int dest){
        graph[src][dest]=1;
        graph[dest][src]=1;
    }
    public void display(){
        for(int i=1;i<=vertices;i++){
            for(int j=1;j<=vertices;j++){
                if(graph[i][j]==1){
                    System.out.println(i+"->"+j);
                }
            }
        }
    }
    public void delete(int src, int dest){
        graph[src][dest]=0;
        graph[dest][src]=0;
    }
    public static void main(String[] args) {
        UnDirectedGraph UG= new UnDirectedGraph(3);
        UG.insert(1, 2);
        UG.insert(2, 3);
        UG.insert(1, 3);
        // UG.display();
        UG.delete(1, 2);
        // UG.display();
        UG.delete(1, 3);
        UG.display();
    }
}
