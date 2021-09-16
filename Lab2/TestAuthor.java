package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {

        var person1 = new Author("Gena","gena2002@mail.ru",'M');
        var person2 = new Author("Maya","zxc@gmail.com",'F');

        System.out.println(person1.getName());
        System.out.println(person1.getEmail());
        System.out.println(person1.getGender());

        System.out.println(person2.getName());
        System.out.println(person2.getEmail());
        System.out.println(person2.getGender());

        person1.setEmail("GenadiyGorin@yandex.ru");

        System.out.println(person1.getEmail());

        System.out.println(person1);
        System.out.println(person2);
    }
}
