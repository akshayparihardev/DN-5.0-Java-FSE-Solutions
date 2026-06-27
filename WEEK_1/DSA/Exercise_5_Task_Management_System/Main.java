package WEEK_1.DSA.Exercise_5_Task_Management_System;

public class Main {
    public static void main(String[] args) {
        
        TaskManagement taskList = new TaskManagement();

        Task t1 = new Task(101,"Complete DSA","In Progress");
        Task t2 = new Task(102,"Complete Design Patterns","Pending");
        Task t3 = new Task(103,"Complete PLSQL","Yet to Start");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        taskList.traverseTask();
        
        taskList.searchTask(102);

        taskList.deleteTask(102);

        taskList.traverseTask();

    }
}
