package kh.java.collections.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStackStudy {
	public static void main(String[] args) {
		QueueStackStudy study = new QueueStackStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * Stack
	 *  - 선입후출(LIFO, Last In First Out)
	 *  
	 *  - push : 맨 마지막에 추가
	 *  - pop : 맨 마지막에서 제거
	 */
	public void test2() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		System.out.println(stack);

		int n = stack.pop();
		System.out.println("pop = " + n);
		n = stack.pop(); // 두번 pop 했음
		System.out.println("pop = " + n);
		System.out.println(stack);
	}

	/**
	 * Queue
	 *  - 선입선출(FIFO, First In First Out)
	 *  
	 *  - offer : 맨 마지막에 추가
	 *  - poll : 맨 앞에서 제거
	 */
	public void test1() {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(3);
		queue.offer(5);
		queue.offer(7);
		System.out.println(queue);

		int n = queue.poll();
		System.out.println(n + "제거 후 : " + queue);

		queue.offer(9);
		System.out.println(queue);

		// 모든 요소를 순서대로 꺼내기
		System.out.println("--순서대로 꺼내기--");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
