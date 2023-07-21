import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees_872 {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {

            // листы интов и метод dfs применительно к н ним;
            // сравниваем листы.
            List<Integer> leaf1 = new ArrayList<>();
            List<Integer> leaf2 = new ArrayList<>();
            dfs(root1, leaf1);
            dfs(root2, leaf2);
            return leaf1.equals(leaf2);

        }
        public void dfs(TreeNode node, List<Integer> leafValues) {
            if (node != null) {
                if (node.left == null && node.right == null) {
                    leafValues.add(node.val);
                    dfs(node.left, leafValues);
                    dfs(node.right, leafValues);
                }


                }
            }
        }



