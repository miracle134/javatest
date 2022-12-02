package mc.javatest.algorithm;

import java.util.Arrays;

/**
 *
 */
public class HeapSort {

    int[] heap;
    boolean flagMaxMin = true; // true : Max 힙, false :Min 힙

    public static void main(String[] args) {
        HeapSort h = new HeapSort();

        // 일반 배열
        int[] arr = {10, 25, 40, 50, 15, 60, 30};

        // 힙 담기
        for (int i : arr) {
            h.addHeap(i);
        }

        System.out.printf("최초 힙 : %s\n\n", Arrays.toString(h.heap));

        // 힙 정렬

        // Max 힙일경우 오름차순
        int[] sortAsc = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int tmp = h.popHeap();
            sortAsc[i] = tmp;

            System.out.printf("힙 : %s Pop : %s 정렬중 : %s\n", Arrays.toString(h.heap), tmp, Arrays.toString(sortAsc));
        }
        System.out.printf("정렬완료 : %s\n\n", Arrays.toString(sortAsc));

        // 다시 힙 담기
        for (int i : arr) {
            h.addHeap(i);
        }

        // Max 힙일경우 내림차순
        int[] sortDesc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int tmp = h.popHeap();
            sortDesc[i] = tmp;

            System.out.printf("힙 : %s Pop : %s 정렬중 : %s\n", Arrays.toString(h.heap), tmp, Arrays.toString(sortDesc));
        }

        System.out.printf("정렬완료 : %s\n", Arrays.toString(sortDesc));
    }


    /**
     * 힙 추가
     */
    private void addHeap(int num) {
        if (heap == null || heap.length == 0) heap = new int[]{num};
        else {
            heap = Arrays.copyOf(heap, heap.length + 1);
            heap[heap.length - 1] = num;
        }

        // 정렬 Up
        heapUpSort(heap.length-1);

    }

    /**
     * 힙 꺼내기
     */
    private int popHeap() {
        int pop = -1;

        if(heap.length > 0){
            pop = heap[0];
            heap[0] = heap[heap.length - 1];
            heap = Arrays.copyOfRange(heap, 0, heap.length - 1);

            // 정렬 Down
            heapDownSort();
        }

        return pop;
    }

    /**
     * 힙 위로 정렬
     */
    private void heapUpSort(int addNode) {
        int addNodeValue, parentNode, parentNodeValue;

        while(addNode > 0){
            // 부모 찾기 : (자식-1)/2
            addNodeValue = heap[addNode];
            parentNode = (addNode - 1) / 2;
            parentNodeValue = heap[parentNode];

            // Max 힙
            if(flagMaxMin){
                if(addNodeValue > parentNodeValue) {
                    heap[parentNode] = addNodeValue;
                    heap[addNode] = parentNodeValue;
                    addNode = parentNode;
                }else break;

            // Min 힙
            }else{
                if(addNodeValue < parentNodeValue) {
                    heap[parentNode] = addNodeValue;
                    heap[addNode] = parentNodeValue;
                    addNode = parentNode;
                }else break;
            }
        }

    }

    /**
     * 힙 아래로 정렬
     */
    private void heapDownSort() {
        int topNode = 0, topNodeValue, leftNode, rightNode, leftNodeValue, rightNodeValue;

        while(topNode < heap.length-1){
            // 자식 찾기 : 왼쪽 : 부모*2+1 오른쪽 : 부모*2+2
            topNodeValue = heap[topNode];
            leftNode = topNode*2+1;
            rightNode = topNode*2+2;

            if(leftNode >= heap.length)  leftNodeValue = -1;
            else leftNodeValue = heap[leftNode];

            if(rightNode >= heap.length)  rightNodeValue = -1;
            else rightNodeValue = heap[rightNode];

            // Max 힙
            if(flagMaxMin){

                if(leftNodeValue < 0) break;
                else if(topNodeValue < leftNodeValue){

                    if(leftNodeValue > rightNodeValue){
                        heap[leftNode] = topNodeValue;
                        heap[topNode] = leftNodeValue;
                        topNode = leftNode;
                    }else{
                        heap[rightNode] = topNodeValue;
                        heap[topNode] = rightNodeValue;
                        topNode = rightNode;
                    }

                }else if(topNodeValue < rightNodeValue){
                    heap[rightNode] = topNodeValue;
                    heap[topNode] = rightNodeValue;
                    topNode = rightNode;
                }else break;

            // Min 힙
            }else{

                if(leftNodeValue < 0) break;
                else if(topNodeValue > leftNodeValue){

                    if(rightNodeValue > -1 && leftNodeValue < rightNodeValue){
                        heap[leftNode] = topNodeValue;
                        heap[topNode] = leftNodeValue;
                        topNode = leftNode;
                    }else if(rightNodeValue > -1){
                        heap[rightNode] = topNodeValue;
                        heap[topNode] = rightNodeValue;
                        topNode = rightNode;
                    }

                }else if(rightNodeValue > -1 && topNodeValue > rightNodeValue){
                    heap[rightNode] = topNodeValue;
                    heap[topNode] = rightNodeValue;
                    topNode = rightNode;
                }else break;

            }
        }

    }


}
