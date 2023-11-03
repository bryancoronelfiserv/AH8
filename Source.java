class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean linkedListFind(Node<T> head, T target) {
    Node<T> current = head;
    // Traverse the linked list
    while (current != null) {
      if (current.val.equals(target)) {
        return true; // Target found
      }
      current = current.next;
    }
    return false; // Target not found
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Source.linkedListFind(a, "c")); // true

  }

}