public class ClassA {

    private int firstField;

    private int secondField;


    protected void doSomething(String p1, int p2){


        /* Doesn't have to work for AST analysis :) */
        firstField = p1;

        secondField = p2;

    }



    /*
     * This method matches the getter name convention & should be excluded.
     */
    public Object getSomething(){
        return (Integer) firstField;
    }


}
