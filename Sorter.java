
public class Sorter {
    private static int[] newArray = new int[20];

    public static void main(String[] args) {

        //Min + (int)(Math.random() * ((Max - Min) + 1))

        for (int i = 0; i < 19; i++) {
            newArray[i] = 1 + (int) (Math.random() * ((100 - 1) + 1));
        }
        for (int anArray : newArray) System.out.print(String.valueOf(anArray) + ", ");
        sortLow(newArray);
        sortHigh(newArray);
    }

    private static void sortLow(int[] array){
        for (int length = array.length; length > 0; length--) {
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    numSwitch(array, i, (i - 1));
                }
            }
        }
        System.out.println("");
        System.out.println("After");
        for (int anArray : array) System.out.print(String.valueOf(anArray) + ", ");
    }
    private static void sortHigh(int[] array){
        for (int anArray1 : array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    numSwitch(array, i, (i + 1));
                }
            }
        }
        System.out.println("");
        System.out.println("After");
        for (int anArray : array) System.out.print(String.valueOf(anArray) + ", ");
    }
    private static void numSwitch(int[] anArray, int first, int second){
        int holder = anArray[first];
        anArray[first] = anArray[second];
        anArray[second] = holder;
    }
}
