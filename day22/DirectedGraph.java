public class DirectedGraph {
    int vertices;
    int graph[][];
    public DirectedGraph(int v){
        this.vertices=v;
        this.graph=new int[v+1][v+1];
    }
    public void insert(int src, int dest){
        graph[src][dest]=1;
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
    }
    public static void main(String[] args) {
        DirectedGraph DG= new DirectedGraph(3);
        DG.insert(1, 2);
        DG.insert(2, 3);
        DG.insert(1, 3);
        // DG.display();
        DG.delete(1, 3);
        DG.display();
    }

}
