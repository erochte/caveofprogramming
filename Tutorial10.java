public class Tutorial10 {
    public static void main(String[] args) {
        int value = 7;

        int[] vaules;
        vaules = new int[3];

        System.out.println(vaules[0]);

        vaules[0] = 10;
        vaules[1] = 20;
        vaules[2] = 30;

        System.out.println(vaules[0]);
        System.out.println(vaules[1]);
        System.out.println(vaules[2]);

        for (int i=0; i<vaules.length; i++) {
            System.out.println(vaules[i]);
        }

        int[] numbers = {5, 6, 7};

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
