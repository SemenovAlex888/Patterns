package Decorator_Wrapper.decorator_1;

// Базовый декоратор
/*
* Базовый декоратор хранит ссылку на вложенный объект-компонент. Им может быть как конкретный компонент,
* так и один из конкретных декораторов. Базовый декоратор делегирует все свои операции вложенному объекту.
* Дополнительное поведение будет жить в конкретных декораторах.
* */
public class DataSourceDecorator implements DataSource{
    private DataSource wrappee; // хранит ссылку на вложенный объект-компонент.

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
