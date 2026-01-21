import java.util.*;

public class SearchEngineProject
 {
    static class TrieNode
     {
    TrieNode children []= new TrieNode[26];
    boolean isEndOfWord= false;

   static class Trie
   {
      trieNode curr = root;
   }
     trie()
     {
        for(int i=0; i<26; i++)
        {

        children[i]= null; // initially all the idx is stored with null 
        }
     }
public static TrieNode root = new TrieNode(); // root node will be null or empty 

}

// INSERT FUNCTION

public static void insert(String words){
    TrieNode curr = root;
    for(int level =0; level< words.length (); level++)
    {
        int idx = words.charAt(curr.children[idx])-'a'; // idx is identified 
        if(curr.children[idx]==null) // idx will be null initially
          {
            curr.children[idx]= new TrieNode();
          }
          curr=curr.children[idx]; // update
    }
      curr.eow=true; // set endOfWord to true
}

// SEARCH FUNCTION

public static boolean search(String key){
     TrieNode curr = root;
    for(int level =0; level< key.length (); level++)
    {
        int idx = key.charAt(curr.children[idx])-'a'; 
        if(curr.children[idx]==null) 
          {
           return false;
          }
          curr=curr.children[idx]; // update
    }
      return curr.eow==true;
}
// AUTO SUGGESTLOGIC FUNCTION

 public static void autoSuggest(String prefix){
    TrieNode current = root;
    for (int i = 0; i < prefix.length(); i++) {
     int idx = prefix.charAt(curr.children[i])-'a'; // return idx
     if(curr.children[i]==null){
        System.out.print("Prefix not found");
        return;
     }
     curr = curr.children[i]; // update
    }
    curr.eow = true;
    printSuggestions(current,prefix);
}

 // PRINT SUGGESTION FUNCTION 

 public static void printSuggestions(TrieNode current, String prefix)
 {
    if(curr.eow==true)
    {
        System.out.println(prefix);
    }
    for (int i = 0; i < 26; i++)
    {
        if(node.children[i]!=null)
            {
              printSuggestions( node.children[i], prefix + (char)(i + 'a'));// idx is converted into char
            }
    }

 }
  public static void main(String args[])
  {
    Trie trie = new Trie();
    String movies[]={"My fault","Your fault","Our fault","After","Any","Before Sunrise","Before Sunset"};
 
        for(int i=0; i<movies.length; i++)
        {
        trie.insert(movies[i]);
        
         Scanner sc = new Scanner(System.in);
         System.out.println(" NETFLIX SEARCH ENGINE (Demo)");
         System.out.println(" Auto-Suggestion using Trie Data Structure");
         System.out.print("Enter choice: ");
         int choice = sc.nextInt();
         if(choice==1)
         {
            System.out.println("Enter the movie name:");
            String word = sc.nextLine().toLowerCase();
            if(trie.search(word))
                System.out.println("Movie name found...!");
            else
                System.out.println("Movie name not found..");
         }

         else if(choice==2)
         {
            System.out.println("Enter the Prefix:");
            String prefix = sc.nextLine().toLowerCase();
            trie.autoSuggest(prefix);

         }
         else if (choice == 3) 
         {  
            System.out.println("Thank you for using Netflix Search Engine!");
            System.out.println("Exiting...");
            break;
         }
         else
         {
            System.out.println("Invalid choice");
         }
         
          sc.close();
    }
 }
}



   
