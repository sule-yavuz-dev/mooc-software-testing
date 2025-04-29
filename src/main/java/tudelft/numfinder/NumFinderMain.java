package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        //this works
        nf.find(new int[]{4, 25, 7, 9});
        System.out.println("Normal input: ");
        System.out.println("Max: " + nf.getLargest());
        System.out.println("Min: " + nf.getSmallest());

        // this crashes
        try {
            nf.find(null);
            System.out.println("Null input: ");
            System.out.println("Max: " + nf.getLargest());
            System.out.println("Min: " + nf.getSmallest());
        } catch (Exception e) {
            System.out.println("Null input caused error: " + e);
        }
    }
}
