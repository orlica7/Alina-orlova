package main.java;

import main.java.service.*;
import main.java.dom.DomWriter;
import main.java.entity.Edition;
import main.java.entity.EditionType;
import main.java.entity.Genre;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, MyInputException {
        DomWriter.writeEditions();
        EditionCompare.compare(Edition.editions);
        System.out.println(EditionService.getAllEditions(EditionType.BOOK).toString());
        System.out.println("Количество страниц по жанру: ");
        System.out.println(EditionService.countAllPage(Genre.DETECTIVE));
        System.out.println(EditionService.find(Edition.editions).toString());
    }
}

