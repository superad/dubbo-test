package service;

import lombok.extern.slf4j.Slf4j;
import model.TreeNode;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by fgm on 2016/6/7.
 */
@Slf4j
public class ExecuteService {

    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        invoke();
    }


    public static void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        SearchService searchService=new SearchService();
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

        Object o=searchService.getClass().getMethod("binaryTreePaths",TreeNode.class).invoke(searchService,root);
        log.info("{}",o);
    }

}
