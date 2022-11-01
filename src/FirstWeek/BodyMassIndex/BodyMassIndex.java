package FirstWeek.BodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.print("Kilo Giriniz (kg): ");
        float weight=inp.nextFloat();
        System.out.print("Boy Giriniz(metre) : ");
        float size= inp.nextFloat();

        float bodyMassIndex;
        bodyMassIndex =weight/ size*size;
        System.out.println("Vücut Kitle Endeksiniz: "+bodyMassIndex);

    }
}
