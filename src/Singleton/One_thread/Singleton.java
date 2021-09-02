package Singleton.One_thread;

/*
 * Наивный Одиночка (один поток)
 * https://refactoring.guru/ru/design-patterns/singleton/java/example#example-0
 *
 * Топорно реализовать Одиночку очень просто — достаточно скрыть конструктор и предоставить статический создающий метод.
 *
 * Для многопоточной седы такой вариант не подойдет. См. для многопоточки:
 * https://refactoring.guru/ru/design-patterns/singleton/java/example#example-2
 * */

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
