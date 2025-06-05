package DepoUygulamasi;

import java.util.HashMap;
import java.util.Map;

// Tüm ürünleri saklamak için map
public class VeriTabani {
    public static Map<Integer, Urun> urunler = new HashMap<>();
    public static int idSayac = 1000; // Otomatik artan Id giriş olarak 1000 secilir.
}

