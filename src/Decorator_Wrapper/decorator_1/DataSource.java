package Decorator_Wrapper.decorator_1;

/*
* https://javarush.ru/quests/lectures/questcore.level08.lecture06?post=full#discussion
*
* Диаграмма: https://refactoring.guru/ru/design-patterns/decorator
* Пример: https://refactoring.guru/ru/design-patterns/decorator/java/example
*
* Компонент задаёт общий интерфейс обёрток и оборачиваемых объектов.
Конкретный компонент определяет класс оборачиваемых объектов. Он содержит какое-то базовое поведение, которое потом изменяют декораторы.
Базовый декоратор хранит ссылку на вложенный объект-компонент. Им может быть как конкретный компонент, так и один из конкретных декораторов. Базовый декоратор делегирует все свои операции вложенному объекту. Дополнительное поведение будет жить в конкретных декораторах.
Конкретные декораторы — это различные вариации декораторов, которые содержат добавочное поведение. Оно выполняется до или после вызова аналогичного поведения обёрнутого объекта.
Клиент может оборачивать простые компоненты и декораторы в другие декораторы, работая со всеми объектами через общий интерфейс компонентов.
*
* */

// Интерфейс, задающий базовые операции чтения и записи данных
public interface DataSource {
    void writeData(String data);

    String readData();
}
