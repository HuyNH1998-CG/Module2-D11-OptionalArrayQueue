public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean isFull = false;
        if (currentSize == capacity) {
            isFull = true;
        }
        return isFull;
    }

    public boolean isQueueEmpty() {
        boolean isEmpty = false;
        if (currentSize == 0) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Unable to add " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println(item + " has been pushed to queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue empty");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("removed " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("removed " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getQueueArr() {
        return queueArr;
    }

    public void setQueueArr(int[] queueArr) {
        this.queueArr = queueArr;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
