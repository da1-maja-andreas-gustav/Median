// Version: 20200917
// Handin done by:
//   <202004107> <A. Malthe Henriksen>
//   <201905796> <Maja Vonge Cornils>
// Contributions:
//   <A. Malthe Henriksen> <Programmed exercise.>
//   <Maja Vonge Cornils> <Advice.>

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
        Iterator<Integer> iterator = binaryTree.iterator();

        int i = 0;
        int result = 0;
        int size = binaryTree.size() / 2;

        while (iterator.hasNext() && i<=size) {
            result = iterator.next();
            i++;
        }

        return result;
    }
}