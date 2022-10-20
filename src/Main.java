import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void addCollection(String key, Integer value, HashMap<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey().equals(key) && entry.getValue().equals(value)) {
                throw new RuntimeException("Эта пара уже существует в коллекции!");
            }
            hashMap.put(key, value);
            return;
        }
    }

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        PhoneBook phoneBook1 = new PhoneBook("Иванов Иван", "+79205871111");
        PhoneBook phoneBook2 = new PhoneBook("Петров Пётр", "+79205872222");
        PhoneBook phoneBook3 = new PhoneBook("Сидоров Сидр", "+79205873333");
        PhoneBook phoneBook4 = new PhoneBook("Январский Январь", "+79205874444");
        PhoneBook phoneBook5 = new PhoneBook("Февральский Февраль", "+79205875555");
        PhoneBook phoneBook6 = new PhoneBook("Мартовский Март", "+79205876666");
        PhoneBook phoneBook7 = new PhoneBook("Апрельский Апрель", "+79205876666");
        PhoneBook phoneBook8 = new PhoneBook("Майский Май", "+79205877777");
        PhoneBook phoneBook9 = new PhoneBook("Июньский Июнь", "+79205878888");
        PhoneBook phoneBook10 = new PhoneBook("Июльский Июль", "+79205879999");
        PhoneBook phoneBook11 = new PhoneBook("Августовский Август", "+79205545431");
        PhoneBook phoneBook12 = new PhoneBook("Сентябрьский Сентябрь", "+79205058793");
        PhoneBook phoneBook13 = new PhoneBook("Октябрьский Октябрь", "+79205845463");
        PhoneBook phoneBook14 = new PhoneBook("Ноябрьский Ноябрь", "+79205897975");
        PhoneBook phoneBook15 = new PhoneBook("Декабрьский Декабрь", "+46413247165");
        PhoneBook phoneBook16 = new PhoneBook("Котов Кот", "89233265423");
        PhoneBook phoneBook17 = new PhoneBook("Собачий Собак", "+7132165461");
        PhoneBook phoneBook18 = new PhoneBook("Хомяков Хомяк", "+346412137987");
        PhoneBook phoneBook19 = new PhoneBook("Щенков Щенок", "21346916544");
        PhoneBook phoneBook20 = new PhoneBook("Мурзиковый Мурзик", "541794616164");

        PhoneBook[] phones = {phoneBook1, phoneBook2, phoneBook3, phoneBook4, phoneBook5,
                phoneBook6, phoneBook7, phoneBook8, phoneBook9, phoneBook10,
                phoneBook11, phoneBook12, phoneBook13, phoneBook14, phoneBook15,
                phoneBook16, phoneBook17, phoneBook18, phoneBook19, phoneBook20};

        for (int i = 0; i < phones.length; i++) {
            phoneBook.put(phones[i].getName(), phones[i].getPhone());
        }

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phoneBook.get(phones[i].getName()));
        }

        Product banana = new Product("Банан", 50, 5);
        Product orange = new Product("Апельсин", 100, 4);
        Product apple = new Product("Яблоко", 70, 3);
        Product kiwi = new Product("Киви", 150, 2);
        Product milk = new Product("Молоко", 80, 1);
        Product meat = new Product("Мясо", 300, 0.350);
        Product salat = new Product("Салат", 25, 0.100);
        Product mayonnaise = new Product("Майонез", 125, 0.315);

        Recipe cezar = new Recipe("Цезарь", meat, 3);
        cezar.addProduct(apple, 5);
        Recipe kaleidoscope = new Recipe("Калейдоскоп", salat, 2);
        kaleidoscope.addProduct(mayonnaise, 3);
        Recipe milkCocktaile = new Recipe("Молочный коктейль", apple, 5);
        Recipe fructesSalat = new Recipe("Фруктовый салат", kiwi, 4);
        fructesSalat.addProduct(orange, 4);

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(cezar);
        recipes.add(milkCocktaile);
        recipes.add(kaleidoscope);
        recipes.add(fructesSalat);

        System.out.println();
        System.out.println(recipes);

        HashMap<String, Integer> collection = new HashMap<>();
        collection.put("Первый", 111);
        collection.put("Второй", 222);
        collection.put("Третий", 333);
        collection.put("Четвёртый", 444);
        collection.put("Пятый", 555);

        System.out.println(collection);
        addCollection("Шестой", 666, collection);
        System.out.println(collection);
        addCollection("Второй", 777, collection);
        System.out.println(collection);

    }
}
