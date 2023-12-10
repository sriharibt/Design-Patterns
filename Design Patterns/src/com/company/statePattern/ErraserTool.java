package com.company.statePattern;

public class ErraserTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("erased");
    }

    @Override
    public void mouseDown() {
        System.out.println("selected mouse down");
    }
}
