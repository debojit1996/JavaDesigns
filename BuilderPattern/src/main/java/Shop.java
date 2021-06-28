public class Shop {
    public static void main(String[] args) {
        // Traditional way of creating a Phone object as below:
        /* Problems here:
            1. We need to use the exact same order unless we declare different constructors accepting
            args in different order.
            2. We always will have to pass all the values in the constructor( again unless we do some
            constructor overloading)
         */
        Phone newPhone = new Phone("iOS", 8, "MediaTek", 4000, 5.5);
        System.out.println("Traditional phone: "+newPhone);

        /*
          With this builder pattern, we can only set the variables we want to set. Also, the order of
          setting these variables doesn't matter
         */
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setProcessor("Qualcomm Snapdragon 765G")
                .getPhone();
        System.out.println(phone);
    }
}
