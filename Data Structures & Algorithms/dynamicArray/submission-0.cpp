class DynamicArray {
public:
    int* arr;
    int pos;
    int capacity;
    DynamicArray(int capacity) {
        arr = new int[capacity];
        pos = 0;
        this -> capacity = capacity;
    }

    int get(int i) {
        return arr[i];
    }

    void set(int i, int n) {
        arr[i] = n;
    }

    void pushback(int n) {
        if(pos == capacity) resize();
        arr[pos++] = n;
    }

    int popback() {
        if(pos <= 0) {
            return -1;
        }
        int x = arr[pos-1];
        pos--;
        return x;
    }

    void resize() {
        capacity = capacity*2;
        int* newArr = new int[capacity];
        for(int i=0;i<pos;i++){
            newArr[i] = arr[i];
        }
        delete[] arr;
        arr = newArr;
    }

    int getSize() {
        return pos;
    }

    int getCapacity() {
        return capacity;
    }
};
