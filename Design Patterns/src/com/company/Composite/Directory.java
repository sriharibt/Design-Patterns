package com.company.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {


    String directory;

    public Directory(String directory){
        this.directory = directory;
        this.children = new ArrayList<>();
    }

    List<FileSystemComponent> children;

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public  void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void ls_command() {
        System.out.println("Directory: " + this.directory);
        for (FileSystemComponent component: children){
            component.ls_command();
        }
    }


}
