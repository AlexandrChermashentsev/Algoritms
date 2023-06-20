package Lect_Sem_2;

import java.util.Random;

// Реализовать алгоритм пирамидальной сортировки (сортировка кучей)

public class HW_1_Lect_Sem_2 {
 
    public static class HeapSort {

        // Преобразование в двоичную кучу поддерева с корнем rootIndex - индексом в array, sizeHeap - размер кучи.
        void heapify(int[] array, int sizeHeap, int rootIndex){
            int largest = rootIndex; // Инициализируем наибольший элемент как корень
            int left = 2 * rootIndex + 1; // левый
            int right = 2 * rootIndex + 2; // правый

            // Если левый больше корня
            if (left < sizeHeap && array[left] > array[largest]) largest = left;

            // Если правый больше чем самый большой элемент в данный момент
            if (right < sizeHeap && array[right] > array[largest]) largest = right;

            // Если самы большой элемент не корень
            if (largest != rootIndex) {
                int temp = array[rootIndex];
                array[rootIndex] = array[largest];
                array[largest] = temp;

                // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
                heapify(array, sizeHeap, largest);
            }
        }

        public void sort (int[] array){
            int heapSize = array.length;

            // Построение кучи (перегруппируем массив)
            for (int i = heapSize / 2 - 1; i >= 0; i--) {
                heapify(array, heapSize, i);
            }
            // Один за другми извлекаем элементы из кучи
            for (int i = heapSize - 1; i >= 0; i--) {
                // Перемещаем текущий корень в конец
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // Вызываем процедуру heapify в уменьшенной куче
                heapify(array, i, 0);
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int sizeArray = 20;
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }

        printArray(array);

        HeapSort sorted = new HeapSort();
        sorted.sort(array);
        
        printArray(array);
    }

}

