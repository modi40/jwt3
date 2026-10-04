class Con {
public String concat(String s1, String s2) {
return s1 + s2;
}
}

class Comp {
public int compare(String s1, String s2) {
return s1.compareTo(s2);
}
}

public class one {
public static void main(String[] args) {
Con c = new Con();
Comp cp = new Comp();
String str1 = "Core";
String str2 = "Java";
String joined = c.concat(str1, str2);
System.out.println("Concatenation of '" + str1 + "' and '" + str2 + "' is: " + joined);
int result = cp.compare(str1, str2);
if (result == 0) {
System.out.println("Both strings are equal.");
} else if (result < 0) {
System.out.println("'" + str1 + "' is smaller than '" + str2 + "'.");
} else {
System.out.println("'" + str1 + "' is greater than '" + str2 + "'.");
}
}
}
