class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    Node<T> current = head;
    int currentIndex = 0;
    // Traverse the linked list
    while (current != null) {
      if (currentIndex == index) {
        return current.val; // Return the value at the specified index
      }
      current = current.next;
      currentIndex++;
    }
    // If the index is out of bounds or the list is empty, return null
    return null;
  }

  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");
    node1.next = node2;
    node2.next = node3;
    // banana -> mango -> kiwi
    System.out.println(ECSource.getNodeValue(node1, 1));

    // banana -> mango -> kiwi
    System.out.println(ECSource.getNodeValue(node1, 0)); // "banana"


    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
    // a -> b -> c -> d
    System.out.println(ECSource.getNodeValue(a, 7)); // null

  }
}