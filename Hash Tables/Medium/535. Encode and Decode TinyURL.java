public class Codec {

    HashMap<String, String> map;

    public Codec(){
        map = new HashMap<>();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        int code = longUrl.hashCode() % longUrl.length();

        map.put("http://tinyurl.com"+String.valueOf(code), longUrl);
        return "http://tinyurl.com"+String.valueOf(code);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
