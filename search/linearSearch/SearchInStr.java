public class SearchInStr {
    public static void main(String[] args) {
        String str = "rahul";
        char target = 'u';
        System.out.println(search2(str, target));;
    }

    static boolean search(String str, char target) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str == null) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
