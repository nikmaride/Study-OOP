package com.company;


public class Main {

    public static void main(String[] args) {
        class Family {
            int nap = 80;
            int food = 900;
            int health = 90;
            int power = 100;

            void Sleep () {
                power -= 10;
                nap += 10;
            }
            void eat () {
                if (food > 100) {
                    power += 20;
                    food += 30;
                } else {
                    health -=30;
                }
            }
            void mobility () {
                System.out.println("TRY");
            }
        }
        class Father extends Family {
            private int money;
            void work (){
                System.out.println("I AM VERY BUSY");
            }
            public int getMoney() {
                return money;
            }
        }
    }
    }

