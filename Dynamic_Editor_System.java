/*
StringBuilder Dynamic Editor System

Create a program that uses StringBuilder to simulate a text editor.

Operations:
Insert text
Delete part of text
Replace text
Reverse text

Example Flow:
Start: Java
Insert: Programming
Delete: Java
Replace: Programming  - Coding
Reverse final string
*/

class Dynamic_Editor_System {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Start: " + sb);

        sb.append(" Programming");
        System.out.println("Insert: " + sb);

        sb.delete(0, 5);
        System.out.println("Delete: " + sb);

        int index = sb.indexOf("Programming");
        sb.replace(index, index + 11, "Coding");
        System.out.println("Replace: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}