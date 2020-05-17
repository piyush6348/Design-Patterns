public interface IGraphIterator {
    Iterator createBreadthFirstIterator(int startNode);
    Iterator createDepthFirstIterator(int startNode);
}
