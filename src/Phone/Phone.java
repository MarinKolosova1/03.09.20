package Phone;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + "(" + number + ")");
    }

    public String getNumber(){
        return this.number;
    }

    //∎Создать метод sendMessage с аргументами переменной длины.
    //Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    public void sendMessage(String ... addressees){
        System.out.println("Список получателей:");
        for (String addressee : addressees) {
            System.out.println(" - " + addressee);
        }
    }
}
