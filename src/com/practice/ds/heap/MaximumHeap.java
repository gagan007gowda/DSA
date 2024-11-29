package com.practice.ds.heap;

public class MaximumHeap {
    static class MaxHeap {
        int[] Heap;
        int MaxSize;
        int size;

        MaxHeap(int size) {
            this.MaxSize = size;
            Heap = new int[this.MaxSize + 1];
            Heap[0] = Integer.MAX_VALUE;
        }

        private int parent(int pos) {
            return pos / 2;
        }

        private int lNode(int pos) {
            return pos * 2;
        }

        private int rNode(int pos) {
            return pos * 2 + 1;
        }

        private void swap(int i, int j) {
            int temp = Heap[i];
            Heap[i] = Heap[j];
            Heap[j] = temp;
        }

        private void heapifyUp(int pos) {
            int parentPosition = parent(pos);
            if (pos > 0 && Heap[parentPosition] < Heap[pos]) {
                swap(parentPosition, pos);
                heapifyUp(parentPosition);
            }
        }

        public void insertNode(int element) {
            Heap[++size] = element;
            int currentPos = size;
            heapifyUp(currentPos);
        }

        public void heapifyDown(int pos) {
            //If this condition is matched then they are leaf nodes
            if (pos >= size / 2 && pos <= size)
                return;
            int lNodePos = lNode(pos), rNodePos = rNode(pos);
            if (Heap[pos] <= Heap[lNodePos] || Heap[pos] <= Heap[rNodePos]) {
                if (Heap[lNode(pos)] > Heap[rNode(pos)]) {
                    swap(pos, lNodePos);
                    heapifyDown(lNodePos);
                }
                else{
                    swap(pos, rNodePos);
                    heapifyDown(rNodePos);
                }
            }
        }

        public int extractMax() {
            int deletedNode = Heap[1];
            Heap[1] = Heap[size--];
            heapifyDown(1);
            return deletedNode;
        }

        public void printHeap() {
            for (int i = 1; i <= size / 2; i++) {
                System.out.print("The value: " + Heap[i]
                        + " L Child: " + Heap[lNode(i)] + " R Child: "
                        + Heap[rNode(i)]);
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insertNode(1);
        maxHeap.insertNode(4);
        maxHeap.insertNode(2);
        maxHeap.insertNode(5);
        maxHeap.insertNode(13);
        maxHeap.insertNode(6);
        maxHeap.insertNode(17);
        maxHeap.printHeap();
        System.out.println("After deleting"+ maxHeap.extractMax());
        maxHeap.printHeap();
    }
}

