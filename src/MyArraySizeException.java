public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int row;
    
    public MyArraySizeException(String message, int row) {
        super(message);
        this.row = row;
    }

    public int getRow() {
        return row;
    }

}
