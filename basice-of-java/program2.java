public class program2 {
    public static void main(String[] args) {
        String str = "hello ";
        System.out.println(str);
        System.out.println(str.charAt(3));
        System.out.println(str + "world");
        System.out.println(str);
        str += "world";
        System.out.println(str);
        System.out.println(str.length());   
        System.out.println(str.substring(6, 11)); 
        str += "This is Kishori Patil.. hello\n";
        System.out.println(str.contains("Kishorip"));
        System.out.println(str.indexOf("hello", str.indexOf("hello") + 1));
        System.out.println(str.lastIndexOf("hello"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.strip());
        System.out.println(str.substring(11));
        System.out.println(str.repeat(4));
        String str2 = str;
        System.out.println(str.equals(str2));
    }
    
}
