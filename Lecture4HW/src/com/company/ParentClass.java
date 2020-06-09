package com.company;

public class ParentClass {
        int upperlimit;
        int lowerlimit;

    public ParentClass(int lowerlimit, int upperlimit) {
        this.upperlimit = upperlimit;
        this.lowerlimit = lowerlimit;
    }

    public void printLimits(){
            for(int i = lowerlimit; i<= upperlimit; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public void multiply(){
            int product = 1;
            for(int i = lowerlimit; i<= upperlimit; i++){
                System.out.print(i + " ");
                product *= i;
            }
            System.out.println("\nThe product of given numbers is: "+ product);
            System.out.println();
        }

}
