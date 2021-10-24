package fr.uml2java;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        UMLToCode translator = new UMLToCode();
        translator.translate();
        System.out.println(translator);
    }
}
