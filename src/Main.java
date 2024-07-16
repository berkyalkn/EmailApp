public class Main {

    public static void main(String[] args) {

        Email berkay = new Email("Berkay", "Alkan");

        berkay.setMailboxCapacity(400);
        berkay.changePassword("berkay07");
        berkay.setAlternateEmail("berky.alknn@gmail.com");

        System.out.println(berkay.getMailboxCapacity());
        System.out.println(berkay.getPassword());
        System.out.println(berkay.getAlternateEmail());
    }
}
