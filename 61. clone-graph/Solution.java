/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) return node;

        // If we have already cloned this node, return the clone from the map
        if(map.containsKey(node)) {
            return map.get(node);
        }

        // 1. Create a clone of the current node [don't just add neighbors yet]
        Node clone = new Node(node.val);
        map.put(node, clone);
        
        // 2. Iterate through the neighbors of the original node
        for(Node neighbor: node.neighbors) {
            // 3. Recursively clone neighbors and add them to the current clone's list
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}