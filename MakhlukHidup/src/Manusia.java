public class Manusia extends MakhlukHidup {
  private String pekerjaan;

  public Manusia(String nama, String pekerjaan) {
    super(nama);
    this.pekerjaan = pekerjaan;
  }

  @Override
  public void bernafas() {
    System.out.println("Manusia bernafas menggunakan paru-paru");
  }

  @Override
  public void berjalan() {
    System.out.println("Manusia bergerak menggunakan kaki");
  }

  public void bekerja() {
    System.out.println("Manusia bekerja");
  }

  public String getPekerjaan() {
    return pekerjaan;
  }
}