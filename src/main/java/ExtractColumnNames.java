public class ExtractColumnNames
{
    public static final String COLUMN1="MW TID 1";
    public static final String COLUMN2="MW TID 2";
    public static final String COLUMN3="health index";
    public static final String COLUMN4="Twamp pkt loss bin% at site 1";
    public static final String COLUMN5="Twamp pkt loss bin% at site 2";
    public static final String COLUMN6="DS EnodeBs";
    public static final String COLUMN7="Avg RSL 1";
    public static final String COLUMN8="ES 1 sec";
    public static final String COLUMN9="SES 1 sec";
    public static final String COLUMN10="IFMS Note";
    public static final String COLUMN11="DS Sites";

    public ExtractColumnNames() {}

    public static String[] getAllColumns()
    {
        return new String[]{COLUMN1,COLUMN2,COLUMN3,COLUMN4,COLUMN5,COLUMN6,COLUMN7,COLUMN8,COLUMN9,COLUMN10,COLUMN11};
    }
}
