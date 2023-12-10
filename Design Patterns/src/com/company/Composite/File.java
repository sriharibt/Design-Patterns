package com.company.Composite;

public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls_command() {
        System.out.println("File: " +this.name);
    }
}
