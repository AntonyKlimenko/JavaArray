package by.itstep.klimenko.javalessons.lesson18_19.util;

public class Convertor {
    public static String toString(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(" ");
        }

        return builder + "";
    }
}
