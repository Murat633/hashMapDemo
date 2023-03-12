import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String, String>();

        sozluk.put("book","Kitap");
        sozluk.put("table","Masa");
        sozluk.put("Computer","Bilgisayar");

        // sozluk.remove("table");


        for (String item:sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }
    }
}