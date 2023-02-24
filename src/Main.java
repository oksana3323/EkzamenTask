public class Main {
    public static void main(String[] args){
        Author author1 = new Author("АЛЕКСАНДР СЕРГЕЕВИЧ ПУШКИН","puskin@gmail.com",'m');
        Author author2 = new Author("ЛЕВ НИКОЛАЕВИЧ ТОЛСТОЙ","tolstoi@gmail.com",'m');
        System.out.println(author1);
        System.out.println(author2);

        Book book1 = new Book("Сказка о царе Салтане",author1,1200,34);
        Book book2 = new Book("Повести покойного Ивана Петровича Белкина",author1,900,22);
        Book book3 = new Book("Сказка о рыбаке и рыбке",author1,3000,120);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Book book4 = new Book("Война и мир",author2,3200,30);
        Book book5 = new Book("Анна Каренина",author2,1200,70);
        Book book6 = new Book("Смерть Ивана Ильича",author2,3000,30);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);




    }}

