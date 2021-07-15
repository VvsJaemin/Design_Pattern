package interpreterPattern;

public class InterpreterPatternDemo {

    // Rule : 로버트와 존은 남성
    public static Expression getMaleExpression(){
        Expression robert = new TeminalExpression("Robert");
        Expression john = new TeminalExpression("John");

        return new OrExpression(robert, john);
    }

    // Rule : 줄리는 결혼한 여성

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TeminalExpression("Julie");
        Expression married = new TeminalExpression("Married");

        return new AndExpression(julie, married);
    }



    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
