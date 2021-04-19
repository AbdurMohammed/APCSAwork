//Abdur Mohammed
//Period 5


import java.util.Scanner;

public class printChar {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter a String to print one character per line ");
        String input = kb.nextLine();
        System.out.println("Your entered: " + input);

        for(int i = 0; i < input.length(); i++){
           char letter = input.charAt(i);
            System.out.println(letter);
        }
    }
}

/*
C:\Users\A.R.M\.jdks\adopt-openjdk-14.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51048:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath "N:\AP CSA\out\production\AP CSA" printChar
Please enter a String to print one character per line
The quick brown fox jumps over the lazy dog
Your entered: The quick brown fox jumps over the lazy dog
T
h
e

q
u
i
c
k

b
r
o
w
n

f
o
x

j
u
m
p
s

o
v
e
r

t
h
e

l
a
z
y

d
o
g

Process finished with exit code 0
 */