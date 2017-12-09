public class Thr implements Runnable {
    @Override
    public void run() {
        System.out.println("Please, write text down: ");
        String text = Main.scan.nextLine();
        if(text.equalsIgnoreCase("-1")) {
            Main.exit=true;
            return;
        }
        Main.mprint(text);
        System.out.println("my entered text is : " + text);


    }
}
