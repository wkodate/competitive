package com.wkodate.procon.aoj.alds1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Queue {

    private final int quantum;

    private int processTime = 0;

    private Deque<Process> deque = new ArrayDeque<>();

    public Queue(int quantum) {
        this.quantum = quantum;
    }

    public void addProcess(Process process) {
        deque.add(process);
    }

    public List<Process> calculate() {
        List<Process> calculated = new ArrayList<>();
        while (!deque.isEmpty()) {
            Process process = deque.element();
            deque.remove();

            boolean finished = cpuExec(process);
            if (finished) {
                process.time = processTime;
                calculated.add(process);
            }
        }
        return calculated;
    }

    private boolean cpuExec(Process process) {
        if (process.time > quantum) {
            process.time = process.time - quantum;
            deque.add(process);
            processTime += quantum;
            return false;
        }
        processTime += process.time;
        return true;
    }


    public class Process {
        String name;
        int time;

        Process(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Queue queue = new Queue(Integer.parseInt(input[1]));

        int processNum = Integer.parseInt(input[0]);
        for (int i = 0; i < processNum; i++) {
            String[] rows = br.readLine().split(" ");
            queue.addProcess(queue.new Process(rows[0], Integer.parseInt(rows[1])));
        }

        List<Process> result = queue.calculate();
        for (Process process : result) {
            System.out.println(process.name + " " + process.time);
        }
    }

}
