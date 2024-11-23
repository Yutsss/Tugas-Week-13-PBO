public abstract class MakhlukHidup {
  private String nama;

  public MakhlukHidup(String nama) {
    this.nama = nama;
  }

  public void bernafas() {
    System.out.println("Makhluk hidup bernafas");
  }

  public void berjalan() {
    System.out.println("Tidak semua makhluk hidup bisa berjalan");
  }

  public String getNama() {
    return nama;
  }
}