import java.util.*;


public class DisjointBySize{
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointBySize(int n){
        for(int i = 0; i<n; i++){
            parent.add(i);
            size.add(1);
        }
    }


    public int findUpair(int node){
        if(node == parent.get(node)) return node;

        int ulp = findUpair(parent.get(node));
        parent.set(node, ulp);
        return ulp;
    }


    public void unionBySize(int u, int v){
        int ulp_u = findUpair(u);
        int ulp_v = findUpair(v);

        if(ulp_u == ulp_v) return;

        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
        }
        else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}