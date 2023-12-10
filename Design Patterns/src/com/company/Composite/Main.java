package com.company.Composite;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory subDirectory = new Directory("SubDirectory");
        subDirectory.addComponent(new File("file3.txt"));

        Directory root = new Directory("Root");

        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(subDirectory);

        root.ls_command();
       // root.lsOnlyImmediate();
    }
}
