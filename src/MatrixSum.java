public class MatrixSum {
    public static void main(String[] args) {
        String[][] arr = {
                {"2", "3", "4", "5"},
                {"1","3", "4", "1hjh"},
                {"2", "2", "2", "2"},
                {"1", "3", "4", "5"}
        };
        try{
            System.out.println("Сумма элементов массива равна = " + getMatrixSum(arr));
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
            System.out.print("Ошибка в строке ");
            System.out.println(e.getRow() + 1);
        } catch (MyArrayDataException e){
            System.out.print(e.getMessage());
            System.out.print(" в строке ");
            System.out.print(e.getRow() + 1);
            System.out.print(", столбце ");
            System.out.println(e.getColumn() + 1);
            System.out.println("Невозможно вычислить сумму.");
        }

    }
    public static int getMatrixSum (String[][] arr) throws ArrayIndexOutOfBoundsException{

        for (int i = 0; i < arr.length; i++){
            if (arr[i].length != 4){
                throw new MyArraySizeException("Число элементов в строке матрицы не соответствует заявленному", i);
            }
        }
        int ii = 0;
        int sum = 0;
        int iCopy= 0;
        int jCopy = 0;
        try{
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[i].length; j++){
                    iCopy = i;
                    jCopy = j;
                    ii = Integer.parseInt(arr[i][j]);
                    sum += ii;
                }
        } catch (NumberFormatException e){
            throw new MyArrayDataException("Неверный тип элементов матрицы", iCopy, jCopy);
        }
        return sum;
    }
}
