public class Tumbuhan extends MakhlukHidup {
  private String jenis;

  public Tumbuhan(String nama, String jenis) {
    super(nama);
    this.jenis = jenis;
  }

  @Override
  public void bernafas() {
    System.out.println("Tumbuhan bernafas menggunakan daun");
  }

  @Override
  public void berjalan() {
    System.out.println("Tumbuhan tidak bisa bergerak");
  }

  public String getJenis() {
    return jenis;
  }

}
