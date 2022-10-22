import java.util.*;

public class Main {

    static final int SIZE_LIST = 3;

    public static void fillListRandomValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < SIZE_LIST; i++) {
            list.add(random.nextInt(1001));
        }
    }

    public static Integer calculateSumList(List<Integer> list) {
        Integer sum = 0;
        for (int i = 0; i < SIZE_LIST; i++) {
            sum += list.get(i);
        }
        return sum;
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

        for (PhoneBook phone : phones) {
            phoneBook.put(phone.getName(), phone.getPhone());
        }

        for (PhoneBook phone : phones) {
            System.out.println(phoneBook.get(phone.getName()));
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
        cezar.addProduct(banana, 5);
        Recipe kaleidoscope = new Recipe("Калейдоскоп", salat, 2);
        kaleidoscope.addProduct(mayonnaise, 3);
        Recipe milkCocktaile = new Recipe("Молочный коктейль", apple, 5);
        milkCocktaile.addProduct(milk, 2);
        Recipe fructesSalat = new Recipe("Фруктовый салат", kiwi, 4);
        fructesSalat.addProduct(orange, 2);

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(cezar);
        recipes.add(milkCocktaile);
        recipes.add(kaleidoscope);
        recipes.add(fructesSalat);

        System.out.println();
        System.out.println(recipes + "\n");

        CollectionNumbers collection = new CollectionNumbers();

        Numbers number1 = new Numbers("Первый", 111);
        Numbers number2 = new Numbers("Второй", 222);
        Numbers number3 = new Numbers("Третий", 333);
        Numbers number4 = new Numbers("Четвёртый", 444);
        Numbers number5 = new Numbers("Пятый", 555);

        collection.addNumberToCollection(number1);
        collection.addNumberToCollection(number2);
        collection.addNumberToCollection(number3);
        collection.addNumberToCollection(number4);
        collection.addNumberToCollection(number5);
        collection.addNumberToCollection(new Numbers("Пятый", 55));
        collection.addNumberToCollection(new Numbers("Пятый", 66));
//        collection.addNumberToCollection(number4);
        System.out.println(collection + "\n");

        Map<String, List<Integer>> oldCollection = new HashMap<>();
        Map<String, Integer> newCollection = new HashMap<>();

        List<Integer> numbers = new ArrayList<>(SIZE_LIST);
        List<Integer> numbers2 = new ArrayList<>(SIZE_LIST);
        List<Integer> numbers3 = new ArrayList<>(SIZE_LIST);
        List<Integer> numbers4 = new ArrayList<>(SIZE_LIST);
        List<Integer> numbers5 = new ArrayList<>(SIZE_LIST);

        fillListRandomValues(numbers);
        fillListRandomValues(numbers2);
        fillListRandomValues(numbers3);
        fillListRandomValues(numbers4);
        fillListRandomValues(numbers5);

        oldCollection.put("Первый список", numbers);
        oldCollection.put("Второй список", numbers2);
        oldCollection.put("Третий список", numbers3);
        oldCollection.put("Четвёртый список", numbers4);
        oldCollection.put("Пятый список", numbers5);

        System.out.println("Первоначальная коллеция типа <String, List<Integer>>: ");
        for (Map.Entry<String, List<Integer>> entry : oldCollection.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            newCollection.put(entry.getKey(), calculateSumList(entry.getValue()));
        }

        System.out.println();
        System.out.println("Новая коллеция типа <String, Integer>: ");
        for (Map.Entry<String, Integer> entry : newCollection.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        Map<String, Integer> lastTaskInThisLesson = new LinkedHashMap<>();
        lastTaskInThisLesson.put("Время 18:36:20", 0);
        lastTaskInThisLesson.put("Время 18:36:25", 1);
        lastTaskInThisLesson.put("Время 18:36:30", 2);
        lastTaskInThisLesson.put("Время 18:36:35", 3);
        lastTaskInThisLesson.put("Время 18:36:40", 4);
        lastTaskInThisLesson.put("Время 18:36:45", 5);
        lastTaskInThisLesson.put("Время 18:36:48", 6);
        lastTaskInThisLesson.put("Время 18:36:51", 7);
        lastTaskInThisLesson.put("Время 18:36:54", 8);
        lastTaskInThisLesson.put("Время 18:36:57", 9);

        System.out.println();
        int i = 1;

        for (Map.Entry<String, Integer> entry : lastTaskInThisLesson.entrySet()) {
            System.out.println("Запись № " + i + ": " + entry.getKey() + " --> " + entry.getValue());
            i++;
        }

    }
}
