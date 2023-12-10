package com.company.statePattern;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("line drawn");
    }

    @Override
    public void mouseDown() {
        System.out.println("Mouse Down from Brush tool");
    }
}
