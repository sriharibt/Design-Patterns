package com.company;

import com.company.Builder.Desktop;
import com.company.SingletonPattern.Logger;
import com.company.SingletonPattern.LoggerLazy;
import com.company.adapter.StudentClient;
import com.company.memento.Editor;
import com.company.memento.History;
import com.company.observer.EmailSubscriber;
import com.company.observer.Notifier;
import com.company.observer.Subscriber;
import com.company.observer.WhatsappSubsriber;
import com.company.statePattern.BrushTool;
import com.company.statePattern.Canvas;
import com.company.statePattern.ErraserTool;

public class Main {


    private void mememtoPattern() {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A");
        history.push(editor.saveState());

        editor.setContent("B");
        history.push(editor.saveState());

        editor.setContent("C");
        editor.restore(history.undo());

        editor.restore(history.undo());

        System.out.println(editor.getContent());
    }


    public void statePattern() {
        Canvas canvas = new Canvas();
        canvas.setTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setTool(new ErraserTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }

    private void observerPattern() {

        Subscriber emailSubscriber1 = new EmailSubscriber();
        Subscriber whatsappSubscriber1 = new WhatsappSubsriber();

        Notifier notifier = new Notifier();
        notifier.register(emailSubscriber1);
        notifier.register(whatsappSubscriber1);

        notifier.notify("Hi Subsribers");

        System.out.println(emailSubscriber1.getMessage());

        notifier.unregister(emailSubscriber1);
        notifier.notify("New new message");

        System.out.println(emailSubscriber1.getMessage());
        System.out.println(whatsappSubscriber1.getMessage());
    }

    private void adapterPattern() {
        StudentClient client = new StudentClient();
        System.out.println(client.getStudentList());
    }

    private void singeltonPattern() {
        Logger logInstance = Logger.getInstance();

        System.out.println(logInstance);

        Logger logInstance2 = Logger.getInstance();
        System.out.println(logInstance2);


        LoggerLazy loggerLazy = LoggerLazy.getInstance();
        System.out.println(loggerLazy);

        LoggerLazy loggerLazy2 = LoggerLazy.getInstance();
        System.out.println(loggerLazy2);
    }
    public static void main(String[] args) {

        Desktop desktop = Desktop.builder().ram("16gb").build();
        System.out.println(desktop.toString());

    }
}
