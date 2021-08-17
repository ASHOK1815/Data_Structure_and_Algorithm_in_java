package BinearyTrees;

import java.awt.*;
import java.util.Queue;
import java.util.Scanner;

class BinearyNode{

        public int data;
        public BinearyNode left;
        public BinearyNode right;

        BinearyNode(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

         public static BinearyNode getdata(int data)
         {
             BinearyNode temp = new BinearyNode(data);
             return  temp;
         }

         public static int height(BinearyNode root)
         {
             if(root == null) return 0;
             else
             {
                 int leftindex = height(root.left);
                 int rightindex = height(root.right);

                 return Math.max(leftindex,rightindex)+1;
             }

         }

         public static BinearyNode insertData(BinearyNode root,int data)
         {
             if(root == null)
             {
                 root = getdata(data);
             }
             else if(data<root.data)
             {
                 root.left = insertData(root.left,data);
             }
             else if(data> root.data)
             {
                 root.right = insertData(root.right,data);
             }

             return root;
         }


         public static void displayInorder(BinearyNode root)
         {
             if(root == null)return;;
             displayInorder(root.left);
             System.out.print(root.data+" ");
             displayInorder(root.right);

         }

         public static boolean search(BinearyNode root,int data)
         {
             if(root ==  null) return false;
             else if(root.data == data) return true;
             else if(data < root.data) return search(root.left,data);
             else return search(root.right,data);
         }

         public static int countNodes(BinearyNode root)
         {
             if(root == null) return 0;
             else
             {
                 return countNodes(root.left)+countNodes(root.right)+1;
             }

         }


         public static void  LevelOrderTraversal(BinearyNode root)
         {
             java.util.Queue<BinearyNode> queue = new java.util.LinkedList<BinearyNode>() ;
             queue.add(root);
             queue.add(null);
             while (!queue.isEmpty())
             {
                 BinearyNode current = queue.poll();
                 if (current == null) {
                     if (!queue.isEmpty()) {
                         queue.add(null);
                         System.out.println();
                     }
                 }
                 else
                 {
                     if(root.left != null)
                     {
                         queue.add(root.left);
                     }
                     if(root.right != null)
                     {
                         queue.add(root.right);
                     }

                     System.out.print(current.data+" ");

                 }
             }
         }



    }
public class BinearyTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinearyNode root = null;

        root = BinearyNode.insertData(root,15);
        root = BinearyNode.insertData(root,14);
        root = BinearyNode.insertData(root,13);
        root = BinearyNode.insertData(root,12);
        root = BinearyNode.insertData(root,16);
        root = BinearyNode.insertData(root,17);

        BinearyNode.displayInorder(root);

        System.out.println("\nEnter the element you want to search for ");
        int k = scanner.nextInt();

        if(BinearyNode.search(root,k))
        {
            System.out.println("Element present in the tree");
        }
        else
        {
            System.out.println("Element not present in the tree");
        }

        System.out.println("\nThe height of the bineary tree is "+BinearyNode.height(root));
        System.out.println("\nThe total number of the nodes in the tree "+BinearyNode.countNodes(root));









    }
}
