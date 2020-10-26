public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setProcessor("Qualcomm Snapdragon 765G")
                .getPhone();
        System.out.println(phone);
    }
}
