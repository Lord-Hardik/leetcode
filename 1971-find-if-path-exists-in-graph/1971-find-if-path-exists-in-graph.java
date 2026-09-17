class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> graph = new ArrayList<>();

        for(int i= 0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){

            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int node, int destination, List<List<Integer>> graph, boolean[] visited){

        if(node == destination){
            return true;
        }

        visited[node] = true;

        for(int neighbor : graph.get(node)){

            if(!visited[neighbor]){
                if(dfs(neighbor, destination, graph, visited)){
                    return true;
                }
            }
        }
        return false;
    }
}