package service;

import lombok.extern.slf4j.Slf4j;
import model.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fgm on 2016/6/5.
 *
 * Binary Tree Paths
 */
@Slf4j
public class SearchService {


    public List<String> binaryTreePaths(TreeNode root){
        List<String> res=new ArrayList<String>();
        String str=root.val+"";
        helper(res,root,str);
        return res;
    }

    public void helper(List<String> res,TreeNode root,String str){
        if(root.left==null&&root.right==null){
            res.add(str);
            return;
        }
        if(root.left!=null){
            helper(res, root.left, str+"->"+root.left.val);
        }
        if(root.right!=null){
            helper(res,root.right,str+"->"+root.right.val);
        }

    }

    @Test
    public void test(){
        TreeNode root=new TreeNode();
        TreeNode left=new TreeNode();
        TreeNode right=new TreeNode();
        root.setLeft(left);
        root.setRight(right);
        root.setVal("1");
        left.setVal("2");
        right.setVal("3");
        TreeNode right2=new TreeNode();
        left.setRight(right2);
        right2.setVal("5");
        List<String> list=binaryTreePaths(root);
        log.info("list==>"+list);

    }



}
