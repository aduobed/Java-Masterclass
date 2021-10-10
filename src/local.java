public class local {
    public static void main(String[] args) {
// using math.random() to print random numbers
        double rand = Math.random();
        System.out.println("" + rand);

        //Converting the random number to integer
        double n = (int) (Math.random() * 10);
        System.out.println(n);

        //Generating numbers from 0-100 to check whether even or odd
        for (int i = 0; i <= 100; i++) {
            int num = i;
            if ((num % 2) == 0) {
                System.out.println(num + " is even");
            } else System.out.println(num + " is odd");
        }

        //Using modulo to check for particular cases
        for (int i = 0; i <= 100 ; i++) {
            int num = i;
            if (num == 0) {
                System.out.println("frozen");
            } else if (num == 1 && num < 15){
                System.out.println("cold");
            } else if (num > 14 && num < 25){
                System.out.println("cool");
            } else if (num > 24 && num < 41) {
                System.out.println("warm");
            } else if (num > 40 && num < 61) {
                System.out.println("hot");
            } else if (num > 60 && num < 81) {
                System.out.println("very hot");
            } else if (num > 80 && num < 100) {
                System.out.println("extremely hot");
            } else {
                System.out.println("boiling");
            }
        }

        //Generating a random number[0-9] and print its name
        for (int i = 0; i <= 9; i++) {
            int isRandomNum = (int) (Math.random() * i);

            switch (isRandomNum) {
                case 1:
                    System.out.println(isRandomNum + " one");
                    break;
                case 2:
                    System.out.println(isRandomNum + " two");
                    break;
                case 3:
                    System.out.println( isRandomNum +" three");
                    break;
                case 4:
                    System.out.println( isRandomNum +" four");
                    break;
                case 5:
                    System.out.println(isRandomNum + " five");
                    break;
                case 6:
                    System.out.println( isRandomNum +" six");
                    break;
                case 7:
                    System.out.println(isRandomNum +" seven");
                    break;
                case 8:
                    System.out.println(isRandomNum +" eight");
                    break;
                case 9:
                    System.out.println(isRandomNum +" nine");
                    break;
            }
        }

        //using a do-while loop to generate random numbers and stop when zero
        int min = -3;
        int max = 3;
        int num = 0;
//
        do {
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(random_int);
            num = random_int;
        } while(num != 0);

        //using a while loop to generate random numbers and stop when zero
        while (num != 0) {
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(random_int);
            num += random_int;
        }
        }
    }

