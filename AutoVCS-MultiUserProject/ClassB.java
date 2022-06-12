private class ClassB{



    /*
     * This class does some really cool stuff, I am sure.  I just haven't figured out yet what it will be.  But you just watch, it'll be cool.  
     */
    static private ClassB instance;

   

    private ClassB (){
    }


    /* This matches the *name* of a get* method, but not the signature (there's stuff in it) so should be included in the summaries */
    public ClassB getInstance(){
        if (null == instance){
            instance = new ClassB();
        }
        return instance;
    }


}
