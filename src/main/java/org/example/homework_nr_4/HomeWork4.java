package org.example.homework_nr_4;

public class HomeWork4 {

    // 18 22 1 7 9
    public static void main(String[] args){
        int[] array = new int[5];
        array[0] = 18;
        array[1] = 22;
        array[2] = 1;
        array[3] = 795;
        array[4] = 9;

        for(int index = 0; index != array.length; index++){
            System.out.println(array[index]);

        }
        System.out.println("----------------------------------------");

            // 69 3 58 18
            int[] array2 = new int[4];
            array2[0] = 69;
            array2[1] = 4;
            array2[2] = 58;
            array2[3] = 18;
            int sum = 0;
            for(int number = 0; number != array2.length; number++ ){
                System.out.println(array2[number]);

                sum = sum + array2[number];
            }
            System.out.println(" Сумма всех элементов массива равна: " + sum);

            // Среднее значение элементов массива
            for (int number = 0; number < args.length; number++){
                sum += array2[number];
            }
            double average = (double)  sum / array2.length;
        System.out.println(" Среднее значение элементов массива равно: " + average);

            // 12 58 64 2  4 8
            // 5  1  7  85 9 6
            // 7  98 8  1  4 5

            int[][] biArray = new int[][]{
                    {12, 55, 63, 2, 4, 8},
                    {5, 1, 7, 85, 9, 6},
                    {7, 98, 8, 1, 4, 5}
            };
            System.out.println();

        for (int j = 0; j != biArray.length; j++){
            for (int i = 0; i != biArray[j].length; i++){
                System.out.print(biArray[j][i] + " ");
            }
            System.out.println();
        }
        // Вывод на экран всех четных элементов массива
        System.out.println(" Четные элементы массива: ");

        for (int j = 0; j != biArray.length; j++){
            for (int i = 0; i != biArray[j].length; i++){
                if (biArray[j][i] % 2 == 0){
                    System.out.println(biArray[j][i]);
                }
            }
        }
        // Вывод на экран всех не четных элементов массива
        System.out.println(" Не четные элементы массива: ");

               for (int j = 0; j != biArray.length; j++){
            for (int i = 0; i != biArray.length; i++){
                if (biArray[j][i] % 2 != 0){
                    System.out.println(biArray[j][i]);
                }
            }
        }
        System.out.println("----------------------------------------");
               // Массив с именами
               String[] namesArray = new String[] {"Victor", "Stas", "Pavel", "Alex" };
               for (int i = 0; i != namesArray.length; i++){
                   System.out.println(namesArray[i]);
               }
               String[] copyNames = namesArray;
               for (int i = 0; i != copyNames.length; i++){

                   System.out.print("Скопированные элементы массива String: ");
                   System.out.println(copyNames[i]);


               }


        }
    }

