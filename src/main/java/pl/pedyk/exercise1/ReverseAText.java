package pl.pedyk.exercise1;

public class ReverseAText {

    public static String reverseAText(String text) {
        if (text == null) {
            return "";
        }
        char[] array = text.toCharArray();
        final int halfLength = array.length/2;
        char clipboard;

        for (int indx1 = 0; indx1 < halfLength; indx1++) {
            clipboard = array[indx1];
            array[indx1] = array[array.length -1 - indx1];
            array[array.length - 1 - indx1] = clipboard;
        }
        return String.valueOf(array);
    }


}
