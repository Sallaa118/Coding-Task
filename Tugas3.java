import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Isi pertanyaan di bawah ini untuk menentukan zodiakmu");
        System.out.print("Kamu lahir bulan berapa? ");
        int bulan = input.nextInt();
        System.out.print("Terus lahir tanggal berapa? ");
        int tanggal = input.nextInt();

        String zodiak = "";
        String bohong = "";

        if (bulan == 12) {
            if (tanggal < 22)
                zodiak = "Sagitarius";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Capricorn";
        }
        else if (bulan == 1) {
            if (tanggal < 20)
                zodiak = "Capricorn";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Aquarius";
        }
        else if (bulan == 2) {
            if (tanggal < 19)
                zodiak = "Aquarius";
            else if (tanggal > 29)
                bohong = "zonkkk";
            else
                zodiak = "Pisces";
        }
        else if(bulan == 3) {
            if (tanggal < 21)
                zodiak = "Pisces";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Aries";
        }
        else if (bulan == 4) {
            if (tanggal < 20)
                zodiak = "Aries";
            else if (tanggal > 30)
                bohong = "zonkkk";
            else
                zodiak = "Taurus";
        }
        else if (bulan == 5) {
            if (tanggal < 21)
                zodiak = "Taurus";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Gemini";
        }
        else if( bulan == 6) {
            if (tanggal < 21)
                zodiak = "Gemini";
            else if (tanggal > 30)
                bohong = "zonkkk";
            else
                zodiak = "Cancer";
        }
        else if (bulan == 7) {
            if (tanggal < 23)
                zodiak = "Cancer";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Leo";
        }
        else if( bulan == 8) {
            if (tanggal < 23)
                zodiak = "Leo";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Virgo";
        }
        else if (bulan == 9) {
            if (tanggal < 23)
                zodiak = "Virgo";
            else if (tanggal > 30)
                bohong = "zonkkk";
            else
                zodiak = "Libra";
        }
        else if (bulan == 10) {
            if (tanggal < 23)
                zodiak = "Libra";
            else if (tanggal > 31)
                bohong = "zonkkk";
            else
                zodiak = "Scorpio";
        }
        else if (bulan == 11) {
            if (tanggal < 22)
                zodiak = "Scorpio";
            else if (tanggal > 30)
                bohong = "zonkkk";
            else
                zodiak ="Sagitarius";
        }
        else if (bulan > 12) {
            if (tanggal > 30)
                bohong = "zonkkk";
        }
        System.out.println("Selamaatt zodiak kamu : "+ zodiak);
        System.out.println("Terimakasih sudah mengisi dengan benar ;)");
        System.out.println("Kalo kosong, berarti kamu ga punya zodiak hehe... " + bohong);
    }
}

