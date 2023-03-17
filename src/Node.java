import java.util.Map;

public class Node {
	char val;
	boolean isWord;
	Map<Character,Node>mymap;
	Node(char val ,boolean isWord,Map<Character,Node>mymap){
		this.val=val;
		this.isWord=isWord;
		this.mymap=mymap;
	}
}
