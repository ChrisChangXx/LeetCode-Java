package com.chris.leetcode.old.everyday;

import java.util.Iterator;
import java.util.Stack;

/**
 * solution232
 * 用栈实现队列
 *
 * @author zhangh
 * @date 2021/03/05
 */
public class Solution232 {
    static class MyQueue {

        private Stack mainStack;
        private Stack minorStack;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            mainStack = new Stack();
            minorStack = new Stack();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            mainStack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (minorStack.isEmpty()) {
                Iterator iterator = mainStack.iterator();
                while (iterator.hasNext()) {
                    minorStack.push(mainStack.pop());
                }
            }
            return (int) minorStack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (minorStack.isEmpty()) {
                Iterator iterator = mainStack.iterator();
                while (iterator.hasNext()) {
                    minorStack.push(mainStack.pop());
                }
            }
            return (int) minorStack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return mainStack.isEmpty() && minorStack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}
