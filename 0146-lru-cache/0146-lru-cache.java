class LRUCache {

    class Node {
        int key, val;
        Node prev;
        Node next;

        Node(int k, int v) {
            key = k;
            val = v;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    Map<Integer, Node> mp = new HashMap<>();
    int limit;

    public LRUCache(int capacity) {
        limit = capacity;

        head.next = tail;
        tail.prev = head;
    }

    void addNode(Node newNode) {
        Node oldNode = head.next;

        head.next = newNode;
        newNode.prev = head;

        newNode.next = oldNode;
        oldNode.prev = newNode;
    }

    void delNode(Node oldNode) {
        Node oldprev = oldNode.prev;
        Node oldnext = oldNode.next;

        oldprev.next = oldnext;
        oldnext.prev = oldprev;
    }

    public int get(int key) {

        if (!mp.containsKey(key))
            return -1;

        Node ansNode = mp.get(key);

        delNode(ansNode);
        addNode(ansNode);

        return ansNode.val;
    }

    public void put(int key, int value) {

        // Key already exists
        if (mp.containsKey(key)) {
            Node oldNode = mp.get(key);

            delNode(oldNode);
            mp.remove(key);
        }

        // Capacity reached
        if (mp.size() == limit) {
            Node lruNode = tail.prev;

            delNode(lruNode);
            mp.remove(lruNode.key);
        }

        // Add new node as most recently used
        Node newNode = new Node(key, value);

        addNode(newNode);
        mp.put(key, newNode);
    }
}