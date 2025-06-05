package DepoUygulamasi;

public class Urun // Ürün sınıfı, her ürün nesnesinin bilgilerini tutar.
{
    private int id;              // Ürün ID'si (otomatik verilir)
    private String urunIsmi;     // Ürün adı
    private String uretici;      // Üretici firma adı
    private int miktar;          // Ürünün mevcut miktarı
    private String birim;        // Ürünün birimi (örneğin: çuval, kg)
    private String raf;          // Ürünün bulunduğu raf (başlangıçta null)

    // Constructor - ürün tanımlanması sırasında
    public Urun(int id, String urunIsmi, String uretici, String birim) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar = 0;     // Başlangıç miktarı sıfır
        this.raf = null;     // Raf başlangıçta boş
    }

    // Getter ve Setter metotları
    public int getId()
    { return id;
    }
    public String getUrunIsmi()
    { return urunIsmi;
    }
    public String getUretici()
    { return uretici;
    }
    public int getMiktar()
    { return miktar;
    }
    public String getBirim()
    { return birim;
    }
    public String getRaf()
    { return raf;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    public void setRaf(String raf) {
        this.raf = raf;
    }

    // Ürün bilgilerinin tablo formatında gösterilmesi için.
    @Override
    public String toString() {
        return String.format("%-6d %-10s %-12s %-8d %-10s %-6s",
                id, urunIsmi, uretici, miktar, birim, (raf == null ? "-" : raf));
    }
}
