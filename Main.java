public class Main {
    public static void main(String[] args) {
//        int liczba = 5;
//        int liczba2 = 2;
//
//        System.out.println("Hello World " + liczba);
//
//        String name = "Melisa";
//        int age = 27;
//        System.out.println("My name is " + name + "and I am " + age);
//
//        String account = " Melisa Podgórny ";
//        account.length();
//        System.out.println(account.length());
//
//        System.out.println(account.indexOf('r'));
//        System.out.println(account.substring(1,6));
//        System.out.println(account.trim());
//        System.out.println(account.length());
//
//        char a = 'a';
//        char alpha = '\u03B1';
//        System.out.println(alpha);
//
//        char[] witaj = {'w', 'i', 't', 'a','j'};
//        System.out.println(witaj);
//        Character.isDigit(a);
//        System.out.println( Character.isDigit(a));
//
//        if (liczba>liczba2 & liczba2==liczba){
//            System.out.println("Program działa");
//        }else{
//            System.out.println("Program nie działa");
//            if (liczba==liczba2){
//                System.out.println("System działa");
//
//            }
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Wpisz imię");
//        String userInputName = skaner.nextLine();
//        System.out.println("Wpisz nazwisko");
//        String userInputSurname = skaner.nextLine();
//        System.out.println("Witaj" + userInputName + userInputSurname + "!");
//
//        int number = 3;
//        int number2;
//        System.out.println(number++);
//        System.out.println(++number);
//        System.out.println(number);
//        number2 = number++;
//        System.out.println(number2);
//        number2 = ++number;
//        System.out.println(number2);
//        System.out.println(++number2);


        ArrayList<String> arrayList = new ArrayList<>();
        String[] nameTable = new String[4];
        String[] nameTableBio = {"kasia", "tomasz", "anna", "joanna"};
        System.out.println(nameTableBio);
        for(int i = 0; i < nameTableBio.length; i++){
            System.out.println(nameTableBio[i]);

        }


    }
}
