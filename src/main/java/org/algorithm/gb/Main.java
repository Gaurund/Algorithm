package org.algorithm.gb;



public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashIsNtCash = new HashMap<>(4);

         String ret = hashIsNtCash.put("+79001112233", "Андрей");
        ret = hashIsNtCash.put("+79001112232", "Василий");
        ret = hashIsNtCash.put("+79001112234", "Александр");
        ret = hashIsNtCash.put("+79001112235", "Прокопий");
        ret = hashIsNtCash.put("+79001112236", "Фавст");
        ret = hashIsNtCash.put("+79001112237", "Амфибрахий");
        ret = hashIsNtCash.put("+79001112212", "Доменико");
        ret = hashIsNtCash.put("+79001112213", "Модуньо");
        ret = hashIsNtCash.put("+79001112214", "Воларе");

        for (var e : hashIsNtCash  ) {
            System.out.println(e);
        }

    }
}