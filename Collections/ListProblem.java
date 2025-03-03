import java.util.TreeSet;

public class ListProblem {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 6, 7, 10};

        TreeSet<Integer> mergedSet = new TreeSet<>();

        for (int num : arr1) {
            mergedSet.add(num);
        }

        for (int num : arr2) {
            mergedSet.add(num);
        }

        // Print the merged sorted set
        System.out.println("merged sorted set: " + mergedSet);
    }

    
}
