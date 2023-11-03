public class Tugas4 {
    public static void main (String[] args){
        String[] tugas = {"Tugas pancasila bab 3", "Tugas PTIK PPT", "Tugas Coding", "Tugas sistem digital", "Tugas besar PSM"};
        System.out.println("Daftar Tugas:");
        for (int i = 0; i < tugas.length; i++) {
            System.out.println((i + 1) + ". " + tugas[i]);
        }
    }
}
