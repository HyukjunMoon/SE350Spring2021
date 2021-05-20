/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrintTextExample;

import java.util.stream.Collectors;

public class PrintTextHexDecorator extends PrintTextDecorator {
    public PrintTextHexDecorator(PrintText inner)
    {
        super(inner);
    }
    public void print(String text)
    {
        String hex = text.chars()
                .boxed()
                .map(x -> "0x" + Integer.toHexString(x))
                .collect(Collectors.joining(" "));
        inner.print(text + " -> HEX: " + hex);
    }
}