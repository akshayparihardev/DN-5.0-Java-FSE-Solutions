package WEEK_1.DSA.Exercise_5_Task_Management_System;

public class TaskManagement {

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {
        Node newwNode = new Node(task);

        if (head == null) {
            head = newwNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newwNode;

    }

    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("No Tasks Available");
            return;
        }

        // If the first node has the task
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task Deleted.");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.task.getTaskId() != taskId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found...");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task Deleted.");
        }
    }

    public void searchTask(int taskId) {

        Node temp = head;

        while (temp != null) {

            if (temp.task.getTaskId() == taskId) {
                System.out.println(temp.task.toString());
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found...");
    }

    public void traverseTask() {

        if (head == null) {
            System.out.println("No Tasks Available");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.task.toString());
            temp = temp.next;
        }
    }
}
