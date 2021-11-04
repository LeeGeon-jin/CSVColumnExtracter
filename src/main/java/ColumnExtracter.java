import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ColumnExtracter
{
    public static void main(String[] args) throws IOException, CsvValidationException {

        //set the input and output file name
        String fileName=getTodayDate()+"_mw_lu_1d_avg.csv";
        String outputFileName="new_"+fileName;

        extractAndWrite(fileName,outputFileName);

    }

    private static void extractAndWrite(String inputFileName, String outputFileName) throws IOException, CsvValidationException {
        //setup the reader
        FileReader fileReader=new FileReader(inputFileName);
        CSVReader csvReader=new CSVReader(fileReader);

        //setup the writer
        FileWriter fileWriter=new FileWriter(outputFileName);
        CSVWriter csvWriter=new CSVWriter(fileWriter);

        //write the first line (extracted columns' headers)
        csvWriter.writeNext(ExtractColumnNames.getAllColumns());
        //get all the column headers
        String[] allColumnNames=csvReader.readNext();
        //assign and save the columns' index into the ExtractColumnIndexes class
        new ExtractColumnIndexes(allColumnNames);

        String[] nextLine;
        String[] filtedLine;
        while ((nextLine=csvReader.readNext()) !=null)
        {
            filtedLine=new String[]{nextLine[ExtractColumnIndexes.col1],nextLine[ExtractColumnIndexes.col2],nextLine[ExtractColumnIndexes.col3],nextLine[ExtractColumnIndexes.col4],nextLine[ExtractColumnIndexes.col5],nextLine[ExtractColumnIndexes.col6],nextLine[ExtractColumnIndexes.col7],nextLine[ExtractColumnIndexes.col8],nextLine[ExtractColumnIndexes.col9],nextLine[ExtractColumnIndexes.col10],nextLine[ExtractColumnIndexes.col11]};
            csvWriter.writeNext(filtedLine);
        }

        //close the writers
        csvWriter.close();
        fileWriter.close();

        //close the readers
        csvReader.close();
        fileReader.close();
    }

    private static String getTodayDate()
    {
        DateTimeFormatter formatter=DateTimeFormatter.BASIC_ISO_DATE;
        return LocalDate.now().format(formatter);
    }
}
