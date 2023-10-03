package Trie;

public class Trie {
    private static Node root;
    Trie(){
        root = new Node();
    }
    //Insert the word in trie

    public static void insert(String word){
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }

    // Returns if the word is in trie

    public static boolean search(String word){
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        if (node.isEnd()){
            return true;
        }
        return false;
    }

    // Return any word that starts with given prefix

    public static boolean startsWith(String prefix){
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        int n =5;
        int type[] = {1,1,2,3,3};
        String[] values = {"hello","help","helo","hel","hel"};
        Trie trie=new Trie();
        for (int i = 0; i < n; i++) {
            if (type[i]==1){
                trie.insert(values[i]);
            } else if (type[i] == 2) {
                if (trie.search(values[i])){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
            else {
                if (trie.startsWith(values[i])){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
        }
    }
}
