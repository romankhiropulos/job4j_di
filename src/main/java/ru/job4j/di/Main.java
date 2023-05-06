package ru.job4j.di;

/**
 * Here we are using an own context-class
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);
        ui.setStore(context.get(Store.class));

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
