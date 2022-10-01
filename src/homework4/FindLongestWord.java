package homework4;

public class FindLongestWord {
    public static void main(String[] args) {
      String str1 = "в предложении все слова разной длины карачубаккалор   ";
      String[] array = str1.trim().split(" ");
      String max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i].length()>max.length()) max = array[i];
        }
        System.out.println("Самое длинное слово в предложении : "+ max);
    }
}
