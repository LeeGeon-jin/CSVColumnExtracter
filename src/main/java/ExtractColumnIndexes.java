import java.util.ArrayList;
import java.util.Arrays;

public class ExtractColumnIndexes
{
    static int col1;
    static int col2;
    static int col3;
    static int col4;
    static int col5;
    static int col6;
    static int col7;
    static int col8;
    static int col9;
    static int col10;
    static int col11;

    ExtractColumnIndexes(String[] inputColumnNames)
    {

        ArrayList<String> columns=new ArrayList<>(Arrays.asList(inputColumnNames));

        col1=columns.indexOf(ExtractColumnNames.COLUMN1);
        col2=columns.indexOf(ExtractColumnNames.COLUMN2);
        col3=columns.indexOf(ExtractColumnNames.COLUMN3);
        col4=columns.indexOf(ExtractColumnNames.COLUMN4);
        col5=columns.indexOf(ExtractColumnNames.COLUMN5);
        col6=columns.indexOf(ExtractColumnNames.COLUMN6);
        col7=columns.indexOf(ExtractColumnNames.COLUMN7);
        col8=columns.indexOf(ExtractColumnNames.COLUMN8);
        col9=columns.indexOf(ExtractColumnNames.COLUMN9);
        col10=columns.indexOf(ExtractColumnNames.COLUMN10);
        col11=columns.indexOf(ExtractColumnNames.COLUMN11);
    }
}
