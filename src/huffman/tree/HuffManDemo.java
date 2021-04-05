package huffman.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffManDemo {
    public static void main(String[] args) {
//        String a = "fcafd";
//        char[] arr = a.toCharArray();
//        System.out.println((int)'a');
        int[] arr = {13,7,8,3,29,6,1};
        Node root = createHuffmanTree(arr);
        preOrder(root);
    }
    public static void preOrder(Node root){
        if(root==null){
            System.out.println("树空，不能遍历");
        }else{
            root.preOrder();
        }
    }
    public static Node createHuffmanTree(int[] arr) {
        List<Node> nodes = new ArrayList<>();
        for(int value:arr){
            nodes.add(new Node(value));
        }
        while(nodes.size() > 1) {
            //排序, 从小到大
            Collections.sort(nodes);

            System.out.println("nodes="+nodes);
            //取出第一颗最小的二叉树
            Node leftNode = nodes.get(0);
            //取出第二颗最小的二叉树
            Node rightNode = nodes.get(1);
            //创建一颗新的二叉树,它的根节点 没有data, 只有权值
            Node parent = new Node( leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;

            //将已经处理的两颗二叉树从nodes删除
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            //将新的二叉树，加入到nodes
            nodes.add(parent);

        }
        //nodes 最后的结点，就是赫夫曼树的根结点
        return nodes.get(0);

    }
}

class Node implements Comparable<Node>{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrder();
        }
        if(this.right!=null) {
            this.right.preOrder();
        }
        }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return this.value-o.value;
    }

    }

