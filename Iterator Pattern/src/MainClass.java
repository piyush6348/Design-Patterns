public class MainClass {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Iterator breadthFirstIterator = graph.createBreadthFirstIterator(0);
        Iterator depthFirstIterator = graph.createDepthFirstIterator(1);

        // Breadth First iteration
        while (breadthFirstIterator.hasNext()) {
            GraphNode graphNode = breadthFirstIterator.next();
        }


        // Depth First iteration
        while (depthFirstIterator.hasNext()) {
            GraphNode graphNode = depthFirstIterator.next();
        }
    }
}
