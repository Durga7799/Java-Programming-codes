class Graph
{
  boolean matrix[][];
  int num;
  public Graph (int num)
  {
	this.num = num;
	matrix = new boolean[num][num];
  }
  public void addEdge (int i, int j)
  {
	matrix[i][j] = true;
	matrix[j][i] = true;
  }
  public void removeEdge (int i, int j)
  {
	matrix[i][j] = false;
	matrix[j][i] = false;
  }
  public String toString ()
  {
	StringBuilder s = new StringBuilder ();
	for (int i = 0; i < num; i++)
	  {
		s.append (i + ": ");
	  for (boolean j:matrix[i])
		  {
			s.append ((j ? 1 : 0) + " ");
		  }
		s.append ("\n");
	  }
	return s.toString ();
  }
}

public class Main
{
  public static void main (String args[])
  {
	Graph g = new Graph (4);
	  g.addEdge (0, 1);
	  g.addEdge (0, 2);
	  g.addEdge (1, 2);
	  g.addEdge (2, 0);
	  g.addEdge (2, 3);
	  System.out.print (g.toString ());
  }
}
