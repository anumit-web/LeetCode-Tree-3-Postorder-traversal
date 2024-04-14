/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    List<Integer> ls = new ArrayList<>();

    public List<Integer> postOrderTraversal(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        // post order        
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        ls.add(root.val);

        return ls;
    }
}
