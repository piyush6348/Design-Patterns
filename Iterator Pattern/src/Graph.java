public class Graph implements IGraphIterator {
    // Other graph properties
    @Override
    public Iterator createBreadthFirstIterator(int startNode) {
        return new BreadthFirstIterator(startNode);
    }

    @Override
    public Iterator createDepthFirstIterator(int startNode) {
        return new DepthFirstIterator(startNode);
    }
}
