import java.util.*;
class Testchar
{
public static void main(String args[]){
System.out.println("ENTER THE CHARACTER");
Scanner A5=new Scanner(System.in);
char C=A5.next().charAt(0);
if(C=='a')
System.out.println("Vowel");
else if(C=='e')
System.out.println("Vowel");
else if(C=='i')
System.out.println("Vowel");
else if(C=='o')
System.out.println("Vowel");
else if(C=='u')
System.out.println("Vowel");
else if(C=='A')
System.out.println("Vowel");
else if(C=='E')
System.out.println("Vowel");
else if(C=='I')
System.out.println("Vowel");
else if(C=='O')
System.out.println("Vowel");
else if(C=='U')
System.out.println("Vowel");
else if((C>='A'&&C<='Z')||(C>='a'&&C<='z'))
System.out.println("Consonant");
}
}
