package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List <String> lastNames = CSVReader_Writer.getLastNames();
        List<String> fname = new ArrayList<>();
        fname.add("fa");
        fname.add("fa");

        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);
        CSVReader_Writer.saveFemaleNames(fname);
        System.out.println(nameService);
              
        Person test = nameService.getNewRandomPerson();
        System.out.println(test);
        

	}

}
