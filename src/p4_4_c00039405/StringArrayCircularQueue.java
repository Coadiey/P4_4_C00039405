/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_4_c00039405;

import java.util.Arrays;

/**
 *
 * @author cxb0250
 */
public class StringArrayCircularQueue {

    private final String[] Array;
    private int head = 0;
    private int tail = 0;
    private boolean full = false;

    StringArrayCircularQueue() {                             //default constructor
        this.Array = new String[5];
    }

    StringArrayCircularQueue(int s) {
        this.Array = new String[s];
    }

    private int getTail() {
        return this.tail;
    }

    private void setTail() {
        this.tail = (this.tail + 1) % this.Array.length;
    }

    private int getHead() {
        return this.head;
    }

    private void setHead() {
        this.head = (this.head + 1) % this.Array.length;
    }

    public void enqueue(String str) {
        if (this.isFull() == false) {
            this.Array[this.getTail()] = str;
            this.setTail();
        }
    }

    public String dequeue() {
        String tempStr = this.Array[this.getHead()];
        this.Array[this.getHead()] = null;
        this.setHead();
        return tempStr;
    }

    public int size() {
        return this.getTail();
    }

    public boolean isEmpty() {
        if (this.Array[this.getHead()] == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (((this.tail + 1) % this.Array.length) == this.getHead()) {
            full = true;
            return false;
        } else {
            return full;
        }
    }

    @Override
    public String toString() {
        return "Queue: " + Arrays.toString(this.Array);
    }

}
