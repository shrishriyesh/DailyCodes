//User function Template for Java

// class Node
// {
//     int data; //data of the node
//     int hd; //horizontal distance of the node
//     Node left, right; //left and right references
 
//     // Constructor of tree node
//     public Node(int key)
//     {
//         data = key;
//         hd = Integer.MAX_VALUE;
//         left = right = null;
//     }
// }


class Tree
{
 
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> out=new ArrayList<>();
    if (root == null) 
            return out;
    if(root.left==null&&root.right==null)
            {
                out.add(root.data);
                return out;
            }     
  
        int hd = 0; 
  
        Map<Integer, Integer> map = new TreeMap<>(); 
  
        Queue<Node> queue = new LinkedList<Node>(); 
  
        root.hd = hd; 
        queue.add(root); 
        int min=0;
        int max=0;
  
        while (!queue.isEmpty()) 
        { 
            Node temp = queue.remove(); 
  
            
            hd = temp.hd; 
  
            min=Math.min(min,hd);
            max=Math.max(max,hd);
            map.put(hd, temp.data); 
  
             
            if (temp.left != null) 
            { 
                temp.left.hd = hd-1; 
                queue.add(temp.left); 
            } 
             
            if (temp.right != null) 
            { 
                temp.right.hd = hd+1; 
                queue.add(temp.right); 
            } 
        } 
  
     
        // Set<Entry<Integer, Integer>> set = map.entrySet(); 
  
         
        // Iterator<Entry<Integer, Integer>> iterator = set.iterator(); 
  
        // while (iterator.hasNext()) 
        // { 
        //     Map.Entry<Integer, Integer> me = iterator.next(); 
        //     System.out.print(me.getValue()+" "); 
        // } 
        for(int i=min;i<=max;i++)
        {
            if(map.containsKey(i))
            out.add(map.get(i));
        }
        return out;
    }
}
