package Decorator_Wrapper.decorator_1;

import java.util.Base64;

// Декоратор шифрования
/*
* Конкретные декораторы — это различные вариации декораторов, которые содержат добавочное поведение.
* Оно выполняется до или после вызова аналогичного поведения обёрнутого объекта.
* */
public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
