package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Does your car remain silent when you turn the key? (y/n)");
        String ans1 = input1.nextLine();
        if(ans1.equals("y")){
            Scanner input2 = new Scanner(System.in);
            System.out.println("Are the battery terminals corroded? (y/n)");
            String ans2 = input2.nextLine();
            if(ans2.equals("y")){
                System.out.println("Clean terminals and start over.");
            }
            else{
                System.out.println("Replace cables and start over.");
            }

        }
        else{
            Scanner input3 = new Scanner(System.in);
            System.out.println("Does the car make a slicking noise? (y/n)");
            String ans3 = input3.nextLine();

            if(ans3.equals("y")){
                System.out.println("Replace the battery and start over.");
            }
            else{
                Scanner input4 = new Scanner(System.in);
                System.out.println("Does the car crank up but not start? (y/n)");
                String ans4 = input4.nextLine();
                if(ans4.equals("y")){
                    System.out.println("Replace spark plugs and start over.");

                }
                else{
                    Scanner input5 = new Scanner(System.in);
                    System.out.println("Does the engine start and then die? (y/n)");
                    String ans5 = input5.nextLine();
                    if(ans5.equals("y")){
                        Scanner input6 = new Scanner(System.in);
                        System.out.println("Does your car have fuel injection? (y/n)");
                        String ans6 = input6.nextLine();
                        if(ans6.equals("y")){
                            System.out.println("Get it for service.");
                        }
                        else{
                            System.out.println("Check the choke.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
