package main;

public class QuickFindUF {

    private int[] id;
    public QuickFindUF(int N) {
        id = new int[N];
        for(int i=0; i<N; i++)
            id[i]=1;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        
    }
        
                              
           
    
}
    
