package com.java12.demo.java12Demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTest {

    @Test
    public void utility_Indent_string_methods(){

        String text = "Hello From Java !\nThis is new sentence.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);
    }

    @Test
    public void transform_String(){
        String text = "Java12Demo";
        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );

        assertEquals("omeD21avaJ", transformed);
    }

}
