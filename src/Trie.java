import java.util.HashMap;

public class Trie {
	Node root;
public Trie() {
        root=new Node('\u0000',false,new HashMap<>());
    }
    
    public void insert(String word) {
    	char[] temp=word.toCharArray();
    	Node tempNode=root;
        for (int i=0;i<word.length();i++)
        {
        	if (!tempNode.mymap.containsKey(temp[i]))
        	{
        		tempNode.mymap.put(temp[i],new Node(temp[i],false,new HashMap<>()));
        	}
        	tempNode=tempNode.mymap.get(temp[i]);
        }
        tempNode.isWord=true;
    }
    
    public boolean search(String word) {
    	char[] temp=word.toCharArray();
    	Node tempNode=root;
        for (int i=0;i<word.length();i++)
        {
        	if (!tempNode.mymap.containsKey(temp[i]))
        	{
        		return false;
        	}
        	tempNode=tempNode.mymap.get(temp[i]);
        }
        if (tempNode.isWord)
        		return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
    	char[] temp=prefix.toCharArray();
    	Node tempNode=root;
        for (int i=0;i<prefix.length();i++)
        {
        	if (!tempNode.mymap.containsKey(temp[i]))
        	{
        		return false;
        	}
        	tempNode=tempNode.mymap.get(temp[i]);
        }
        return true;
    }

}
