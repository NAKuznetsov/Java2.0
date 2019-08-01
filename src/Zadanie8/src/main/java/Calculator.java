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
            case DIVISION: {
                if (rightNum.getValue() == 0)
                {
                    throw new ArithmeticException("Попытка деления на ноль!");
                }
                result = leftNum.getValue() / rightNum.getValue();
                break;
            }
        }
        return result;
    }
}
