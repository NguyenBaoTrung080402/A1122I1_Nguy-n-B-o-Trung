package graph;

import java.util.Arrays;
import java.util.Scanner;


public class Kruskal {
    class Edge implements Comparable<Edge>{
        int weight, dest, src;
        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    };
    class Subset{
        int p, rank;
    }
    int V, E;
    Edge edge[];
    
    public Kruskal(int v, int e){
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }
    
    public Kruskal(){}
    int find(Subset s[], int i){
        if(s[i].p !=i)
            s[i].p=find(s, s[i].p);
        return s[i].p;
    }
    
    void Union(Subset s[], int x, int y){
        int r1 = find(s, x);
        int r2 = find(s, y);
        if(s[r1].rank<s[r2].rank)
            s[r1].p=r2;
        else if(s[r1].rank>s[r2].rank)
            s[r2].p=r1;
        else{
            s[r2].p=r1;
            s[r1].rank++;
        }
    }
    
    void MST(){
        Edge re[] = new Edge[V];
        int e=0;
        int i=0;
        for(i=0; i<V; ++i){
            re[i]=new Edge();
        }
        Arrays.sort(edge);
        Subset s[] = new Subset[V];
        for(i=0; i<V; ++i){
            s[i]=new Subset();
        }
        for(int v =0; v<V; ++v){
            s[v].p=v;
            s[v].rank=0;
        }
        
        i=0;
        
        while(e<V-1){
            Edge next = edge[i++];
            int x = find(s, next.src);
            int y = find(s, next.dest);
            if(x!=y){
                re[e++]= next;
                Union(s, x, y);
            }
        }
        System.out.println("MST");
        int minimumCost = 0;
        for (i = 0; i < e; ++i) {
            System.out.println(re[i].src + " -> "
                               + re[i].dest
                               + " == " + re[i].weight);
            minimumCost += re[i].weight;
        }
        System.out.println("Minimum Cost Spanning Tree "
                           + minimumCost);
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int v = 4;
       int e = 5;
       Kruskal graph = new Kruskal(v, e);
       for(int i=0; i< e; i++){
            System.out.println("Input vertices " + i );
            graph.edge[i].src=Integer.parseInt(sc.nextLine());
            graph.edge[i].dest=Integer.parseInt(sc.nextLine());
            graph.edge[i].weight=Integer.parseInt(sc.nextLine());
        }
       graph.MST();
    }
    
}
