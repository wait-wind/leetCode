package leetcode.editor.cn;

import lombok.Builder;
import lombok.Data;

/**
 * @author panjihang
 * @Description TODO
 * @Date 2021/9/5 10:18 下午
 */
@Builder
@Data
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }
}
