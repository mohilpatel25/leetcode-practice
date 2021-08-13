/*
Problem Name: 0535. Encode and Decode TinyURL
Problem Link: https://leetcode.com/problems/encode-and-decode-tinyurl/
Difficulty: Medium
*/
public class Codec {
    String alnum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    HashMap<String,String> codeToUrl = new HashMap<String,String>();
    HashMap<String,String> urlToCode = new HashMap<String,String>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String code = generateCode(longUrl);
        while(codeToUrl.containsKey(code))
            code = generateCode(longUrl);
        code = "http://tinyurl.com/" + code;
        urlToCode.put(longUrl, code);
        codeToUrl.put(code, longUrl);
        return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return codeToUrl.get(shortUrl);
    }
    
    private String generateCode(String url){
        int num = 0;
        for(char c: url.toCharArray())
            num += c;
        StringBuilder code  = new StringBuilder();
        for(int i=1;i<=6;i++){
            code.append(alnum.charAt((num*i)%62));
        }
        return code.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
