import java.util.*;


public class DisjointByRank{
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointByRank(int n){
        for(int i = 0; i<n; i++){
            rank.add(0);
            parent.add(i);
        }
    }


    public int findUpair(int node){
        if(node == parent.get(node)) return node;

        int ulp = findUpair(parent.get(node));
        parent.set(node, ulp);
        return ulp;
    }

    public void unionByRank(int u, int v){
        int ulp_u = findUpair(u);
        int ulp_v = findUpair(v);

        if(ulp_u == ulp_v) return;

        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }
        else if(rank.get(ulp_v) < rank.get(ulp_u)){
            parent.set(ulp_v, ulp_u);
        }else{
            parent.set(ulp_v, ulp_u);
            rank.set(ulp_u, rank.get((ulp_u))+1);
        }
    }
}