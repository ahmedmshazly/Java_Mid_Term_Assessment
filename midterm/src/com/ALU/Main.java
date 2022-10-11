package com.ALU;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


// First thing first you have three lights, represents three methods in our class, Red , Green , and Yellow
// The red is called first, then when it is done it calls the green then when the green is done it calls the yellow and so on.
// The red light add a car each second to the qeueu, with respect to our limts of 100 car on the Q. No car moves out of the Q while it is red.
// The Green light add a car each second and remove a car in the same second, and the number on the Q doesn't affect, car come car go 30 times in 30 seconds.
// The yellow light (10 sec) moves a car each 2 seconds and add a car each one sec, (one sec is our default to add a car)
// All of the above is with repeat to our limits .
// when we reach 100, we either do nothing for 20 sec (when red light), or move a car then add a car every second (loop when it is green), or we move a car and add a car every 2 seconds (when yellow light).

// The application also generate random objects of cars each time it adds a car to the line.



class Traffic_lights
{
    public static ArrayList<String> cars = new ArrayList<>();
    public static Random rand = new Random();
    public static int traffic_max = 100;
    public static int count = 1;
    static Thread thread = new Thread();
    public static String[] models = {"Volvo", "BMW", "Ford", "Mazda"};
    public static String[] colors = {"Black", "Blue", "Red", "Yellow", "Green", "White", "Silver", "Gold", "Brown"};
    public static int counter;



    public static void red_light() throws InterruptedException

    {
        System.out.println("###################################################");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!Red Light!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("###################################################");

        if (count == 1)
        {
            for (int i = 1; i < 21; i++)
            {

                thread.sleep(1000);
                if (cars.size() + 1 <= traffic_max)
                {
                    int x = rand.nextInt(models.length);
                    int y = rand.nextInt(colors.length);
                    String _car = String.format("%s %s", colors[y], models[x]); // Generate random cars
                    cars.add(_car);
                    System.out.println( _car + " joined the queue | " + " Traffic has  " + cars.size() + " cars, ");
                    if (cars.size() == traffic_max)
                    {
                        count = 0;
                    }
                }
            }
        }
        else if (count == 0 || cars.size() == 100) // checks if the array size is 100.
        {
            System.out.print("There are 100 cars in the Array,");
            System.out.println(" Code wont be executed for 20 seconds");
            // No cars moves for 20 seconds.
            for (int i = 1; i < 21; i++)
            {
                thread.sleep(1000);
            }
        }
        green_light();
    }

    public static void green_light() throws InterruptedException
    {
        System.out.println("###################################################");
        System.out.println("|||||||||||||||||||||Green Light|||||||||||||||||||||");
        System.out.println("###################################################");

        for (int i = 1; i < 31; i++) //The for loop to control the waiting time in each light.
        {
            counter ++; //I just fixed a bug with it, ignore

            thread.sleep(1000);
            if ((cars.size() != 0)&&(cars.size()  + 1 <= traffic_max))
            {
                int x = rand.nextInt(models.length);
                int y = rand.nextInt(colors.length);
                String _car = String.format("%s %s", colors[y], models[x]);
                System.out.println( _car + " joined the queue | " + cars.get(0) + " left the queue | " + " Traffic has  " + cars.size() + " cars, ");
                cars.add(_car);
                cars.remove(0);
            } else if (cars.size() == 0)
            {
                System.out.println("cars in traffic: " + cars.size());
                System.exit(0);
            }
            if ((cars.size() >= traffic_max-1) && (counter < 30)) { // if the size is already 100, and the green light still on, it moves our a car and doesn't take one in // The same for other lights
                System.out.println("cars in traffic: " + (cars.size()-1) + " ," + cars.get(0) + "has been moved, No cars joined");
                cars.remove(0);
            }
            else { //if it is 100 and the light timer is done // The same for other lights
                count = 0;
                counter = 0;
            }
        }

        yellow_light();
    }

    public static void yellow_light() throws InterruptedException
    {
        System.out.println("###################################################");
        System.out.println("|||||||||||||||||||||Yellow Light|||||||||||||||||||||");
        System.out.println("###################################################");
        for (int i = 1; i < 6; i++)
        {
            counter ++;
            thread.sleep(2000);
            if ((cars.size() != 0)&&(cars.size()  + 1 <= traffic_max))
            {
                int x = rand.nextInt(models.length);
                int y = rand.nextInt(colors.length);
                String _car = String.format("%s %s", colors[y], models[x]);
                cars.add(_car);
                cars.add(_car);
                System.out.println( _car + " and one other joined the queue | " + cars.get(0) + " left the queue | " + " Traffic has  " + cars.size() + " cars, ");
                cars.remove(0);
            } else if (cars.size() == 0)
            {
                System.out.println("cars in traffic: " + cars.size());
                System.exit(0);
            }
            if ((cars.size() >= traffic_max-1) && (counter < 30)) {
                System.out.println("cars in traffic: " + (cars.size()-1) + " ," + cars.get(0) + "has been moved, No cars joined");
                cars.remove(0);

            }
            else {
                count = 0;
                counter = 0;
            }
        }

        red_light();
    }


    public static void main(String[] args) throws InterruptedException
    {
        red_light();
        green_light();
        yellow_light();
    }
}
