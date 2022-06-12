private class ClassATest{

    private ClassA myInstanceOfA;


    @Before
    public void setup(){
        myInstanceOfA = new ClassA();

    }

    
    @Test
    public void testFeatureA(){
        Assert.assertEquals(0, myInstanceOfA.firstField);

    }



    @Test
    public void testFeatureB(){
        Assert.assertEquals(9001, myInstanceOfA.secondField);
    }


}
