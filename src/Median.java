// Version: 20200917
// Handin done by:
//   <202004107> <A. Malthe Henriksen>
// Contributions:
//   <A. Malthe Henriksen> <Programmed exercise.>

import java.io.*;
import java.util.*;

public class Median {
    // Add your private fields here

    private TreeSet<Integer> binaryTree;


    public Median() {
        binaryTree = new TreeSet<>();
    }

    public void add(int x) {
        // Implement your method to add x to the data structure
        binaryTree.add(x);
    }

    public int median() {
        // Implement your method to return the median of the numbers added so far
        int size = binaryTree.size();
        int next = 0;
        for (int i = 0; i <= size/2; i++) {
            if (!binaryTree.contains(next)) {
                next = binaryTree.ceiling(next);
            } else {
                next = binaryTree.ceiling(next+1);
            }
        }

        return next;
    }
}