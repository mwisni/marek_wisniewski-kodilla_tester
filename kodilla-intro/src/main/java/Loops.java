public class Loops {
    public static void main(String[] args) {
        Loops metod = new Loops();
        int [] table = new int[] {3,6,15};

        System.out.println(metod.sumNumbers(table));
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }
        public int sumNumbers(int[] numbers) {
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;
        }

}
