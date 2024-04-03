package trie;

public class Test {

	public static void main(String[] args) {

		RadixTree rt = new RadixTreeImpl();
		rt.insert("/api/users", "users");
		rt.insert("/api/books", "books");
		rt.insert("/api/users/{userId}", "User[userId]");
		
		System.out.println(rt.find("a"));
		System.out.println(rt.find("/api/users/{userId}"));
		
	}

}
