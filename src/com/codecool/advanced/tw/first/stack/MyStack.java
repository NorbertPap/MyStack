package com.codecool.advanced.tw.first.stack;

public class MyStack<T> {

    Node<T> top = null;

    private class Node<T> {
        T data;
        Node<T> next = null;

        private Node(T data){
            this.data = data;
        }
    }

    public void push(T t){
        Node<T> newTop= new Node<>(t);
        newTop.next = top;
        top = newTop;
    }

    public T pop(){
        if(top == null) return null;
        T returnValue = top.data;
        top = top.next;
        return returnValue;
    }

    public T peek(){
        if(top == null) return null;
        return top.data;
    }
}
