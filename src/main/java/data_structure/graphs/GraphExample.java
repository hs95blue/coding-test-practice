package data_structure.graphs;

import java.util.LinkedList;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjacencyList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for(int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addVertex(int vertex) {
        adjacencyList[vertex] = new LinkedList<>();
    }

    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }

    void printGraph() {
        for(int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            LinkedList<Integer> list = adjacencyList[i];
            for(int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }
}
public class GraphExample {
    public static void main(String[] args) {
        // 그래프 생성
        Graph graph = new Graph(5);

        // 그래프에 정점 추가
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // 그래프에 간선 추가
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        // 그래프 출력
        graph.printGraph();
    }
}
