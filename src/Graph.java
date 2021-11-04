import java.util.*;

class Graph {

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }

  public static void main(String[] args) {

    // Create the graph
    int V = 9;
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      am.add(new ArrayList<Integer>());

    // Add edges
    addEdge(am, 0, 1);
    addEdge(am, 0, 2);
    addEdge(am, 0, 8);
    addEdge(am, 1, 3);
    addEdge(am, 1, 5);
    addEdge(am, 1, 6);
    addEdge(am, 2, 5);
    addEdge(am, 2, 6);
    addEdge(am, 2, 7);
    addEdge(am, 2, 8);
    addEdge(am, 3, 4);
    addEdge(am, 3, 5);
    addEdge(am, 3, 8);
    addEdge(am, 4, 6);
    addEdge(am, 4, 7);
    addEdge(am, 5, 8);
    addEdge(am, 7, 8);
    addEdge(am, 7, 1);

    printGraph(am);
  }

  // Print the graph
  static void printGraph(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}
