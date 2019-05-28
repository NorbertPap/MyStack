package com.codecool.advanced.tw.first.stack;

public class Main {

    public static void main(String[] args) {
	    MyStack<Integer> myStack1 = new MyStack<>();
	    MyStack<Integer> myStack2 = new MyStack<>();
	    myStack1.pop();
	    myStack1.peek();
		for (int i = 0; i < 10; i++) {
			myStack1.push(i);
		}
		while(myStack1.peek()!=null){
			myStack2.push(myStack1.pop());
		}
		while(myStack2.peek()!=null){
			System.out.println(myStack2.pop());
		}
    }
}
