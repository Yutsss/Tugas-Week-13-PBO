public class Main {
    public static void main(String[] args) throws Exception {
        Manusia manusia = new Manusia("Budi", "Dokter");
        Hewan hewan = new Hewan("Kucing", "Mamalia");
        Tumbuhan tumbuhan = new Tumbuhan("Pohon", "Paku");

        manusia.bernafas();
        manusia.berjalan();
        manusia.bekerja();
        manusia.getPekerjaan();
        System.out.println(manusia.getNama());

        hewan.bernafas();
        hewan.berjalan();
        System.out.println(hewan.getJenis());
        System.out.println(hewan.getNama());

        tumbuhan.bernafas();
        tumbuhan.berjalan();
        System.out.println(tumbuhan.getJenis());
        System.out.println(tumbuhan.getNama());
    }
}
