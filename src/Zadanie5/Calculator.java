package Zadanie5;

public class Calculator
{
    private Value leftNum;
    private Value rightNum;
    private Operation operation;

    Calculator(Value leftNum, Value rightNum, Operation operation)
    {
        this.leftNum = leftNum;
        this.rightNum = rightNum;
        this.operation = operation;
    }

    double getResult()
    {
        double result = 0;

        switch (operation)
        {
            case ADDITION:
            {
                result = leftNum.getValue() + rightNum.getValue();
                break;
            }
            case SUBTRACTION:
                {
                result = leftNum.getValue() - rightNum.getValue();
                break;
            }
            case MULTIPLICATION:
                {
                result = leftNum.getValue() * rightNum.getValue();
                break;
            }
            case DIVISION:
                {
                result = leftNum.getValue() / rightNum.getValue();
                break;
            }
            default:
                System.out.println("Такой операции не существует!");
                break;
        }
        return result;
    }
}
