public class Main {
    public static void main(String[] args) {
        String password = "password=abc123";
        String login = "login=bob";
        String valuePassword = getValue(password);
        String valueLogin = getValue(login);
        System.out.println(valuePassword + "\n" + valueLogin);
        System.out.println("--------------------------------");

        String s = "hello " + "world " + 15 + " " + false;
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ").append("world ").append(15 + " ").append(false);
        String newString = stringBuilder.toString();
        System.out.println(newString);

        StringBuilder reverseSt = stringBuilder.reverse();
        String s1 = reverseSt.toString();
        System.out.println(s1);
        System.out.println("-------------------------------");



        String string = "Hello!!";
        String d = String.valueOf(string.length());
        System.out.println(d);

    }

    public static String getValue(String input) {
        int indexOf = input.indexOf("=");
        String substring = input.substring(indexOf + 1);
        return substring;
    }
}
