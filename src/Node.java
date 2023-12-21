
// JPSE, 10/2/23, RS with GitHub stuff, No Citations

public class Node <T> {
    private Node parentNode; // Lines 5,6,7 create the two nodes and value that will be used for the rest of the code
    private Node childNode;
    private T value;

    public Node (){  // one of the three needed constructors that takes no parameters and acts as just a "default"
    }

    public Node (T numVal){ // second of the three needed construcors which takes in just a T value
        value = numVal;
    }
    public Node (Node pNode, Node cNode, T numVal){ //third of the three need constructors which takes in two nodes (Parent Node and a Child Node) and a T value
        parentNode = pNode;
        childNode = cNode;
        value = numVal;
    }

    //accesors!

    public T getValue(){ // now accessors, as you could imagine, let us access things, this accessor gives us the value of the variable value
        return value;
    }

    public Node getParentNode(){ //this one does the same but gives us the parent node
        return parentNode;
    }

    public Node getChildNode(){ //similiarly, this one gives us the child node
        return childNode;
    }

    public void setValue(T numVal){ //this one takes the already existing 'value' and sets it to a new value
        value = numVal;
    }

    public void setParentNode(Node pNode){ //takes an already existing parent node and changes it to the new parent node in the parameters
        parentNode = pNode;
    }

    public void setChildNode(Node cNode){ //takes an already existing child node and changes it to the new child node in the parameters.
        childNode = cNode;
    }

    public boolean equals(Node inputNode){ //overwriting the equals method to be used with node
        return inputNode.getValue().equals(value);
    }

    public String toString(){ //overwriting the toString method to be used with node
        return "Node: " + value;
    }

}

