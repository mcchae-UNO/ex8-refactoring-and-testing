package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   // TODO: Your answer
   <T extends superClass> void extractedMethod(List<T> objects, String input) {
	   for (T obj : objects) {
		   if (obj.contains(input))
			   System.out.println(obj);
	   }
   }
   
}

class superClass {
	String name;
	
	public boolean contains(String input) {
		return name.contains(input); 
	}
}

class Node extends superClass{
}

class Edge extends superClass {
}