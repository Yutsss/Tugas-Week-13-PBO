public class Hewan extends MakhlukHidup {
  private String jenis;

  public Hewan(String nama, String jenis) {
    super(nama);
    this.jenis = jenis;
  }

  @Override
  public void bernafas() {
    System.out.println("Hewan bernafas menggunakan paru-paru atau insang");
  }

  @Override
  public void berjalan() {
    System.out.println("Hewan berjalan menggunakan kaki atau sirip");
  }

  public String getJenis() {
    return jenis;
  }

}
