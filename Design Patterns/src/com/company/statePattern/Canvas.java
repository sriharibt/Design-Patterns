package com.company.statePattern;

public class Canvas implements Tool{

    Tool currentTool;

    public void setTool(Tool tool) {
        this.currentTool = tool;
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp() {
        currentTool.mouseUp();
    }
}
