package christmastree;

public class ChristmasTreeUsingStringBuilder
{
    private int height;
    private String symbol;


    public ChristmasTreeUsingStringBuilder(final int height, final String symbol)
    {
        this.height = height;
        this.symbol = symbol;
    }


    public void paint()
    {
        paintCrown();
        //paintRoot();
    }


    private void paintCrown()
    {
        StringBuilder row;

        for (int rowNo = 1; rowNo <= height; rowNo++) {
            row = createRow(rowNo, symbol);
            System.out.println(row);
        }
    }

    private StringBuilder createRow(int rowNo, String symbol)
    {
        StringBuilder row = new StringBuilder();
        int blankSpace = height - rowNo;

        row.append(getSpace(blankSpace));
        row = getTreePart(rowNo, row, symbol);
        addSpace(blankSpace, row);

        return row;

    }

    private StringBuilder getTreePart(int rowNo, StringBuilder row, String symbol1)
    {
        int sign = 2 * rowNo - 1;

        for (int i = 1; i <= sign; i++) {
            row.append(symbol1);
        }

        return row;
    }

    private String getSpace(int blankSpace)
    {
        String rowPart = "";

        for (int i = 0; i < blankSpace; i++) {
            rowPart += ".";
        }

        return rowPart;
    }

    private void addSpace(int blankSpace, StringBuilder row)
    {
        for (int i = 0; i < blankSpace; i++) {
            row.append(".");
        }
    }
}
